/*
 * Copyright (c) 2008-2016 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.haulmont.cuba.web.log;

import com.haulmont.cuba.core.global.Logging;
import com.haulmont.cuba.core.global.SilentException;
import com.haulmont.cuba.core.global.TimeSource;
import com.vaadin.server.DefaultErrorHandler;
import com.vaadin.server.ErrorEvent;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.v7.data.Validator;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.SocketException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AppLog {

    private static final Logger log = LoggerFactory.getLogger(AppLog.class);

    protected transient Deque<LogItem> items = new ArrayDeque<>();

    protected final int capacity;
    protected final TimeSource timeSource;

    public AppLog(int capacity, TimeSource timeSource) {
        this.capacity = capacity;
        this.timeSource = timeSource;
    }

    public void log(LogItem item) {
        String msg = item.getMessage();

        if (item.getLevel().equals(LogLevel.ERROR)) {
            if (item.getThrowable() != null)
                log.error(msg, item.getThrowable());
            else
                log.error(msg);
        } else {
            if (item.getThrowable() != null)
                log.debug("{}: {}", item.getLevel(), msg, item.getThrowable());
            else
                log.debug("{}: {}", item.getLevel(), msg);
        }

        // clean reference to throwable
        item.sanitize();
        
        if (items.size() >= capacity) {
            items.removeLast();
        }
        items.addFirst(item);
    }

    public void log(LogLevel level, String message, Throwable throwable) {
        log(new LogItem(timeSource.currentTimestamp(), level, message, throwable));
    }

    public void debug(String message) {
        log(new LogItem(timeSource.currentTimestamp(), LogLevel.DEBUG, message, null));
    }

    public void info(String message) {
        log(new LogItem(timeSource.currentTimestamp(), LogLevel.INFO, message, null));
    }

    public void warning(String message) {
        log(new LogItem(timeSource.currentTimestamp(), LogLevel.WARNING, message, null));
    }

    public void error(String message) {
        log(new LogItem(timeSource.currentTimestamp(), LogLevel.ERROR, message, null));
    }

    public void log(ErrorEvent event) {
        Throwable t = event.getThrowable();

        if (t instanceof SilentException)
            return;

        if (t instanceof Validator.InvalidValueException)
            return;

        if (t instanceof SocketException
                || ExceptionUtils.getRootCause(t) instanceof SocketException) {
            // Most likely client browser closed socket
            LogItem item = new LogItem(timeSource.currentTimestamp(), LogLevel.WARNING,
                    "SocketException in CommunicationManager. Most likely client (browser) closed socket.", null);
            log(item);
            return;
        }

        // Support Tomcat 8 ClientAbortException
        if (StringUtils.contains(ExceptionUtils.getMessage(t), "ClientAbortException")) {
            // Most likely client browser closed socket
            LogItem item = new LogItem(timeSource.currentTimestamp(), LogLevel.WARNING,
                    "ClientAbortException on write response to client. Most likely client (browser) closed socket.", null);
            log(item);
            return;
        }

        // if it is UberJar or deployed to Jetty
        if (ExceptionUtils.getThrowableList(t).stream()
                .anyMatch(o -> o.getClass().getName().equals("org.eclipse.jetty.io.EofException"))) {
            // Most likely client browser closed socket
            LogItem item = new LogItem(timeSource.currentTimestamp(), LogLevel.WARNING,
                    "org.eclipse.jetty.io.EofException on write response to client. Most likely client (browser) closed socket.", null);
            log(item);
            return;
        }

        Throwable rootCause = ExceptionUtils.getRootCause(t);
        if (rootCause == null) {
            rootCause = t;
        }
        Logging annotation = rootCause.getClass().getAnnotation(Logging.class);
        Logging.Type loggingType = annotation == null ? Logging.Type.FULL : annotation.value();
        if (loggingType == Logging.Type.NONE) {
            return;
        }

        // Finds the original source of the error/exception
        AbstractComponent component = DefaultErrorHandler.findAbstractComponent(event);

        StringBuilder msg = new StringBuilder();
        msg.append("Exception");
        if (component != null) {
            msg.append(" in ").append(component.getClass().getName());
        }
        msg.append(": ");

        if (loggingType == Logging.Type.BRIEF) {
            error(msg + rootCause.toString());
        } else {
            LogItem item = new LogItem(timeSource.currentTimestamp(), LogLevel.ERROR, msg.toString(), t);
            log(item);
        }
    }

    public List<LogItem> getItems() {
        return new ArrayList<>(items);
    }
}
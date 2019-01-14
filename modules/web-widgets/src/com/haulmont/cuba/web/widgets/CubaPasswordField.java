/*
 * Copyright (c) 2008-2017 Haulmont.
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
 */

package com.haulmont.cuba.web.widgets;

import com.haulmont.cuba.web.widgets.client.passwordfield.CubaPasswordFieldState;
import com.vaadin.shared.Connector;
import com.vaadin.ui.PasswordField;

import java.util.Objects;

public class CubaPasswordField extends PasswordField {

    public CubaPasswordField() {
        setAutocomplete(false);
    }

    @Override
    protected CubaPasswordFieldState getState() {
        return (CubaPasswordFieldState) super.getState();
    }

    @Override
    protected CubaPasswordFieldState getState(boolean markAsDirty) {
        return (CubaPasswordFieldState) super.getState(markAsDirty);
    }

    public boolean isAutocomplete() {
        return getState(false).autocomplete;
    }

    public void setAutocomplete(boolean autocomplete) {
        if (isAutocomplete() != autocomplete) {
            getState().autocomplete = autocomplete;
        }
    }

    public void setCapsLockIndicator(Connector capsLockIndicator) {
        getState().capsLockIndicator = capsLockIndicator;
    }

    public void setHtmlName(String htmlName) {
        String oldHtmlName = getState(false).htmlName;
        if (!Objects.equals(htmlName, oldHtmlName)) {
            getState().htmlName = htmlName;
        }
    }

    public String getHtmlName() {
        return getState(false).htmlName;
    }
}
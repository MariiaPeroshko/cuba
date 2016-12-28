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
 */

package com.haulmont.cuba.gui.components;

import com.haulmont.cuba.client.sys.PersistenceManagerClient;
import com.haulmont.cuba.core.app.PersistenceManagerService;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.View;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.gui.data.DsBuilder;
import com.haulmont.cuba.gui.data.impl.DatasourceImpl;
import com.haulmont.cuba.security.entity.Group;
import com.haulmont.cuba.security.entity.User;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

@Ignore
public class LookupPickerFieldTest extends AbstractComponentTestCase {

    @Mocked
    PersistenceManagerService persistenceManagerService;

    @Override
    protected void initExpectations() {
        super.initExpectations();

        new NonStrictExpectations() {
            {
                AppBeans.get(PersistenceManagerClient.NAME); result = persistenceManagerService;
                AppBeans.get(PersistenceManagerClient.class); result = persistenceManagerService;
                AppBeans.get(PersistenceManagerClient.NAME, PersistenceManagerClient.class); result = persistenceManagerService;

                persistenceManagerService.getMaxFetchUI(anyString); result = 10000;

                clientConfig.getPickerShortcutModifiers(); result = "CTRL-ALT";
            }
        };
    }

    @Test
    public void testNew() {
        Component component = factory.createComponent(LookupPickerField.NAME);
        assertNotNull(component);
        assertTrue(component instanceof LookupPickerField);
    }

    @Test
    public void testGetSetValue() {
        LookupPickerField component = factory.createComponent(LookupPickerField.class);

        assertNull(component.getValue());

        component.setOptionsList(new ArrayList<>(Arrays.asList("One", "Two", "Three")));
        component.setValue("One");

        assertEquals("One", component.getValue());
    }

    @Test
    public void testSetToReadonly() {
        LookupPickerField component = factory.createComponent(LookupPickerField.class);

        component.setEditable(false);
        assertFalse(component.isEditable());

        component.setOptionsList(new ArrayList<>(Arrays.asList("One", "Two", "Three")));
        component.setValue("One");

        assertEquals("One", component.getValue());
        assertFalse(component.isEditable());
    }

    @Test
    public void testSetToReadonlyFromValueListener() {
        final LookupPickerField component = factory.createComponent(LookupPickerField.class);

        assertTrue(component.isEditable());

        component.setOptionsList(new ArrayList<>(Arrays.asList("One", "Two", "Three")));
        component.addValueChangeListener(e -> component.setEditable(false));
        component.setValue("One");

        assertEquals("One", component.getValue());
        assertFalse(component.isEditable());
    }

    @Test
    public void testDatasource() {
        LookupPickerField component = factory.createComponent(LookupPickerField.class);

        //noinspection unchecked
        Datasource<User> testDs = new DsBuilder()
                .setId("testDs")
                .setJavaClass(User.class)
                .setView(viewRepository.getView(User.class, View.LOCAL))
                .buildDatasource();

        testDs.setItem(new User());
        ((DatasourceImpl) testDs).valid();

        assertNull(component.getValue());
        Group g = new Group();
        g.setName("Group 0");
        testDs.getItem().setGroup(g);

        //noinspection unchecked
        CollectionDatasource<Group, UUID> groupsDs = new DsBuilder()
                .setId("testDs")
                .setJavaClass(Group.class)
                .setView(viewRepository.getView(Group.class, View.LOCAL))
                .setRefreshMode(CollectionDatasource.RefreshMode.NEVER)
                .setAllowCommit(false)
                .buildCollectionDatasource();

        Group g1 = new Group();
        g1.setName("Group 1");
        groupsDs.includeItem(g1);
        Group g2 = new Group();
        g2.setName("Group 2");
        groupsDs.includeItem(g2);

        component.setOptionsDatasource(groupsDs);

        component.setValue(g2);
        assertEquals(g2, groupsDs.getItem());

        component.setDatasource(testDs, "group");
        assertEquals(g, component.getValue());

        assertEquals(g, groupsDs.getItem());
        assertFalse(groupsDs.containsItem(g.getId())); // due to #PL-4625

        component.setValue(g1);
        assertEquals(g1, testDs.getItem().getGroup());
        assertEquals(g1, groupsDs.getItem());

        testDs.getItem().setGroup(g2);
        assertEquals(g2, component.getValue());
    }

    @Test
    public void testValueChangeListener() {
        LookupPickerField component = factory.createComponent(LookupPickerField.class);

        final AtomicInteger counter = new AtomicInteger(0);

        //noinspection unchecked
        Datasource<User> testDs = new DsBuilder()
                .setId("testDs")
                .setJavaClass(User.class)
                .setView(viewRepository.getView(User.class, View.LOCAL))
                .buildDatasource();

        testDs.setItem(new User());
        ((DatasourceImpl) testDs).valid();

        assertNull(component.getValue());
        final Group g = new Group();
        testDs.getItem().setGroup(g);

        //noinspection unchecked
        CollectionDatasource<Group, UUID> groupsDs = new DsBuilder()
                .setId("testDs")
                .setJavaClass(Group.class)
                .setView(viewRepository.getView(Group.class, View.LOCAL))
                .setRefreshMode(CollectionDatasource.RefreshMode.NEVER)
                .setAllowCommit(false)
                .buildCollectionDatasource();

        groupsDs.includeItem(g);
        Group g1 = new Group();
        groupsDs.includeItem(g1);
        Group g2 = new Group();
        groupsDs.includeItem(g2);

        component.setOptionsDatasource(groupsDs);

        Component.ValueChangeListener listener1 = e -> {
            assertNull(e.getPrevValue());
            assertEquals(g2, e.getValue());

            counter.addAndGet(1);
        };
        component.addValueChangeListener(listener1);
        component.setValue(g2);

        component.removeValueChangeListener(listener1);
        assertEquals(1, counter.get());

        Component.ValueChangeListener listener2 = e -> {
            assertEquals(g2, e.getPrevValue());
            assertEquals(g, e.getValue());

            counter.addAndGet(1);
        };

        component.addValueChangeListener(listener2);

        component.setDatasource(testDs, "group");
        assertEquals(g, component.getValue());

        assertEquals(2, counter.get());

        component.removeValueChangeListener(listener2);
        component.setValue(g1);
        assertEquals(g1, testDs.getItem().getGroup());

        assertEquals(2, counter.get());

        Component.ValueChangeListener listener3 = e -> {
            assertEquals(g1, e.getPrevValue());
            assertEquals(g2, e.getValue());

            counter.addAndGet(1);
        };
        component.addValueChangeListener(listener3);
        testDs.getItem().setGroup(g2);
        assertEquals(g2, component.getValue());

        assertEquals(3, counter.get());
    }

    @Test
    public void testValueLoadFromOptions() {
        LookupPickerField component = factory.createComponent(LookupPickerField.class);

        //noinspection unchecked
        Datasource<User> testDs = new DsBuilder()
                .setId("testDs")
                .setJavaClass(User.class)
                .setView(viewRepository.getView(User.class, View.LOCAL))
                .buildDatasource();

        testDs.setItem(new User());
        ((DatasourceImpl) testDs).valid();

        assertNull(component.getValue());
        Group g = new Group();
        testDs.getItem().setGroup(g);

        //noinspection unchecked
        CollectionDatasource<Group, UUID> groupsDs = new DsBuilder()
                .setId("testDs")
                .setJavaClass(Group.class)
                .setView(viewRepository.getView(Group.class, View.LOCAL))
                .setRefreshMode(CollectionDatasource.RefreshMode.NEVER)
                .setAllowCommit(false)
                .buildCollectionDatasource();

        groupsDs.includeItem(g);
        Group g1 = new Group();
        g1.setId(g.getId());
        groupsDs.includeItem(g1);
        Group g2 = new Group();
        groupsDs.includeItem(g2);

        component.setOptionsDatasource(groupsDs);

        component.setDatasource(testDs, "group");

        assertTrue("Value should be from options ds", g1 == component.getValue());

        component.setValue(g2);

        Component.ValueChangeListener listener1 = e -> {
            assertEquals(g2, e.getPrevValue());
            assertEquals(g1, e.getValue());
        };
        component.addValueChangeListener(listener1);
        component.setValue(g);
    }
}
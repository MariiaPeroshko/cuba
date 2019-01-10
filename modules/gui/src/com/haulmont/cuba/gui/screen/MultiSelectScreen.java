/*
 * Copyright (c) 2008-2019 Haulmont.
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

package com.haulmont.cuba.gui.screen;

/**
 * A screen that can change selection mode of lookup component.
 */
public interface MultiSelectScreen {

    /**
     * Informs a screen that a lookup component should change its selection mode, if possible.
     *
     * @param multiSelect {@code true} to enable multiple selections, {@code false} otherwise
     */
    void setMultiSelect(boolean multiSelect);
}

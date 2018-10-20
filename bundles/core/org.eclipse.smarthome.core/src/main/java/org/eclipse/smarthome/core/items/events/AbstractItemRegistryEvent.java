/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.items.events;

import org.eclipse.smarthome.core.events.AbstractEvent;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.dto.ItemDTO;

/**
 * Abstract implementation of an item registry event which will be posted by the {@link ItemRegistry} for added, removed
 * and updated items.
 *
 * @author Stefan Bußweiler - Initial contribution
 */
public abstract class AbstractItemRegistryEvent extends AbstractEvent {

    private final ItemDTO item;

    /**
     * Must be called in subclass constructor to create a new item registry event.
     *
     * @param topic the topic
     * @param payload the payload
     * @param source the source, can be null
     * @param item the item data transfer object
     */
    protected AbstractItemRegistryEvent(String topic, String payload, String source, ItemDTO item) {
        super(topic, payload, source);
        this.item = item;
    }

    /**
     * Gets the item.
     * 
     * @return the item
     */
    public ItemDTO getItem() {
        return item;
    }

}
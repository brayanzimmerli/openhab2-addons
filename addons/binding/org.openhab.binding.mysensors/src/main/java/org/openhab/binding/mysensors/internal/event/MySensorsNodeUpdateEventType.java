/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.mysensors.internal.event;

/**
 * Enum of possible node update events
 * REVERT == return to old status
 * BATTERY == for battery info (in percent)
 * UPDATE == new value for the node
 *
 * @author Tim Oberföll
 *
 */
public enum MySensorsNodeUpdateEventType {
    REVERT,
    BATTERY,
    UPDATE
}

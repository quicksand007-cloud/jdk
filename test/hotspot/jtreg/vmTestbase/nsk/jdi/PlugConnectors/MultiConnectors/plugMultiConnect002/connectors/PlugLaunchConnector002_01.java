/*
 * Copyright (c) 2007, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * A Simple LaunchingConnector without default arguments used by
 * nsk/jdi/PlugConnectors/MultiConnectors/plugMultiConnect002 test
 */

package nsk.jdi.PlugConnectors.MultiConnectors.plugMultiConnect002.connectors;

import nsk.share.jdi.*;
import com.sun.jdi.*;
import com.sun.jdi.connect.*;
import java.util.*;

public class PlugLaunchConnector002_01 extends PlugConnectors implements LaunchingConnector {

    static String plugLaunchConnectorName
        = "PlugLaunchConnector002_01_Name";
    static String plugLaunchConnectorDescription
        = "PlugLaunchConnector002_01_Description";
    static Transport plugLaunchConnectorTransport
        = new PlugConnectorsTransport("PlugLaunchConnector002_01_Transport");
    static Map<String, Connector.Argument> plugLaunchConnectorDefaultArguments
        = new HashMap<String, Connector.Argument>();


    public PlugLaunchConnector002_01() {

        super(plugLaunchConnectorName,
            plugLaunchConnectorDescription,
            plugLaunchConnectorTransport,
            plugLaunchConnectorDefaultArguments);
    }

} // end of PlugLaunchConnector002_01 class

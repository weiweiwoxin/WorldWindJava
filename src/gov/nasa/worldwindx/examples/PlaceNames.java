/*
 * Copyright 2006-2009, 2017, 2020 United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 * 
 * The NASA World Wind Java (WWJ) platform is licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * NASA World Wind Java (WWJ) also contains the following 3rd party Open Source
 * software:
 * 
 *     Jackson Parser – Licensed under Apache 2.0
 *     GDAL – Licensed under MIT
 *     JOGL – Licensed under  Berkeley Software Distribution (BSD)
 *     Gluegen – Licensed under Berkeley Software Distribution (BSD)
 * 
 * A complete listing of 3rd Party software notices and licenses included in
 * NASA World Wind Java (WWJ)  can be found in the WorldWindJava-v2.2 3rd-party
 * notices and licenses PDF found in code directory.
 */
package gov.nasa.worldwindx.examples;

import javax.swing.*;
import java.awt.*;

/**
 * Example of customizing which place names (names of countries, oceans, cities, etc) are displayed. The panel on the
 * left side of the window lists all of the available place name categories. Click the check boxes to turn individual
 * categories on or off.
 *
 * @author jparsons
 * @version $Id: PlaceNames.java 2109 2014-06-30 16:52:38Z tgaskins $
 */
public class PlaceNames extends ApplicationTemplate
{
    public static class AppFrame extends ApplicationTemplate.AppFrame
    {
        public AppFrame()
        {
            super(true, true, false);
            this.getControlPanel().add(makeControlPanel(),  BorderLayout.SOUTH);
        }


        private JPanel makeControlPanel()
        { 
            return new PlaceNamesPanel(this.getWwd());
        }
    }

    public static void main(String[] args)
    {
        ApplicationTemplate.start("WorldWind Place Names", AppFrame.class);
    }
}

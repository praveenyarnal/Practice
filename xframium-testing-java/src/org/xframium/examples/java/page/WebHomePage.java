/*******************************************************************************
 * xFramium
 *
 * Copyright 2017 by Moreland Labs LTD (http://www.morelandlabs.com)
 *
 * Some open source application is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version.
 *  
 * Some open source application is distributed in the hope that it will 
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with xFramium.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @license GPL-3.0+ <http://spdx.org/licenses/GPL-3.0+>
 *******************************************************************************/
package org.xframium.examples.java.page;

import org.xframium.page.Page;
import org.xframium.page.data.PageData;

public interface WebHomePage extends Page
{
    @ElementDefinition
    public static final String TOGGLE_BUTTON = "toggleButton";
    
    @ElementDefinition
    public static final String TOGGLE_VALUE = "toggleValue";
    
    @ElementDefinition
    public static final String ACCORDIAN_OPEN = "aOpen";
    
    @ElementDefinition
    public static final String DELETE_BUTTON = "deleteButton";
    
    public void testKeyword();
    
    public void testKeywordWithData( PageData pageData );
}

/*
* JsonTransient.java
*
* Copyright (c) 2009-2013, Ralf Th. Pietsch. All rights reserved.
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
* MA 02110-1301 USA
*/
package de.ratopi.libs.json;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Marks methods that it's return value should not be serialized in JsonWriters.
 * <p/>
 * Created: 13.09.2009<br/>
 * @author Ralf Th. Pietsch &lt;ratopi@abwesend.de&gt;
 */
@Target( { METHOD } )
@Retention( RUNTIME )
public @interface JsonTransient
{
}

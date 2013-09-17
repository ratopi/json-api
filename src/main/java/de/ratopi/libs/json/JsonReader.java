/*
* JsonReader.java
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

import java.io.IOException;
import java.io.Reader;

/**
 * Reads a JSON from the given reader and returns its
 * Java representation.
 * <p/>
 * Created: 13.06.2009<br/>
 * @author Ralf Th. Pietsch &lt;ratopi@abwesend.de&gt;
 */
public interface JsonReader
{
	public Object readJson( Reader reader ) throws IOException;
}

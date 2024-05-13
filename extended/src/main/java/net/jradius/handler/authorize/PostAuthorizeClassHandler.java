/**
 * JRadius - A RADIUS Server Java Adapter
 * Copyright (C) 2004-2005 PicoPoint, B.V.
 * Copyright (c) 2006-2007 David Bird <david@coova.com>
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package net.jradius.handler.authorize;

import net.jradius.dictionary.Attr_Class;
import net.jradius.dictionary.Attr_State;
import net.jradius.exception.RadiusException;
import net.jradius.handler.RadiusSessionHandler;
import net.jradius.packet.AccessAccept;
import net.jradius.packet.AccessChallenge;
import net.jradius.packet.RadiusPacket;
import net.jradius.packet.attribute.AttributeFactory;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.server.JRadiusRequest;
import net.jradius.session.JRadiusSession;

/**
 * Post-Authorize Class Attribute Handler.
 *
 * @author David Bird
 */
public class PostAuthorizeClassHandler extends RadiusSessionHandler
{
    public boolean handle(JRadiusRequest request) throws RadiusException
    {
        JRadiusSession session = request.getSession();
        if (session == null) return noSessionFound(request);
        
        RadiusPacket rep = request.getReplyPacket();

        if (!(rep instanceof AccessAccept ||
        		rep instanceof AccessChallenge)) return false;

        Object[] attrs = rep.findAttributes(Attr_Class.TYPE);
        if (attrs != null && session.getRadiusClass() == null)
        {
        	byte[][] classes = new byte[attrs.length][];
	        for (int i = 0; i < attrs.length; i++)
	        {
	            RadiusAttribute attribute = (RadiusAttribute) attrs[i];
	            classes[i] = (byte[]) attribute.getValue().getValueObject();
	        }
	        // System.err.println(this.getClass().getName() + " setting radiusClass");
	        session.setRadiusClass(classes);
        }

        RadiusAttribute attr = rep.findAttribute(Attr_State.TYPE);
        if (attr != null)
        {
        	byte[] val = (byte[]) attr.getValue().getValueObject();
        	// System.err.println(this.getClass().getName() + " setting radiusState "+val.length+" "+val[0]);
	        session.setRadiusState(val);
        }

        rep.overwriteAttribute(AttributeFactory.newAttribute(rep instanceof AccessAccept ? Attr_Class.TYPE : Attr_State.TYPE, 
        		(ClassPrefix + session.getSessionKey()).getBytes(), rep.isRecyclable()));
        
        return false;
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: X-Ascend-Assign-IP-Server<br>
 * Attribute Type: 145<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendAssignIPServer extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Assign-IP-Server";
    public static final long TYPE = 145;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 145;
        attributeValue = new IPAddrValue();
    }

    public Attr_XAscendAssignIPServer()
    {
        setup();
    }

    public Attr_XAscendAssignIPServer(Serializable o)
    {
        setup(o);
    }
}
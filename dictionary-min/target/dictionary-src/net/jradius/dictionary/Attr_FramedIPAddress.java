// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Framed-IP-Address<br>
 * Attribute Type: 8<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedIPAddress extends RadiusAttribute
{
    public static final String NAME = "Framed-IP-Address";
    public static final long TYPE = 8;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 8;
        attributeValue = new IPAddrValue();
    }

    public Attr_FramedIPAddress()
    {
        setup();
    }

    public Attr_FramedIPAddress(Serializable o)
    {
        setup(o);
    }
}

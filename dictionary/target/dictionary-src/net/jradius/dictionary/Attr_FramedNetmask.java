// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Framed-Netmask<br>
 * Attribute Type: 9<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedNetmask extends RadiusAttribute
{
    public static final String NAME = "Framed-Netmask";
    public static final long TYPE = 9;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 9;
        attributeValue = new IPAddrValue();
    }

    public Attr_FramedNetmask()
    {
        setup();
    }

    public Attr_FramedNetmask(Serializable o)
    {
        setup(o);
    }
}

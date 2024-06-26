// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: NAS-IPv6-Address<br>
 * Attribute Type: 95<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_NASIPv6Address extends RadiusAttribute
{
    public static final String NAME = "NAS-IPv6-Address";
    public static final long TYPE = 95;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 95;
        attributeValue = new IPv6AddrValue();
    }

    public Attr_NASIPv6Address()
    {
        setup();
    }

    public Attr_NASIPv6Address(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: Packet-Dst-IPv6-Address<br>
 * Attribute Type: 1098 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PacketDstIPv6Address extends RadiusAttribute
{
    public static final String NAME = "Packet-Dst-IPv6-Address";
    public static final long TYPE = 1098;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1098;
        attributeValue = new IPv6AddrValue();
    }

    public Attr_PacketDstIPv6Address()
    {
        setup();
    }

    public Attr_PacketDstIPv6Address(Serializable o)
    {
        setup(o);
    }
}
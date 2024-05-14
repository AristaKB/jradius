// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: Login-IPv6-Host<br>
 * Attribute Type: 98<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginIPv6Host extends RadiusAttribute
{
    public static final String NAME = "Login-IPv6-Host";
    public static final long TYPE = 98;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 98;
        attributeValue = new IPv6AddrValue();
    }

    public Attr_LoginIPv6Host()
    {
        setup();
    }

    public Attr_LoginIPv6Host(Serializable o)
    {
        setup(o);
    }
}

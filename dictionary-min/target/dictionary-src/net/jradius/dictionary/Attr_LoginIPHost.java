// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Login-IP-Host<br>
 * Attribute Type: 14<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginIPHost extends RadiusAttribute
{
    public static final String NAME = "Login-IP-Host";
    public static final long TYPE = 14;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 14;
        attributeValue = new IPAddrValue();
    }

    public Attr_LoginIPHost()
    {
        setup();
    }

    public Attr_LoginIPHost(Serializable o)
    {
        setup(o);
    }
}

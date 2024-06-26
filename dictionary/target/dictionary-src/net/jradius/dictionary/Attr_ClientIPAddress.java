// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Client-IP-Address<br>
 * Attribute Type: 1052 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ClientIPAddress extends RadiusAttribute
{
    public static final String NAME = "Client-IP-Address";
    public static final long TYPE = 1052;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1052;
        attributeValue = new IPAddrValue();
    }

    public Attr_ClientIPAddress()
    {
        setup();
    }

    public Attr_ClientIPAddress(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Packet-Src-IP-Address<br>
 * Attribute Type: 1084 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PacketSrcIPAddress extends RadiusAttribute
{
    public static final String NAME = "Packet-Src-IP-Address";
    public static final long TYPE = 1084;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1084;
        attributeValue = new IPAddrValue();
    }

    public Attr_PacketSrcIPAddress()
    {
        setup();
    }

    public Attr_PacketSrcIPAddress(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redcreek;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: RedCreek-Tunneled-IP-Addr<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1958<br>
 * VSA Type: 5<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_RedCreekTunneledIPAddr extends VSAttribute
{
    public static final String NAME = "RedCreek-Tunneled-IP-Addr";
    public static final int VENDOR_ID = 1958;
    public static final int VSA_TYPE = 5;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IPAddrValue();
    }

    public Attr_RedCreekTunneledIPAddr()
    {
        setup();
    }

    public Attr_RedCreekTunneledIPAddr(Serializable o)
    {
        setup(o);
    }
}

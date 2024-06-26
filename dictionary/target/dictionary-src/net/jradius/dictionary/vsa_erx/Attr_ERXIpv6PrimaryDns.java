// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_erx;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: ERX-Ipv6-Primary-Dns<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4874<br>
 * VSA Type: 47<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ERXIpv6PrimaryDns extends VSAttribute
{
    public static final String NAME = "ERX-Ipv6-Primary-Dns";
    public static final int VENDOR_ID = 4874;
    public static final int VSA_TYPE = 47;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IPv6AddrValue();
    }

    public Attr_ERXIpv6PrimaryDns()
    {
        setup();
    }

    public Attr_ERXIpv6PrimaryDns(Serializable o)
    {
        setup(o);
    }
}

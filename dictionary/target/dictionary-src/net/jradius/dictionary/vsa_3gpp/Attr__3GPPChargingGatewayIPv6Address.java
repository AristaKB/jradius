// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_3gpp;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: 3GPP-Charging-Gateway-IPv6-Address<br>
 * Attribute Type: 26<br>
 * Vendor Id: 10415<br>
 * VSA Type: 14<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr__3GPPChargingGatewayIPv6Address extends VSAttribute
{
    public static final String NAME = "3GPP-Charging-Gateway-IPv6-Address";
    public static final int VENDOR_ID = 10415;
    public static final int VSA_TYPE = 14;
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

    public Attr__3GPPChargingGatewayIPv6Address()
    {
        setup();
    }

    public Attr__3GPPChargingGatewayIPv6Address(Serializable o)
    {
        setup(o);
    }
}

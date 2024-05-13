// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_chillispot;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: ChilliSpot-DHCP-DNS2<br>
 * Attribute Type: 26<br>
 * Vendor Id: 14559<br>
 * VSA Type: 63<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ChilliSpotDHCPDNS2 extends VSAttribute
{
    public static final String NAME = "ChilliSpot-DHCP-DNS2";
    public static final int VENDOR_ID = 14559;
    public static final int VSA_TYPE = 63;
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

    public Attr_ChilliSpotDHCPDNS2()
    {
        setup();
    }

    public Attr_ChilliSpotDHCPDNS2(Serializable o)
    {
        setup(o);
    }
}

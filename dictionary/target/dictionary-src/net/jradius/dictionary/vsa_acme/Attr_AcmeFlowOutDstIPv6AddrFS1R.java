// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_acme;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: Acme-Flow-Out-Dst-IPv6_Addr_FS1_R<br>
 * Attribute Type: 26<br>
 * Vendor Id: 9148<br>
 * VSA Type: 162<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcmeFlowOutDstIPv6AddrFS1R extends VSAttribute
{
    public static final String NAME = "Acme-Flow-Out-Dst-IPv6_Addr_FS1_R";
    public static final int VENDOR_ID = 9148;
    public static final int VSA_TYPE = 162;
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

    public Attr_AcmeFlowOutDstIPv6AddrFS1R()
    {
        setup();
    }

    public Attr_AcmeFlowOutDstIPv6AddrFS1R(Serializable o)
    {
        setup(o);
    }
}

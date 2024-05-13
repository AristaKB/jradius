// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_acme;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: Acme-Flow-Out-Dst-IPv6_Addr_FS2_R<br>
 * Attribute Type: 26<br>
 * Vendor Id: 9148<br>
 * VSA Type: 170<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcmeFlowOutDstIPv6AddrFS2R extends VSAttribute
{
    public static final String NAME = "Acme-Flow-Out-Dst-IPv6_Addr_FS2_R";
    public static final int VENDOR_ID = 9148;
    public static final int VSA_TYPE = 170;
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

    public Attr_AcmeFlowOutDstIPv6AddrFS2R()
    {
        setup();
    }

    public Attr_AcmeFlowOutDstIPv6AddrFS2R(Serializable o)
    {
        setup(o);
    }
}

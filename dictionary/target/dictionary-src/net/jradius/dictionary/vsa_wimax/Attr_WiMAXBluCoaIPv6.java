// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPv6AddrValue;

/**
 * Attribute Name: WiMAX-Blu-Coa-IPv6<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 51<br>
 * Value Type: IPv6AddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXBluCoaIPv6 extends VSAttribute
{
    public static final String NAME = "WiMAX-Blu-Coa-IPv6";
    public static final int VENDOR_ID = 24757;
    public static final int VSA_TYPE = 51;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IPv6AddrValue();
    }

    public Attr_WiMAXBluCoaIPv6()
    {
        setup();
    }

    public Attr_WiMAXBluCoaIPv6(Serializable o)
    {
        setup(o);
    }
}

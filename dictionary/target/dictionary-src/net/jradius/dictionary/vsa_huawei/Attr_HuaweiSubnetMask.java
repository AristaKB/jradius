// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_huawei;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Huawei-Subnet-Mask<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2011<br>
 * VSA Type: 72<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_HuaweiSubnetMask extends VSAttribute
{
    public static final String NAME = "Huawei-Subnet-Mask";
    public static final int VENDOR_ID = 2011;
    public static final int VSA_TYPE = 72;
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

    public Attr_HuaweiSubnetMask()
    {
        setup();
    }

    public Attr_HuaweiSubnetMask(Serializable o)
    {
        setup(o);
    }
}

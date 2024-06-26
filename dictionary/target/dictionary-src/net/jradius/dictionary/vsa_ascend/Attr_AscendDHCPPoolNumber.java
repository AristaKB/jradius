// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Ascend-DHCP-Pool-Number<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 148<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendDHCPPoolNumber extends VSAttribute
{
    public static final String NAME = "Ascend-DHCP-Pool-Number";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 148;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IntegerValue();
    }

    public Attr_AscendDHCPPoolNumber()
    {
        setup();
    }

    public Attr_AscendDHCPPoolNumber(Serializable o)
    {
        setup(o);
    }
}

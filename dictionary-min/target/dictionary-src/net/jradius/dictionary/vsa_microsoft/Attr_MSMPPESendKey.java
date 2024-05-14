// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: MS-MPPE-Send-Key<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 16<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSMPPESendKey extends VSAttribute
{
    public static final String NAME = "MS-MPPE-Send-Key";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 16;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new OctetsValue();
    }

    public Attr_MSMPPESendKey()
    {
        setup();
    }

    public Attr_MSMPPESendKey(Serializable o)
    {
        setup(o);
    }
}

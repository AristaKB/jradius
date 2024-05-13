// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: MS-CHAP-Domain<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 10<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSCHAPDomain extends VSAttribute
{
    public static final String NAME = "MS-CHAP-Domain";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 10;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new StringValue();
    }

    public Attr_MSCHAPDomain()
    {
        setup();
    }

    public Attr_MSCHAPDomain(Serializable o)
    {
        setup(o);
    }
}

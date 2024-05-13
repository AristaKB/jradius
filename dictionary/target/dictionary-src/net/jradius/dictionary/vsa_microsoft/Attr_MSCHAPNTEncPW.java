// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: MS-CHAP-NT-Enc-PW<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 6<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSCHAPNTEncPW extends VSAttribute
{
    public static final String NAME = "MS-CHAP-NT-Enc-PW";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 6;
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

    public Attr_MSCHAPNTEncPW()
    {
        setup();
    }

    public Attr_MSCHAPNTEncPW(Serializable o)
    {
        setup(o);
    }
}

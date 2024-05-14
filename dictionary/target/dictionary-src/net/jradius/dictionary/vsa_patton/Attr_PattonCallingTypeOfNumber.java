// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_patton;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Patton-Calling-Type-Of-Number<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1768<br>
 * VSA Type: 83<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PattonCallingTypeOfNumber extends VSAttribute
{
    public static final String NAME = "Patton-Calling-Type-Of-Number";
    public static final int VENDOR_ID = 1768;
    public static final int VSA_TYPE = 83;
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

    public Attr_PattonCallingTypeOfNumber()
    {
        setup();
    }

    public Attr_PattonCallingTypeOfNumber(Serializable o)
    {
        setup(o);
    }
}

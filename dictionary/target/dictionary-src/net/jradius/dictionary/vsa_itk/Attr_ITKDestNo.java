// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_itk;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: ITK-Dest-No<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1195<br>
 * VSA Type: 130<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ITKDestNo extends VSAttribute
{
    public static final String NAME = "ITK-Dest-No";
    public static final int VENDOR_ID = 1195;
    public static final int VSA_TYPE = 130;
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

    public Attr_ITKDestNo()
    {
        setup();
    }

    public Attr_ITKDestNo(Serializable o)
    {
        setup(o);
    }
}

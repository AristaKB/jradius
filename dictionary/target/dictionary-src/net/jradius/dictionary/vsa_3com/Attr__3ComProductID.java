// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_3com;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: 3Com-Product-ID<br>
 * Attribute Type: 26<br>
 * Vendor Id: 43<br>
 * VSA Type: 255<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr__3ComProductID extends VSAttribute
{
    public static final String NAME = "3Com-Product-ID";
    public static final int VENDOR_ID = 43;
    public static final int VSA_TYPE = 255;
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

    public Attr__3ComProductID()
    {
        setup();
    }

    public Attr__3ComProductID(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_h3c;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: H3C-Product-ID<br>
 * Attribute Type: 26<br>
 * Vendor Id: 25506<br>
 * VSA Type: 255<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_H3CProductID extends VSAttribute
{
    public static final String NAME = "H3C-Product-ID";
    public static final int VENDOR_ID = 25506;
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

    public Attr_H3CProductID()
    {
        setup();
    }

    public Attr_H3CProductID(Serializable o)
    {
        setup(o);
    }
}

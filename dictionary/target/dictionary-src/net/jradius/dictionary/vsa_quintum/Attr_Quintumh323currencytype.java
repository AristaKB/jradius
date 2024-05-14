// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_quintum;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Quintum-h323-currency-type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 6618<br>
 * VSA Type: 110<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_Quintumh323currencytype extends VSAttribute
{
    public static final String NAME = "Quintum-h323-currency-type";
    public static final int VENDOR_ID = 6618;
    public static final int VSA_TYPE = 110;
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

    public Attr_Quintumh323currencytype()
    {
        setup();
    }

    public Attr_Quintumh323currencytype(Serializable o)
    {
        setup(o);
    }
}

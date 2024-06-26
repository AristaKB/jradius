// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_hp;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: HP-Command-String<br>
 * Attribute Type: 26<br>
 * Vendor Id: 11<br>
 * VSA Type: 2<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_HPCommandString extends VSAttribute
{
    public static final String NAME = "HP-Command-String";
    public static final int VENDOR_ID = 11;
    public static final int VSA_TYPE = 2;
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

    public Attr_HPCommandString()
    {
        setup();
    }

    public Attr_HPCommandString(Serializable o)
    {
        setup(o);
    }
}

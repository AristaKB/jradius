// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_juniper;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Juniper-Allow-Configuration<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2636<br>
 * VSA Type: 4<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_JuniperAllowConfiguration extends VSAttribute
{
    public static final String NAME = "Juniper-Allow-Configuration";
    public static final int VENDOR_ID = 2636;
    public static final int VSA_TYPE = 4;
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

    public Attr_JuniperAllowConfiguration()
    {
        setup();
    }

    public Attr_JuniperAllowConfiguration(Serializable o)
    {
        setup(o);
    }
}

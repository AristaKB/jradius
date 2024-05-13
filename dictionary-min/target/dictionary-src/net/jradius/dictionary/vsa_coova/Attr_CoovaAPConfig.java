// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary.vsa_coova;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Coova-AP-Config<br>
 * Attribute Type: 26<br>
 * Vendor Id: 31515<br>
 * VSA Type: 4<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CoovaAPConfig extends VSAttribute
{
    public static final String NAME = "Coova-AP-Config";
    public static final int VENDOR_ID = 31515;
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

    public Attr_CoovaAPConfig()
    {
        setup();
    }

    public Attr_CoovaAPConfig(Serializable o)
    {
        setup(o);
    }
}

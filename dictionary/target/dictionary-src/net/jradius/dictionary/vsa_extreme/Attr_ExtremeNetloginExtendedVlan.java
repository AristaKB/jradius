// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_extreme;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Extreme-Netlogin-Extended-Vlan<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1916<br>
 * VSA Type: 211<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ExtremeNetloginExtendedVlan extends VSAttribute
{
    public static final String NAME = "Extreme-Netlogin-Extended-Vlan";
    public static final int VENDOR_ID = 1916;
    public static final int VSA_TYPE = 211;
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

    public Attr_ExtremeNetloginExtendedVlan()
    {
        setup();
    }

    public Attr_ExtremeNetloginExtendedVlan(Serializable o)
    {
        setup(o);
    }
}

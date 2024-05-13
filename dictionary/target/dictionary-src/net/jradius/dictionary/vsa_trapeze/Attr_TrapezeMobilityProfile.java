// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_trapeze;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Trapeze-Mobility-Profile<br>
 * Attribute Type: 26<br>
 * Vendor Id: 14525<br>
 * VSA Type: 2<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TrapezeMobilityProfile extends VSAttribute
{
    public static final String NAME = "Trapeze-Mobility-Profile";
    public static final int VENDOR_ID = 14525;
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

    public Attr_TrapezeMobilityProfile()
    {
        setup();
    }

    public Attr_TrapezeMobilityProfile(Serializable o)
    {
        setup(o);
    }
}

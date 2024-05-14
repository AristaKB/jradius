// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ericsson;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Ericsson-ViG-Emergency-Call-Indicator<br>
 * Attribute Type: 26<br>
 * Vendor Id: 193<br>
 * VSA Type: 110<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EricssonViGEmergencyCallIndicator extends VSAttribute
{
    public static final String NAME = "Ericsson-ViG-Emergency-Call-Indicator";
    public static final int VENDOR_ID = 193;
    public static final int VSA_TYPE = 110;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IntegerValue();
    }

    public Attr_EricssonViGEmergencyCallIndicator()
    {
        setup();
    }

    public Attr_EricssonViGEmergencyCallIndicator(Serializable o)
    {
        setup(o);
    }
}

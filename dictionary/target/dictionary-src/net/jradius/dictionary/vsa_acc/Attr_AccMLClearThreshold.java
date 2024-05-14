// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_acc;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acc-ML-Clear-Threshold<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5<br>
 * VSA Type: 12<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AccMLClearThreshold extends VSAttribute
{
    public static final String NAME = "Acc-ML-Clear-Threshold";
    public static final int VENDOR_ID = 5;
    public static final int VSA_TYPE = 12;
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

    public Attr_AccMLClearThreshold()
    {
        setup();
    }

    public Attr_AccMLClearThreshold(Serializable o)
    {
        setup(o);
    }
}

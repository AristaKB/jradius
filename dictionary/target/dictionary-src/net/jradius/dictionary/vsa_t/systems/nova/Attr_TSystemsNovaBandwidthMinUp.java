// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_t.systems.nova;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: T-Systems-Nova-Bandwidth-Min-Up<br>
 * Attribute Type: 26<br>
 * Vendor Id: 16787<br>
 * VSA Type: 5<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TSystemsNovaBandwidthMinUp extends VSAttribute
{
    public static final String NAME = "T-Systems-Nova-Bandwidth-Min-Up";
    public static final int VENDOR_ID = 16787;
    public static final int VSA_TYPE = 5;
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

    public Attr_TSystemsNovaBandwidthMinUp()
    {
        setup();
    }

    public Attr_TSystemsNovaBandwidthMinUp(Serializable o)
    {
        setup(o);
    }
}
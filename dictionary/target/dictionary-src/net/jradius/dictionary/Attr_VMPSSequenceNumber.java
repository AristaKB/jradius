// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: VMPS-Sequence-Number<br>
 * Attribute Type: 0x2b02 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VMPSSequenceNumber extends RadiusAttribute
{
    public static final String NAME = "VMPS-Sequence-Number";
    public static final long TYPE = 0x2b02;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 0x2b02;
        attributeValue = new IntegerValue();
    }

    public Attr_VMPSSequenceNumber()
    {
        setup();
    }

    public Attr_VMPSSequenceNumber(Serializable o)
    {
        setup(o);
    }
}

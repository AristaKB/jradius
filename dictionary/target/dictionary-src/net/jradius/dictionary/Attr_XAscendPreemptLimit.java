// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-Preempt-Limit<br>
 * Attribute Type: 245<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendPreemptLimit extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Preempt-Limit";
    public static final long TYPE = 245;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 245;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendPreemptLimit()
    {
        setup();
    }

    public Attr_XAscendPreemptLimit(Serializable o)
    {
        setup(o);
    }
}

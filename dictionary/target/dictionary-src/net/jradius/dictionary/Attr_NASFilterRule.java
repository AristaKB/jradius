// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: NAS-Filter-Rule<br>
 * Attribute Type: 92<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_NASFilterRule extends RadiusAttribute
{
    public static final String NAME = "NAS-Filter-Rule";
    public static final long TYPE = 92;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 92;
        attributeValue = new StringValue();
    }

    public Attr_NASFilterRule()
    {
        setup();
    }

    public Attr_NASFilterRule(Serializable o)
    {
        setup(o);
    }
}
// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: NAS-Port-Id<br>
 * Attribute Type: 87<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_NASPortId extends RadiusAttribute
{
    public static final String NAME = "NAS-Port-Id";
    public static final long TYPE = 87;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 87;
        attributeValue = new StringValue();
    }

    public Attr_NASPortId()
    {
        setup();
    }

    public Attr_NASPortId(Serializable o)
    {
        setup(o);
    }
}
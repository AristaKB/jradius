// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Operator-Name<br>
 * Attribute Type: 126<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_OperatorName extends RadiusAttribute
{
    public static final String NAME = "Operator-Name";
    public static final long TYPE = 126;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 126;
        attributeValue = new StringValue();
    }

    public Attr_OperatorName()
    {
        setup();
    }

    public Attr_OperatorName(Serializable o)
    {
        setup(o);
    }
}

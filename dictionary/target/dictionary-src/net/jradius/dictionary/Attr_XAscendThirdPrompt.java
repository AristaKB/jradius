// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-Third-Prompt<br>
 * Attribute Type: 213<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendThirdPrompt extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Third-Prompt";
    public static final long TYPE = 213;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 213;
        attributeValue = new StringValue();
    }

    public Attr_XAscendThirdPrompt()
    {
        setup();
    }

    public Attr_XAscendThirdPrompt(Serializable o)
    {
        setup(o);
    }
}

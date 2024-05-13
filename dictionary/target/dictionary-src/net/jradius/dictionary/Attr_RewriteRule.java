// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Rewrite-Rule<br>
 * Attribute Type: 1078 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_RewriteRule extends RadiusAttribute
{
    public static final String NAME = "Rewrite-Rule";
    public static final long TYPE = 1078;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1078;
        attributeValue = new StringValue();
    }

    public Attr_RewriteRule()
    {
        setup();
    }

    public Attr_RewriteRule(Serializable o)
    {
        setup(o);
    }
}

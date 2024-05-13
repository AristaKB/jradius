// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Digest-QOP<br>
 * Attribute Type: 1067 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DigestQOP extends RadiusAttribute
{
    public static final String NAME = "Digest-QOP";
    public static final long TYPE = 1067;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1067;
        attributeValue = new StringValue();
    }

    public Attr_DigestQOP()
    {
        setup();
    }

    public Attr_DigestQOP(Serializable o)
    {
        setup(o);
    }
}

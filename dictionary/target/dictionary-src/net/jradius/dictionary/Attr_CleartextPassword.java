// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Cleartext-Password<br>
 * Attribute Type: 1100 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CleartextPassword extends RadiusAttribute
{
    public static final String NAME = "Cleartext-Password";
    public static final long TYPE = 1100;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1100;
        attributeValue = new StringValue();
    }

    public Attr_CleartextPassword()
    {
        setup();
    }

    public Attr_CleartextPassword(Serializable o)
    {
        setup(o);
    }
}
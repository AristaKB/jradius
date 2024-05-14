// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.EncryptedStringValue;

/**
 * Attribute Name: Password<br>
 * Attribute Type: 2<br>
 * Value Type: EncryptedStringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_Password extends RadiusAttribute
{
    public static final String NAME = "Password";
    public static final long TYPE = 2;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 2;
        attributeValue = new EncryptedStringValue();
    }

    public Attr_Password()
    {
        setup();
    }

    public Attr_Password(Serializable o)
    {
        setup(o);
    }
}

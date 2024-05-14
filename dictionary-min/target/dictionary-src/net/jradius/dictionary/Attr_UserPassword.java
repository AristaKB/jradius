// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.EncryptedStringValue;

/**
 * Attribute Name: User-Password<br>
 * Attribute Type: 2<br>
 * Value Type: EncryptedStringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_UserPassword extends RadiusAttribute
{
    public static final String NAME = "User-Password";
    public static final long TYPE = 2;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 2;
        attributeValue = new EncryptedStringValue();
    }

    public Attr_UserPassword()
    {
        setup();
    }

    public Attr_UserPassword(Serializable o)
    {
        setup(o);
    }
}

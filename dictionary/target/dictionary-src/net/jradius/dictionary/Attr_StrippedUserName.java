// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Stripped-User-Name<br>
 * Attribute Type: 1043 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_StrippedUserName extends RadiusAttribute
{
    public static final String NAME = "Stripped-User-Name";
    public static final long TYPE = 1043;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1043;
        attributeValue = new StringValue();
    }

    public Attr_StrippedUserName()
    {
        setup();
    }

    public Attr_StrippedUserName(Serializable o)
    {
        setup(o);
    }
}
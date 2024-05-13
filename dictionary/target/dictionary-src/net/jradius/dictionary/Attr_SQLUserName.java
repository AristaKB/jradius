// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: SQL-User-Name<br>
 * Attribute Type: 1055 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SQLUserName extends RadiusAttribute
{
    public static final String NAME = "SQL-User-Name";
    public static final long TYPE = 1055;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1055;
        attributeValue = new StringValue();
    }

    public Attr_SQLUserName()
    {
        setup();
    }

    public Attr_SQLUserName(Serializable o)
    {
        setup(o);
    }
}
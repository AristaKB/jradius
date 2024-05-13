// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Menu<br>
 * Attribute Type: 1001 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_Menu extends RadiusAttribute
{
    public static final String NAME = "Menu";
    public static final long TYPE = 1001;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1001;
        attributeValue = new StringValue();
    }

    public Attr_Menu()
    {
        setup();
    }

    public Attr_Menu(Serializable o)
    {
        setup(o);
    }
}
// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: EAP-Id<br>
 * Attribute Type: 1020 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPId extends RadiusAttribute
{
    public static final String NAME = "EAP-Id";
    public static final long TYPE = 1020;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1020;
        attributeValue = new IntegerValue();
    }

    public Attr_EAPId()
    {
        setup();
    }

    public Attr_EAPId(Serializable o)
    {
        setup(o);
    }
}
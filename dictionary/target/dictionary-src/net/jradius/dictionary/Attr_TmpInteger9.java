// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Tmp-Integer-9<br>
 * Attribute Type: 1819 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpInteger9 extends RadiusAttribute
{
    public static final String NAME = "Tmp-Integer-9";
    public static final long TYPE = 1819;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1819;
        attributeValue = new IntegerValue();
    }

    public Attr_TmpInteger9()
    {
        setup();
    }

    public Attr_TmpInteger9(Serializable o)
    {
        setup(o);
    }
}
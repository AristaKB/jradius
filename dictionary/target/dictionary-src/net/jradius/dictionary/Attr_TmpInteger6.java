// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Tmp-Integer-6<br>
 * Attribute Type: 1816 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpInteger6 extends RadiusAttribute
{
    public static final String NAME = "Tmp-Integer-6";
    public static final long TYPE = 1816;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1816;
        attributeValue = new IntegerValue();
    }

    public Attr_TmpInteger6()
    {
        setup();
    }

    public Attr_TmpInteger6(Serializable o)
    {
        setup(o);
    }
}

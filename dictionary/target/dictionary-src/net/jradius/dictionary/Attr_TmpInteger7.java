// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Tmp-Integer-7<br>
 * Attribute Type: 1817 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpInteger7 extends RadiusAttribute
{
    public static final String NAME = "Tmp-Integer-7";
    public static final long TYPE = 1817;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1817;
        attributeValue = new IntegerValue();
    }

    public Attr_TmpInteger7()
    {
        setup();
    }

    public Attr_TmpInteger7(Serializable o)
    {
        setup(o);
    }
}

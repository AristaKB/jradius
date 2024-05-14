// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Tmp-Integer-2<br>
 * Attribute Type: 1812 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpInteger2 extends RadiusAttribute
{
    public static final String NAME = "Tmp-Integer-2";
    public static final long TYPE = 1812;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1812;
        attributeValue = new IntegerValue();
    }

    public Attr_TmpInteger2()
    {
        setup();
    }

    public Attr_TmpInteger2(Serializable o)
    {
        setup(o);
    }
}

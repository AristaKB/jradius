// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Tmp-String-7<br>
 * Attribute Type: 1807 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpString7 extends RadiusAttribute
{
    public static final String NAME = "Tmp-String-7";
    public static final long TYPE = 1807;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1807;
        attributeValue = new StringValue();
    }

    public Attr_TmpString7()
    {
        setup();
    }

    public Attr_TmpString7(Serializable o)
    {
        setup(o);
    }
}

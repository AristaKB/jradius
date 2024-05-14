// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Suffix<br>
 * Attribute Type: 1004 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_Suffix extends RadiusAttribute
{
    public static final String NAME = "Suffix";
    public static final long TYPE = 1004;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1004;
        attributeValue = new StringValue();
    }

    public Attr_Suffix()
    {
        setup();
    }

    public Attr_Suffix(Serializable o)
    {
        setup(o);
    }
}

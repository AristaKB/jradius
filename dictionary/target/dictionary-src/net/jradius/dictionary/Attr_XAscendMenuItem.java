// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-Menu-Item<br>
 * Attribute Type: 206<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendMenuItem extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Menu-Item";
    public static final long TYPE = 206;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 206;
        attributeValue = new StringValue();
    }

    public Attr_XAscendMenuItem()
    {
        setup();
    }

    public Attr_XAscendMenuItem(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Framed-IPv6-Pool<br>
 * Attribute Type: 100<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedIPv6Pool extends RadiusAttribute
{
    public static final String NAME = "Framed-IPv6-Pool";
    public static final long TYPE = 100;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 100;
        attributeValue = new StringValue();
    }

    public Attr_FramedIPv6Pool()
    {
        setup();
    }

    public Attr_FramedIPv6Pool(Serializable o)
    {
        setup(o);
    }
}
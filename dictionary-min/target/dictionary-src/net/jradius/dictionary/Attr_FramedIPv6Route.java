// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Framed-IPv6-Route<br>
 * Attribute Type: 99<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedIPv6Route extends RadiusAttribute
{
    public static final String NAME = "Framed-IPv6-Route";
    public static final long TYPE = 99;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 99;
        attributeValue = new StringValue();
    }

    public Attr_FramedIPv6Route()
    {
        setup();
    }

    public Attr_FramedIPv6Route(Serializable o)
    {
        setup(o);
    }
}

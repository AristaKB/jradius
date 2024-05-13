// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Framed-IPv6-Prefix<br>
 * Attribute Type: 97<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedIPv6Prefix extends RadiusAttribute
{
    public static final String NAME = "Framed-IPv6-Prefix";
    public static final long TYPE = 97;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 97;
        attributeValue = new OctetsValue();
    }

    public Attr_FramedIPv6Prefix()
    {
        setup();
    }

    public Attr_FramedIPv6Prefix(Serializable o)
    {
        setup(o);
    }
}

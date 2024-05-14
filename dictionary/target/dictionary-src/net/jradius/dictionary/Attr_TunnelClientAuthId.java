// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Tunnel-Client-Auth-Id<br>
 * Attribute Type: 90<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelClientAuthId extends RadiusAttribute
{
    public static final String NAME = "Tunnel-Client-Auth-Id";
    public static final long TYPE = 90;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 90;
        attributeValue = new StringValue();
    }

    public Attr_TunnelClientAuthId()
    {
        setup();
    }

    public Attr_TunnelClientAuthId(Serializable o)
    {
        setup(o);
    }
}

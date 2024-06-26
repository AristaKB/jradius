// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Tunnel-Server-Auth-Id<br>
 * Attribute Type: 91<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelServerAuthId extends RadiusAttribute
{
    public static final String NAME = "Tunnel-Server-Auth-Id";
    public static final long TYPE = 91;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 91;
        attributeValue = new StringValue();
    }

    public Attr_TunnelServerAuthId()
    {
        setup();
    }

    public Attr_TunnelServerAuthId(Serializable o)
    {
        setup(o);
    }
}

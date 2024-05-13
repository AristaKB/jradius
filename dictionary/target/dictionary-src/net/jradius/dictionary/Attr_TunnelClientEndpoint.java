// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Tunnel-Client-Endpoint<br>
 * Attribute Type: 66<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelClientEndpoint extends RadiusAttribute
{
    public static final String NAME = "Tunnel-Client-Endpoint";
    public static final long TYPE = 66;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 66;
        attributeValue = new StringValue();
    }

    public Attr_TunnelClientEndpoint()
    {
        setup();
    }

    public Attr_TunnelClientEndpoint(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Inner-Tunnel-User-Name<br>
 * Attribute Type: 1102 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_InnerTunnelUserName extends RadiusAttribute
{
    public static final String NAME = "Inner-Tunnel-User-Name";
    public static final long TYPE = 1102;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1102;
        attributeValue = new StringValue();
    }

    public Attr_InnerTunnelUserName()
    {
        setup();
    }

    public Attr_InnerTunnelUserName(Serializable o)
    {
        setup(o);
    }
}

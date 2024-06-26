// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Packet-Authentication-Vector<br>
 * Attribute Type: 1088 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PacketAuthenticationVector extends RadiusAttribute
{
    public static final String NAME = "Packet-Authentication-Vector";
    public static final long TYPE = 1088;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1088;
        attributeValue = new OctetsValue();
    }

    public Attr_PacketAuthenticationVector()
    {
        setup();
    }

    public Attr_PacketAuthenticationVector(Serializable o)
    {
        setup(o);
    }
}

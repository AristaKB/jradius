// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Packet-Transmit-Counter<br>
 * Attribute Type: 1134 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PacketTransmitCounter extends RadiusAttribute
{
    public static final String NAME = "Packet-Transmit-Counter";
    public static final long TYPE = 1134;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1134;
        attributeValue = new IntegerValue();
    }

    public Attr_PacketTransmitCounter()
    {
        setup();
    }

    public Attr_PacketTransmitCounter(Serializable o)
    {
        setup(o);
    }
}

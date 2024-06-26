// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Framed-IPX-Network<br>
 * Attribute Type: 23<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedIPXNetwork extends RadiusAttribute
{
    public static final String NAME = "Framed-IPX-Network";
    public static final long TYPE = 23;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 23;
        attributeValue = new IPAddrValue();
    }

    public Attr_FramedIPXNetwork()
    {
        setup();
    }

    public Attr_FramedIPXNetwork(Serializable o)
    {
        setup(o);
    }
}

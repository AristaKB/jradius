// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acct-Tunnel-Packets-Lost<br>
 * Attribute Type: 86<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctTunnelPacketsLost extends RadiusAttribute
{
    public static final String NAME = "Acct-Tunnel-Packets-Lost";
    public static final long TYPE = 86;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 86;
        attributeValue = new IntegerValue();
    }

    public Attr_AcctTunnelPacketsLost()
    {
        setup();
    }

    public Attr_AcctTunnelPacketsLost(Serializable o)
    {
        setup(o);
    }
}

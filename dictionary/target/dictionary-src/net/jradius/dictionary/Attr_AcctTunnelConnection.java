// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Acct-Tunnel-Connection<br>
 * Attribute Type: 68<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctTunnelConnection extends RadiusAttribute
{
    public static final String NAME = "Acct-Tunnel-Connection";
    public static final long TYPE = 68;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 68;
        attributeValue = new StringValue();
    }

    public Attr_AcctTunnelConnection()
    {
        setup();
    }

    public Attr_AcctTunnelConnection(Serializable o)
    {
        setup(o);
    }
}

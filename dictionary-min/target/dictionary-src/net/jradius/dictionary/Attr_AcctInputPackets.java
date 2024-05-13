// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acct-Input-Packets<br>
 * Attribute Type: 47<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctInputPackets extends RadiusAttribute
{
    public static final String NAME = "Acct-Input-Packets";
    public static final long TYPE = 47;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 47;
        attributeValue = new IntegerValue();
    }

    public Attr_AcctInputPackets()
    {
        setup();
    }

    public Attr_AcctInputPackets(Serializable o)
    {
        setup(o);
    }
}

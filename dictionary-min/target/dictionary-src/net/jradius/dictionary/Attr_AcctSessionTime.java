// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acct-Session-Time<br>
 * Attribute Type: 46<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctSessionTime extends RadiusAttribute
{
    public static final String NAME = "Acct-Session-Time";
    public static final long TYPE = 46;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 46;
        attributeValue = new IntegerValue();
    }

    public Attr_AcctSessionTime()
    {
        setup();
    }

    public Attr_AcctSessionTime(Serializable o)
    {
        setup(o);
    }
}

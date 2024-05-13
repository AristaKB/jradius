// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Acct-Session-Id<br>
 * Attribute Type: 44<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctSessionId extends RadiusAttribute
{
    public static final String NAME = "Acct-Session-Id";
    public static final long TYPE = 44;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 44;
        attributeValue = new StringValue();
    }

    public Attr_AcctSessionId()
    {
        setup();
    }

    public Attr_AcctSessionId(Serializable o)
    {
        setup(o);
    }
}
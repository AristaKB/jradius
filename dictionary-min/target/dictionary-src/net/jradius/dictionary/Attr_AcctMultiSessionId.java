// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Acct-Multi-Session-Id<br>
 * Attribute Type: 50<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctMultiSessionId extends RadiusAttribute
{
    public static final String NAME = "Acct-Multi-Session-Id";
    public static final long TYPE = 50;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 50;
        attributeValue = new StringValue();
    }

    public Attr_AcctMultiSessionId()
    {
        setup();
    }

    public Attr_AcctMultiSessionId(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acct-Output-Gigawords<br>
 * Attribute Type: 53<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctOutputGigawords extends RadiusAttribute
{
    public static final String NAME = "Acct-Output-Gigawords";
    public static final long TYPE = 53;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 53;
        attributeValue = new IntegerValue();
    }

    public Attr_AcctOutputGigawords()
    {
        setup();
    }

    public Attr_AcctOutputGigawords(Serializable o)
    {
        setup(o);
    }
}

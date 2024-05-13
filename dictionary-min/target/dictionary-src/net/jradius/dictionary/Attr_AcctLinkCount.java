// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acct-Link-Count<br>
 * Attribute Type: 51<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctLinkCount extends RadiusAttribute
{
    public static final String NAME = "Acct-Link-Count";
    public static final long TYPE = 51;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 51;
        attributeValue = new IntegerValue();
    }

    public Attr_AcctLinkCount()
    {
        setup();
    }

    public Attr_AcctLinkCount(Serializable o)
    {
        setup(o);
    }
}

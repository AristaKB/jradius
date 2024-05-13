// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Client-Port-Id<br>
 * Attribute Type: 5<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ClientPortId extends RadiusAttribute
{
    public static final String NAME = "Client-Port-Id";
    public static final long TYPE = 5;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 5;
        attributeValue = new IntegerValue();
    }

    public Attr_ClientPortId()
    {
        setup();
    }

    public Attr_ClientPortId(Serializable o)
    {
        setup(o);
    }
}
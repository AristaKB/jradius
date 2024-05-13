// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Port-Message<br>
 * Attribute Type: 18<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PortMessage extends RadiusAttribute
{
    public static final String NAME = "Port-Message";
    public static final long TYPE = 18;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 18;
        attributeValue = new StringValue();
    }

    public Attr_PortMessage()
    {
        setup();
    }

    public Attr_PortMessage(Serializable o)
    {
        setup(o);
    }
}

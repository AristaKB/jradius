// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Framed-Callback-Id<br>
 * Attribute Type: 20<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedCallbackId extends RadiusAttribute
{
    public static final String NAME = "Framed-Callback-Id";
    public static final long TYPE = 20;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 20;
        attributeValue = new StringValue();
    }

    public Attr_FramedCallbackId()
    {
        setup();
    }

    public Attr_FramedCallbackId(Serializable o)
    {
        setup(o);
    }
}
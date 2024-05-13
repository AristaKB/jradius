// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-Xmit-Rate<br>
 * Attribute Type: 255<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendXmitRate extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Xmit-Rate";
    public static final long TYPE = 255;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 255;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendXmitRate()
    {
        setup();
    }

    public Attr_XAscendXmitRate(Serializable o)
    {
        setup(o);
    }
}
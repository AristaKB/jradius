// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-Receive-Secret<br>
 * Attribute Type: 215<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendReceiveSecret extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Receive-Secret";
    public static final long TYPE = 215;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 215;
        attributeValue = new StringValue();
    }

    public Attr_XAscendReceiveSecret()
    {
        setup();
    }

    public Attr_XAscendReceiveSecret(Serializable o)
    {
        setup(o);
    }
}

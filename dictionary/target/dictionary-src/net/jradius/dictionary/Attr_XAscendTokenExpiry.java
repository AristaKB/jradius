// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-Token-Expiry<br>
 * Attribute Type: 204<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendTokenExpiry extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Token-Expiry";
    public static final long TYPE = 204;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 204;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendTokenExpiry()
    {
        setup();
    }

    public Attr_XAscendTokenExpiry(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-Dial-Number<br>
 * Attribute Type: 227<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendDialNumber extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Dial-Number";
    public static final long TYPE = 227;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 227;
        attributeValue = new StringValue();
    }

    public Attr_XAscendDialNumber()
    {
        setup();
    }

    public Attr_XAscendDialNumber(Serializable o)
    {
        setup(o);
    }
}
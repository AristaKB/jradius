// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-Primary-Home-Agent<br>
 * Attribute Type: 129<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendPrimaryHomeAgent extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Primary-Home-Agent";
    public static final long TYPE = 129;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 129;
        attributeValue = new StringValue();
    }

    public Attr_XAscendPrimaryHomeAgent()
    {
        setup();
    }

    public Attr_XAscendPrimaryHomeAgent(Serializable o)
    {
        setup(o);
    }
}

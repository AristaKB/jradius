// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-PPP-Async-Map<br>
 * Attribute Type: 212<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendPPPAsyncMap extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-PPP-Async-Map";
    public static final long TYPE = 212;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 212;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendPPPAsyncMap()
    {
        setup();
    }

    public Attr_XAscendPPPAsyncMap(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-Add-Seconds<br>
 * Attribute Type: 240<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendAddSeconds extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Add-Seconds";
    public static final long TYPE = 240;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 240;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendAddSeconds()
    {
        setup();
    }

    public Attr_XAscendAddSeconds(Serializable o)
    {
        setup(o);
    }
}
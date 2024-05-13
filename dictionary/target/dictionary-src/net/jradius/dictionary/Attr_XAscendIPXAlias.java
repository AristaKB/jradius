// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-IPX-Alias<br>
 * Attribute Type: 224<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendIPXAlias extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-IPX-Alias";
    public static final long TYPE = 224;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 224;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendIPXAlias()
    {
        setup();
    }

    public Attr_XAscendIPXAlias(Serializable o)
    {
        setup(o);
    }
}
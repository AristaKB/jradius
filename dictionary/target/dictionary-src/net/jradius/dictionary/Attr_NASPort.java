// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: NAS-Port<br>
 * Attribute Type: 5<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_NASPort extends RadiusAttribute
{
    public static final String NAME = "NAS-Port";
    public static final long TYPE = 5;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 5;
        attributeValue = new IntegerValue();
    }

    public Attr_NASPort()
    {
        setup();
    }

    public Attr_NASPort(Serializable o)
    {
        setup(o);
    }
}

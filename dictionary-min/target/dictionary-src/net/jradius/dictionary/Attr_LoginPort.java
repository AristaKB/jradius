// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Login-Port<br>
 * Attribute Type: 16<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginPort extends RadiusAttribute
{
    public static final String NAME = "Login-Port";
    public static final long TYPE = 16;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 16;
        attributeValue = new IntegerValue();
    }

    public Attr_LoginPort()
    {
        setup();
    }

    public Attr_LoginPort(Serializable o)
    {
        setup(o);
    }
}
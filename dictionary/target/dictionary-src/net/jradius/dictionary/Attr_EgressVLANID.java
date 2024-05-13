// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Egress-VLANID<br>
 * Attribute Type: 56<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EgressVLANID extends RadiusAttribute
{
    public static final String NAME = "Egress-VLANID";
    public static final long TYPE = 56;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 56;
        attributeValue = new IntegerValue();
    }

    public Attr_EgressVLANID()
    {
        setup();
    }

    public Attr_EgressVLANID(Serializable o)
    {
        setup(o);
    }
}
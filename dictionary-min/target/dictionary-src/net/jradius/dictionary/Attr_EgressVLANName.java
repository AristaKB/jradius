// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Egress-VLAN-Name<br>
 * Attribute Type: 58<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EgressVLANName extends RadiusAttribute
{
    public static final String NAME = "Egress-VLAN-Name";
    public static final long TYPE = 58;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 58;
        attributeValue = new StringValue();
    }

    public Attr_EgressVLANName()
    {
        setup();
    }

    public Attr_EgressVLANName(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Basic-Location-Policy-Rules<br>
 * Attribute Type: 129<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_BasicLocationPolicyRules extends RadiusAttribute
{
    public static final String NAME = "Basic-Location-Policy-Rules";
    public static final long TYPE = 129;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 129;
        attributeValue = new OctetsValue();
    }

    public Attr_BasicLocationPolicyRules()
    {
        setup();
    }

    public Attr_BasicLocationPolicyRules(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Extended-Location-Policy-Rules<br>
 * Attribute Type: 130<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ExtendedLocationPolicyRules extends RadiusAttribute
{
    public static final String NAME = "Extended-Location-Policy-Rules";
    public static final long TYPE = 130;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 130;
        attributeValue = new OctetsValue();
    }

    public Attr_ExtendedLocationPolicyRules()
    {
        setup();
    }

    public Attr_ExtendedLocationPolicyRules(Serializable o)
    {
        setup(o);
    }
}

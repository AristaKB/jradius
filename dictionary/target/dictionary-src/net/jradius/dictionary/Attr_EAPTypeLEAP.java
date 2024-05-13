// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Type-LEAP<br>
 * Attribute Type: 1301 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPTypeLEAP extends RadiusAttribute
{
    public static final String NAME = "EAP-Type-LEAP";
    public static final long TYPE = 1301;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1301;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPTypeLEAP()
    {
        setup();
    }

    public Attr_EAPTypeLEAP(Serializable o)
    {
        setup(o);
    }
}
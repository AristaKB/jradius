// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-EMSK<br>
 * Attribute Type: 1130 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPEMSK extends RadiusAttribute
{
    public static final String NAME = "EAP-EMSK";
    public static final long TYPE = 1130;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1130;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPEMSK()
    {
        setup();
    }

    public Attr_EAPEMSK(Serializable o)
    {
        setup(o);
    }
}
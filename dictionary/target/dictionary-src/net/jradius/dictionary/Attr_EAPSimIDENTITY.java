// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Sim-IDENTITY<br>
 * Attribute Type: 1550 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimIDENTITY extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-IDENTITY";
    public static final long TYPE = 1550;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1550;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPSimIDENTITY()
    {
        setup();
    }

    public Attr_EAPSimIDENTITY(Serializable o)
    {
        setup(o);
    }
}

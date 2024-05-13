// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Sim-RAND<br>
 * Attribute Type: 1537 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimRAND extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-RAND";
    public static final long TYPE = 1537;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1537;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPSimRAND()
    {
        setup();
    }

    public Attr_EAPSimRAND(Serializable o)
    {
        setup(o);
    }
}

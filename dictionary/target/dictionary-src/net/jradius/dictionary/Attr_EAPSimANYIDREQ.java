// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Sim-ANY_ID_REQ<br>
 * Attribute Type: 1549 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimANYIDREQ extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-ANY_ID_REQ";
    public static final long TYPE = 1549;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1549;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPSimANYIDREQ()
    {
        setup();
    }

    public Attr_EAPSimANYIDREQ(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Sim-NEXT_REAUTH_ID<br>
 * Attribute Type: 1669 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimNEXTREAUTHID extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-NEXT_REAUTH_ID";
    public static final long TYPE = 1669;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1669;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPSimNEXTREAUTHID()
    {
        setup();
    }

    public Attr_EAPSimNEXTREAUTHID(Serializable o)
    {
        setup(o);
    }
}

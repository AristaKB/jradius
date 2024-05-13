// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Sim-FULLAUTH_ID_REQ<br>
 * Attribute Type: 1553 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimFULLAUTHIDREQ extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-FULLAUTH_ID_REQ";
    public static final long TYPE = 1553;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1553;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPSimFULLAUTHIDREQ()
    {
        setup();
    }

    public Attr_EAPSimFULLAUTHIDREQ(Serializable o)
    {
        setup(o);
    }
}

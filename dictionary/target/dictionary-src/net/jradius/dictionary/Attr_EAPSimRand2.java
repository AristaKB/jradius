// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: EAP-Sim-Rand2<br>
 * Attribute Type: 1202 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimRand2 extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-Rand2";
    public static final long TYPE = 1202;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1202;
        attributeValue = new OctetsValue();
    }

    public Attr_EAPSimRand2()
    {
        setup();
    }

    public Attr_EAPSimRand2(Serializable o)
    {
        setup(o);
    }
}

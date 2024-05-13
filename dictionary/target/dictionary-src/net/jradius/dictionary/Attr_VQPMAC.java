// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: VQP-MAC<br>
 * Attribute Type: 0x2c06 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VQPMAC extends RadiusAttribute
{
    public static final String NAME = "VQP-MAC";
    public static final long TYPE = 0x2c06;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 0x2c06;
        attributeValue = new OctetsValue();
    }

    public Attr_VQPMAC()
    {
        setup();
    }

    public Attr_VQPMAC(Serializable o)
    {
        setup(o);
    }
}

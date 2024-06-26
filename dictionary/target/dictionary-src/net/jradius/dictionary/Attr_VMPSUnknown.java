// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: VMPS-Unknown<br>
 * Attribute Type: 0x2c07 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VMPSUnknown extends RadiusAttribute
{
    public static final String NAME = "VMPS-Unknown";
    public static final long TYPE = 0x2c07;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 0x2c07;
        attributeValue = new OctetsValue();
    }

    public Attr_VMPSUnknown()
    {
        setup();
    }

    public Attr_VMPSUnknown(Serializable o)
    {
        setup(o);
    }
}

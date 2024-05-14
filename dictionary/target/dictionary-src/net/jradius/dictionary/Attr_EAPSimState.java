// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: EAP-Sim-State<br>
 * Attribute Type: 1207 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimState extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-State";
    public static final long TYPE = 1207;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1207;
        attributeValue = new IntegerValue();
    }

    public Attr_EAPSimState()
    {
        setup();
    }

    public Attr_EAPSimState(Serializable o)
    {
        setup(o);
    }
}

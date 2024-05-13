// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Tunnel-Preference<br>
 * Attribute Type: 83<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelPreference extends RadiusAttribute
{
    public static final String NAME = "Tunnel-Preference";
    public static final long TYPE = 83;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 83;
        attributeValue = new IntegerValue();
    }

    public Attr_TunnelPreference()
    {
        setup();
    }

    public Attr_TunnelPreference(Serializable o)
    {
        setup(o);
    }
}

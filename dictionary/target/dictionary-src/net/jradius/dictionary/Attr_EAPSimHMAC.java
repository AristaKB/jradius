// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: EAP-Sim-HMAC<br>
 * Attribute Type: 1209 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPSimHMAC extends RadiusAttribute
{
    public static final String NAME = "EAP-Sim-HMAC";
    public static final long TYPE = 1209;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1209;
        attributeValue = new StringValue();
    }

    public Attr_EAPSimHMAC()
    {
        setup();
    }

    public Attr_EAPSimHMAC(Serializable o)
    {
        setup(o);
    }
}

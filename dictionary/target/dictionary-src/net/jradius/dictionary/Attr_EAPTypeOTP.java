// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: EAP-Type-OTP<br>
 * Attribute Type: 1285 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPTypeOTP extends RadiusAttribute
{
    public static final String NAME = "EAP-Type-OTP";
    public static final long TYPE = 1285;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1285;
        attributeValue = new StringValue();
    }

    public Attr_EAPTypeOTP()
    {
        setup();
    }

    public Attr_EAPTypeOTP(Serializable o)
    {
        setup(o);
    }
}

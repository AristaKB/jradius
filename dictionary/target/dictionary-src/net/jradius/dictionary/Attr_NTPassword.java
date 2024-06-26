// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: NT-Password<br>
 * Attribute Type: 1058 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_NTPassword extends RadiusAttribute
{
    public static final String NAME = "NT-Password";
    public static final long TYPE = 1058;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1058;
        attributeValue = new OctetsValue();
    }

    public Attr_NTPassword()
    {
        setup();
    }

    public Attr_NTPassword(Serializable o)
    {
        setup(o);
    }
}

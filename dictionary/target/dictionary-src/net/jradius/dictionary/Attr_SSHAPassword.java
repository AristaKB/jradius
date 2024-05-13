// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: SSHA-Password<br>
 * Attribute Type: 1094 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SSHAPassword extends RadiusAttribute
{
    public static final String NAME = "SSHA-Password";
    public static final long TYPE = 1094;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1094;
        attributeValue = new OctetsValue();
    }

    public Attr_SSHAPassword()
    {
        setup();
    }

    public Attr_SSHAPassword(Serializable o)
    {
        setup(o);
    }
}
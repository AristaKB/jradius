// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: SHA1-Password<br>
 * Attribute Type: 1093 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SHA1Password extends RadiusAttribute
{
    public static final String NAME = "SHA1-Password";
    public static final long TYPE = 1093;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1093;
        attributeValue = new OctetsValue();
    }

    public Attr_SHA1Password()
    {
        setup();
    }

    public Attr_SHA1Password(Serializable o)
    {
        setup(o);
    }
}
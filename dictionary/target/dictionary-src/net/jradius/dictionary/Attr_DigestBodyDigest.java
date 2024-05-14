// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Digest-Body-Digest<br>
 * Attribute Type: 1069 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DigestBodyDigest extends RadiusAttribute
{
    public static final String NAME = "Digest-Body-Digest";
    public static final long TYPE = 1069;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1069;
        attributeValue = new StringValue();
    }

    public Attr_DigestBodyDigest()
    {
        setup();
    }

    public Attr_DigestBodyDigest(Serializable o)
    {
        setup(o);
    }
}

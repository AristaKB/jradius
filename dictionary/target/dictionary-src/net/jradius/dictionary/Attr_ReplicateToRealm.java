// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Replicate-To-Realm<br>
 * Attribute Type: 1049 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ReplicateToRealm extends RadiusAttribute
{
    public static final String NAME = "Replicate-To-Realm";
    public static final long TYPE = 1049;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1049;
        attributeValue = new StringValue();
    }

    public Attr_ReplicateToRealm()
    {
        setup();
    }

    public Attr_ReplicateToRealm(Serializable o)
    {
        setup(o);
    }
}
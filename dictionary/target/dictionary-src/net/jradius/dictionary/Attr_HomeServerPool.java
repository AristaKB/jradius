// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Home-Server-Pool<br>
 * Attribute Type: 1111 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_HomeServerPool extends RadiusAttribute
{
    public static final String NAME = "Home-Server-Pool";
    public static final long TYPE = 1111;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1111;
        attributeValue = new StringValue();
    }

    public Attr_HomeServerPool()
    {
        setup();
    }

    public Attr_HomeServerPool(Serializable o)
    {
        setup(o);
    }
}

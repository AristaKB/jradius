// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: EAP-Key-Name<br>
 * Attribute Type: 102<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPKeyName extends RadiusAttribute
{
    public static final String NAME = "EAP-Key-Name";
    public static final long TYPE = 102;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 102;
        attributeValue = new StringValue();
    }

    public Attr_EAPKeyName()
    {
        setup();
    }

    public Attr_EAPKeyName(Serializable o)
    {
        setup(o);
    }
}

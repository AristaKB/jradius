// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Framed-Interface-Id<br>
 * Attribute Type: 96<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedInterfaceId extends RadiusAttribute
{
    public static final String NAME = "Framed-Interface-Id";
    public static final long TYPE = 96;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 96;
        attributeValue = new OctetsValue();
    }

    public Attr_FramedInterfaceId()
    {
        setup();
    }

    public Attr_FramedInterfaceId(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: PKM-SA-Descriptor<br>
 * Attribute Type: 142<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PKMSADescriptor extends RadiusAttribute
{
    public static final String NAME = "PKM-SA-Descriptor";
    public static final long TYPE = 142;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 142;
        attributeValue = new OctetsValue();
    }

    public Attr_PKMSADescriptor()
    {
        setup();
    }

    public Attr_PKMSADescriptor(Serializable o)
    {
        setup(o);
    }
}

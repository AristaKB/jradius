// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: VQP-Domain-Name<br>
 * Attribute Type: 0x2c04 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VQPDomainName extends RadiusAttribute
{
    public static final String NAME = "VQP-Domain-Name";
    public static final long TYPE = 0x2c04;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 0x2c04;
        attributeValue = new StringValue();
    }

    public Attr_VQPDomainName()
    {
        setup();
    }

    public Attr_VQPDomainName(Serializable o)
    {
        setup(o);
    }
}

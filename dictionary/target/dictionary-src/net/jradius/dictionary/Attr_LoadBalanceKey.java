// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Load-Balance-Key<br>
 * Attribute Type: 1025 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoadBalanceKey extends RadiusAttribute
{
    public static final String NAME = "Load-Balance-Key";
    public static final long TYPE = 1025;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1025;
        attributeValue = new StringValue();
    }

    public Attr_LoadBalanceKey()
    {
        setup();
    }

    public Attr_LoadBalanceKey(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-FCP-Parameter<br>
 * Attribute Type: 119<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendFCPParameter extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-FCP-Parameter";
    public static final long TYPE = 119;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 119;
        attributeValue = new StringValue();
    }

    public Attr_XAscendFCPParameter()
    {
        setup();
    }

    public Attr_XAscendFCPParameter(Serializable o)
    {
        setup(o);
    }
}

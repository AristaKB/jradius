// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Login-LAT-Port<br>
 * Attribute Type: 63<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginLATPort extends RadiusAttribute
{
    public static final String NAME = "Login-LAT-Port";
    public static final long TYPE = 63;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 63;
        attributeValue = new StringValue();
    }

    public Attr_LoginLATPort()
    {
        setup();
    }

    public Attr_LoginLATPort(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Login-LAT-Service<br>
 * Attribute Type: 34<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginLATService extends RadiusAttribute
{
    public static final String NAME = "Login-LAT-Service";
    public static final long TYPE = 34;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 34;
        attributeValue = new StringValue();
    }

    public Attr_LoginLATService()
    {
        setup();
    }

    public Attr_LoginLATService(Serializable o)
    {
        setup(o);
    }
}

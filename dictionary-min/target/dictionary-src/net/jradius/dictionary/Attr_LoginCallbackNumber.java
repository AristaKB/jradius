// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Login-Callback-Number<br>
 * Attribute Type: 19<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginCallbackNumber extends RadiusAttribute
{
    public static final String NAME = "Login-Callback-Number";
    public static final long TYPE = 19;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 19;
        attributeValue = new StringValue();
    }

    public Attr_LoginCallbackNumber()
    {
        setup();
    }

    public Attr_LoginCallbackNumber(Serializable o)
    {
        setup(o);
    }
}

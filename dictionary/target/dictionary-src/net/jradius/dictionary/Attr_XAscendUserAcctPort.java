// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: X-Ascend-User-Acct-Port<br>
 * Attribute Type: 140<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendUserAcctPort extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-User-Acct-Port";
    public static final long TYPE = 140;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 140;
        attributeValue = new IntegerValue();
    }

    public Attr_XAscendUserAcctPort()
    {
        setup();
    }

    public Attr_XAscendUserAcctPort(Serializable o)
    {
        setup(o);
    }
}

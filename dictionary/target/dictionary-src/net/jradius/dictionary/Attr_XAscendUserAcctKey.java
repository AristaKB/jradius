// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-User-Acct-Key<br>
 * Attribute Type: 141<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendUserAcctKey extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-User-Acct-Key";
    public static final long TYPE = 141;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 141;
        attributeValue = new StringValue();
    }

    public Attr_XAscendUserAcctKey()
    {
        setup();
    }

    public Attr_XAscendUserAcctKey(Serializable o)
    {
        setup(o);
    }
}

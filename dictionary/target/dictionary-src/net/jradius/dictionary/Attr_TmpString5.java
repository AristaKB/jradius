// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Tmp-String-5<br>
 * Attribute Type: 1805 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpString5 extends RadiusAttribute
{
    public static final String NAME = "Tmp-String-5";
    public static final long TYPE = 1805;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1805;
        attributeValue = new StringValue();
    }

    public Attr_TmpString5()
    {
        setup();
    }

    public Attr_TmpString5(Serializable o)
    {
        setup(o);
    }
}

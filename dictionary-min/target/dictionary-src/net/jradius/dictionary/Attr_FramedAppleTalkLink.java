// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Framed-AppleTalk-Link<br>
 * Attribute Type: 37<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedAppleTalkLink extends RadiusAttribute
{
    public static final String NAME = "Framed-AppleTalk-Link";
    public static final long TYPE = 37;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 37;
        attributeValue = new IntegerValue();
    }

    public Attr_FramedAppleTalkLink()
    {
        setup();
    }

    public Attr_FramedAppleTalkLink(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Framed-AppleTalk-Zone<br>
 * Attribute Type: 39<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedAppleTalkZone extends RadiusAttribute
{
    public static final String NAME = "Framed-AppleTalk-Zone";
    public static final long TYPE = 39;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 39;
        attributeValue = new StringValue();
    }

    public Attr_FramedAppleTalkZone()
    {
        setup();
    }

    public Attr_FramedAppleTalkZone(Serializable o)
    {
        setup(o);
    }
}

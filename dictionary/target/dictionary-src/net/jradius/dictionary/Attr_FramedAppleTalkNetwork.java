// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Framed-AppleTalk-Network<br>
 * Attribute Type: 38<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedAppleTalkNetwork extends RadiusAttribute
{
    public static final String NAME = "Framed-AppleTalk-Network";
    public static final long TYPE = 38;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 38;
        attributeValue = new IntegerValue();
    }

    public Attr_FramedAppleTalkNetwork()
    {
        setup();
    }

    public Attr_FramedAppleTalkNetwork(Serializable o)
    {
        setup(o);
    }
}
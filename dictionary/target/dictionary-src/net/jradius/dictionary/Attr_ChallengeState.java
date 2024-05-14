// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Challenge-State<br>
 * Attribute Type: 24<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ChallengeState extends RadiusAttribute
{
    public static final String NAME = "Challenge-State";
    public static final long TYPE = 24;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 24;
        attributeValue = new StringValue();
    }

    public Attr_ChallengeState()
    {
        setup();
    }

    public Attr_ChallengeState(Serializable o)
    {
        setup(o);
    }
}

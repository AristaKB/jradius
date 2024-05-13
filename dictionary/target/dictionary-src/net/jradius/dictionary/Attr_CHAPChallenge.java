// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: CHAP-Challenge<br>
 * Attribute Type: 60<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CHAPChallenge extends RadiusAttribute
{
    public static final String NAME = "CHAP-Challenge";
    public static final long TYPE = 60;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 60;
        attributeValue = new OctetsValue();
    }

    public Attr_CHAPChallenge()
    {
        setup();
    }

    public Attr_CHAPChallenge(Serializable o)
    {
        setup(o);
    }
}
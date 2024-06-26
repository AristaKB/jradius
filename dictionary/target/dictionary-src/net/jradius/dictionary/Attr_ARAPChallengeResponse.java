// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: ARAP-Challenge-Response<br>
 * Attribute Type: 84<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ARAPChallengeResponse extends RadiusAttribute
{
    public static final String NAME = "ARAP-Challenge-Response";
    public static final long TYPE = 84;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 84;
        attributeValue = new OctetsValue();
    }

    public Attr_ARAPChallengeResponse()
    {
        setup();
    }

    public Attr_ARAPChallengeResponse(Serializable o)
    {
        setup(o);
    }
}

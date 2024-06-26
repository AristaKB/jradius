// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.Date;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.DateValue;

/**
 * Attribute Name: Event-Timestamp<br>
 * Attribute Type: 55<br>
 * Value Type: DateValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EventTimestamp extends RadiusAttribute
{
    public static final String NAME = "Event-Timestamp";
    public static final long TYPE = 55;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 55;
        attributeValue = new DateValue();
    }

    public Attr_EventTimestamp()
    {
        setup();
    }

    public Attr_EventTimestamp(Serializable o)
    {
        setup(o);
    }
}

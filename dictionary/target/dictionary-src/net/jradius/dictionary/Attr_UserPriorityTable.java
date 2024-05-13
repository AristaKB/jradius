// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: User-Priority-Table<br>
 * Attribute Type: 59<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_UserPriorityTable extends RadiusAttribute
{
    public static final String NAME = "User-Priority-Table";
    public static final long TYPE = 59;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 59;
        attributeValue = new OctetsValue();
    }

    public Attr_UserPriorityTable()
    {
        setup();
    }

    public Attr_UserPriorityTable(Serializable o)
    {
        setup(o);
    }
}

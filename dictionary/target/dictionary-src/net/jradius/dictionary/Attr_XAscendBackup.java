// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: X-Ascend-Backup<br>
 * Attribute Type: 176<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendBackup extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Backup";
    public static final long TYPE = 176;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 176;
        attributeValue = new StringValue();
    }

    public Attr_XAscendBackup()
    {
        setup();
    }

    public Attr_XAscendBackup(Serializable o)
    {
        setup(o);
    }
}

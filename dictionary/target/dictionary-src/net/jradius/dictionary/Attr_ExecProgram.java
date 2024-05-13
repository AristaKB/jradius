// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Exec-Program<br>
 * Attribute Type: 502 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ExecProgram extends RadiusAttribute
{
    public static final String NAME = "Exec-Program";
    public static final long TYPE = 502;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 502;
        attributeValue = new StringValue();
    }

    public Attr_ExecProgram()
    {
        setup();
    }

    public Attr_ExecProgram(Serializable o)
    {
        setup(o);
    }
}
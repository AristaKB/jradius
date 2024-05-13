// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Module-Failure-Message<br>
 * Attribute Type: 1076 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ModuleFailureMessage extends RadiusAttribute
{
    public static final String NAME = "Module-Failure-Message";
    public static final long TYPE = 1076;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1076;
        attributeValue = new StringValue();
    }

    public Attr_ModuleFailureMessage()
    {
        setup();
    }

    public Attr_ModuleFailureMessage(Serializable o)
    {
        setup(o);
    }
}
// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: SMB-Account-CTRL-TEXT<br>
 * Attribute Type: 1061 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SMBAccountCTRLTEXT extends RadiusAttribute
{
    public static final String NAME = "SMB-Account-CTRL-TEXT";
    public static final long TYPE = 1061;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1061;
        attributeValue = new StringValue();
    }

    public Attr_SMBAccountCTRLTEXT()
    {
        setup();
    }

    public Attr_SMBAccountCTRLTEXT(Serializable o)
    {
        setup(o);
    }
}

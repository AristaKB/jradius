// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Connect-Info<br>
 * Attribute Type: 77<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ConnectInfo extends RadiusAttribute
{
    public static final String NAME = "Connect-Info";
    public static final long TYPE = 77;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 77;
        attributeValue = new StringValue();
    }

    public Attr_ConnectInfo()
    {
        setup();
    }

    public Attr_ConnectInfo(Serializable o)
    {
        setup(o);
    }
}

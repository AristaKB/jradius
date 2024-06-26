// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: PKM-CA-Cert<br>
 * Attribute Type: 138<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PKMCACert extends RadiusAttribute
{
    public static final String NAME = "PKM-CA-Cert";
    public static final long TYPE = 138;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 138;
        attributeValue = new OctetsValue();
    }

    public Attr_PKMCACert()
    {
        setup();
    }

    public Attr_PKMCACert(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: PKM-Cryptosuite-List<br>
 * Attribute Type: 140<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PKMCryptosuiteList extends RadiusAttribute
{
    public static final String NAME = "PKM-Cryptosuite-List";
    public static final long TYPE = 140;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 140;
        attributeValue = new OctetsValue();
    }

    public Attr_PKMCryptosuiteList()
    {
        setup();
    }

    public Attr_PKMCryptosuiteList(Serializable o)
    {
        setup(o);
    }
}

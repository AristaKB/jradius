// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: X-Ascend-Client-Primary-DNS<br>
 * Attribute Type: 135<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendClientPrimaryDNS extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Client-Primary-DNS";
    public static final long TYPE = 135;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 135;
        attributeValue = new IPAddrValue();
    }

    public Attr_XAscendClientPrimaryDNS()
    {
        setup();
    }

    public Attr_XAscendClientPrimaryDNS(Serializable o)
    {
        setup(o);
    }
}

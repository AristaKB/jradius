// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: WiMAX-FA-IP-Address<br>
 * Attribute Type: 1901 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXFAIPAddress extends RadiusAttribute
{
    public static final String NAME = "WiMAX-FA-IP-Address";
    public static final long TYPE = 1901;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1901;
        attributeValue = new IPAddrValue();
    }

    public Attr_WiMAXFAIPAddress()
    {
        setup();
    }

    public Attr_WiMAXFAIPAddress(Serializable o)
    {
        setup(o);
    }
}

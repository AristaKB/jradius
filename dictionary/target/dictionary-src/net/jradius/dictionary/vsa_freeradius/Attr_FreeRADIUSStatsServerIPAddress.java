// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_freeradius;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: FreeRADIUS-Stats-Server-IP-Address<br>
 * Attribute Type: 26<br>
 * Vendor Id: 11344<br>
 * VSA Type: 170<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FreeRADIUSStatsServerIPAddress extends VSAttribute
{
    public static final String NAME = "FreeRADIUS-Stats-Server-IP-Address";
    public static final int VENDOR_ID = 11344;
    public static final int VSA_TYPE = 170;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IPAddrValue();
    }

    public Attr_FreeRADIUSStatsServerIPAddress()
    {
        setup();
    }

    public Attr_FreeRADIUSStatsServerIPAddress(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_bay.networks;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Annex-Secondary-DNS-Server<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1584<br>
 * VSA Type: 55<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AnnexSecondaryDNSServer extends VSAttribute
{
    public static final String NAME = "Annex-Secondary-DNS-Server";
    public static final int VENDOR_ID = 1584;
    public static final int VSA_TYPE = 55;
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

    public Attr_AnnexSecondaryDNSServer()
    {
        setup();
    }

    public Attr_AnnexSecondaryDNSServer(Serializable o)
    {
        setup(o);
    }
}

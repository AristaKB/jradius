// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_springtide;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: ST-Primary-NBNS-Server<br>
 * Attribute Type: 26<br>
 * Vendor Id: 3551<br>
 * VSA Type: 7<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_STPrimaryNBNSServer extends VSAttribute
{
    public static final String NAME = "ST-Primary-NBNS-Server";
    public static final int VENDOR_ID = 3551;
    public static final int VSA_TYPE = 7;
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

    public Attr_STPrimaryNBNSServer()
    {
        setup();
    }

    public Attr_STPrimaryNBNSServer(Serializable o)
    {
        setup(o);
    }
}

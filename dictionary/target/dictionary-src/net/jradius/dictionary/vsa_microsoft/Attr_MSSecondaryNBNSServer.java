// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: MS-Secondary-NBNS-Server<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 31<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSSecondaryNBNSServer extends VSAttribute
{
    public static final String NAME = "MS-Secondary-NBNS-Server";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 31;
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

    public Attr_MSSecondaryNBNSServer()
    {
        setup();
    }

    public Attr_MSSecondaryNBNSServer(Serializable o)
    {
        setup(o);
    }
}

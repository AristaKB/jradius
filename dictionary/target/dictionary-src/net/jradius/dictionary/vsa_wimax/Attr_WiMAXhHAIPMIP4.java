// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: WiMAX-hHA-IP-MIP4<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 6<br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXhHAIPMIP4 extends VSAttribute
{
    public static final String NAME = "WiMAX-hHA-IP-MIP4";
    public static final int VENDOR_ID = 24757;
    public static final int VSA_TYPE = 6;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IPAddrValue();
    }

    public Attr_WiMAXhHAIPMIP4()
    {
        setup();
    }

    public Attr_WiMAXhHAIPMIP4(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: DHCP-Netware-Sub-Options<br>
 * Attribute Type: 26<br>
 * Vendor Id: 54<br>
 * VSA Type: 63<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DHCPNetwareSubOptions extends VSAttribute
{
    public static final String NAME = "DHCP-Netware-Sub-Options";
    public static final int VENDOR_ID = 54;
    public static final int VSA_TYPE = 63;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new OctetsValue();
    }

    public Attr_DHCPNetwareSubOptions()
    {
        setup();
    }

    public Attr_DHCPNetwareSubOptions(Serializable o)
    {
        setup(o);
    }
}

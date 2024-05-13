// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: DHCP-Netinfo-Tag<br>
 * Attribute Type: 26<br>
 * Vendor Id: 54<br>
 * VSA Type: 113<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DHCPNetinfoTag extends VSAttribute
{
    public static final String NAME = "DHCP-Netinfo-Tag";
    public static final int VENDOR_ID = 54;
    public static final int VSA_TYPE = 113;
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

    public Attr_DHCPNetinfoTag()
    {
        setup();
    }

    public Attr_DHCPNetinfoTag(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: DHCP-Agent-Circuit-Id<br>
 * Attribute Type: 26<br>
 * Vendor Id: 54<br>
 * VSA Type: 1<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DHCPAgentCircuitId extends SubAttribute
{
    public static final String NAME = "DHCP-Agent-Circuit-Id";
    public static final int VENDOR_ID = 54;
    public static final int PARENT_TYPE = 82;
    public static final int VSA_TYPE = (1 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1;
        setParentClass(Attr_DHCPRelayAgentInformation.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new OctetsValue();
    }

    public Attr_DHCPAgentCircuitId()
    {
        setup();
    }

    public Attr_DHCPAgentCircuitId(Serializable o)
    {
        setup(o);
    }
}

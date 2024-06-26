// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: DHCP-Relay-Agent-Flags<br>
 * Attribute Type: 26<br>
 * Vendor Id: 54<br>
 * VSA Type: 10<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DHCPRelayAgentFlags extends SubAttribute
{
    public static final String NAME = "DHCP-Relay-Agent-Flags";
    public static final int VENDOR_ID = 54;
    public static final int PARENT_TYPE = 82;
    public static final int VSA_TYPE = (10 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 10;
        setParentClass(Attr_DHCPRelayAgentInformation.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new IntegerValue();
        ((IntegerValue)attributeValue).setLength(1);
    }

    public Attr_DHCPRelayAgentFlags()
    {
        setup();
    }

    public Attr_DHCPRelayAgentFlags(Serializable o)
    {
        setup(o);
    }
}

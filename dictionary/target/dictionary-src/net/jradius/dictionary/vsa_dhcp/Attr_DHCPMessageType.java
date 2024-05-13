// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: DHCP-Message-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 54<br>
 * VSA Type: 53<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> DHCP-Discover (1)
 * <li> DHCP-Offer (2)
 * <li> DHCP-Request (3)
 * <li> DHCP-Decline (4)
 * <li> DHCP-Ack (5)
 * <li> DHCP-NAK (6)
 * <li> DHCP-Release (7)
 * <li> DHCP-Inform (8)
 * <li> DHCP-Force-Renew (9)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DHCPMessageType extends VSAttribute
{
    public static final String NAME = "DHCP-Message-Type";
    public static final int VENDOR_ID = 54;
    public static final int VSA_TYPE = 53;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long DHCPDiscover = new Long(1L);
    public static final Long DHCPOffer = new Long(2L);
    public static final Long DHCPRequest = new Long(3L);
    public static final Long DHCPDecline = new Long(4L);
    public static final Long DHCPAck = new Long(5L);
    public static final Long DHCPNAK = new Long(6L);
    public static final Long DHCPRelease = new Long(7L);
    public static final Long DHCPInform = new Long(8L);
    public static final Long DHCPForceRenew = new Long(9L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("DHCP-Discover".equals(name)) return new Long(1L);
            if ("DHCP-Offer".equals(name)) return new Long(2L);
            if ("DHCP-Request".equals(name)) return new Long(3L);
            if ("DHCP-Decline".equals(name)) return new Long(4L);
            if ("DHCP-Ack".equals(name)) return new Long(5L);
            if ("DHCP-NAK".equals(name)) return new Long(6L);
            if ("DHCP-Release".equals(name)) return new Long(7L);
            if ("DHCP-Inform".equals(name)) return new Long(8L);
            if ("DHCP-Force-Renew".equals(name)) return new Long(9L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "DHCP-Discover";
            if (new Long(2L).equals(value)) return "DHCP-Offer";
            if (new Long(3L).equals(value)) return "DHCP-Request";
            if (new Long(4L).equals(value)) return "DHCP-Decline";
            if (new Long(5L).equals(value)) return "DHCP-Ack";
            if (new Long(6L).equals(value)) return "DHCP-NAK";
            if (new Long(7L).equals(value)) return "DHCP-Release";
            if (new Long(8L).equals(value)) return "DHCP-Inform";
            if (new Long(9L).equals(value)) return "DHCP-Force-Renew";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_DHCPMessageType()
    {
        setup();
    }

    public Attr_DHCPMessageType(Serializable o)
    {
        setup(o);
    }
}

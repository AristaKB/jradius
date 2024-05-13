// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_alcatel;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: AAT-IP-TOS<br>
 * Attribute Type: 26<br>
 * Vendor Id: 3041<br>
 * VSA Type: 22<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> IP-TOS-Normal (0)
 * <li> IP-TOS-Disabled (1)
 * <li> IP-TOS-Cost (2)
 * <li> IP-TOS-Reliability (4)
 * <li> IP-TOS-Throughput (8)
 * <li> IP-TOS-Latency (16)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AATIPTOS extends VSAttribute
{
    public static final String NAME = "AAT-IP-TOS";
    public static final int VENDOR_ID = 3041;
    public static final int VSA_TYPE = 22;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long IPTOSNormal = new Long(0L);
    public static final Long IPTOSDisabled = new Long(1L);
    public static final Long IPTOSCost = new Long(2L);
    public static final Long IPTOSReliability = new Long(4L);
    public static final Long IPTOSThroughput = new Long(8L);
    public static final Long IPTOSLatency = new Long(16L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(4L),new Long(8L),new Long(16L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("IP-TOS-Normal".equals(name)) return new Long(0L);
            if ("IP-TOS-Disabled".equals(name)) return new Long(1L);
            if ("IP-TOS-Cost".equals(name)) return new Long(2L);
            if ("IP-TOS-Reliability".equals(name)) return new Long(4L);
            if ("IP-TOS-Throughput".equals(name)) return new Long(8L);
            if ("IP-TOS-Latency".equals(name)) return new Long(16L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "IP-TOS-Normal";
            if (new Long(1L).equals(value)) return "IP-TOS-Disabled";
            if (new Long(2L).equals(value)) return "IP-TOS-Cost";
            if (new Long(4L).equals(value)) return "IP-TOS-Reliability";
            if (new Long(8L).equals(value)) return "IP-TOS-Throughput";
            if (new Long(16L).equals(value)) return "IP-TOS-Latency";
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
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_AATIPTOS()
    {
        setup();
    }

    public Attr_AATIPTOS(Serializable o)
    {
        setup(o);
    }
}
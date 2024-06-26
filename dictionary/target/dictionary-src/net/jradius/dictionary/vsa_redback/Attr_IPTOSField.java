// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: IP-TOS-Field<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 61<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> normal (0)
 * <li> min-cost-only (1)
 * <li> max-reliability-only (2)
 * <li> max-reliability-plus-min-cost (3)
 * <li> max-throughput-only (4)
 * <li> max-throughput-plus-min-cost (5)
 * <li> max-throughput-plus-max-reliability (6)
 * <li> max-throughput-plus-max-reliability-plus-min-cost (7)
 * <li> min-delay-only (8)
 * <li> min-delay-plus-min-cost (9)
 * <li> min-delay-plus-max-reliability (10)
 * <li> min-delay-plus-max-reliability-plus-min-cost (11)
 * <li> min-delay-plus-max-throughput (12)
 * <li> min-delay-plus-max-throughput-plus-min-cost (13)
 * <li> min-delay-plus-max-throughput-plus-max-reliability (14)
 * <li> min-delay-plus-max-throughput-plus-max-reliability-plus-min-cost (15)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_IPTOSField extends VSAttribute
{
    public static final String NAME = "IP-TOS-Field";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 61;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long normal = new Long(0L);
    public static final Long mincostonly = new Long(1L);
    public static final Long maxreliabilityonly = new Long(2L);
    public static final Long maxreliabilityplusmincost = new Long(3L);
    public static final Long maxthroughputonly = new Long(4L);
    public static final Long maxthroughputplusmincost = new Long(5L);
    public static final Long maxthroughputplusmaxreliability = new Long(6L);
    public static final Long maxthroughputplusmaxreliabilityplusmincost = new Long(7L);
    public static final Long mindelayonly = new Long(8L);
    public static final Long mindelayplusmincost = new Long(9L);
    public static final Long mindelayplusmaxreliability = new Long(10L);
    public static final Long mindelayplusmaxreliabilityplusmincost = new Long(11L);
    public static final Long mindelayplusmaxthroughput = new Long(12L);
    public static final Long mindelayplusmaxthroughputplusmincost = new Long(13L);
    public static final Long mindelayplusmaxthroughputplusmaxreliability = new Long(14L);
    public static final Long mindelayplusmaxthroughputplusmaxreliabilityplusmincost = new Long(15L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("normal".equals(name)) return new Long(0L);
            if ("min-cost-only".equals(name)) return new Long(1L);
            if ("max-reliability-only".equals(name)) return new Long(2L);
            if ("max-reliability-plus-min-cost".equals(name)) return new Long(3L);
            if ("max-throughput-only".equals(name)) return new Long(4L);
            if ("max-throughput-plus-min-cost".equals(name)) return new Long(5L);
            if ("max-throughput-plus-max-reliability".equals(name)) return new Long(6L);
            if ("max-throughput-plus-max-reliability-plus-min-cost".equals(name)) return new Long(7L);
            if ("min-delay-only".equals(name)) return new Long(8L);
            if ("min-delay-plus-min-cost".equals(name)) return new Long(9L);
            if ("min-delay-plus-max-reliability".equals(name)) return new Long(10L);
            if ("min-delay-plus-max-reliability-plus-min-cost".equals(name)) return new Long(11L);
            if ("min-delay-plus-max-throughput".equals(name)) return new Long(12L);
            if ("min-delay-plus-max-throughput-plus-min-cost".equals(name)) return new Long(13L);
            if ("min-delay-plus-max-throughput-plus-max-reliability".equals(name)) return new Long(14L);
            if ("min-delay-plus-max-throughput-plus-max-reliability-plus-min-cost".equals(name)) return new Long(15L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "normal";
            if (new Long(1L).equals(value)) return "min-cost-only";
            if (new Long(2L).equals(value)) return "max-reliability-only";
            if (new Long(3L).equals(value)) return "max-reliability-plus-min-cost";
            if (new Long(4L).equals(value)) return "max-throughput-only";
            if (new Long(5L).equals(value)) return "max-throughput-plus-min-cost";
            if (new Long(6L).equals(value)) return "max-throughput-plus-max-reliability";
            if (new Long(7L).equals(value)) return "max-throughput-plus-max-reliability-plus-min-cost";
            if (new Long(8L).equals(value)) return "min-delay-only";
            if (new Long(9L).equals(value)) return "min-delay-plus-min-cost";
            if (new Long(10L).equals(value)) return "min-delay-plus-max-reliability";
            if (new Long(11L).equals(value)) return "min-delay-plus-max-reliability-plus-min-cost";
            if (new Long(12L).equals(value)) return "min-delay-plus-max-throughput";
            if (new Long(13L).equals(value)) return "min-delay-plus-max-throughput-plus-min-cost";
            if (new Long(14L).equals(value)) return "min-delay-plus-max-throughput-plus-max-reliability";
            if (new Long(15L).equals(value)) return "min-delay-plus-max-throughput-plus-max-reliability-plus-min-cost";
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

    public Attr_IPTOSField()
    {
        setup();
    }

    public Attr_IPTOSField(Serializable o)
    {
        setup(o);
    }
}

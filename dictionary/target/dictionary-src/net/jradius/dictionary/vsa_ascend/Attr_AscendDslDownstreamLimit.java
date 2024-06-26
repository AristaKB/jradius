// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-Dsl-Downstream-Limit<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 99<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> adslcap-dn-1280000 (10)
 * <li> adslcap-dn-1600000 (9)
 * <li> adslcap-dn-1920000 (8)
 * <li> adslcap-dn-2240000 (7)
 * <li> adslcap-dn-2560000 (6)
 * <li> adslcap-dn-2688000 (5)
 * <li> adslcap-dn-3200000 (4)
 * <li> adslcap-dn-4480000 (3)
 * <li> adslcap-dn-5120000 (2)
 * <li> adslcap-dn-6272000 (1)
 * <li> adslcap-dn-640000 (12)
 * <li> adslcap-dn-7168000 (0)
 * <li> adslcap-dn-960000 (11)
 * <li> adsldmt-dn-128000 (121)
 * <li> adsldmt-dn-1280000 (114)
 * <li> adsldmt-dn-1600000 (113)
 * <li> adsldmt-dn-1920000 (112)
 * <li> adsldmt-dn-2240000 (111)
 * <li> adsldmt-dn-256000 (120)
 * <li> adsldmt-dn-2560000 (110)
 * <li> adsldmt-dn-2688000 (109)
 * <li> adsldmt-dn-3200000 (108)
 * <li> adsldmt-dn-384000 (119)
 * <li> adsldmt-dn-4480000 (107)
 * <li> adsldmt-dn-512000 (118)
 * <li> adsldmt-dn-5120000 (106)
 * <li> adsldmt-dn-6272000 (105)
 * <li> adsldmt-dn-640000 (117)
 * <li> adsldmt-dn-7168000 (104)
 * <li> adsldmt-dn-768000 (116)
 * <li> adsldmt-dn-8000000 (103)
 * <li> adsldmt-dn-8960000 (102)
 * <li> adsldmt-dn-9504000 (101)
 * <li> adsldmt-dn-960000 (115)
 * <li> adsldmt-dn-auto (100)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendDslDownstreamLimit extends VSAttribute
{
    public static final String NAME = "Ascend-Dsl-Downstream-Limit";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 99;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long adslcapdn1280000 = new Long(10L);
    public static final Long adslcapdn1600000 = new Long(9L);
    public static final Long adslcapdn1920000 = new Long(8L);
    public static final Long adslcapdn2240000 = new Long(7L);
    public static final Long adslcapdn2560000 = new Long(6L);
    public static final Long adslcapdn2688000 = new Long(5L);
    public static final Long adslcapdn3200000 = new Long(4L);
    public static final Long adslcapdn4480000 = new Long(3L);
    public static final Long adslcapdn5120000 = new Long(2L);
    public static final Long adslcapdn6272000 = new Long(1L);
    public static final Long adslcapdn640000 = new Long(12L);
    public static final Long adslcapdn7168000 = new Long(0L);
    public static final Long adslcapdn960000 = new Long(11L);
    public static final Long adsldmtdn128000 = new Long(121L);
    public static final Long adsldmtdn1280000 = new Long(114L);
    public static final Long adsldmtdn1600000 = new Long(113L);
    public static final Long adsldmtdn1920000 = new Long(112L);
    public static final Long adsldmtdn2240000 = new Long(111L);
    public static final Long adsldmtdn256000 = new Long(120L);
    public static final Long adsldmtdn2560000 = new Long(110L);
    public static final Long adsldmtdn2688000 = new Long(109L);
    public static final Long adsldmtdn3200000 = new Long(108L);
    public static final Long adsldmtdn384000 = new Long(119L);
    public static final Long adsldmtdn4480000 = new Long(107L);
    public static final Long adsldmtdn512000 = new Long(118L);
    public static final Long adsldmtdn5120000 = new Long(106L);
    public static final Long adsldmtdn6272000 = new Long(105L);
    public static final Long adsldmtdn640000 = new Long(117L);
    public static final Long adsldmtdn7168000 = new Long(104L);
    public static final Long adsldmtdn768000 = new Long(116L);
    public static final Long adsldmtdn8000000 = new Long(103L);
    public static final Long adsldmtdn8960000 = new Long(102L);
    public static final Long adsldmtdn9504000 = new Long(101L);
    public static final Long adsldmtdn960000 = new Long(115L);
    public static final Long adsldmtdnauto = new Long(100L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(10L),new Long(9L),new Long(8L),new Long(7L),new Long(6L),new Long(5L),new Long(4L),new Long(3L),new Long(2L),new Long(1L),new Long(12L),new Long(0L),new Long(11L),new Long(121L),new Long(114L),new Long(113L),new Long(112L),new Long(111L),new Long(120L),new Long(110L),new Long(109L),new Long(108L),new Long(119L),new Long(107L),new Long(118L),new Long(106L),new Long(105L),new Long(117L),new Long(104L),new Long(116L),new Long(103L),new Long(102L),new Long(101L),new Long(115L),new Long(100L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("adslcap-dn-1280000".equals(name)) return new Long(10L);
            if ("adslcap-dn-1600000".equals(name)) return new Long(9L);
            if ("adslcap-dn-1920000".equals(name)) return new Long(8L);
            if ("adslcap-dn-2240000".equals(name)) return new Long(7L);
            if ("adslcap-dn-2560000".equals(name)) return new Long(6L);
            if ("adslcap-dn-2688000".equals(name)) return new Long(5L);
            if ("adslcap-dn-3200000".equals(name)) return new Long(4L);
            if ("adslcap-dn-4480000".equals(name)) return new Long(3L);
            if ("adslcap-dn-5120000".equals(name)) return new Long(2L);
            if ("adslcap-dn-6272000".equals(name)) return new Long(1L);
            if ("adslcap-dn-640000".equals(name)) return new Long(12L);
            if ("adslcap-dn-7168000".equals(name)) return new Long(0L);
            if ("adslcap-dn-960000".equals(name)) return new Long(11L);
            if ("adsldmt-dn-128000".equals(name)) return new Long(121L);
            if ("adsldmt-dn-1280000".equals(name)) return new Long(114L);
            if ("adsldmt-dn-1600000".equals(name)) return new Long(113L);
            if ("adsldmt-dn-1920000".equals(name)) return new Long(112L);
            if ("adsldmt-dn-2240000".equals(name)) return new Long(111L);
            if ("adsldmt-dn-256000".equals(name)) return new Long(120L);
            if ("adsldmt-dn-2560000".equals(name)) return new Long(110L);
            if ("adsldmt-dn-2688000".equals(name)) return new Long(109L);
            if ("adsldmt-dn-3200000".equals(name)) return new Long(108L);
            if ("adsldmt-dn-384000".equals(name)) return new Long(119L);
            if ("adsldmt-dn-4480000".equals(name)) return new Long(107L);
            if ("adsldmt-dn-512000".equals(name)) return new Long(118L);
            if ("adsldmt-dn-5120000".equals(name)) return new Long(106L);
            if ("adsldmt-dn-6272000".equals(name)) return new Long(105L);
            if ("adsldmt-dn-640000".equals(name)) return new Long(117L);
            if ("adsldmt-dn-7168000".equals(name)) return new Long(104L);
            if ("adsldmt-dn-768000".equals(name)) return new Long(116L);
            if ("adsldmt-dn-8000000".equals(name)) return new Long(103L);
            if ("adsldmt-dn-8960000".equals(name)) return new Long(102L);
            if ("adsldmt-dn-9504000".equals(name)) return new Long(101L);
            if ("adsldmt-dn-960000".equals(name)) return new Long(115L);
            if ("adsldmt-dn-auto".equals(name)) return new Long(100L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(10L).equals(value)) return "adslcap-dn-1280000";
            if (new Long(9L).equals(value)) return "adslcap-dn-1600000";
            if (new Long(8L).equals(value)) return "adslcap-dn-1920000";
            if (new Long(7L).equals(value)) return "adslcap-dn-2240000";
            if (new Long(6L).equals(value)) return "adslcap-dn-2560000";
            if (new Long(5L).equals(value)) return "adslcap-dn-2688000";
            if (new Long(4L).equals(value)) return "adslcap-dn-3200000";
            if (new Long(3L).equals(value)) return "adslcap-dn-4480000";
            if (new Long(2L).equals(value)) return "adslcap-dn-5120000";
            if (new Long(1L).equals(value)) return "adslcap-dn-6272000";
            if (new Long(12L).equals(value)) return "adslcap-dn-640000";
            if (new Long(0L).equals(value)) return "adslcap-dn-7168000";
            if (new Long(11L).equals(value)) return "adslcap-dn-960000";
            if (new Long(121L).equals(value)) return "adsldmt-dn-128000";
            if (new Long(114L).equals(value)) return "adsldmt-dn-1280000";
            if (new Long(113L).equals(value)) return "adsldmt-dn-1600000";
            if (new Long(112L).equals(value)) return "adsldmt-dn-1920000";
            if (new Long(111L).equals(value)) return "adsldmt-dn-2240000";
            if (new Long(120L).equals(value)) return "adsldmt-dn-256000";
            if (new Long(110L).equals(value)) return "adsldmt-dn-2560000";
            if (new Long(109L).equals(value)) return "adsldmt-dn-2688000";
            if (new Long(108L).equals(value)) return "adsldmt-dn-3200000";
            if (new Long(119L).equals(value)) return "adsldmt-dn-384000";
            if (new Long(107L).equals(value)) return "adsldmt-dn-4480000";
            if (new Long(118L).equals(value)) return "adsldmt-dn-512000";
            if (new Long(106L).equals(value)) return "adsldmt-dn-5120000";
            if (new Long(105L).equals(value)) return "adsldmt-dn-6272000";
            if (new Long(117L).equals(value)) return "adsldmt-dn-640000";
            if (new Long(104L).equals(value)) return "adsldmt-dn-7168000";
            if (new Long(116L).equals(value)) return "adsldmt-dn-768000";
            if (new Long(103L).equals(value)) return "adsldmt-dn-8000000";
            if (new Long(102L).equals(value)) return "adsldmt-dn-8960000";
            if (new Long(101L).equals(value)) return "adsldmt-dn-9504000";
            if (new Long(115L).equals(value)) return "adsldmt-dn-960000";
            if (new Long(100L).equals(value)) return "adsldmt-dn-auto";
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

    public Attr_AscendDslDownstreamLimit()
    {
        setup();
    }

    public Attr_AscendDslDownstreamLimit(Serializable o)
    {
        setup(o);
    }
}

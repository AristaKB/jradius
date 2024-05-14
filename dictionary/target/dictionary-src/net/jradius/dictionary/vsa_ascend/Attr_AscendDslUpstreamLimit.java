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
 * Attribute Name: Ascend-Dsl-Upstream-Limit<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 98<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> adsldmt-up-896000 (153)
 * <li> adslcap-up-1088000 (50)
 * <li> adslcap-up-272000 (56)
 * <li> adslcap-up-408000 (55)
 * <li> adslcap-up-544000 (54)
 * <li> adslcap-up-680000 (53)
 * <li> adslcap-up-816000 (52)
 * <li> adslcap-up-952000 (51)
 * <li> adsldmt-up-1088000 (151)
 * <li> adsldmt-up-128000 (160)
 * <li> adsldmt-up-256000 (159)
 * <li> adsldmt-up-384000 (158)
 * <li> adsldmt-up-512000 (157)
 * <li> adsldmt-up-640000 (156)
 * <li> adsldmt-up-768000 (155)
 * <li> adsldmt-up-800000 (154)
 * <li> adsldmt-up-928000 (152)
 * <li> adsldmt-up-auto (150)
 * <li> sdsl-1168000 (5)
 * <li> sdsl-144000 (0)
 * <li> sdsl-1552000 (6)
 * <li> sdsl-2320000 (7)
 * <li> sdsl-272000 (1)
 * <li> sdsl-400000 (2)
 * <li> sdsl-528000 (3)
 * <li> sdsl-784000 (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendDslUpstreamLimit extends VSAttribute
{
    public static final String NAME = "Ascend-Dsl-Upstream-Limit";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 98;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long adsldmtup896000 = new Long(153L);
    public static final Long adslcapup1088000 = new Long(50L);
    public static final Long adslcapup272000 = new Long(56L);
    public static final Long adslcapup408000 = new Long(55L);
    public static final Long adslcapup544000 = new Long(54L);
    public static final Long adslcapup680000 = new Long(53L);
    public static final Long adslcapup816000 = new Long(52L);
    public static final Long adslcapup952000 = new Long(51L);
    public static final Long adsldmtup1088000 = new Long(151L);
    public static final Long adsldmtup128000 = new Long(160L);
    public static final Long adsldmtup256000 = new Long(159L);
    public static final Long adsldmtup384000 = new Long(158L);
    public static final Long adsldmtup512000 = new Long(157L);
    public static final Long adsldmtup640000 = new Long(156L);
    public static final Long adsldmtup768000 = new Long(155L);
    public static final Long adsldmtup800000 = new Long(154L);
    public static final Long adsldmtup928000 = new Long(152L);
    public static final Long adsldmtupauto = new Long(150L);
    public static final Long sdsl1168000 = new Long(5L);
    public static final Long sdsl144000 = new Long(0L);
    public static final Long sdsl1552000 = new Long(6L);
    public static final Long sdsl2320000 = new Long(7L);
    public static final Long sdsl272000 = new Long(1L);
    public static final Long sdsl400000 = new Long(2L);
    public static final Long sdsl528000 = new Long(3L);
    public static final Long sdsl784000 = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(153L),new Long(50L),new Long(56L),new Long(55L),new Long(54L),new Long(53L),new Long(52L),new Long(51L),new Long(151L),new Long(160L),new Long(159L),new Long(158L),new Long(157L),new Long(156L),new Long(155L),new Long(154L),new Long(152L),new Long(150L),new Long(5L),new Long(0L),new Long(6L),new Long(7L),new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("adsldmt-up-896000".equals(name)) return new Long(153L);
            if ("adslcap-up-1088000".equals(name)) return new Long(50L);
            if ("adslcap-up-272000".equals(name)) return new Long(56L);
            if ("adslcap-up-408000".equals(name)) return new Long(55L);
            if ("adslcap-up-544000".equals(name)) return new Long(54L);
            if ("adslcap-up-680000".equals(name)) return new Long(53L);
            if ("adslcap-up-816000".equals(name)) return new Long(52L);
            if ("adslcap-up-952000".equals(name)) return new Long(51L);
            if ("adsldmt-up-1088000".equals(name)) return new Long(151L);
            if ("adsldmt-up-128000".equals(name)) return new Long(160L);
            if ("adsldmt-up-256000".equals(name)) return new Long(159L);
            if ("adsldmt-up-384000".equals(name)) return new Long(158L);
            if ("adsldmt-up-512000".equals(name)) return new Long(157L);
            if ("adsldmt-up-640000".equals(name)) return new Long(156L);
            if ("adsldmt-up-768000".equals(name)) return new Long(155L);
            if ("adsldmt-up-800000".equals(name)) return new Long(154L);
            if ("adsldmt-up-928000".equals(name)) return new Long(152L);
            if ("adsldmt-up-auto".equals(name)) return new Long(150L);
            if ("sdsl-1168000".equals(name)) return new Long(5L);
            if ("sdsl-144000".equals(name)) return new Long(0L);
            if ("sdsl-1552000".equals(name)) return new Long(6L);
            if ("sdsl-2320000".equals(name)) return new Long(7L);
            if ("sdsl-272000".equals(name)) return new Long(1L);
            if ("sdsl-400000".equals(name)) return new Long(2L);
            if ("sdsl-528000".equals(name)) return new Long(3L);
            if ("sdsl-784000".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(153L).equals(value)) return "adsldmt-up-896000";
            if (new Long(50L).equals(value)) return "adslcap-up-1088000";
            if (new Long(56L).equals(value)) return "adslcap-up-272000";
            if (new Long(55L).equals(value)) return "adslcap-up-408000";
            if (new Long(54L).equals(value)) return "adslcap-up-544000";
            if (new Long(53L).equals(value)) return "adslcap-up-680000";
            if (new Long(52L).equals(value)) return "adslcap-up-816000";
            if (new Long(51L).equals(value)) return "adslcap-up-952000";
            if (new Long(151L).equals(value)) return "adsldmt-up-1088000";
            if (new Long(160L).equals(value)) return "adsldmt-up-128000";
            if (new Long(159L).equals(value)) return "adsldmt-up-256000";
            if (new Long(158L).equals(value)) return "adsldmt-up-384000";
            if (new Long(157L).equals(value)) return "adsldmt-up-512000";
            if (new Long(156L).equals(value)) return "adsldmt-up-640000";
            if (new Long(155L).equals(value)) return "adsldmt-up-768000";
            if (new Long(154L).equals(value)) return "adsldmt-up-800000";
            if (new Long(152L).equals(value)) return "adsldmt-up-928000";
            if (new Long(150L).equals(value)) return "adsldmt-up-auto";
            if (new Long(5L).equals(value)) return "sdsl-1168000";
            if (new Long(0L).equals(value)) return "sdsl-144000";
            if (new Long(6L).equals(value)) return "sdsl-1552000";
            if (new Long(7L).equals(value)) return "sdsl-2320000";
            if (new Long(1L).equals(value)) return "sdsl-272000";
            if (new Long(2L).equals(value)) return "sdsl-400000";
            if (new Long(3L).equals(value)) return "sdsl-528000";
            if (new Long(4L).equals(value)) return "sdsl-784000";
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

    public Attr_AscendDslUpstreamLimit()
    {
        setup();
    }

    public Attr_AscendDslUpstreamLimit(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-Simplified-MNP-Levels<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x0099<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> none (1)
 * <li> mnpLevel3 (2)
 * <li> mnpLevel4 (3)
 * <li> ccittV42 (4)
 * <li> usRoboticsHST (5)
 * <li> synchronousNone (6)
 * <li> mnpLevel2 (7)
 * <li> mnp10 (8)
 * <li> v42Etc (9)
 * <li> mnp10Etc (10)
 * <li> lapmEtc (11)
 * <li> v42Etc2 (12)
 * <li> v42SRej (13)
 * <li> piafs (14)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRSimplifiedMNPLevels extends VSAttribute
{
    public static final String NAME = "USR-Simplified-MNP-Levels";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x0099;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long none = new Long(1L);
    public static final Long mnpLevel3 = new Long(2L);
    public static final Long mnpLevel4 = new Long(3L);
    public static final Long ccittV42 = new Long(4L);
    public static final Long usRoboticsHST = new Long(5L);
    public static final Long synchronousNone = new Long(6L);
    public static final Long mnpLevel2 = new Long(7L);
    public static final Long mnp10 = new Long(8L);
    public static final Long v42Etc = new Long(9L);
    public static final Long mnp10Etc = new Long(10L);
    public static final Long lapmEtc = new Long(11L);
    public static final Long v42Etc2 = new Long(12L);
    public static final Long v42SRej = new Long(13L);
    public static final Long piafs = new Long(14L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("none".equals(name)) return new Long(1L);
            if ("mnpLevel3".equals(name)) return new Long(2L);
            if ("mnpLevel4".equals(name)) return new Long(3L);
            if ("ccittV42".equals(name)) return new Long(4L);
            if ("usRoboticsHST".equals(name)) return new Long(5L);
            if ("synchronousNone".equals(name)) return new Long(6L);
            if ("mnpLevel2".equals(name)) return new Long(7L);
            if ("mnp10".equals(name)) return new Long(8L);
            if ("v42Etc".equals(name)) return new Long(9L);
            if ("mnp10Etc".equals(name)) return new Long(10L);
            if ("lapmEtc".equals(name)) return new Long(11L);
            if ("v42Etc2".equals(name)) return new Long(12L);
            if ("v42SRej".equals(name)) return new Long(13L);
            if ("piafs".equals(name)) return new Long(14L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "none";
            if (new Long(2L).equals(value)) return "mnpLevel3";
            if (new Long(3L).equals(value)) return "mnpLevel4";
            if (new Long(4L).equals(value)) return "ccittV42";
            if (new Long(5L).equals(value)) return "usRoboticsHST";
            if (new Long(6L).equals(value)) return "synchronousNone";
            if (new Long(7L).equals(value)) return "mnpLevel2";
            if (new Long(8L).equals(value)) return "mnp10";
            if (new Long(9L).equals(value)) return "v42Etc";
            if (new Long(10L).equals(value)) return "mnp10Etc";
            if (new Long(11L).equals(value)) return "lapmEtc";
            if (new Long(12L).equals(value)) return "v42Etc2";
            if (new Long(13L).equals(value)) return "v42SRej";
            if (new Long(14L).equals(value)) return "piafs";
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
        setFormat("4,0");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_USRSimplifiedMNPLevels()
    {
        setup();
    }

    public Attr_USRSimplifiedMNPLevels(Serializable o)
    {
        setup(o);
    }
}
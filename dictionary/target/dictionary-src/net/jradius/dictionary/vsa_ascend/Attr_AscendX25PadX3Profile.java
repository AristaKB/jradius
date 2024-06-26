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
 * Attribute Name: Ascend-X25-Pad-X3-Profile<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 29<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> CC_SSP (4)
 * <li> CC_TSP (5)
 * <li> CRT (0)
 * <li> CUSTOM (11)
 * <li> DEFAULT (2)
 * <li> HARDCOPY (6)
 * <li> HDX (7)
 * <li> INFONET (1)
 * <li> NULL (10)
 * <li> POS (9)
 * <li> SCEN (3)
 * <li> SHARK (8)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendX25PadX3Profile extends VSAttribute
{
    public static final String NAME = "Ascend-X25-Pad-X3-Profile";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 29;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long CCSSP = new Long(4L);
    public static final Long CCTSP = new Long(5L);
    public static final Long CRT = new Long(0L);
    public static final Long CUSTOM = new Long(11L);
    public static final Long DEFAULT = new Long(2L);
    public static final Long HARDCOPY = new Long(6L);
    public static final Long HDX = new Long(7L);
    public static final Long INFONET = new Long(1L);
    public static final Long NULL = new Long(10L);
    public static final Long POS = new Long(9L);
    public static final Long SCEN = new Long(3L);
    public static final Long SHARK = new Long(8L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(4L),new Long(5L),new Long(0L),new Long(11L),new Long(2L),new Long(6L),new Long(7L),new Long(1L),new Long(10L),new Long(9L),new Long(3L),new Long(8L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("CC_SSP".equals(name)) return new Long(4L);
            if ("CC_TSP".equals(name)) return new Long(5L);
            if ("CRT".equals(name)) return new Long(0L);
            if ("CUSTOM".equals(name)) return new Long(11L);
            if ("DEFAULT".equals(name)) return new Long(2L);
            if ("HARDCOPY".equals(name)) return new Long(6L);
            if ("HDX".equals(name)) return new Long(7L);
            if ("INFONET".equals(name)) return new Long(1L);
            if ("NULL".equals(name)) return new Long(10L);
            if ("POS".equals(name)) return new Long(9L);
            if ("SCEN".equals(name)) return new Long(3L);
            if ("SHARK".equals(name)) return new Long(8L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(4L).equals(value)) return "CC_SSP";
            if (new Long(5L).equals(value)) return "CC_TSP";
            if (new Long(0L).equals(value)) return "CRT";
            if (new Long(11L).equals(value)) return "CUSTOM";
            if (new Long(2L).equals(value)) return "DEFAULT";
            if (new Long(6L).equals(value)) return "HARDCOPY";
            if (new Long(7L).equals(value)) return "HDX";
            if (new Long(1L).equals(value)) return "INFONET";
            if (new Long(10L).equals(value)) return "NULL";
            if (new Long(9L).equals(value)) return "POS";
            if (new Long(3L).equals(value)) return "SCEN";
            if (new Long(8L).equals(value)) return "SHARK";
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

    public Attr_AscendX25PadX3Profile()
    {
        setup();
    }

    public Attr_AscendX25PadX3Profile(Serializable o)
    {
        setup(o);
    }
}

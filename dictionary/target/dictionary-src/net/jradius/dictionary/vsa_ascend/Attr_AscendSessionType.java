// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-Session-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 18<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Ascend-Session-G711-Alaw (3)
 * <li> Ascend-Session-G711-Ulaw (2)
 * <li> Ascend-Session-G723 (4)
 * <li> Ascend-Session-G723-64KPS (6)
 * <li> Ascend-Session-G728 (7)
 * <li> Ascend-Session-G729 (5)
 * <li> Ascend-Session-RT24 (8)
 * <li> Ascend-Session-Unknown (1)
 * <li> Ascend-Session-Unused (0)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendSessionType extends VSAttribute
{
    public static final String NAME = "Ascend-Session-Type";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 18;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AscendSessionG711Alaw = new Long(3L);
    public static final Long AscendSessionG711Ulaw = new Long(2L);
    public static final Long AscendSessionG723 = new Long(4L);
    public static final Long AscendSessionG72364KPS = new Long(6L);
    public static final Long AscendSessionG728 = new Long(7L);
    public static final Long AscendSessionG729 = new Long(5L);
    public static final Long AscendSessionRT24 = new Long(8L);
    public static final Long AscendSessionUnknown = new Long(1L);
    public static final Long AscendSessionUnused = new Long(0L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(3L),new Long(2L),new Long(4L),new Long(6L),new Long(7L),new Long(5L),new Long(8L),new Long(1L),new Long(0L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Ascend-Session-G711-Alaw".equals(name)) return new Long(3L);
            if ("Ascend-Session-G711-Ulaw".equals(name)) return new Long(2L);
            if ("Ascend-Session-G723".equals(name)) return new Long(4L);
            if ("Ascend-Session-G723-64KPS".equals(name)) return new Long(6L);
            if ("Ascend-Session-G728".equals(name)) return new Long(7L);
            if ("Ascend-Session-G729".equals(name)) return new Long(5L);
            if ("Ascend-Session-RT24".equals(name)) return new Long(8L);
            if ("Ascend-Session-Unknown".equals(name)) return new Long(1L);
            if ("Ascend-Session-Unused".equals(name)) return new Long(0L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(3L).equals(value)) return "Ascend-Session-G711-Alaw";
            if (new Long(2L).equals(value)) return "Ascend-Session-G711-Ulaw";
            if (new Long(4L).equals(value)) return "Ascend-Session-G723";
            if (new Long(6L).equals(value)) return "Ascend-Session-G723-64KPS";
            if (new Long(7L).equals(value)) return "Ascend-Session-G728";
            if (new Long(5L).equals(value)) return "Ascend-Session-G729";
            if (new Long(8L).equals(value)) return "Ascend-Session-RT24";
            if (new Long(1L).equals(value)) return "Ascend-Session-Unknown";
            if (new Long(0L).equals(value)) return "Ascend-Session-Unused";
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

    public Attr_AscendSessionType()
    {
        setup();
    }

    public Attr_AscendSessionType(Serializable o)
    {
        setup(o);
    }
}

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
 * Attribute Name: Tunnel-Algorithm<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 31<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> First (1)
 * <li> Load-Balance (2)
 * <li> WRR (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelAlgorithm extends VSAttribute
{
    public static final String NAME = "Tunnel-Algorithm";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 31;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long First = new Long(1L);
    public static final Long LoadBalance = new Long(2L);
    public static final Long WRR = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("First".equals(name)) return new Long(1L);
            if ("Load-Balance".equals(name)) return new Long(2L);
            if ("WRR".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "First";
            if (new Long(2L).equals(value)) return "Load-Balance";
            if (new Long(3L).equals(value)) return "WRR";
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

    public Attr_TunnelAlgorithm()
    {
        setup();
    }

    public Attr_TunnelAlgorithm(Serializable o)
    {
        setup(o);
    }
}

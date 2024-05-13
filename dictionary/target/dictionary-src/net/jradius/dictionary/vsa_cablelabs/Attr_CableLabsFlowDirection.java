// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_cablelabs;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: CableLabs-Flow-Direction<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4491<br>
 * VSA Type: 50<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Reserved (0)
 * <li> Upstream (1)
 * <li> Downstream (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CableLabsFlowDirection extends VSAttribute
{
    public static final String NAME = "CableLabs-Flow-Direction";
    public static final int VENDOR_ID = 4491;
    public static final int VSA_TYPE = 50;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Reserved = new Long(0L);
    public static final Long Upstream = new Long(1L);
    public static final Long Downstream = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Reserved".equals(name)) return new Long(0L);
            if ("Upstream".equals(name)) return new Long(1L);
            if ("Downstream".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Reserved";
            if (new Long(1L).equals(value)) return "Upstream";
            if (new Long(2L).equals(value)) return "Downstream";
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

    public Attr_CableLabsFlowDirection()
    {
        setup();
    }

    public Attr_CableLabsFlowDirection(Serializable o)
    {
        setup(o);
    }
}

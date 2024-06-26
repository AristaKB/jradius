// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_cablelabs;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: CableLabs-Query-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4491<br>
 * VSA Type: 7<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Reserved (0)
 * <li> Toll-Free-Number-Looukp (1)
 * <li> LNP-Number-Lookup (2)
 * <li> Calling-Name-Delivery-Lookup (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CableLabsQueryType extends VSAttribute
{
    public static final String NAME = "CableLabs-Query-Type";
    public static final int VENDOR_ID = 4491;
    public static final int VSA_TYPE = 7;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Reserved = new Long(0L);
    public static final Long TollFreeNumberLooukp = new Long(1L);
    public static final Long LNPNumberLookup = new Long(2L);
    public static final Long CallingNameDeliveryLookup = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Reserved".equals(name)) return new Long(0L);
            if ("Toll-Free-Number-Looukp".equals(name)) return new Long(1L);
            if ("LNP-Number-Lookup".equals(name)) return new Long(2L);
            if ("Calling-Name-Delivery-Lookup".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Reserved";
            if (new Long(1L).equals(value)) return "Toll-Free-Number-Looukp";
            if (new Long(2L).equals(value)) return "LNP-Number-Lookup";
            if (new Long(3L).equals(value)) return "Calling-Name-Delivery-Lookup";
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

    public Attr_CableLabsQueryType()
    {
        setup();
    }

    public Attr_CableLabsQueryType(Serializable o)
    {
        setup(o);
    }
}

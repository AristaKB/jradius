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
 * Attribute Name: CableLabs-Signal-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4491<br>
 * VSA Type: 51<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Reserved (0)
 * <li> Network-Signal (1)
 * <li> Subject-Signal (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CableLabsSignalType extends VSAttribute
{
    public static final String NAME = "CableLabs-Signal-Type";
    public static final int VENDOR_ID = 4491;
    public static final int VSA_TYPE = 51;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Reserved = new Long(0L);
    public static final Long NetworkSignal = new Long(1L);
    public static final Long SubjectSignal = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Reserved".equals(name)) return new Long(0L);
            if ("Network-Signal".equals(name)) return new Long(1L);
            if ("Subject-Signal".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Reserved";
            if (new Long(1L).equals(value)) return "Network-Signal";
            if (new Long(2L).equals(value)) return "Subject-Signal";
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

    public Attr_CableLabsSignalType()
    {
        setup();
    }

    public Attr_CableLabsSignalType(Serializable o)
    {
        setup(o);
    }
}
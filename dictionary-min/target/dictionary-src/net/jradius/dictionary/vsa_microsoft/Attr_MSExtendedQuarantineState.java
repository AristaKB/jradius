// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: MS-Extended-Quarantine-State<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 57<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Transition (1)
 * <li> Infected (2)
 * <li> Unknown (3)
 * <li> No-Data (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSExtendedQuarantineState extends VSAttribute
{
    public static final String NAME = "MS-Extended-Quarantine-State";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 57;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Transition = new Long(1L);
    public static final Long Infected = new Long(2L);
    public static final Long Unknown = new Long(3L);
    public static final Long NoData = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Transition".equals(name)) return new Long(1L);
            if ("Infected".equals(name)) return new Long(2L);
            if ("Unknown".equals(name)) return new Long(3L);
            if ("No-Data".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Transition";
            if (new Long(2L).equals(value)) return "Infected";
            if (new Long(3L).equals(value)) return "Unknown";
            if (new Long(4L).equals(value)) return "No-Data";
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

    public Attr_MSExtendedQuarantineState()
    {
        setup();
    }

    public Attr_MSExtendedQuarantineState(Serializable o)
    {
        setup(o);
    }
}
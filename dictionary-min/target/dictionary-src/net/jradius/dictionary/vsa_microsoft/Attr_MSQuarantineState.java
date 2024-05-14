// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: MS-Quarantine-State<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 45<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Full-Access (0)
 * <li> Quarantine (1)
 * <li> Probation (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSQuarantineState extends VSAttribute
{
    public static final String NAME = "MS-Quarantine-State";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 45;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long FullAccess = new Long(0L);
    public static final Long Quarantine = new Long(1L);
    public static final Long Probation = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Full-Access".equals(name)) return new Long(0L);
            if ("Quarantine".equals(name)) return new Long(1L);
            if ("Probation".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Full-Access";
            if (new Long(1L).equals(value)) return "Quarantine";
            if (new Long(2L).equals(value)) return "Probation";
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

    public Attr_MSQuarantineState()
    {
        setup();
    }

    public Attr_MSQuarantineState(Serializable o)
    {
        setup(o);
    }
}

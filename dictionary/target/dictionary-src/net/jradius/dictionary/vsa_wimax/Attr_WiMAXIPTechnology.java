// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: WiMAX-IP-Technology<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 23<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Reserved-0 (0)
 * <li> Reserved-1 (1)
 * <li> PMIP4 (2)
 * <li> CMIP4 (3)
 * <li> CMIP6 (4)
 * <li> Ethernet-CS (5)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXIPTechnology extends VSAttribute
{
    public static final String NAME = "WiMAX-IP-Technology";
    public static final int VENDOR_ID = 24757;
    public static final int VSA_TYPE = 23;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Reserved0 = new Long(0L);
    public static final Long Reserved1 = new Long(1L);
    public static final Long PMIP4 = new Long(2L);
    public static final Long CMIP4 = new Long(3L);
    public static final Long CMIP6 = new Long(4L);
    public static final Long EthernetCS = new Long(5L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Reserved-0".equals(name)) return new Long(0L);
            if ("Reserved-1".equals(name)) return new Long(1L);
            if ("PMIP4".equals(name)) return new Long(2L);
            if ("CMIP4".equals(name)) return new Long(3L);
            if ("CMIP6".equals(name)) return new Long(4L);
            if ("Ethernet-CS".equals(name)) return new Long(5L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Reserved-0";
            if (new Long(1L).equals(value)) return "Reserved-1";
            if (new Long(2L).equals(value)) return "PMIP4";
            if (new Long(3L).equals(value)) return "CMIP4";
            if (new Long(4L).equals(value)) return "CMIP6";
            if (new Long(5L).equals(value)) return "Ethernet-CS";
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
        setFormat("1,1,c");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_WiMAXIPTechnology()
    {
        setup();
    }

    public Attr_WiMAXIPTechnology(Serializable o)
    {
        setup(o);
    }
}

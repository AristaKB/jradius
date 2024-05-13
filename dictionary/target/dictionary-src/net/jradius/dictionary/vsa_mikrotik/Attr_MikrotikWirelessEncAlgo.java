// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_mikrotik;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Mikrotik-Wireless-Enc-Algo<br>
 * Attribute Type: 26<br>
 * Vendor Id: 14988<br>
 * VSA Type: 6<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> No-encryption (0)
 * <li> 40-bit-WEP (1)
 * <li> 104-bit-WEP (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MikrotikWirelessEncAlgo extends VSAttribute
{
    public static final String NAME = "Mikrotik-Wireless-Enc-Algo";
    public static final int VENDOR_ID = 14988;
    public static final int VSA_TYPE = 6;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Noencryption = new Long(0L);
    public static final Long _40bitWEP = new Long(1L);
    public static final Long _104bitWEP = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("No-encryption".equals(name)) return new Long(0L);
            if ("40-bit-WEP".equals(name)) return new Long(1L);
            if ("104-bit-WEP".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "No-encryption";
            if (new Long(1L).equals(value)) return "40-bit-WEP";
            if (new Long(2L).equals(value)) return "104-bit-WEP";
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

    public Attr_MikrotikWirelessEncAlgo()
    {
        setup();
    }

    public Attr_MikrotikWirelessEncAlgo(Serializable o)
    {
        setup(o);
    }
}

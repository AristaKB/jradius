// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_erx;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: ERX-IP-Block-Multicast<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4874<br>
 * VSA Type: 101<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> disabled (0)
 * <li> enabled (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ERXIPBlockMulticast extends VSAttribute
{
    public static final String NAME = "ERX-IP-Block-Multicast";
    public static final int VENDOR_ID = 4874;
    public static final int VSA_TYPE = 101;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long disabled = new Long(0L);
    public static final Long enabled = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("disabled".equals(name)) return new Long(0L);
            if ("enabled".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "disabled";
            if (new Long(1L).equals(value)) return "enabled";
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

    public Attr_ERXIPBlockMulticast()
    {
        setup();
    }

    public Attr_ERXIPBlockMulticast(Serializable o)
    {
        setup(o);
    }
}

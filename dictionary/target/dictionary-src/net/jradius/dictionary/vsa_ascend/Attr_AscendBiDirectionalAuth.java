// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-Bi-Directional-Auth<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 46<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Bi-Directional-Auth-Allowed (1)
 * <li> Bi-Directional-Auth-None (0)
 * <li> Bi-Directional-Auth-Required (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendBiDirectionalAuth extends VSAttribute
{
    public static final String NAME = "Ascend-Bi-Directional-Auth";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 46;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long BiDirectionalAuthAllowed = new Long(1L);
    public static final Long BiDirectionalAuthNone = new Long(0L);
    public static final Long BiDirectionalAuthRequired = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(0L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Bi-Directional-Auth-Allowed".equals(name)) return new Long(1L);
            if ("Bi-Directional-Auth-None".equals(name)) return new Long(0L);
            if ("Bi-Directional-Auth-Required".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Bi-Directional-Auth-Allowed";
            if (new Long(0L).equals(value)) return "Bi-Directional-Auth-None";
            if (new Long(2L).equals(value)) return "Bi-Directional-Auth-Required";
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

    public Attr_AscendBiDirectionalAuth()
    {
        setup();
    }

    public Attr_AscendBiDirectionalAuth(Serializable o)
    {
        setup(o);
    }
}

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
 * Attribute Name: CableLabs-Element-Requesting-QoS<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4491<br>
 * VSA Type: 65<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Client (0)
 * <li> Policy-Server (1)
 * <li> Embedded-Client (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CableLabsElementRequestingQoS extends VSAttribute
{
    public static final String NAME = "CableLabs-Element-Requesting-QoS";
    public static final int VENDOR_ID = 4491;
    public static final int VSA_TYPE = 65;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Client = new Long(0L);
    public static final Long PolicyServer = new Long(1L);
    public static final Long EmbeddedClient = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Client".equals(name)) return new Long(0L);
            if ("Policy-Server".equals(name)) return new Long(1L);
            if ("Embedded-Client".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Client";
            if (new Long(1L).equals(value)) return "Policy-Server";
            if (new Long(2L).equals(value)) return "Embedded-Client";
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

    public Attr_CableLabsElementRequestingQoS()
    {
        setup();
    }

    public Attr_CableLabsElementRequestingQoS(Serializable o)
    {
        setup(o);
    }
}

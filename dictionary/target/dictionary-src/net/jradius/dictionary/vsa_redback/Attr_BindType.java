// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Bind-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 42<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> AAA-AUTH-BIND (1)
 * <li> AAA-BYPASS-BIND (2)
 * <li> AAA-INTERFACE-BIND (3)
 * <li> AAA-SUBSCRIBE-BIND (4)
 * <li> AAA-TUNNEL-BIND (5)
 * <li> AAA-SESSION-BIND (6)
 * <li> AAA-Q8021-BIND (7)
 * <li> AAA-MULTI-BIND (8)
 * <li> AAA-DHCP-BIND (9)
 * <li> AAA-MULTI-BIND-SUB (10)
 * <li> AAA-BRIDGE-GROUP-BIND (11)
 * <li> AAA-VLAN-BIND (12)
 * <li> AAA-VLAN-GROUP-BIND (13)
 * <li> AAA-AUTO-SUBSCRIBER-BIND (14)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_BindType extends VSAttribute
{
    public static final String NAME = "Bind-Type";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 42;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AAAAUTHBIND = new Long(1L);
    public static final Long AAABYPASSBIND = new Long(2L);
    public static final Long AAAINTERFACEBIND = new Long(3L);
    public static final Long AAASUBSCRIBEBIND = new Long(4L);
    public static final Long AAATUNNELBIND = new Long(5L);
    public static final Long AAASESSIONBIND = new Long(6L);
    public static final Long AAAQ8021BIND = new Long(7L);
    public static final Long AAAMULTIBIND = new Long(8L);
    public static final Long AAADHCPBIND = new Long(9L);
    public static final Long AAAMULTIBINDSUB = new Long(10L);
    public static final Long AAABRIDGEGROUPBIND = new Long(11L);
    public static final Long AAAVLANBIND = new Long(12L);
    public static final Long AAAVLANGROUPBIND = new Long(13L);
    public static final Long AAAAUTOSUBSCRIBERBIND = new Long(14L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("AAA-AUTH-BIND".equals(name)) return new Long(1L);
            if ("AAA-BYPASS-BIND".equals(name)) return new Long(2L);
            if ("AAA-INTERFACE-BIND".equals(name)) return new Long(3L);
            if ("AAA-SUBSCRIBE-BIND".equals(name)) return new Long(4L);
            if ("AAA-TUNNEL-BIND".equals(name)) return new Long(5L);
            if ("AAA-SESSION-BIND".equals(name)) return new Long(6L);
            if ("AAA-Q8021-BIND".equals(name)) return new Long(7L);
            if ("AAA-MULTI-BIND".equals(name)) return new Long(8L);
            if ("AAA-DHCP-BIND".equals(name)) return new Long(9L);
            if ("AAA-MULTI-BIND-SUB".equals(name)) return new Long(10L);
            if ("AAA-BRIDGE-GROUP-BIND".equals(name)) return new Long(11L);
            if ("AAA-VLAN-BIND".equals(name)) return new Long(12L);
            if ("AAA-VLAN-GROUP-BIND".equals(name)) return new Long(13L);
            if ("AAA-AUTO-SUBSCRIBER-BIND".equals(name)) return new Long(14L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "AAA-AUTH-BIND";
            if (new Long(2L).equals(value)) return "AAA-BYPASS-BIND";
            if (new Long(3L).equals(value)) return "AAA-INTERFACE-BIND";
            if (new Long(4L).equals(value)) return "AAA-SUBSCRIBE-BIND";
            if (new Long(5L).equals(value)) return "AAA-TUNNEL-BIND";
            if (new Long(6L).equals(value)) return "AAA-SESSION-BIND";
            if (new Long(7L).equals(value)) return "AAA-Q8021-BIND";
            if (new Long(8L).equals(value)) return "AAA-MULTI-BIND";
            if (new Long(9L).equals(value)) return "AAA-DHCP-BIND";
            if (new Long(10L).equals(value)) return "AAA-MULTI-BIND-SUB";
            if (new Long(11L).equals(value)) return "AAA-BRIDGE-GROUP-BIND";
            if (new Long(12L).equals(value)) return "AAA-VLAN-BIND";
            if (new Long(13L).equals(value)) return "AAA-VLAN-GROUP-BIND";
            if (new Long(14L).equals(value)) return "AAA-AUTO-SUBSCRIBER-BIND";
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

    public Attr_BindType()
    {
        setup();
    }

    public Attr_BindType(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_shiva;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Shiva-Link-Protocol<br>
 * Attribute Type: 26<br>
 * Vendor Id: 166<br>
 * VSA Type: 97<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> HDLC (1)
 * <li> ARAV1 (2)
 * <li> ARAV2 (3)
 * <li> SHELL (4)
 * <li> AALAP (5)
 * <li> SLIP (6)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ShivaLinkProtocol extends VSAttribute
{
    public static final String NAME = "Shiva-Link-Protocol";
    public static final int VENDOR_ID = 166;
    public static final int VSA_TYPE = 97;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long HDLC = new Long(1L);
    public static final Long ARAV1 = new Long(2L);
    public static final Long ARAV2 = new Long(3L);
    public static final Long SHELL = new Long(4L);
    public static final Long AALAP = new Long(5L);
    public static final Long SLIP = new Long(6L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("HDLC".equals(name)) return new Long(1L);
            if ("ARAV1".equals(name)) return new Long(2L);
            if ("ARAV2".equals(name)) return new Long(3L);
            if ("SHELL".equals(name)) return new Long(4L);
            if ("AALAP".equals(name)) return new Long(5L);
            if ("SLIP".equals(name)) return new Long(6L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "HDLC";
            if (new Long(2L).equals(value)) return "ARAV1";
            if (new Long(3L).equals(value)) return "ARAV2";
            if (new Long(4L).equals(value)) return "SHELL";
            if (new Long(5L).equals(value)) return "AALAP";
            if (new Long(6L).equals(value)) return "SLIP";
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

    public Attr_ShivaLinkProtocol()
    {
        setup();
    }

    public Attr_ShivaLinkProtocol(Serializable o)
    {
        setup(o);
    }
}

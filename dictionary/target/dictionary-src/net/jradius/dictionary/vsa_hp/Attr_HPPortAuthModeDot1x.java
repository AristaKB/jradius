// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_hp;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: HP-Port-Auth-Mode-Dot1x<br>
 * Attribute Type: 26<br>
 * Vendor Id: 11<br>
 * VSA Type: 13<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Port-Based (1)
 * <li> User-Based (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_HPPortAuthModeDot1x extends VSAttribute
{
    public static final String NAME = "HP-Port-Auth-Mode-Dot1x";
    public static final int VENDOR_ID = 11;
    public static final int VSA_TYPE = 13;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long PortBased = new Long(1L);
    public static final Long UserBased = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Port-Based".equals(name)) return new Long(1L);
            if ("User-Based".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Port-Based";
            if (new Long(2L).equals(value)) return "User-Based";
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

    public Attr_HPPortAuthModeDot1x()
    {
        setup();
    }

    public Attr_HPPortAuthModeDot1x(Serializable o)
    {
        setup(o);
    }
}

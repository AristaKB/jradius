// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_redback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Platform-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 98<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> SMS (1)
 * <li> SmartEdge-800 (2)
 * <li> SE-400 (3)
 * <li> SE-100 (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PlatformType extends VSAttribute
{
    public static final String NAME = "Platform-Type";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 98;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long SMS = new Long(1L);
    public static final Long SmartEdge800 = new Long(2L);
    public static final Long SE400 = new Long(3L);
    public static final Long SE100 = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("SMS".equals(name)) return new Long(1L);
            if ("SmartEdge-800".equals(name)) return new Long(2L);
            if ("SE-400".equals(name)) return new Long(3L);
            if ("SE-100".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "SMS";
            if (new Long(2L).equals(value)) return "SmartEdge-800";
            if (new Long(3L).equals(value)) return "SE-400";
            if (new Long(4L).equals(value)) return "SE-100";
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

    public Attr_PlatformType()
    {
        setup();
    }

    public Attr_PlatformType(Serializable o)
    {
        setup(o);
    }
}
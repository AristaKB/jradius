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
 * Attribute Name: Medium-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 38<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> DSL (11)
 * <li> Cable (12)
 * <li> Wireless (13)
 * <li> Satellite (14)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MediumType extends VSAttribute
{
    public static final String NAME = "Medium-Type";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 38;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long DSL = new Long(11L);
    public static final Long Cable = new Long(12L);
    public static final Long Wireless = new Long(13L);
    public static final Long Satellite = new Long(14L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(11L),new Long(12L),new Long(13L),new Long(14L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("DSL".equals(name)) return new Long(11L);
            if ("Cable".equals(name)) return new Long(12L);
            if ("Wireless".equals(name)) return new Long(13L);
            if ("Satellite".equals(name)) return new Long(14L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(11L).equals(value)) return "DSL";
            if (new Long(12L).equals(value)) return "Cable";
            if (new Long(13L).equals(value)) return "Wireless";
            if (new Long(14L).equals(value)) return "Satellite";
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

    public Attr_MediumType()
    {
        setup();
    }

    public Attr_MediumType(Serializable o)
    {
        setup(o);
    }
}

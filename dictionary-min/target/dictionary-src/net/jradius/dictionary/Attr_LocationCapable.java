// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Location-Capable<br>
 * Attribute Type: 131<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Civix-Location (1)
 * <li> Geo-Location (2)
 * <li> Users-Location (4)
 * <li> NAS-Location (8)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LocationCapable extends RadiusAttribute
{
    public static final String NAME = "Location-Capable";
    public static final long TYPE = 131;

    public static final long serialVersionUID = TYPE;

    public static final Long CivixLocation = new Long(1L);
    public static final Long GeoLocation = new Long(2L);
    public static final Long UsersLocation = new Long(4L);
    public static final Long NASLocation = new Long(8L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(4L),new Long(8L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Civix-Location".equals(name)) return new Long(1L);
            if ("Geo-Location".equals(name)) return new Long(2L);
            if ("Users-Location".equals(name)) return new Long(4L);
            if ("NAS-Location".equals(name)) return new Long(8L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Civix-Location";
            if (new Long(2L).equals(value)) return "Geo-Location";
            if (new Long(4L).equals(value)) return "Users-Location";
            if (new Long(8L).equals(value)) return "NAS-Location";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 131;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_LocationCapable()
    {
        setup();
    }

    public Attr_LocationCapable(Serializable o)
    {
        setup(o);
    }
}

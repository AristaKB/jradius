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
 * Attribute Name: Requested-Location-Info<br>
 * Attribute Type: 132<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Civix-Location (1)
 * <li> Geo-Location (2)
 * <li> Users-Location (4)
 * <li> NAS-Location (8)
 * <li> Future-Requests (16)
 * <li> None (32)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_RequestedLocationInfo extends RadiusAttribute
{
    public static final String NAME = "Requested-Location-Info";
    public static final long TYPE = 132;

    public static final long serialVersionUID = TYPE;

    public static final Long CivixLocation = new Long(1L);
    public static final Long GeoLocation = new Long(2L);
    public static final Long UsersLocation = new Long(4L);
    public static final Long NASLocation = new Long(8L);
    public static final Long FutureRequests = new Long(16L);
    public static final Long None = new Long(32L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(4L),new Long(8L),new Long(16L),new Long(32L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Civix-Location".equals(name)) return new Long(1L);
            if ("Geo-Location".equals(name)) return new Long(2L);
            if ("Users-Location".equals(name)) return new Long(4L);
            if ("NAS-Location".equals(name)) return new Long(8L);
            if ("Future-Requests".equals(name)) return new Long(16L);
            if ("None".equals(name)) return new Long(32L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Civix-Location";
            if (new Long(2L).equals(value)) return "Geo-Location";
            if (new Long(4L).equals(value)) return "Users-Location";
            if (new Long(8L).equals(value)) return "NAS-Location";
            if (new Long(16L).equals(value)) return "Future-Requests";
            if (new Long(32L).equals(value)) return "None";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 132;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_RequestedLocationInfo()
    {
        setup();
    }

    public Attr_RequestedLocationInfo(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Strip-User-Name<br>
 * Attribute Type: 1035 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> No (0)
 * <li> Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_StripUserName extends RadiusAttribute
{
    public static final String NAME = "Strip-User-Name";
    public static final long TYPE = 1035;

    public static final long serialVersionUID = TYPE;

    public static final Long No = new Long(0L);
    public static final Long Yes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("No".equals(name)) return new Long(0L);
            if ("Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "No";
            if (new Long(1L).equals(value)) return "Yes";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 1035;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_StripUserName()
    {
        setup();
    }

    public Attr_StripUserName(Serializable o)
    {
        setup(o);
    }
}

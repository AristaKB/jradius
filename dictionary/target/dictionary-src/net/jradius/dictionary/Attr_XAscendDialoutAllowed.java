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
 * Attribute Name: X-Ascend-Dialout-Allowed<br>
 * Attribute Type: 131<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Dialout-Not-Allowed (0)
 * <li> Dialout-Allowed (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendDialoutAllowed extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Dialout-Allowed";
    public static final long TYPE = 131;

    public static final long serialVersionUID = TYPE;

    public static final Long DialoutNotAllowed = new Long(0L);
    public static final Long DialoutAllowed = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Dialout-Not-Allowed".equals(name)) return new Long(0L);
            if ("Dialout-Allowed".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Dialout-Not-Allowed";
            if (new Long(1L).equals(value)) return "Dialout-Allowed";
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

    public Attr_XAscendDialoutAllowed()
    {
        setup();
    }

    public Attr_XAscendDialoutAllowed(Serializable o)
    {
        setup(o);
    }
}

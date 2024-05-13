// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: X-Ascend-Event-Type<br>
 * Attribute Type: 150<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Ascend-ColdStart (1)
 * <li> Ascend-Session-Event (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendEventType extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Event-Type";
    public static final long TYPE = 150;

    public static final long serialVersionUID = TYPE;

    public static final Long AscendColdStart = new Long(1L);
    public static final Long AscendSessionEvent = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Ascend-ColdStart".equals(name)) return new Long(1L);
            if ("Ascend-Session-Event".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Ascend-ColdStart";
            if (new Long(2L).equals(value)) return "Ascend-Session-Event";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 150;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendEventType()
    {
        setup();
    }

    public Attr_XAscendEventType(Serializable o)
    {
        setup(o);
    }
}
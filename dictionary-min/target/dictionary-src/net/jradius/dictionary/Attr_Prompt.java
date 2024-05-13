// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Prompt<br>
 * Attribute Type: 76<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> No-Echo (0)
 * <li> Echo (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_Prompt extends RadiusAttribute
{
    public static final String NAME = "Prompt";
    public static final long TYPE = 76;

    public static final long serialVersionUID = TYPE;

    public static final Long NoEcho = new Long(0L);
    public static final Long Echo = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("No-Echo".equals(name)) return new Long(0L);
            if ("Echo".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "No-Echo";
            if (new Long(1L).equals(value)) return "Echo";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 76;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_Prompt()
    {
        setup();
    }

    public Attr_Prompt(Serializable o)
    {
        setup(o);
    }
}

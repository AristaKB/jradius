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
 * Attribute Name: Multi-Link-Flag<br>
 * Attribute Type: 126<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> True (1)
 * <li> False (0)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MultiLinkFlag extends RadiusAttribute
{
    public static final String NAME = "Multi-Link-Flag";
    public static final long TYPE = 126;

    public static final long serialVersionUID = TYPE;

    public static final Long True = new Long(1L);
    public static final Long False = new Long(0L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(0L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("True".equals(name)) return new Long(1L);
            if ("False".equals(name)) return new Long(0L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "True";
            if (new Long(0L).equals(value)) return "False";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 126;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_MultiLinkFlag()
    {
        setup();
    }

    public Attr_MultiLinkFlag(Serializable o)
    {
        setup(o);
    }
}

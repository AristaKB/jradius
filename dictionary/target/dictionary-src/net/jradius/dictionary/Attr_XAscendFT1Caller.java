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
 * Attribute Name: X-Ascend-FT1-Caller<br>
 * Attribute Type: 175<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> FT1-No (0)
 * <li> FT1-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendFT1Caller extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-FT1-Caller";
    public static final long TYPE = 175;

    public static final long serialVersionUID = TYPE;

    public static final Long FT1No = new Long(0L);
    public static final Long FT1Yes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("FT1-No".equals(name)) return new Long(0L);
            if ("FT1-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "FT1-No";
            if (new Long(1L).equals(value)) return "FT1-Yes";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 175;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendFT1Caller()
    {
        setup();
    }

    public Attr_XAscendFT1Caller(Serializable o)
    {
        setup(o);
    }
}

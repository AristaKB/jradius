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
 * Attribute Name: X-Ascend-Temporary-Rtes<br>
 * Attribute Type: 126<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Temp-Rtes-No (0)
 * <li> Temp-Rtes-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendTemporaryRtes extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Temporary-Rtes";
    public static final long TYPE = 126;

    public static final long serialVersionUID = TYPE;

    public static final Long TempRtesNo = new Long(0L);
    public static final Long TempRtesYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Temp-Rtes-No".equals(name)) return new Long(0L);
            if ("Temp-Rtes-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Temp-Rtes-No";
            if (new Long(1L).equals(value)) return "Temp-Rtes-Yes";
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

    public Attr_XAscendTemporaryRtes()
    {
        setup();
    }

    public Attr_XAscendTemporaryRtes(Serializable o)
    {
        setup(o);
    }
}
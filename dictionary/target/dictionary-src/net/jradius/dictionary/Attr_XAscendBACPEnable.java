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
 * Attribute Name: X-Ascend-BACP-Enable<br>
 * Attribute Type: 133<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> BACP-No (0)
 * <li> BACP-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendBACPEnable extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-BACP-Enable";
    public static final long TYPE = 133;

    public static final long serialVersionUID = TYPE;

    public static final Long BACPNo = new Long(0L);
    public static final Long BACPYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("BACP-No".equals(name)) return new Long(0L);
            if ("BACP-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "BACP-No";
            if (new Long(1L).equals(value)) return "BACP-Yes";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 133;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendBACPEnable()
    {
        setup();
    }

    public Attr_XAscendBACPEnable(Serializable o)
    {
        setup(o);
    }
}

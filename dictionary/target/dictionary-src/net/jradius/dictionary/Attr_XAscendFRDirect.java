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
 * Attribute Name: X-Ascend-FR-Direct<br>
 * Attribute Type: 219<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> FR-Direct-No (0)
 * <li> FR-Direct-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendFRDirect extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-FR-Direct";
    public static final long TYPE = 219;

    public static final long serialVersionUID = TYPE;

    public static final Long FRDirectNo = new Long(0L);
    public static final Long FRDirectYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("FR-Direct-No".equals(name)) return new Long(0L);
            if ("FR-Direct-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "FR-Direct-No";
            if (new Long(1L).equals(value)) return "FR-Direct-Yes";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 219;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendFRDirect()
    {
        setup();
    }

    public Attr_XAscendFRDirect(Serializable o)
    {
        setup(o);
    }
}

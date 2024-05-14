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
 * Attribute Name: X-Ascend-Token-Immediate<br>
 * Attribute Type: 200<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Tok-Imm-No (0)
 * <li> Tok-Imm-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendTokenImmediate extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Token-Immediate";
    public static final long TYPE = 200;

    public static final long serialVersionUID = TYPE;

    public static final Long TokImmNo = new Long(0L);
    public static final Long TokImmYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Tok-Imm-No".equals(name)) return new Long(0L);
            if ("Tok-Imm-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Tok-Imm-No";
            if (new Long(1L).equals(value)) return "Tok-Imm-Yes";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 200;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendTokenImmediate()
    {
        setup();
    }

    public Attr_XAscendTokenImmediate(Serializable o)
    {
        setup(o);
    }
}

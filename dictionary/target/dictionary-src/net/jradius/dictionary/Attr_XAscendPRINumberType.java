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
 * Attribute Name: X-Ascend-PRI-Number-Type<br>
 * Attribute Type: 226<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Unknown-Number (0)
 * <li> Intl-Number (1)
 * <li> National-Number (2)
 * <li> Net-Specific-Number (3)
 * <li> Local-Number (4)
 * <li> Abbrev-Number (5)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendPRINumberType extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-PRI-Number-Type";
    public static final long TYPE = 226;

    public static final long serialVersionUID = TYPE;

    public static final Long UnknownNumber = new Long(0L);
    public static final Long IntlNumber = new Long(1L);
    public static final Long NationalNumber = new Long(2L);
    public static final Long NetSpecificNumber = new Long(3L);
    public static final Long LocalNumber = new Long(4L);
    public static final Long AbbrevNumber = new Long(5L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Unknown-Number".equals(name)) return new Long(0L);
            if ("Intl-Number".equals(name)) return new Long(1L);
            if ("National-Number".equals(name)) return new Long(2L);
            if ("Net-Specific-Number".equals(name)) return new Long(3L);
            if ("Local-Number".equals(name)) return new Long(4L);
            if ("Abbrev-Number".equals(name)) return new Long(5L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Unknown-Number";
            if (new Long(1L).equals(value)) return "Intl-Number";
            if (new Long(2L).equals(value)) return "National-Number";
            if (new Long(3L).equals(value)) return "Net-Specific-Number";
            if (new Long(4L).equals(value)) return "Local-Number";
            if (new Long(5L).equals(value)) return "Abbrev-Number";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 226;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendPRINumberType()
    {
        setup();
    }

    public Attr_XAscendPRINumberType(Serializable o)
    {
        setup(o);
    }
}
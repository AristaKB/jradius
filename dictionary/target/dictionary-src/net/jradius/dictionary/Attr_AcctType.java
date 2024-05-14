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
 * Attribute Name: Acct-Type<br>
 * Attribute Type: 1012 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Local (0)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctType extends RadiusAttribute
{
    public static final String NAME = "Acct-Type";
    public static final long TYPE = 1012;

    public static final long serialVersionUID = TYPE;

    public static final Long Local = new Long(0L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Local".equals(name)) return new Long(0L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Local";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 1012;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_AcctType()
    {
        setup();
    }

    public Attr_AcctType(Serializable o)
    {
        setup(o);
    }
}

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
 * Attribute Name: X-Ascend-PPP-VJ-1172<br>
 * Attribute Type: 211<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> PPP-VJ-1172 (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendPPPVJ1172 extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-PPP-VJ-1172";
    public static final long TYPE = 211;

    public static final long serialVersionUID = TYPE;

    public static final Long PPPVJ1172 = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("PPP-VJ-1172".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "PPP-VJ-1172";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 211;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendPPPVJ1172()
    {
        setup();
    }

    public Attr_XAscendPPPVJ1172(Serializable o)
    {
        setup(o);
    }
}

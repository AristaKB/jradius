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
 * Attribute Name: EAP-IKEv2-AuthType<br>
 * Attribute Type: 1106 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> none (0)
 * <li> secret (1)
 * <li> cert (2)
 * <li> both (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EAPIKEv2AuthType extends RadiusAttribute
{
    public static final String NAME = "EAP-IKEv2-AuthType";
    public static final long TYPE = 1106;

    public static final long serialVersionUID = TYPE;

    public static final Long none = new Long(0L);
    public static final Long secret = new Long(1L);
    public static final Long cert = new Long(2L);
    public static final Long both = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("none".equals(name)) return new Long(0L);
            if ("secret".equals(name)) return new Long(1L);
            if ("cert".equals(name)) return new Long(2L);
            if ("both".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "none";
            if (new Long(1L).equals(value)) return "secret";
            if (new Long(2L).equals(value)) return "cert";
            if (new Long(3L).equals(value)) return "both";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 1106;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_EAPIKEv2AuthType()
    {
        setup();
    }

    public Attr_EAPIKEv2AuthType(Serializable o)
    {
        setup(o);
    }
}

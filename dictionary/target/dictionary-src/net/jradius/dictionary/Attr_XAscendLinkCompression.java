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
 * Attribute Name: X-Ascend-Link-Compression<br>
 * Attribute Type: 233<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Link-Comp-None (0)
 * <li> Link-Comp-Stac (1)
 * <li> Link-Comp-Stac-Draft-9 (2)
 * <li> Link-Comp-MS-Stac (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendLinkCompression extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Link-Compression";
    public static final long TYPE = 233;

    public static final long serialVersionUID = TYPE;

    public static final Long LinkCompNone = new Long(0L);
    public static final Long LinkCompStac = new Long(1L);
    public static final Long LinkCompStacDraft9 = new Long(2L);
    public static final Long LinkCompMSStac = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Link-Comp-None".equals(name)) return new Long(0L);
            if ("Link-Comp-Stac".equals(name)) return new Long(1L);
            if ("Link-Comp-Stac-Draft-9".equals(name)) return new Long(2L);
            if ("Link-Comp-MS-Stac".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Link-Comp-None";
            if (new Long(1L).equals(value)) return "Link-Comp-Stac";
            if (new Long(2L).equals(value)) return "Link-Comp-Stac-Draft-9";
            if (new Long(3L).equals(value)) return "Link-Comp-MS-Stac";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 233;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendLinkCompression()
    {
        setup();
    }

    public Attr_XAscendLinkCompression(Serializable o)
    {
        setup(o);
    }
}

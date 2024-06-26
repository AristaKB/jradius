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
 * Attribute Name: X-Ascend-Route-IPX<br>
 * Attribute Type: 229<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Route-IPX-No (0)
 * <li> Route-IPX-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendRouteIPX extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Route-IPX";
    public static final long TYPE = 229;

    public static final long serialVersionUID = TYPE;

    public static final Long RouteIPXNo = new Long(0L);
    public static final Long RouteIPXYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Route-IPX-No".equals(name)) return new Long(0L);
            if ("Route-IPX-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Route-IPX-No";
            if (new Long(1L).equals(value)) return "Route-IPX-Yes";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 229;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendRouteIPX()
    {
        setup();
    }

    public Attr_XAscendRouteIPX(Serializable o)
    {
        setup(o);
    }
}

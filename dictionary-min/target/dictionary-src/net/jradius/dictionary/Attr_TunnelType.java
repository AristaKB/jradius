// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Tunnel-Type<br>
 * Attribute Type: 64<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> PPTP (1)
 * <li> L2F (2)
 * <li> L2TP (3)
 * <li> ATMP (4)
 * <li> VTP (5)
 * <li> AH (6)
 * <li> IP (7)
 * <li> MIN-IP (8)
 * <li> ESP (9)
 * <li> GRE (10)
 * <li> DVS (11)
 * <li> IP-in-IP (12)
 * <li> VLAN (13)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelType extends RadiusAttribute
{
    public static final String NAME = "Tunnel-Type";
    public static final long TYPE = 64;

    public static final long serialVersionUID = TYPE;

    public static final Long PPTP = new Long(1L);
    public static final Long L2F = new Long(2L);
    public static final Long L2TP = new Long(3L);
    public static final Long ATMP = new Long(4L);
    public static final Long VTP = new Long(5L);
    public static final Long AH = new Long(6L);
    public static final Long IP = new Long(7L);
    public static final Long MINIP = new Long(8L);
    public static final Long ESP = new Long(9L);
    public static final Long GRE = new Long(10L);
    public static final Long DVS = new Long(11L);
    public static final Long IPinIP = new Long(12L);
    public static final Long VLAN = new Long(13L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("PPTP".equals(name)) return new Long(1L);
            if ("L2F".equals(name)) return new Long(2L);
            if ("L2TP".equals(name)) return new Long(3L);
            if ("ATMP".equals(name)) return new Long(4L);
            if ("VTP".equals(name)) return new Long(5L);
            if ("AH".equals(name)) return new Long(6L);
            if ("IP".equals(name)) return new Long(7L);
            if ("MIN-IP".equals(name)) return new Long(8L);
            if ("ESP".equals(name)) return new Long(9L);
            if ("GRE".equals(name)) return new Long(10L);
            if ("DVS".equals(name)) return new Long(11L);
            if ("IP-in-IP".equals(name)) return new Long(12L);
            if ("VLAN".equals(name)) return new Long(13L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "PPTP";
            if (new Long(2L).equals(value)) return "L2F";
            if (new Long(3L).equals(value)) return "L2TP";
            if (new Long(4L).equals(value)) return "ATMP";
            if (new Long(5L).equals(value)) return "VTP";
            if (new Long(6L).equals(value)) return "AH";
            if (new Long(7L).equals(value)) return "IP";
            if (new Long(8L).equals(value)) return "MIN-IP";
            if (new Long(9L).equals(value)) return "ESP";
            if (new Long(10L).equals(value)) return "GRE";
            if (new Long(11L).equals(value)) return "DVS";
            if (new Long(12L).equals(value)) return "IP-in-IP";
            if (new Long(13L).equals(value)) return "VLAN";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 64;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_TunnelType()
    {
        setup();
    }

    public Attr_TunnelType(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Tunnel-Medium-Type<br>
 * Attribute Type: 65<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> IP (1)
 * <li> IPv4 (1)
 * <li> IPv6 (2)
 * <li> NSAP (3)
 * <li> HDLC (4)
 * <li> BBN-1822 (5)
 * <li> IEEE-802 (6)
 * <li> E.163 (7)
 * <li> E.164 (8)
 * <li> F.69 (9)
 * <li> X.121 (10)
 * <li> IPX (11)
 * <li> Appletalk (12)
 * <li> DecNet-IV (13)
 * <li> Banyan-Vines (14)
 * <li> E.164-NSAP (15)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TunnelMediumType extends RadiusAttribute
{
    public static final String NAME = "Tunnel-Medium-Type";
    public static final long TYPE = 65;

    public static final long serialVersionUID = TYPE;

    public static final Long IP = new Long(1L);
    public static final Long IPv4 = new Long(1L);
    public static final Long IPv6 = new Long(2L);
    public static final Long NSAP = new Long(3L);
    public static final Long HDLC = new Long(4L);
    public static final Long BBN1822 = new Long(5L);
    public static final Long IEEE802 = new Long(6L);
    public static final Long E163 = new Long(7L);
    public static final Long E164 = new Long(8L);
    public static final Long F69 = new Long(9L);
    public static final Long X121 = new Long(10L);
    public static final Long IPX = new Long(11L);
    public static final Long Appletalk = new Long(12L);
    public static final Long DecNetIV = new Long(13L);
    public static final Long BanyanVines = new Long(14L);
    public static final Long E164NSAP = new Long(15L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("IP".equals(name)) return new Long(1L);
            if ("IPv4".equals(name)) return new Long(1L);
            if ("IPv6".equals(name)) return new Long(2L);
            if ("NSAP".equals(name)) return new Long(3L);
            if ("HDLC".equals(name)) return new Long(4L);
            if ("BBN-1822".equals(name)) return new Long(5L);
            if ("IEEE-802".equals(name)) return new Long(6L);
            if ("E.163".equals(name)) return new Long(7L);
            if ("E.164".equals(name)) return new Long(8L);
            if ("F.69".equals(name)) return new Long(9L);
            if ("X.121".equals(name)) return new Long(10L);
            if ("IPX".equals(name)) return new Long(11L);
            if ("Appletalk".equals(name)) return new Long(12L);
            if ("DecNet-IV".equals(name)) return new Long(13L);
            if ("Banyan-Vines".equals(name)) return new Long(14L);
            if ("E.164-NSAP".equals(name)) return new Long(15L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "IP";
            if (new Long(2L).equals(value)) return "IPv6";
            if (new Long(3L).equals(value)) return "NSAP";
            if (new Long(4L).equals(value)) return "HDLC";
            if (new Long(5L).equals(value)) return "BBN-1822";
            if (new Long(6L).equals(value)) return "IEEE-802";
            if (new Long(7L).equals(value)) return "E.163";
            if (new Long(8L).equals(value)) return "E.164";
            if (new Long(9L).equals(value)) return "F.69";
            if (new Long(10L).equals(value)) return "X.121";
            if (new Long(11L).equals(value)) return "IPX";
            if (new Long(12L).equals(value)) return "Appletalk";
            if (new Long(13L).equals(value)) return "DecNet-IV";
            if (new Long(14L).equals(value)) return "Banyan-Vines";
            if (new Long(15L).equals(value)) return "E.164-NSAP";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 65;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_TunnelMediumType()
    {
        setup();
    }

    public Attr_TunnelMediumType(Serializable o)
    {
        setup(o);
    }
}

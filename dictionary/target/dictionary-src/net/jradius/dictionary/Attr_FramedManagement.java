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
 * Attribute Name: Framed-Management<br>
 * Attribute Type: 133<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> SNMP (1)
 * <li> Web-Based (2)
 * <li> Netconf (3)
 * <li> FTP (4)
 * <li> TFTP (5)
 * <li> SFTP (6)
 * <li> RCP (7)
 * <li> SCP (8)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FramedManagement extends RadiusAttribute
{
    public static final String NAME = "Framed-Management";
    public static final long TYPE = 133;

    public static final long serialVersionUID = TYPE;

    public static final Long SNMP = new Long(1L);
    public static final Long WebBased = new Long(2L);
    public static final Long Netconf = new Long(3L);
    public static final Long FTP = new Long(4L);
    public static final Long TFTP = new Long(5L);
    public static final Long SFTP = new Long(6L);
    public static final Long RCP = new Long(7L);
    public static final Long SCP = new Long(8L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("SNMP".equals(name)) return new Long(1L);
            if ("Web-Based".equals(name)) return new Long(2L);
            if ("Netconf".equals(name)) return new Long(3L);
            if ("FTP".equals(name)) return new Long(4L);
            if ("TFTP".equals(name)) return new Long(5L);
            if ("SFTP".equals(name)) return new Long(6L);
            if ("RCP".equals(name)) return new Long(7L);
            if ("SCP".equals(name)) return new Long(8L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "SNMP";
            if (new Long(2L).equals(value)) return "Web-Based";
            if (new Long(3L).equals(value)) return "Netconf";
            if (new Long(4L).equals(value)) return "FTP";
            if (new Long(5L).equals(value)) return "TFTP";
            if (new Long(6L).equals(value)) return "SFTP";
            if (new Long(7L).equals(value)) return "RCP";
            if (new Long(8L).equals(value)) return "SCP";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 133;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_FramedManagement()
    {
        setup();
    }

    public Attr_FramedManagement(Serializable o)
    {
        setup(o);
    }
}

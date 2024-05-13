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
 * Attribute Name: Login-TCP-Port<br>
 * Attribute Type: 16<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Telnet (23)
 * <li> Rlogin (513)
 * <li> Rsh (514)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LoginTCPPort extends RadiusAttribute
{
    public static final String NAME = "Login-TCP-Port";
    public static final long TYPE = 16;

    public static final long serialVersionUID = TYPE;

    public static final Long Telnet = new Long(23L);
    public static final Long Rlogin = new Long(513L);
    public static final Long Rsh = new Long(514L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(23L),new Long(513L),new Long(514L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Telnet".equals(name)) return new Long(23L);
            if ("Rlogin".equals(name)) return new Long(513L);
            if ("Rsh".equals(name)) return new Long(514L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(23L).equals(value)) return "Telnet";
            if (new Long(513L).equals(value)) return "Rlogin";
            if (new Long(514L).equals(value)) return "Rsh";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 16;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_LoginTCPPort()
    {
        setup();
    }

    public Attr_LoginTCPPort(Serializable o)
    {
        setup(o);
    }
}
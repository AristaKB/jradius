// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_alteon;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Alteon-Service-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1872<br>
 * VSA Type: 26<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Alteon-L4admin (250)
 * <li> Alteon-Slbadmin (251)
 * <li> Alteon-Oper (252)
 * <li> Alteon-L4oper (253)
 * <li> Alteon-Slboper (254)
 * <li> Alteon-User (255)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AlteonServiceType extends VSAttribute
{
    public static final String NAME = "Alteon-Service-Type";
    public static final int VENDOR_ID = 1872;
    public static final int VSA_TYPE = 26;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AlteonL4admin = new Long(250L);
    public static final Long AlteonSlbadmin = new Long(251L);
    public static final Long AlteonOper = new Long(252L);
    public static final Long AlteonL4oper = new Long(253L);
    public static final Long AlteonSlboper = new Long(254L);
    public static final Long AlteonUser = new Long(255L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(250L),new Long(251L),new Long(252L),new Long(253L),new Long(254L),new Long(255L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Alteon-L4admin".equals(name)) return new Long(250L);
            if ("Alteon-Slbadmin".equals(name)) return new Long(251L);
            if ("Alteon-Oper".equals(name)) return new Long(252L);
            if ("Alteon-L4oper".equals(name)) return new Long(253L);
            if ("Alteon-Slboper".equals(name)) return new Long(254L);
            if ("Alteon-User".equals(name)) return new Long(255L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(250L).equals(value)) return "Alteon-L4admin";
            if (new Long(251L).equals(value)) return "Alteon-Slbadmin";
            if (new Long(252L).equals(value)) return "Alteon-Oper";
            if (new Long(253L).equals(value)) return "Alteon-L4oper";
            if (new Long(254L).equals(value)) return "Alteon-Slboper";
            if (new Long(255L).equals(value)) return "Alteon-User";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_AlteonServiceType()
    {
        setup();
    }

    public Attr_AlteonServiceType(Serializable o)
    {
        setup(o);
    }
}

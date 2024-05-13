// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-NAS-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0xf002<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> 3Com-NMC (0)
 * <li> 3Com-NETServer (1)
 * <li> 3Com-HiPerArc (2)
 * <li> TACACS+-Server (3)
 * <li> 3Com-SA-Server (4)
 * <li> Ascend (5)
 * <li> Generic-RADIUS (6)
 * <li> 3Com-NETBuilder-II (7)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRNASType extends VSAttribute
{
    public static final String NAME = "USR-NAS-Type";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0xf002;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long _3ComNMC = new Long(0L);
    public static final Long _3ComNETServer = new Long(1L);
    public static final Long _3ComHiPerArc = new Long(2L);
    public static final Long TACACSServer = new Long(3L);
    public static final Long _3ComSAServer = new Long(4L);
    public static final Long Ascend = new Long(5L);
    public static final Long GenericRADIUS = new Long(6L);
    public static final Long _3ComNETBuilderII = new Long(7L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("3Com-NMC".equals(name)) return new Long(0L);
            if ("3Com-NETServer".equals(name)) return new Long(1L);
            if ("3Com-HiPerArc".equals(name)) return new Long(2L);
            if ("TACACS+-Server".equals(name)) return new Long(3L);
            if ("3Com-SA-Server".equals(name)) return new Long(4L);
            if ("Ascend".equals(name)) return new Long(5L);
            if ("Generic-RADIUS".equals(name)) return new Long(6L);
            if ("3Com-NETBuilder-II".equals(name)) return new Long(7L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "3Com-NMC";
            if (new Long(1L).equals(value)) return "3Com-NETServer";
            if (new Long(2L).equals(value)) return "3Com-HiPerArc";
            if (new Long(3L).equals(value)) return "TACACS+-Server";
            if (new Long(4L).equals(value)) return "3Com-SA-Server";
            if (new Long(5L).equals(value)) return "Ascend";
            if (new Long(6L).equals(value)) return "Generic-RADIUS";
            if (new Long(7L).equals(value)) return "3Com-NETBuilder-II";
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
        setFormat("4,0");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_USRNASType()
    {
        setup();
    }

    public Attr_USRNASType(Serializable o)
    {
        setup(o);
    }
}

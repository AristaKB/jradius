// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-IPX-Routing<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x9828<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> none (0)
 * <li> send (1)
 * <li> listen (2)
 * <li> respond (3)
 * <li> all (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRIPXRouting extends VSAttribute
{
    public static final String NAME = "USR-IPX-Routing";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x9828;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long none = new Long(0L);
    public static final Long send = new Long(1L);
    public static final Long listen = new Long(2L);
    public static final Long respond = new Long(3L);
    public static final Long all = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("none".equals(name)) return new Long(0L);
            if ("send".equals(name)) return new Long(1L);
            if ("listen".equals(name)) return new Long(2L);
            if ("respond".equals(name)) return new Long(3L);
            if ("all".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "none";
            if (new Long(1L).equals(value)) return "send";
            if (new Long(2L).equals(value)) return "listen";
            if (new Long(3L).equals(value)) return "respond";
            if (new Long(4L).equals(value)) return "all";
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

    public Attr_USRIPXRouting()
    {
        setup();
    }

    public Attr_USRIPXRouting(Serializable o)
    {
        setup(o);
    }
}

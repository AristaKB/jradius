// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_starent;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: SN-Subscriber-Permission<br>
 * Attribute Type: 26<br>
 * Vendor Id: 8164<br>
 * VSA Type: 20<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> None (0)
 * <li> Simple-IP (1)
 * <li> Mobile-IP (2)
 * <li> Simple-IP-Mobile-IP (3)
 * <li> HA-Mobile-IP (4)
 * <li> Simple-IP-HA-Mobile-IP (5)
 * <li> Mobile-IP-HA-Mobile-IP (6)
 * <li> All (7)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SNSubscriberPermission extends VSAttribute
{
    public static final String NAME = "SN-Subscriber-Permission";
    public static final int VENDOR_ID = 8164;
    public static final int VSA_TYPE = 20;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long None = new Long(0L);
    public static final Long SimpleIP = new Long(1L);
    public static final Long MobileIP = new Long(2L);
    public static final Long SimpleIPMobileIP = new Long(3L);
    public static final Long HAMobileIP = new Long(4L);
    public static final Long SimpleIPHAMobileIP = new Long(5L);
    public static final Long MobileIPHAMobileIP = new Long(6L);
    public static final Long All = new Long(7L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("None".equals(name)) return new Long(0L);
            if ("Simple-IP".equals(name)) return new Long(1L);
            if ("Mobile-IP".equals(name)) return new Long(2L);
            if ("Simple-IP-Mobile-IP".equals(name)) return new Long(3L);
            if ("HA-Mobile-IP".equals(name)) return new Long(4L);
            if ("Simple-IP-HA-Mobile-IP".equals(name)) return new Long(5L);
            if ("Mobile-IP-HA-Mobile-IP".equals(name)) return new Long(6L);
            if ("All".equals(name)) return new Long(7L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "None";
            if (new Long(1L).equals(value)) return "Simple-IP";
            if (new Long(2L).equals(value)) return "Mobile-IP";
            if (new Long(3L).equals(value)) return "Simple-IP-Mobile-IP";
            if (new Long(4L).equals(value)) return "HA-Mobile-IP";
            if (new Long(5L).equals(value)) return "Simple-IP-HA-Mobile-IP";
            if (new Long(6L).equals(value)) return "Mobile-IP-HA-Mobile-IP";
            if (new Long(7L).equals(value)) return "All";
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
        setFormat("2,2");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_SNSubscriberPermission()
    {
        setup();
    }

    public Attr_SNSubscriberPermission(Serializable o)
    {
        setup(o);
    }
}

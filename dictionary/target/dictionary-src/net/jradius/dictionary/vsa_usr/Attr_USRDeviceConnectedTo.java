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
 * Attribute Name: USR-Device-Connected-To<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0xBE5F<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> None (1)
 * <li> isdnGateway (2)
 * <li> quadModem (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRDeviceConnectedTo extends VSAttribute
{
    public static final String NAME = "USR-Device-Connected-To";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0xBE5F;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long None = new Long(1L);
    public static final Long isdnGateway = new Long(2L);
    public static final Long quadModem = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("None".equals(name)) return new Long(1L);
            if ("isdnGateway".equals(name)) return new Long(2L);
            if ("quadModem".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "None";
            if (new Long(2L).equals(value)) return "isdnGateway";
            if (new Long(3L).equals(value)) return "quadModem";
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

    public Attr_USRDeviceConnectedTo()
    {
        setup();
    }

    public Attr_USRDeviceConnectedTo(Serializable o)
    {
        setup(o);
    }
}

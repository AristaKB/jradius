// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:37 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: MS-ARAP-PW-Change-Reason<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 21<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Just-Change-Password (1)
 * <li> Expired-Password (2)
 * <li> Admin-Requires-Password-Change (3)
 * <li> Password-Too-Short (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSARAPPWChangeReason extends VSAttribute
{
    public static final String NAME = "MS-ARAP-PW-Change-Reason";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 21;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long JustChangePassword = new Long(1L);
    public static final Long ExpiredPassword = new Long(2L);
    public static final Long AdminRequiresPasswordChange = new Long(3L);
    public static final Long PasswordTooShort = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Just-Change-Password".equals(name)) return new Long(1L);
            if ("Expired-Password".equals(name)) return new Long(2L);
            if ("Admin-Requires-Password-Change".equals(name)) return new Long(3L);
            if ("Password-Too-Short".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Just-Change-Password";
            if (new Long(2L).equals(value)) return "Expired-Password";
            if (new Long(3L).equals(value)) return "Admin-Requires-Password-Change";
            if (new Long(4L).equals(value)) return "Password-Too-Short";
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

    public Attr_MSARAPPWChangeReason()
    {
        setup();
    }

    public Attr_MSARAPPWChangeReason(Serializable o)
    {
        setup(o);
    }
}

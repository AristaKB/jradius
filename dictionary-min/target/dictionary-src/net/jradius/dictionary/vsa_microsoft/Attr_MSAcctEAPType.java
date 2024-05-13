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
 * Attribute Name: MS-Acct-EAP-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 24<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> MD5 (4)
 * <li> OTP (5)
 * <li> Generic-Token-Card (6)
 * <li> TLS (13)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSAcctEAPType extends VSAttribute
{
    public static final String NAME = "MS-Acct-EAP-Type";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 24;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long MD5 = new Long(4L);
    public static final Long OTP = new Long(5L);
    public static final Long GenericTokenCard = new Long(6L);
    public static final Long TLS = new Long(13L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(4L),new Long(5L),new Long(6L),new Long(13L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("MD5".equals(name)) return new Long(4L);
            if ("OTP".equals(name)) return new Long(5L);
            if ("Generic-Token-Card".equals(name)) return new Long(6L);
            if ("TLS".equals(name)) return new Long(13L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(4L).equals(value)) return "MD5";
            if (new Long(5L).equals(value)) return "OTP";
            if (new Long(6L).equals(value)) return "Generic-Token-Card";
            if (new Long(13L).equals(value)) return "TLS";
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

    public Attr_MSAcctEAPType()
    {
        setup();
    }

    public Attr_MSAcctEAPType(Serializable o)
    {
        setup(o);
    }
}

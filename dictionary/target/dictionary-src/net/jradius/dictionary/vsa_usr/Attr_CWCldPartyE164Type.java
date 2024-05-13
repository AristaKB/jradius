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
 * Attribute Name: CW-Cld-Party-E164-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x8012<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> comsUnknown (1)
 * <li> comsInternationalNumber (2)
 * <li> comsNationalNumber (3)
 * <li> comsNetworkSpecificNumber (4)
 * <li> comsSubscriberNumber (5)
 * <li> comsAbbreviatedNumber (6)
 * <li> comsReserved (7)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CWCldPartyE164Type extends VSAttribute
{
    public static final String NAME = "CW-Cld-Party-E164-Type";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x8012;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long comsUnknown = new Long(1L);
    public static final Long comsInternationalNumber = new Long(2L);
    public static final Long comsNationalNumber = new Long(3L);
    public static final Long comsNetworkSpecificNumber = new Long(4L);
    public static final Long comsSubscriberNumber = new Long(5L);
    public static final Long comsAbbreviatedNumber = new Long(6L);
    public static final Long comsReserved = new Long(7L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("comsUnknown".equals(name)) return new Long(1L);
            if ("comsInternationalNumber".equals(name)) return new Long(2L);
            if ("comsNationalNumber".equals(name)) return new Long(3L);
            if ("comsNetworkSpecificNumber".equals(name)) return new Long(4L);
            if ("comsSubscriberNumber".equals(name)) return new Long(5L);
            if ("comsAbbreviatedNumber".equals(name)) return new Long(6L);
            if ("comsReserved".equals(name)) return new Long(7L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "comsUnknown";
            if (new Long(2L).equals(value)) return "comsInternationalNumber";
            if (new Long(3L).equals(value)) return "comsNationalNumber";
            if (new Long(4L).equals(value)) return "comsNetworkSpecificNumber";
            if (new Long(5L).equals(value)) return "comsSubscriberNumber";
            if (new Long(6L).equals(value)) return "comsAbbreviatedNumber";
            if (new Long(7L).equals(value)) return "comsReserved";
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

    public Attr_CWCldPartyE164Type()
    {
        setup();
    }

    public Attr_CWCldPartyE164Type(Serializable o)
    {
        setup(o);
    }
}

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
 * Attribute Name: CW-Trans-Cld-Party-E164-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x8061<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Unknown (1)
 * <li> International-Number (2)
 * <li> National-Number (3)
 * <li> Network-Specific-Number (4)
 * <li> Subscriber-Number (5)
 * <li> Abbreviated-Number (6)
 * <li> Reserved (7)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CWTransCldPartyE164Type extends VSAttribute
{
    public static final String NAME = "CW-Trans-Cld-Party-E164-Type";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x8061;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Unknown = new Long(1L);
    public static final Long InternationalNumber = new Long(2L);
    public static final Long NationalNumber = new Long(3L);
    public static final Long NetworkSpecificNumber = new Long(4L);
    public static final Long SubscriberNumber = new Long(5L);
    public static final Long AbbreviatedNumber = new Long(6L);
    public static final Long Reserved = new Long(7L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Unknown".equals(name)) return new Long(1L);
            if ("International-Number".equals(name)) return new Long(2L);
            if ("National-Number".equals(name)) return new Long(3L);
            if ("Network-Specific-Number".equals(name)) return new Long(4L);
            if ("Subscriber-Number".equals(name)) return new Long(5L);
            if ("Abbreviated-Number".equals(name)) return new Long(6L);
            if ("Reserved".equals(name)) return new Long(7L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Unknown";
            if (new Long(2L).equals(value)) return "International-Number";
            if (new Long(3L).equals(value)) return "National-Number";
            if (new Long(4L).equals(value)) return "Network-Specific-Number";
            if (new Long(5L).equals(value)) return "Subscriber-Number";
            if (new Long(6L).equals(value)) return "Abbreviated-Number";
            if (new Long(7L).equals(value)) return "Reserved";
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

    public Attr_CWTransCldPartyE164Type()
    {
        setup();
    }

    public Attr_CWTransCldPartyE164Type(Serializable o)
    {
        setup(o);
    }
}

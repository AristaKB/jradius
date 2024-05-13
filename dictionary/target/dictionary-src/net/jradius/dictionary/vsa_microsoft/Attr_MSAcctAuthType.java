// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_microsoft;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: MS-Acct-Auth-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 311<br>
 * VSA Type: 23<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> PAP (1)
 * <li> CHAP (2)
 * <li> MS-CHAP-1 (3)
 * <li> MS-CHAP-2 (4)
 * <li> EAP (5)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MSAcctAuthType extends VSAttribute
{
    public static final String NAME = "MS-Acct-Auth-Type";
    public static final int VENDOR_ID = 311;
    public static final int VSA_TYPE = 23;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long PAP = new Long(1L);
    public static final Long CHAP = new Long(2L);
    public static final Long MSCHAP1 = new Long(3L);
    public static final Long MSCHAP2 = new Long(4L);
    public static final Long EAP = new Long(5L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("PAP".equals(name)) return new Long(1L);
            if ("CHAP".equals(name)) return new Long(2L);
            if ("MS-CHAP-1".equals(name)) return new Long(3L);
            if ("MS-CHAP-2".equals(name)) return new Long(4L);
            if ("EAP".equals(name)) return new Long(5L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "PAP";
            if (new Long(2L).equals(value)) return "CHAP";
            if (new Long(3L).equals(value)) return "MS-CHAP-1";
            if (new Long(4L).equals(value)) return "MS-CHAP-2";
            if (new Long(5L).equals(value)) return "EAP";
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

    public Attr_MSAcctAuthType()
    {
        setup();
    }

    public Attr_MSAcctAuthType(Serializable o)
    {
        setup(o);
    }
}
// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-Source-IP-Check<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 96<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Source-IP-Check-No (0)
 * <li> Source-IP-Check-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendSourceIPCheck extends VSAttribute
{
    public static final String NAME = "Ascend-Source-IP-Check";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 96;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long SourceIPCheckNo = new Long(0L);
    public static final Long SourceIPCheckYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Source-IP-Check-No".equals(name)) return new Long(0L);
            if ("Source-IP-Check-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Source-IP-Check-No";
            if (new Long(1L).equals(value)) return "Source-IP-Check-Yes";
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

    public Attr_AscendSourceIPCheck()
    {
        setup();
    }

    public Attr_AscendSourceIPCheck(Serializable o)
    {
        setup(o);
    }
}

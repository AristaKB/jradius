// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-Calling-Id-Presentatn<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 68<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Allowed (0)
 * <li> Number-Not-Available (2)
 * <li> Restricted (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendCallingIdPresentatn extends VSAttribute
{
    public static final String NAME = "Ascend-Calling-Id-Presentatn";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 68;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Allowed = new Long(0L);
    public static final Long NumberNotAvailable = new Long(2L);
    public static final Long Restricted = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(2L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Allowed".equals(name)) return new Long(0L);
            if ("Number-Not-Available".equals(name)) return new Long(2L);
            if ("Restricted".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Allowed";
            if (new Long(2L).equals(value)) return "Number-Not-Available";
            if (new Long(1L).equals(value)) return "Restricted";
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

    public Attr_AscendCallingIdPresentatn()
    {
        setup();
    }

    public Attr_AscendCallingIdPresentatn(Serializable o)
    {
        setup(o);
    }
}
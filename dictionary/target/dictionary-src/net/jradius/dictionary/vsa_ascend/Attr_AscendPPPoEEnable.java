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
 * Attribute Name: Ascend-PPPoE-Enable<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 74<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> PPPoE-No (0)
 * <li> PPPoE-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendPPPoEEnable extends VSAttribute
{
    public static final String NAME = "Ascend-PPPoE-Enable";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 74;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long PPPoENo = new Long(0L);
    public static final Long PPPoEYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("PPPoE-No".equals(name)) return new Long(0L);
            if ("PPPoE-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "PPPoE-No";
            if (new Long(1L).equals(value)) return "PPPoE-Yes";
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

    public Attr_AscendPPPoEEnable()
    {
        setup();
    }

    public Attr_AscendPPPoEEnable(Serializable o)
    {
        setup(o);
    }
}
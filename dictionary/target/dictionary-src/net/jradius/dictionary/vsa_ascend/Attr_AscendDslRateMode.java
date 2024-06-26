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
 * Attribute Name: Ascend-Dsl-Rate-Mode<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 97<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Rate-Mode-AutoBaud (1)
 * <li> Rate-Mode-Single (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendDslRateMode extends VSAttribute
{
    public static final String NAME = "Ascend-Dsl-Rate-Mode";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 97;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long RateModeAutoBaud = new Long(1L);
    public static final Long RateModeSingle = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Rate-Mode-AutoBaud".equals(name)) return new Long(1L);
            if ("Rate-Mode-Single".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Rate-Mode-AutoBaud";
            if (new Long(2L).equals(value)) return "Rate-Mode-Single";
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

    public Attr_AscendDslRateMode()
    {
        setup();
    }

    public Attr_AscendDslRateMode(Serializable o)
    {
        setup(o);
    }
}

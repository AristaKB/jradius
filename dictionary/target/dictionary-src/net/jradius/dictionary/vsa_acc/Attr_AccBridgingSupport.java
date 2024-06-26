// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_acc;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Acc-Bridging-Support<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5<br>
 * VSA Type: 19<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Disabled (1)
 * <li> Enabled (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AccBridgingSupport extends VSAttribute
{
    public static final String NAME = "Acc-Bridging-Support";
    public static final int VENDOR_ID = 5;
    public static final int VSA_TYPE = 19;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Disabled = new Long(1L);
    public static final Long Enabled = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Disabled".equals(name)) return new Long(1L);
            if ("Enabled".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Disabled";
            if (new Long(2L).equals(value)) return "Enabled";
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

    public Attr_AccBridgingSupport()
    {
        setup();
    }

    public Attr_AccBridgingSupport(Serializable o)
    {
        setup(o);
    }
}

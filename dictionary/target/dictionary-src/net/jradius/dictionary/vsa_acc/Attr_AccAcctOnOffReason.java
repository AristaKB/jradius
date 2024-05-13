// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_acc;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Acc-Acct-On-Off-Reason<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5<br>
 * VSA Type: 21<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> NAS-Reset (0)
 * <li> NAS-Reload (1)
 * <li> Configuration-Reset (2)
 * <li> Configuration-Reload (3)
 * <li> Enabled (4)
 * <li> Disabled (5)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AccAcctOnOffReason extends VSAttribute
{
    public static final String NAME = "Acc-Acct-On-Off-Reason";
    public static final int VENDOR_ID = 5;
    public static final int VSA_TYPE = 21;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long NASReset = new Long(0L);
    public static final Long NASReload = new Long(1L);
    public static final Long ConfigurationReset = new Long(2L);
    public static final Long ConfigurationReload = new Long(3L);
    public static final Long Enabled = new Long(4L);
    public static final Long Disabled = new Long(5L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("NAS-Reset".equals(name)) return new Long(0L);
            if ("NAS-Reload".equals(name)) return new Long(1L);
            if ("Configuration-Reset".equals(name)) return new Long(2L);
            if ("Configuration-Reload".equals(name)) return new Long(3L);
            if ("Enabled".equals(name)) return new Long(4L);
            if ("Disabled".equals(name)) return new Long(5L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "NAS-Reset";
            if (new Long(1L).equals(value)) return "NAS-Reload";
            if (new Long(2L).equals(value)) return "Configuration-Reset";
            if (new Long(3L).equals(value)) return "Configuration-Reload";
            if (new Long(4L).equals(value)) return "Enabled";
            if (new Long(5L).equals(value)) return "Disabled";
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

    public Attr_AccAcctOnOffReason()
    {
        setup();
    }

    public Attr_AccAcctOnOffReason(Serializable o)
    {
        setup(o);
    }
}
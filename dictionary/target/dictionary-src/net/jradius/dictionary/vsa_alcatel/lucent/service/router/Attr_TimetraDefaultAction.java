// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_alcatel.lucent.service.router;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Timetra-Default-Action<br>
 * Attribute Type: 26<br>
 * Vendor Id: 6527<br>
 * VSA Type: 5<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> permit-all (1)
 * <li> deny-all (2)
 * <li> none (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TimetraDefaultAction extends VSAttribute
{
    public static final String NAME = "Timetra-Default-Action";
    public static final int VENDOR_ID = 6527;
    public static final int VSA_TYPE = 5;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long permitall = new Long(1L);
    public static final Long denyall = new Long(2L);
    public static final Long none = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("permit-all".equals(name)) return new Long(1L);
            if ("deny-all".equals(name)) return new Long(2L);
            if ("none".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "permit-all";
            if (new Long(2L).equals(value)) return "deny-all";
            if (new Long(3L).equals(value)) return "none";
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

    public Attr_TimetraDefaultAction()
    {
        setup();
    }

    public Attr_TimetraDefaultAction(Serializable o)
    {
        setup(o);
    }
}

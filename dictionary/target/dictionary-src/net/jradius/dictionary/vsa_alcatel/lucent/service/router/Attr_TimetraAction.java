// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_alcatel.lucent.service.router;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Timetra-Action<br>
 * Attribute Type: 26<br>
 * Vendor Id: 6527<br>
 * VSA Type: 7<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> permit (1)
 * <li> deny (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TimetraAction extends VSAttribute
{
    public static final String NAME = "Timetra-Action";
    public static final int VENDOR_ID = 6527;
    public static final int VSA_TYPE = 7;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long permit = new Long(1L);
    public static final Long deny = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("permit".equals(name)) return new Long(1L);
            if ("deny".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "permit";
            if (new Long(2L).equals(value)) return "deny";
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

    public Attr_TimetraAction()
    {
        setup();
    }

    public Attr_TimetraAction(Serializable o)
    {
        setup(o);
    }
}

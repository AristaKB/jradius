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
 * Attribute Name: Ascend-Numbering-Plan-ID<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 105<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> ISDN-Numbering-Plan (1)
 * <li> Private-Numbering-Plan (9)
 * <li> Unknown-Numbering-Plan (0)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendNumberingPlanID extends VSAttribute
{
    public static final String NAME = "Ascend-Numbering-Plan-ID";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 105;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long ISDNNumberingPlan = new Long(1L);
    public static final Long PrivateNumberingPlan = new Long(9L);
    public static final Long UnknownNumberingPlan = new Long(0L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(9L),new Long(0L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("ISDN-Numbering-Plan".equals(name)) return new Long(1L);
            if ("Private-Numbering-Plan".equals(name)) return new Long(9L);
            if ("Unknown-Numbering-Plan".equals(name)) return new Long(0L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "ISDN-Numbering-Plan";
            if (new Long(9L).equals(value)) return "Private-Numbering-Plan";
            if (new Long(0L).equals(value)) return "Unknown-Numbering-Plan";
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

    public Attr_AscendNumberingPlanID()
    {
        setup();
    }

    public Attr_AscendNumberingPlanID(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_erx;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: ERX-Atm-Service-Category<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4874<br>
 * VSA Type: 14<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> UBR (1)
 * <li> UBRPCR (2)
 * <li> nrtVBR (3)
 * <li> CBR (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ERXAtmServiceCategory extends VSAttribute
{
    public static final String NAME = "ERX-Atm-Service-Category";
    public static final int VENDOR_ID = 4874;
    public static final int VSA_TYPE = 14;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long UBR = new Long(1L);
    public static final Long UBRPCR = new Long(2L);
    public static final Long nrtVBR = new Long(3L);
    public static final Long CBR = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("UBR".equals(name)) return new Long(1L);
            if ("UBRPCR".equals(name)) return new Long(2L);
            if ("nrtVBR".equals(name)) return new Long(3L);
            if ("CBR".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "UBR";
            if (new Long(2L).equals(value)) return "UBRPCR";
            if (new Long(3L).equals(value)) return "nrtVBR";
            if (new Long(4L).equals(value)) return "CBR";
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

    public Attr_ERXAtmServiceCategory()
    {
        setup();
    }

    public Attr_ERXAtmServiceCategory(Serializable o)
    {
        setup(o);
    }
}

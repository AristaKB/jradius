// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_chillispot;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: ChilliSpot-Acct-View-Point<br>
 * Attribute Type: 26<br>
 * Vendor Id: 14559<br>
 * VSA Type: 10<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> ChilliSpot-NAS-View-Point (1)
 * <li> ChilliSpot-Client-View-Point (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ChilliSpotAcctViewPoint extends VSAttribute
{
    public static final String NAME = "ChilliSpot-Acct-View-Point";
    public static final int VENDOR_ID = 14559;
    public static final int VSA_TYPE = 10;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long ChilliSpotNASViewPoint = new Long(1L);
    public static final Long ChilliSpotClientViewPoint = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("ChilliSpot-NAS-View-Point".equals(name)) return new Long(1L);
            if ("ChilliSpot-Client-View-Point".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "ChilliSpot-NAS-View-Point";
            if (new Long(2L).equals(value)) return "ChilliSpot-Client-View-Point";
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

    public Attr_ChilliSpotAcctViewPoint()
    {
        setup();
    }

    public Attr_ChilliSpotAcctViewPoint(Serializable o)
    {
        setup(o);
    }
}

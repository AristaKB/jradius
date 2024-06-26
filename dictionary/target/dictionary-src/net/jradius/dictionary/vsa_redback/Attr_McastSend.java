// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Mcast-Send<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 33<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> NO-SEND (1)
 * <li> SEND (2)
 * <li> UNSOLICITED-SEND (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_McastSend extends VSAttribute
{
    public static final String NAME = "Mcast-Send";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 33;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long NOSEND = new Long(1L);
    public static final Long SEND = new Long(2L);
    public static final Long UNSOLICITEDSEND = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("NO-SEND".equals(name)) return new Long(1L);
            if ("SEND".equals(name)) return new Long(2L);
            if ("UNSOLICITED-SEND".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "NO-SEND";
            if (new Long(2L).equals(value)) return "SEND";
            if (new Long(3L).equals(value)) return "UNSOLICITED-SEND";
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

    public Attr_McastSend()
    {
        setup();
    }

    public Attr_McastSend(Serializable o)
    {
        setup(o);
    }
}

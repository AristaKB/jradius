// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-RMMIE-Status<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x01cd<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> notEnabledInLocalModem (1)
 * <li> notDetectedInRemoteModem (2)
 * <li> ok (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRRMMIEStatus extends VSAttribute
{
    public static final String NAME = "USR-RMMIE-Status";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x01cd;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long notEnabledInLocalModem = new Long(1L);
    public static final Long notDetectedInRemoteModem = new Long(2L);
    public static final Long ok = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("notEnabledInLocalModem".equals(name)) return new Long(1L);
            if ("notDetectedInRemoteModem".equals(name)) return new Long(2L);
            if ("ok".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "notEnabledInLocalModem";
            if (new Long(2L).equals(value)) return "notDetectedInRemoteModem";
            if (new Long(3L).equals(value)) return "ok";
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
        setFormat("4,0");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_USRRMMIEStatus()
    {
        setup();
    }

    public Attr_USRRMMIEStatus(Serializable o)
    {
        setup(o);
    }
}

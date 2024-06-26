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
 * Attribute Name: Acc-Callback-CBCP-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5<br>
 * VSA Type: 37<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> CBCP-None (1)
 * <li> CBCP-User-Specified (2)
 * <li> CBCP-Pre-Specified (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AccCallbackCBCPType extends VSAttribute
{
    public static final String NAME = "Acc-Callback-CBCP-Type";
    public static final int VENDOR_ID = 5;
    public static final int VSA_TYPE = 37;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long CBCPNone = new Long(1L);
    public static final Long CBCPUserSpecified = new Long(2L);
    public static final Long CBCPPreSpecified = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("CBCP-None".equals(name)) return new Long(1L);
            if ("CBCP-User-Specified".equals(name)) return new Long(2L);
            if ("CBCP-Pre-Specified".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "CBCP-None";
            if (new Long(2L).equals(value)) return "CBCP-User-Specified";
            if (new Long(3L).equals(value)) return "CBCP-Pre-Specified";
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

    public Attr_AccCallbackCBCPType()
    {
        setup();
    }

    public Attr_AccCallbackCBCPType(Serializable o)
    {
        setup(o);
    }
}

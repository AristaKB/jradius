// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_bay.networks;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Annex-Tunnel-Authen-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1584<br>
 * VSA Type: 38<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> none (0)
 * <li> kmd5-128 (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AnnexTunnelAuthenType extends VSAttribute
{
    public static final String NAME = "Annex-Tunnel-Authen-Type";
    public static final int VENDOR_ID = 1584;
    public static final int VSA_TYPE = 38;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long none = new Long(0L);
    public static final Long kmd5128 = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("none".equals(name)) return new Long(0L);
            if ("kmd5-128".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "none";
            if (new Long(1L).equals(value)) return "kmd5-128";
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

    public Attr_AnnexTunnelAuthenType()
    {
        setup();
    }

    public Attr_AnnexTunnelAuthenType(Serializable o)
    {
        setup(o);
    }
}

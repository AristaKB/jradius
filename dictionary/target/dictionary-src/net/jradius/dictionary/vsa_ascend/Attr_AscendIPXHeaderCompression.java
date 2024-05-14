// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-IPX-Header-Compression<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 65<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> IPX-Header-Compression-No (0)
 * <li> IPX-Header-Compression-Yes (1)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendIPXHeaderCompression extends VSAttribute
{
    public static final String NAME = "Ascend-IPX-Header-Compression";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 65;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long IPXHeaderCompressionNo = new Long(0L);
    public static final Long IPXHeaderCompressionYes = new Long(1L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("IPX-Header-Compression-No".equals(name)) return new Long(0L);
            if ("IPX-Header-Compression-Yes".equals(name)) return new Long(1L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "IPX-Header-Compression-No";
            if (new Long(1L).equals(value)) return "IPX-Header-Compression-Yes";
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

    public Attr_AscendIPXHeaderCompression()
    {
        setup();
    }

    public Attr_AscendIPXHeaderCompression(Serializable o)
    {
        setup(o);
    }
}

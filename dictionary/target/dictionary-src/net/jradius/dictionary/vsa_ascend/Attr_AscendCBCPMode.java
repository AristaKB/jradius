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
 * Attribute Name: Ascend-CBCP-Mode<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 113<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> CBCP-No-Callback (1)
 * <li> CBCP-User-Callback (2)
 * <li> CBCP-Profile-Callback (3)
 * <li> CBCP-Any-Or-No (7)
 * <li> CBCP-Off (8)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendCBCPMode extends VSAttribute
{
    public static final String NAME = "Ascend-CBCP-Mode";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 113;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long CBCPNoCallback = new Long(1L);
    public static final Long CBCPUserCallback = new Long(2L);
    public static final Long CBCPProfileCallback = new Long(3L);
    public static final Long CBCPAnyOrNo = new Long(7L);
    public static final Long CBCPOff = new Long(8L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(7L),new Long(8L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("CBCP-No-Callback".equals(name)) return new Long(1L);
            if ("CBCP-User-Callback".equals(name)) return new Long(2L);
            if ("CBCP-Profile-Callback".equals(name)) return new Long(3L);
            if ("CBCP-Any-Or-No".equals(name)) return new Long(7L);
            if ("CBCP-Off".equals(name)) return new Long(8L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "CBCP-No-Callback";
            if (new Long(2L).equals(value)) return "CBCP-User-Callback";
            if (new Long(3L).equals(value)) return "CBCP-Profile-Callback";
            if (new Long(7L).equals(value)) return "CBCP-Any-Or-No";
            if (new Long(8L).equals(value)) return "CBCP-Off";
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

    public Attr_AscendCBCPMode()
    {
        setup();
    }

    public Attr_AscendCBCPMode(Serializable o)
    {
        setup(o);
    }
}

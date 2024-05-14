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
 * Attribute Name: Ascend-FR-Link-Status-DLCI<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 106<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Ascend-FR-LMI-Dlci-0 (0)
 * <li> Ascend-FR-LMI-Dlci-1023 (1023)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendFRLinkStatusDLCI extends VSAttribute
{
    public static final String NAME = "Ascend-FR-Link-Status-DLCI";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 106;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AscendFRLMIDlci0 = new Long(0L);
    public static final Long AscendFRLMIDlci1023 = new Long(1023L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1023L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Ascend-FR-LMI-Dlci-0".equals(name)) return new Long(0L);
            if ("Ascend-FR-LMI-Dlci-1023".equals(name)) return new Long(1023L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Ascend-FR-LMI-Dlci-0";
            if (new Long(1023L).equals(value)) return "Ascend-FR-LMI-Dlci-1023";
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

    public Attr_AscendFRLinkStatusDLCI()
    {
        setup();
    }

    public Attr_AscendFRLinkStatusDLCI(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_gandalf;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Gandalf-PPP-NCP-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 64<br>
 * VSA Type: 7<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> BCP (2)
 * <li> IPCP (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_GandalfPPPNCPType extends VSAttribute
{
    public static final String NAME = "Gandalf-PPP-NCP-Type";
    public static final int VENDOR_ID = 64;
    public static final int VSA_TYPE = 7;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long BCP = new Long(2L);
    public static final Long IPCP = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("BCP".equals(name)) return new Long(2L);
            if ("IPCP".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(2L).equals(value)) return "BCP";
            if (new Long(3L).equals(value)) return "IPCP";
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

    public Attr_GandalfPPPNCPType()
    {
        setup();
    }

    public Attr_GandalfPPPNCPType(Serializable o)
    {
        setup(o);
    }
}
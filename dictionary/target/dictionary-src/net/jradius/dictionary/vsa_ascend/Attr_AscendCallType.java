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
 * Attribute Name: Ascend-Call-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 177<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Switched (0)
 * <li> Nailed (1)
 * <li> Nailed/Mpp (2)
 * <li> Perm/Switched (3)
 * <li> AO/DI (6)
 * <li> MegaMax (7)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendCallType extends VSAttribute
{
    public static final String NAME = "Ascend-Call-Type";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 177;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Switched = new Long(0L);
    public static final Long Nailed = new Long(1L);
    public static final Long NailedMpp = new Long(2L);
    public static final Long PermSwitched = new Long(3L);
    public static final Long AODI = new Long(6L);
    public static final Long MegaMax = new Long(7L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(6L),new Long(7L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Switched".equals(name)) return new Long(0L);
            if ("Nailed".equals(name)) return new Long(1L);
            if ("Nailed/Mpp".equals(name)) return new Long(2L);
            if ("Perm/Switched".equals(name)) return new Long(3L);
            if ("AO/DI".equals(name)) return new Long(6L);
            if ("MegaMax".equals(name)) return new Long(7L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Switched";
            if (new Long(1L).equals(value)) return "Nailed";
            if (new Long(2L).equals(value)) return "Nailed/Mpp";
            if (new Long(3L).equals(value)) return "Perm/Switched";
            if (new Long(6L).equals(value)) return "AO/DI";
            if (new Long(7L).equals(value)) return "MegaMax";
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

    public Attr_AscendCallType()
    {
        setup();
    }

    public Attr_AscendCallType(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_shiva;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Shiva-Circuit-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 166<br>
 * VSA Type: 61<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Primary (1)
 * <li> Secondary-Backup (2)
 * <li> Secondary-Augment (3)
 * <li> Secondary-Switch (4)
 * <li> Listener (5)
 * <li> RADIUS (6)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ShivaCircuitType extends VSAttribute
{
    public static final String NAME = "Shiva-Circuit-Type";
    public static final int VENDOR_ID = 166;
    public static final int VSA_TYPE = 61;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Primary = new Long(1L);
    public static final Long SecondaryBackup = new Long(2L);
    public static final Long SecondaryAugment = new Long(3L);
    public static final Long SecondarySwitch = new Long(4L);
    public static final Long Listener = new Long(5L);
    public static final Long RADIUS = new Long(6L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Primary".equals(name)) return new Long(1L);
            if ("Secondary-Backup".equals(name)) return new Long(2L);
            if ("Secondary-Augment".equals(name)) return new Long(3L);
            if ("Secondary-Switch".equals(name)) return new Long(4L);
            if ("Listener".equals(name)) return new Long(5L);
            if ("RADIUS".equals(name)) return new Long(6L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Primary";
            if (new Long(2L).equals(value)) return "Secondary-Backup";
            if (new Long(3L).equals(value)) return "Secondary-Augment";
            if (new Long(4L).equals(value)) return "Secondary-Switch";
            if (new Long(5L).equals(value)) return "Listener";
            if (new Long(6L).equals(value)) return "RADIUS";
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

    public Attr_ShivaCircuitType()
    {
        setup();
    }

    public Attr_ShivaCircuitType(Serializable o)
    {
        setup(o);
    }
}

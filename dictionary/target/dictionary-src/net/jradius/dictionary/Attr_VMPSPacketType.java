// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: VMPS-Packet-Type<br>
 * Attribute Type: 0x2b00 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> VMPS-Join-Request (1)
 * <li> VMPS-Join-Response (2)
 * <li> VMPS-Reconfirm-Request (3)
 * <li> VMPS-Reconfirm-Response (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VMPSPacketType extends RadiusAttribute
{
    public static final String NAME = "VMPS-Packet-Type";
    public static final long TYPE = 0x2b00;

    public static final long serialVersionUID = TYPE;

    public static final Long VMPSJoinRequest = new Long(1L);
    public static final Long VMPSJoinResponse = new Long(2L);
    public static final Long VMPSReconfirmRequest = new Long(3L);
    public static final Long VMPSReconfirmResponse = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("VMPS-Join-Request".equals(name)) return new Long(1L);
            if ("VMPS-Join-Response".equals(name)) return new Long(2L);
            if ("VMPS-Reconfirm-Request".equals(name)) return new Long(3L);
            if ("VMPS-Reconfirm-Response".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "VMPS-Join-Request";
            if (new Long(2L).equals(value)) return "VMPS-Join-Response";
            if (new Long(3L).equals(value)) return "VMPS-Reconfirm-Request";
            if (new Long(4L).equals(value)) return "VMPS-Reconfirm-Response";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 0x2b00;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_VMPSPacketType()
    {
        setup();
    }

    public Attr_VMPSPacketType(Serializable o)
    {
        setup(o);
    }
}

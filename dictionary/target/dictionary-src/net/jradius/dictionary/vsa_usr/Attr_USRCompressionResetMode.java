// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-Compression-Reset-Mode<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x980a<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Auto (0)
 * <li> Reset-Every-Packet (1)
 * <li> Reset-On-Error (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRCompressionResetMode extends VSAttribute
{
    public static final String NAME = "USR-Compression-Reset-Mode";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x980a;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Auto = new Long(0L);
    public static final Long ResetEveryPacket = new Long(1L);
    public static final Long ResetOnError = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Auto".equals(name)) return new Long(0L);
            if ("Reset-Every-Packet".equals(name)) return new Long(1L);
            if ("Reset-On-Error".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Auto";
            if (new Long(1L).equals(value)) return "Reset-Every-Packet";
            if (new Long(2L).equals(value)) return "Reset-On-Error";
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

    public Attr_USRCompressionResetMode()
    {
        setup();
    }

    public Attr_USRCompressionResetMode(Serializable o)
    {
        setup(o);
    }
}

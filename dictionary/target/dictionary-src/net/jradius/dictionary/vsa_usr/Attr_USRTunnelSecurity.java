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
 * Attribute Name: USR-Tunnel-Security<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x9844<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> None (0)
 * <li> Control-Only (1)
 * <li> Data-Only (2)
 * <li> Both-Data-and-Control (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRTunnelSecurity extends VSAttribute
{
    public static final String NAME = "USR-Tunnel-Security";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x9844;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long None = new Long(0L);
    public static final Long ControlOnly = new Long(1L);
    public static final Long DataOnly = new Long(2L);
    public static final Long BothDataandControl = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("None".equals(name)) return new Long(0L);
            if ("Control-Only".equals(name)) return new Long(1L);
            if ("Data-Only".equals(name)) return new Long(2L);
            if ("Both-Data-and-Control".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "None";
            if (new Long(1L).equals(value)) return "Control-Only";
            if (new Long(2L).equals(value)) return "Data-Only";
            if (new Long(3L).equals(value)) return "Both-Data-and-Control";
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

    public Attr_USRTunnelSecurity()
    {
        setup();
    }

    public Attr_USRTunnelSecurity(Serializable o)
    {
        setup(o);
    }
}
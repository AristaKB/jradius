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
 * Attribute Name: VMPS-Error-Code<br>
 * Attribute Type: 0x2b01 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> VMPS-No-Error (0)
 * <li> VMPS-Wrong-Version (1)
 * <li> VMPS-Insufficient-Resources (2)
 * <li> VMPS-Deny (3)
 * <li> VMPS-Shutdown (4)
 * <li> VMPS-Wrong-Mgmt-Domain (5)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VMPSErrorCode extends RadiusAttribute
{
    public static final String NAME = "VMPS-Error-Code";
    public static final long TYPE = 0x2b01;

    public static final long serialVersionUID = TYPE;

    public static final Long VMPSNoError = new Long(0L);
    public static final Long VMPSWrongVersion = new Long(1L);
    public static final Long VMPSInsufficientResources = new Long(2L);
    public static final Long VMPSDeny = new Long(3L);
    public static final Long VMPSShutdown = new Long(4L);
    public static final Long VMPSWrongMgmtDomain = new Long(5L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("VMPS-No-Error".equals(name)) return new Long(0L);
            if ("VMPS-Wrong-Version".equals(name)) return new Long(1L);
            if ("VMPS-Insufficient-Resources".equals(name)) return new Long(2L);
            if ("VMPS-Deny".equals(name)) return new Long(3L);
            if ("VMPS-Shutdown".equals(name)) return new Long(4L);
            if ("VMPS-Wrong-Mgmt-Domain".equals(name)) return new Long(5L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "VMPS-No-Error";
            if (new Long(1L).equals(value)) return "VMPS-Wrong-Version";
            if (new Long(2L).equals(value)) return "VMPS-Insufficient-Resources";
            if (new Long(3L).equals(value)) return "VMPS-Deny";
            if (new Long(4L).equals(value)) return "VMPS-Shutdown";
            if (new Long(5L).equals(value)) return "VMPS-Wrong-Mgmt-Domain";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 0x2b01;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_VMPSErrorCode()
    {
        setup();
    }

    public Attr_VMPSErrorCode(Serializable o)
    {
        setup(o);
    }
}

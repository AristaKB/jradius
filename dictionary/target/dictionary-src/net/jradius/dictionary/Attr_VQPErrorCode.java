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
 * Attribute Name: VQP-Error-Code<br>
 * Attribute Type: 0x2b01 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> VQP-No-Error (0)
 * <li> VQP-Wrong-Version (1)
 * <li> VQP-Insufficient-Resources (2)
 * <li> VQP-Deny (3)
 * <li> VQP-Shutdown (4)
 * <li> VQP-Wrong-Mgmt-Domain (5)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_VQPErrorCode extends RadiusAttribute
{
    public static final String NAME = "VQP-Error-Code";
    public static final long TYPE = 0x2b01;

    public static final long serialVersionUID = TYPE;

    public static final Long VQPNoError = new Long(0L);
    public static final Long VQPWrongVersion = new Long(1L);
    public static final Long VQPInsufficientResources = new Long(2L);
    public static final Long VQPDeny = new Long(3L);
    public static final Long VQPShutdown = new Long(4L);
    public static final Long VQPWrongMgmtDomain = new Long(5L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("VQP-No-Error".equals(name)) return new Long(0L);
            if ("VQP-Wrong-Version".equals(name)) return new Long(1L);
            if ("VQP-Insufficient-Resources".equals(name)) return new Long(2L);
            if ("VQP-Deny".equals(name)) return new Long(3L);
            if ("VQP-Shutdown".equals(name)) return new Long(4L);
            if ("VQP-Wrong-Mgmt-Domain".equals(name)) return new Long(5L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "VQP-No-Error";
            if (new Long(1L).equals(value)) return "VQP-Wrong-Version";
            if (new Long(2L).equals(value)) return "VQP-Insufficient-Resources";
            if (new Long(3L).equals(value)) return "VQP-Deny";
            if (new Long(4L).equals(value)) return "VQP-Shutdown";
            if (new Long(5L).equals(value)) return "VQP-Wrong-Mgmt-Domain";
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

    public Attr_VQPErrorCode()
    {
        setup();
    }

    public Attr_VQPErrorCode(Serializable o)
    {
        setup(o);
    }
}

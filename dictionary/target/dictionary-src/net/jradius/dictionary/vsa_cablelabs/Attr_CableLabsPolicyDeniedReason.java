// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_cablelabs;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: CableLabs-Policy-Denied-Reason<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4491<br>
 * VSA Type: 67<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Policy-Server-Admission-Control-Failure (1)
 * <li> Insufficient-Resources (2)
 * <li> Unknown-Subscriber (3)
 * <li> Unauthorized-AMID (4)
 * <li> Undefined-Service-Class-Name (5)
 * <li> Incompatible-Envelope (6)
 * <li> Other (127)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CableLabsPolicyDeniedReason extends VSAttribute
{
    public static final String NAME = "CableLabs-Policy-Denied-Reason";
    public static final int VENDOR_ID = 4491;
    public static final int VSA_TYPE = 67;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long PolicyServerAdmissionControlFailure = new Long(1L);
    public static final Long InsufficientResources = new Long(2L);
    public static final Long UnknownSubscriber = new Long(3L);
    public static final Long UnauthorizedAMID = new Long(4L);
    public static final Long UndefinedServiceClassName = new Long(5L);
    public static final Long IncompatibleEnvelope = new Long(6L);
    public static final Long Other = new Long(127L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(127L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Policy-Server-Admission-Control-Failure".equals(name)) return new Long(1L);
            if ("Insufficient-Resources".equals(name)) return new Long(2L);
            if ("Unknown-Subscriber".equals(name)) return new Long(3L);
            if ("Unauthorized-AMID".equals(name)) return new Long(4L);
            if ("Undefined-Service-Class-Name".equals(name)) return new Long(5L);
            if ("Incompatible-Envelope".equals(name)) return new Long(6L);
            if ("Other".equals(name)) return new Long(127L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Policy-Server-Admission-Control-Failure";
            if (new Long(2L).equals(value)) return "Insufficient-Resources";
            if (new Long(3L).equals(value)) return "Unknown-Subscriber";
            if (new Long(4L).equals(value)) return "Unauthorized-AMID";
            if (new Long(5L).equals(value)) return "Undefined-Service-Class-Name";
            if (new Long(6L).equals(value)) return "Incompatible-Envelope";
            if (new Long(127L).equals(value)) return "Other";
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

    public Attr_CableLabsPolicyDeniedReason()
    {
        setup();
    }

    public Attr_CableLabsPolicyDeniedReason(Serializable o)
    {
        setup(o);
    }
}

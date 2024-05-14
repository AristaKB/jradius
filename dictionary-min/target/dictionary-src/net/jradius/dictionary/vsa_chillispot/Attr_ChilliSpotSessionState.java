// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_chillispot;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: ChilliSpot-Session-State<br>
 * Attribute Type: 26<br>
 * Vendor Id: 14559<br>
 * VSA Type: 15<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Authorized (1)
 * <li> NotAuthorized (2)
 * <li> Started (3)
 * <li> Stopped (4)
 * <li> UserLogoutUrl (10)
 * <li> IdleTimeoutReached (11)
 * <li> TimeoutReached (12)
 * <li> LogoutTimeReached (13)
 * <li> InDataLimitReached (14)
 * <li> OutDataLimitReached (15)
 * <li> TotalDataLimitReached (16)
 * <li> LocationChanged (17)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ChilliSpotSessionState extends VSAttribute
{
    public static final String NAME = "ChilliSpot-Session-State";
    public static final int VENDOR_ID = 14559;
    public static final int VSA_TYPE = 15;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Authorized = new Long(1L);
    public static final Long NotAuthorized = new Long(2L);
    public static final Long Started = new Long(3L);
    public static final Long Stopped = new Long(4L);
    public static final Long UserLogoutUrl = new Long(10L);
    public static final Long IdleTimeoutReached = new Long(11L);
    public static final Long TimeoutReached = new Long(12L);
    public static final Long LogoutTimeReached = new Long(13L);
    public static final Long InDataLimitReached = new Long(14L);
    public static final Long OutDataLimitReached = new Long(15L);
    public static final Long TotalDataLimitReached = new Long(16L);
    public static final Long LocationChanged = new Long(17L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L),new Long(16L),new Long(17L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Authorized".equals(name)) return new Long(1L);
            if ("NotAuthorized".equals(name)) return new Long(2L);
            if ("Started".equals(name)) return new Long(3L);
            if ("Stopped".equals(name)) return new Long(4L);
            if ("UserLogoutUrl".equals(name)) return new Long(10L);
            if ("IdleTimeoutReached".equals(name)) return new Long(11L);
            if ("TimeoutReached".equals(name)) return new Long(12L);
            if ("LogoutTimeReached".equals(name)) return new Long(13L);
            if ("InDataLimitReached".equals(name)) return new Long(14L);
            if ("OutDataLimitReached".equals(name)) return new Long(15L);
            if ("TotalDataLimitReached".equals(name)) return new Long(16L);
            if ("LocationChanged".equals(name)) return new Long(17L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Authorized";
            if (new Long(2L).equals(value)) return "NotAuthorized";
            if (new Long(3L).equals(value)) return "Started";
            if (new Long(4L).equals(value)) return "Stopped";
            if (new Long(10L).equals(value)) return "UserLogoutUrl";
            if (new Long(11L).equals(value)) return "IdleTimeoutReached";
            if (new Long(12L).equals(value)) return "TimeoutReached";
            if (new Long(13L).equals(value)) return "LogoutTimeReached";
            if (new Long(14L).equals(value)) return "InDataLimitReached";
            if (new Long(15L).equals(value)) return "OutDataLimitReached";
            if (new Long(16L).equals(value)) return "TotalDataLimitReached";
            if (new Long(17L).equals(value)) return "LocationChanged";
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

    public Attr_ChilliSpotSessionState()
    {
        setup();
    }

    public Attr_ChilliSpotSessionState(Serializable o)
    {
        setup(o);
    }
}

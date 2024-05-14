// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_epygi;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Epygi-CallRedirectReason<br>
 * Attribute Type: 26<br>
 * Vendor Id: 16459<br>
 * VSA Type: 195<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> No-Reason (0)
 * <li> Call-Forward-Uncondit (1)
 * <li> Call-Forward-Busy (2)
 * <li> Call-Forward-NoAnswer (3)
 * <li> Call-Tranfer (4)
 * <li> Call-Park (5)
 * <li> Call-Pickup (6)
 * <li> ManyExtension-Ringing (7)
 * <li> Hunt-Group (8)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EpygiCallRedirectReason extends VSAttribute
{
    public static final String NAME = "Epygi-CallRedirectReason";
    public static final int VENDOR_ID = 16459;
    public static final int VSA_TYPE = 195;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long NoReason = new Long(0L);
    public static final Long CallForwardUncondit = new Long(1L);
    public static final Long CallForwardBusy = new Long(2L);
    public static final Long CallForwardNoAnswer = new Long(3L);
    public static final Long CallTranfer = new Long(4L);
    public static final Long CallPark = new Long(5L);
    public static final Long CallPickup = new Long(6L);
    public static final Long ManyExtensionRinging = new Long(7L);
    public static final Long HuntGroup = new Long(8L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("No-Reason".equals(name)) return new Long(0L);
            if ("Call-Forward-Uncondit".equals(name)) return new Long(1L);
            if ("Call-Forward-Busy".equals(name)) return new Long(2L);
            if ("Call-Forward-NoAnswer".equals(name)) return new Long(3L);
            if ("Call-Tranfer".equals(name)) return new Long(4L);
            if ("Call-Park".equals(name)) return new Long(5L);
            if ("Call-Pickup".equals(name)) return new Long(6L);
            if ("ManyExtension-Ringing".equals(name)) return new Long(7L);
            if ("Hunt-Group".equals(name)) return new Long(8L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "No-Reason";
            if (new Long(1L).equals(value)) return "Call-Forward-Uncondit";
            if (new Long(2L).equals(value)) return "Call-Forward-Busy";
            if (new Long(3L).equals(value)) return "Call-Forward-NoAnswer";
            if (new Long(4L).equals(value)) return "Call-Tranfer";
            if (new Long(5L).equals(value)) return "Call-Park";
            if (new Long(6L).equals(value)) return "Call-Pickup";
            if (new Long(7L).equals(value)) return "ManyExtension-Ringing";
            if (new Long(8L).equals(value)) return "Hunt-Group";
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

    public Attr_EpygiCallRedirectReason()
    {
        setup();
    }

    public Attr_EpygiCallRedirectReason(Serializable o)
    {
        setup(o);
    }
}

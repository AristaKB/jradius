// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_sonicwall;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: SonicWall-User-Privilege<br>
 * Attribute Type: 26<br>
 * Vendor Id: 8741<br>
 * VSA Type: 1<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Remote-Access (1)
 * <li> Bypass-Filters (2)
 * <li> VPN-Client-Access (3)
 * <li> Access-To-VPN (4)
 * <li> Limited-Management (5)
 * <li> L2TP-Client-Access (6)
 * <li> Wireless-Guest (7)
 * <li> Wireless-Add-ACL (8)
 * <li> Internet-Access (9)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SonicWallUserPrivilege extends VSAttribute
{
    public static final String NAME = "SonicWall-User-Privilege";
    public static final int VENDOR_ID = 8741;
    public static final int VSA_TYPE = 1;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long RemoteAccess = new Long(1L);
    public static final Long BypassFilters = new Long(2L);
    public static final Long VPNClientAccess = new Long(3L);
    public static final Long AccessToVPN = new Long(4L);
    public static final Long LimitedManagement = new Long(5L);
    public static final Long L2TPClientAccess = new Long(6L);
    public static final Long WirelessGuest = new Long(7L);
    public static final Long WirelessAddACL = new Long(8L);
    public static final Long InternetAccess = new Long(9L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Remote-Access".equals(name)) return new Long(1L);
            if ("Bypass-Filters".equals(name)) return new Long(2L);
            if ("VPN-Client-Access".equals(name)) return new Long(3L);
            if ("Access-To-VPN".equals(name)) return new Long(4L);
            if ("Limited-Management".equals(name)) return new Long(5L);
            if ("L2TP-Client-Access".equals(name)) return new Long(6L);
            if ("Wireless-Guest".equals(name)) return new Long(7L);
            if ("Wireless-Add-ACL".equals(name)) return new Long(8L);
            if ("Internet-Access".equals(name)) return new Long(9L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Remote-Access";
            if (new Long(2L).equals(value)) return "Bypass-Filters";
            if (new Long(3L).equals(value)) return "VPN-Client-Access";
            if (new Long(4L).equals(value)) return "Access-To-VPN";
            if (new Long(5L).equals(value)) return "Limited-Management";
            if (new Long(6L).equals(value)) return "L2TP-Client-Access";
            if (new Long(7L).equals(value)) return "Wireless-Guest";
            if (new Long(8L).equals(value)) return "Wireless-Add-ACL";
            if (new Long(9L).equals(value)) return "Internet-Access";
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

    public Attr_SonicWallUserPrivilege()
    {
        setup();
    }

    public Attr_SonicWallUserPrivilege(Serializable o)
    {
        setup(o);
    }
}

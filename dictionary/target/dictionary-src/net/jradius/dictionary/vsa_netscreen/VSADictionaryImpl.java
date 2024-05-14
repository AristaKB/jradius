// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_netscreen;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_netscreen
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Netscreen"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_NSAdminPrivilege.class);
        map.put(new Long(2L), Attr_NSVSYSName.class);
        map.put(new Long(3L), Attr_NSUserGroup.class);
        map.put(new Long(4L), Attr_NSPrimaryDNS.class);
        map.put(new Long(5L), Attr_NSSecondaryDNS.class);
        map.put(new Long(6L), Attr_NSPrimaryWINS.class);
        map.put(new Long(7L), Attr_NSSecondaryWINS.class);
        map.put(new Long(220L), Attr_NSNSMUserDomainName.class);
        map.put(new Long(221L), Attr_NSNSMUserRoleMapping.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_NSAdminPrivilege.NAME, Attr_NSAdminPrivilege.class);
        map.put(Attr_NSVSYSName.NAME, Attr_NSVSYSName.class);
        map.put(Attr_NSUserGroup.NAME, Attr_NSUserGroup.class);
        map.put(Attr_NSPrimaryDNS.NAME, Attr_NSPrimaryDNS.class);
        map.put(Attr_NSSecondaryDNS.NAME, Attr_NSSecondaryDNS.class);
        map.put(Attr_NSPrimaryWINS.NAME, Attr_NSPrimaryWINS.class);
        map.put(Attr_NSSecondaryWINS.NAME, Attr_NSSecondaryWINS.class);
        map.put(Attr_NSNSMUserDomainName.NAME, Attr_NSNSMUserDomainName.class);
        map.put(Attr_NSNSMUserRoleMapping.NAME, Attr_NSNSMUserRoleMapping.class);
    }
}

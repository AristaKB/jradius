// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ntua;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_ntua
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "NTUA"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(10L), Attr_UserLogonUid.class);
        map.put(new Long(11L), Attr_UserLogonGid.class);
        map.put(new Long(12L), Attr_UserLogonHomeDir.class);
        map.put(new Long(13L), Attr_UserLogonType.class);
        map.put(new Long(14L), Attr_UserLogonQuotaBytes.class);
        map.put(new Long(15L), Attr_UserLogonQuotaFiles.class);
        map.put(new Long(16L), Attr_UserLogonShell.class);
        map.put(new Long(17L), Attr_UserLogonRestriction.class);
        map.put(new Long(18L), Attr_UserLogonGroupNames.class);
        map.put(new Long(19L), Attr_UserLogonDriveNames.class);
        map.put(new Long(20L), Attr_UserLogonUserDescription.class);
        map.put(new Long(21L), Attr_UserLogonUserFullName.class);
        map.put(new Long(22L), Attr_UserLogonUserDomain.class);
        map.put(new Long(23L), Attr_UserLogonLogonTask.class);
        map.put(new Long(24L), Attr_UserLogonLogoffTask.class);
        map.put(new Long(25L), Attr_UserLogonExpiration.class);
        map.put(new Long(26L), Attr_UserLogonUserProfile.class);
        map.put(new Long(50L), Attr_UserLogonAcctTerminateCause.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_UserLogonUid.NAME, Attr_UserLogonUid.class);
        map.put(Attr_UserLogonGid.NAME, Attr_UserLogonGid.class);
        map.put(Attr_UserLogonHomeDir.NAME, Attr_UserLogonHomeDir.class);
        map.put(Attr_UserLogonType.NAME, Attr_UserLogonType.class);
        map.put(Attr_UserLogonQuotaBytes.NAME, Attr_UserLogonQuotaBytes.class);
        map.put(Attr_UserLogonQuotaFiles.NAME, Attr_UserLogonQuotaFiles.class);
        map.put(Attr_UserLogonShell.NAME, Attr_UserLogonShell.class);
        map.put(Attr_UserLogonRestriction.NAME, Attr_UserLogonRestriction.class);
        map.put(Attr_UserLogonGroupNames.NAME, Attr_UserLogonGroupNames.class);
        map.put(Attr_UserLogonDriveNames.NAME, Attr_UserLogonDriveNames.class);
        map.put(Attr_UserLogonUserDescription.NAME, Attr_UserLogonUserDescription.class);
        map.put(Attr_UserLogonUserFullName.NAME, Attr_UserLogonUserFullName.class);
        map.put(Attr_UserLogonUserDomain.NAME, Attr_UserLogonUserDomain.class);
        map.put(Attr_UserLogonLogonTask.NAME, Attr_UserLogonLogonTask.class);
        map.put(Attr_UserLogonLogoffTask.NAME, Attr_UserLogonLogoffTask.class);
        map.put(Attr_UserLogonExpiration.NAME, Attr_UserLogonExpiration.class);
        map.put(Attr_UserLogonUserProfile.NAME, Attr_UserLogonUserProfile.class);
        map.put(Attr_UserLogonAcctTerminateCause.NAME, Attr_UserLogonAcctTerminateCause.class);
    }
}

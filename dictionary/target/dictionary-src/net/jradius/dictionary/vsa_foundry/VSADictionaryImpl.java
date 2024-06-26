// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_foundry;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_foundry
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Foundry"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_FoundryPrivilegeLevel.class);
        map.put(new Long(2L), Attr_FoundryCommandString.class);
        map.put(new Long(3L), Attr_FoundryCommandExceptionFlag.class);
        map.put(new Long(4L), Attr_FoundryINMPrivilege.class);
        map.put(new Long(5L), Attr_FoundryAccessList.class);
        map.put(new Long(6L), Attr_FoundryMACAuthentneeds8021x.class);
        map.put(new Long(7L), Attr_Foundry8021xValidLookup.class);
        map.put(new Long(8L), Attr_FoundryMACBasedVlanQoS.class);
        map.put(new Long(9L), Attr_FoundryINMRoleAorList.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_FoundryPrivilegeLevel.NAME, Attr_FoundryPrivilegeLevel.class);
        map.put(Attr_FoundryCommandString.NAME, Attr_FoundryCommandString.class);
        map.put(Attr_FoundryCommandExceptionFlag.NAME, Attr_FoundryCommandExceptionFlag.class);
        map.put(Attr_FoundryINMPrivilege.NAME, Attr_FoundryINMPrivilege.class);
        map.put(Attr_FoundryAccessList.NAME, Attr_FoundryAccessList.class);
        map.put(Attr_FoundryMACAuthentneeds8021x.NAME, Attr_FoundryMACAuthentneeds8021x.class);
        map.put(Attr_Foundry8021xValidLookup.NAME, Attr_Foundry8021xValidLookup.class);
        map.put(Attr_FoundryMACBasedVlanQoS.NAME, Attr_FoundryMACBasedVlanQoS.class);
        map.put(Attr_FoundryINMRoleAorList.NAME, Attr_FoundryINMRoleAorList.class);
    }
}

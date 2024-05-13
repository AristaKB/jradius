// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_sonicwall;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_sonicwall
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "SonicWall"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_SS3FirewallUserPrivilege.class);
        map.put(new Long(1L), Attr_SonicWallUserPrivilege.class);
        map.put(new Long(3L), Attr_SonicWallUserGroup.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_SS3FirewallUserPrivilege.NAME, Attr_SS3FirewallUserPrivilege.class);
        map.put(Attr_SonicWallUserPrivilege.NAME, Attr_SonicWallUserPrivilege.class);
        map.put(Attr_SonicWallUserGroup.NAME, Attr_SonicWallUserGroup.class);
    }
}
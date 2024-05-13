// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_extreme;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_extreme
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Extreme"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(201L), Attr_ExtremeCLIAuthorization.class);
        map.put(new Long(202L), Attr_ExtremeShellCommand.class);
        map.put(new Long(203L), Attr_ExtremeNetloginVlan.class);
        map.put(new Long(204L), Attr_ExtremeNetloginUrl.class);
        map.put(new Long(205L), Attr_ExtremeNetloginUrlDesc.class);
        map.put(new Long(206L), Attr_ExtremeNetloginOnly.class);
        map.put(new Long(208L), Attr_ExtremeUserLocation.class);
        map.put(new Long(209L), Attr_ExtremeNetloginVlanTag.class);
        map.put(new Long(211L), Attr_ExtremeNetloginExtendedVlan.class);
        map.put(new Long(212L), Attr_ExtremeSecurityProfile.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ExtremeCLIAuthorization.NAME, Attr_ExtremeCLIAuthorization.class);
        map.put(Attr_ExtremeShellCommand.NAME, Attr_ExtremeShellCommand.class);
        map.put(Attr_ExtremeNetloginVlan.NAME, Attr_ExtremeNetloginVlan.class);
        map.put(Attr_ExtremeNetloginUrl.NAME, Attr_ExtremeNetloginUrl.class);
        map.put(Attr_ExtremeNetloginUrlDesc.NAME, Attr_ExtremeNetloginUrlDesc.class);
        map.put(Attr_ExtremeNetloginOnly.NAME, Attr_ExtremeNetloginOnly.class);
        map.put(Attr_ExtremeUserLocation.NAME, Attr_ExtremeUserLocation.class);
        map.put(Attr_ExtremeNetloginVlanTag.NAME, Attr_ExtremeNetloginVlanTag.class);
        map.put(Attr_ExtremeNetloginExtendedVlan.NAME, Attr_ExtremeNetloginExtendedVlan.class);
        map.put(Attr_ExtremeSecurityProfile.NAME, Attr_ExtremeSecurityProfile.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_shasta;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_shasta
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Shasta"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_ShastaUserPrivilege.class);
        map.put(new Long(2L), Attr_ShastaServiceProfile.class);
        map.put(new Long(3L), Attr_ShastaVPNName.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ShastaUserPrivilege.NAME, Attr_ShastaUserPrivilege.class);
        map.put(Attr_ShastaServiceProfile.NAME, Attr_ShastaServiceProfile.class);
        map.put(Attr_ShastaVPNName.NAME, Attr_ShastaVPNName.class);
    }
}

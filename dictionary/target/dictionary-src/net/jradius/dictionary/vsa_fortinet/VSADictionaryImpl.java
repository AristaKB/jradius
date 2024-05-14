// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_fortinet;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_fortinet
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Fortinet"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_FortinetGroupName.class);
        map.put(new Long(2L), Attr_FortinetClientIPAddress.class);
        map.put(new Long(3L), Attr_FortinetVdomName.class);
        map.put(new Long(4L), Attr_FortinetClientIPv6Address.class);
        map.put(new Long(5L), Attr_FortinetInterfaceName.class);
        map.put(new Long(6L), Attr_FortinetAccessProfile.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_FortinetGroupName.NAME, Attr_FortinetGroupName.class);
        map.put(Attr_FortinetClientIPAddress.NAME, Attr_FortinetClientIPAddress.class);
        map.put(Attr_FortinetVdomName.NAME, Attr_FortinetVdomName.class);
        map.put(Attr_FortinetClientIPv6Address.NAME, Attr_FortinetClientIPv6Address.class);
        map.put(Attr_FortinetInterfaceName.NAME, Attr_FortinetInterfaceName.class);
        map.put(Attr_FortinetAccessProfile.NAME, Attr_FortinetAccessProfile.class);
    }
}

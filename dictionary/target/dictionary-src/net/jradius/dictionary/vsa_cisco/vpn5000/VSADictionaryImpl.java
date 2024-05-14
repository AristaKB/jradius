// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_cisco.vpn5000;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_cisco.vpn5000
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Cisco-VPN5000"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_CVPN5000TunnelThroughput.class);
        map.put(new Long(2L), Attr_CVPN5000ClientAssignedIP.class);
        map.put(new Long(3L), Attr_CVPN5000ClientRealIP.class);
        map.put(new Long(4L), Attr_CVPN5000VPNGroupInfo.class);
        map.put(new Long(5L), Attr_CVPN5000VPNPassword.class);
        map.put(new Long(6L), Attr_CVPN5000Echo.class);
        map.put(new Long(7L), Attr_CVPN5000ClientAssignedIPX.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_CVPN5000TunnelThroughput.NAME, Attr_CVPN5000TunnelThroughput.class);
        map.put(Attr_CVPN5000ClientAssignedIP.NAME, Attr_CVPN5000ClientAssignedIP.class);
        map.put(Attr_CVPN5000ClientRealIP.NAME, Attr_CVPN5000ClientRealIP.class);
        map.put(Attr_CVPN5000VPNGroupInfo.NAME, Attr_CVPN5000VPNGroupInfo.class);
        map.put(Attr_CVPN5000VPNPassword.NAME, Attr_CVPN5000VPNPassword.class);
        map.put(Attr_CVPN5000Echo.NAME, Attr_CVPN5000Echo.class);
        map.put(Attr_CVPN5000ClientAssignedIPX.NAME, Attr_CVPN5000ClientAssignedIPX.class);
    }
}

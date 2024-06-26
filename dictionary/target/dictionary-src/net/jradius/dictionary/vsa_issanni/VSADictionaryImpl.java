// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_issanni;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_issanni
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Issanni"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_IssanniSoftFlowTemplate.class);
        map.put(new Long(2L), Attr_IssanniNATSupport.class);
        map.put(new Long(3L), Attr_IssanniRoutingContext.class);
        map.put(new Long(4L), Attr_IssanniTunnelName.class);
        map.put(new Long(5L), Attr_IssanniIPPoolName.class);
        map.put(new Long(6L), Attr_IssanniPPPoEURL.class);
        map.put(new Long(7L), Attr_IssanniPPPoEMOTM.class);
        map.put(new Long(8L), Attr_IssanniService.class);
        map.put(new Long(9L), Attr_IssanniPriDNS.class);
        map.put(new Long(10L), Attr_IssanniSecDNS.class);
        map.put(new Long(11L), Attr_IssanniPriNBNS.class);
        map.put(new Long(12L), Attr_IssanniSecNBNS.class);
        map.put(new Long(13L), Attr_IssanniTrafficClass.class);
        map.put(new Long(14L), Attr_IssanniTunnelType.class);
        map.put(new Long(15L), Attr_IssanniNATType.class);
        map.put(new Long(16L), Attr_IssanniQOSClass.class);
        map.put(new Long(17L), Attr_IssanniInterfaceName.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_IssanniSoftFlowTemplate.NAME, Attr_IssanniSoftFlowTemplate.class);
        map.put(Attr_IssanniNATSupport.NAME, Attr_IssanniNATSupport.class);
        map.put(Attr_IssanniRoutingContext.NAME, Attr_IssanniRoutingContext.class);
        map.put(Attr_IssanniTunnelName.NAME, Attr_IssanniTunnelName.class);
        map.put(Attr_IssanniIPPoolName.NAME, Attr_IssanniIPPoolName.class);
        map.put(Attr_IssanniPPPoEURL.NAME, Attr_IssanniPPPoEURL.class);
        map.put(Attr_IssanniPPPoEMOTM.NAME, Attr_IssanniPPPoEMOTM.class);
        map.put(Attr_IssanniService.NAME, Attr_IssanniService.class);
        map.put(Attr_IssanniPriDNS.NAME, Attr_IssanniPriDNS.class);
        map.put(Attr_IssanniSecDNS.NAME, Attr_IssanniSecDNS.class);
        map.put(Attr_IssanniPriNBNS.NAME, Attr_IssanniPriNBNS.class);
        map.put(Attr_IssanniSecNBNS.NAME, Attr_IssanniSecNBNS.class);
        map.put(Attr_IssanniTrafficClass.NAME, Attr_IssanniTrafficClass.class);
        map.put(Attr_IssanniTunnelType.NAME, Attr_IssanniTunnelType.class);
        map.put(Attr_IssanniNATType.NAME, Attr_IssanniNATType.class);
        map.put(Attr_IssanniQOSClass.NAME, Attr_IssanniQOSClass.class);
        map.put(Attr_IssanniInterfaceName.NAME, Attr_IssanniInterfaceName.class);
    }
}

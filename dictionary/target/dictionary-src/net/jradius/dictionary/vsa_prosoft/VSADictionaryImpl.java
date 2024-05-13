// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_prosoft;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_prosoft
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Prosoft"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(0L), Attr_ProsoftHomeAgentAddress.class);
        map.put(new Long(1L), Attr_ProsoftDefaultGateway.class);
        map.put(new Long(2L), Attr_ProsoftPrimaryDNS.class);
        map.put(new Long(3L), Attr_ProsoftSecondaryDNS.class);
        map.put(new Long(4L), Attr_ProsoftSecurityParameterIndex.class);
        map.put(new Long(5L), Attr_ProsoftSecurityKey.class);
        map.put(new Long(7L), Attr_ProsoftMACAddress.class);
        map.put(new Long(8L), Attr_ProsoftAuthenticationReason.class);
        map.put(new Long(9L), Attr_ProsoftATMInterface.class);
        map.put(new Long(10L), Attr_ProsoftATMVPI.class);
        map.put(new Long(11L), Attr_ProsoftATMVCI.class);
        map.put(new Long(12L), Attr_ProsoftRSCIdentifier.class);
        map.put(new Long(13L), Attr_ProsoftNPMIdentifier.class);
        map.put(new Long(14L), Attr_ProsoftNPMIP.class);
        map.put(new Long(15L), Attr_ProsoftSectorID.class);
        map.put(new Long(16L), Attr_ProsoftAuthRole.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ProsoftHomeAgentAddress.NAME, Attr_ProsoftHomeAgentAddress.class);
        map.put(Attr_ProsoftDefaultGateway.NAME, Attr_ProsoftDefaultGateway.class);
        map.put(Attr_ProsoftPrimaryDNS.NAME, Attr_ProsoftPrimaryDNS.class);
        map.put(Attr_ProsoftSecondaryDNS.NAME, Attr_ProsoftSecondaryDNS.class);
        map.put(Attr_ProsoftSecurityParameterIndex.NAME, Attr_ProsoftSecurityParameterIndex.class);
        map.put(Attr_ProsoftSecurityKey.NAME, Attr_ProsoftSecurityKey.class);
        map.put(Attr_ProsoftMACAddress.NAME, Attr_ProsoftMACAddress.class);
        map.put(Attr_ProsoftAuthenticationReason.NAME, Attr_ProsoftAuthenticationReason.class);
        map.put(Attr_ProsoftATMInterface.NAME, Attr_ProsoftATMInterface.class);
        map.put(Attr_ProsoftATMVPI.NAME, Attr_ProsoftATMVPI.class);
        map.put(Attr_ProsoftATMVCI.NAME, Attr_ProsoftATMVCI.class);
        map.put(Attr_ProsoftRSCIdentifier.NAME, Attr_ProsoftRSCIdentifier.class);
        map.put(Attr_ProsoftNPMIdentifier.NAME, Attr_ProsoftNPMIdentifier.class);
        map.put(Attr_ProsoftNPMIP.NAME, Attr_ProsoftNPMIP.class);
        map.put(Attr_ProsoftSectorID.NAME, Attr_ProsoftSectorID.class);
        map.put(Attr_ProsoftAuthRole.NAME, Attr_ProsoftAuthRole.class);
    }
}

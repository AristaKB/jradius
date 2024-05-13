// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_motorola;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_motorola
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Motorola"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(10L), Attr_MotorolaWiMAXMIPMNHOMEADDRESS.class);
        map.put(new Long(11L), Attr_MotorolaWiMAXMIPKEY.class);
        map.put(new Long(12L), Attr_MotorolaWiMAXMIPSPI.class);
        map.put(new Long(13L), Attr_MotorolaWiMAXMNHA.class);
        map.put(new Long(20L), Attr_MotorolaWiMAXDNSServerIPAddress.class);
        map.put(new Long(22L), Attr_MotorolaWiMAXUserNAI.class);
        map.put(new Long(30L), Attr_MotorolaWiMAXNetworkDomainName.class);
        map.put(new Long(31L), Attr_MotorolaWiMAXEMSAddress.class);
        map.put(new Long(32L), Attr_MotorolaWiMAXProvisioningServer.class);
        map.put(new Long(34L), Attr_MotorolaWiMAXNTPServer.class);
        map.put(new Long(35L), Attr_MotorolaWiMAXHOSVCCLASS.class);
        map.put(new Long(50L), Attr_MotorolaWiMAXHomeBTS.class);
        map.put(new Long(60L), Attr_MotorolaWiMAXMaximumTotalBandwidth.class);
        map.put(new Long(61L), Attr_MotorolaWiMAXMaximumCommitBandwidth.class);
        map.put(new Long(63L), Attr_MotorolaWiMAXConvergenceSublayer.class);
        map.put(new Long(64L), Attr_MotorolaWiMAXServiceFlows.class);
        map.put(new Long(65L), Attr_MotorolaWiMAXVLANID.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_MotorolaWiMAXMIPMNHOMEADDRESS.NAME, Attr_MotorolaWiMAXMIPMNHOMEADDRESS.class);
        map.put(Attr_MotorolaWiMAXMIPKEY.NAME, Attr_MotorolaWiMAXMIPKEY.class);
        map.put(Attr_MotorolaWiMAXMIPSPI.NAME, Attr_MotorolaWiMAXMIPSPI.class);
        map.put(Attr_MotorolaWiMAXMNHA.NAME, Attr_MotorolaWiMAXMNHA.class);
        map.put(Attr_MotorolaWiMAXDNSServerIPAddress.NAME, Attr_MotorolaWiMAXDNSServerIPAddress.class);
        map.put(Attr_MotorolaWiMAXUserNAI.NAME, Attr_MotorolaWiMAXUserNAI.class);
        map.put(Attr_MotorolaWiMAXNetworkDomainName.NAME, Attr_MotorolaWiMAXNetworkDomainName.class);
        map.put(Attr_MotorolaWiMAXEMSAddress.NAME, Attr_MotorolaWiMAXEMSAddress.class);
        map.put(Attr_MotorolaWiMAXProvisioningServer.NAME, Attr_MotorolaWiMAXProvisioningServer.class);
        map.put(Attr_MotorolaWiMAXNTPServer.NAME, Attr_MotorolaWiMAXNTPServer.class);
        map.put(Attr_MotorolaWiMAXHOSVCCLASS.NAME, Attr_MotorolaWiMAXHOSVCCLASS.class);
        map.put(Attr_MotorolaWiMAXHomeBTS.NAME, Attr_MotorolaWiMAXHomeBTS.class);
        map.put(Attr_MotorolaWiMAXMaximumTotalBandwidth.NAME, Attr_MotorolaWiMAXMaximumTotalBandwidth.class);
        map.put(Attr_MotorolaWiMAXMaximumCommitBandwidth.NAME, Attr_MotorolaWiMAXMaximumCommitBandwidth.class);
        map.put(Attr_MotorolaWiMAXConvergenceSublayer.NAME, Attr_MotorolaWiMAXConvergenceSublayer.class);
        map.put(Attr_MotorolaWiMAXServiceFlows.NAME, Attr_MotorolaWiMAXServiceFlows.class);
        map.put(Attr_MotorolaWiMAXVLANID.NAME, Attr_MotorolaWiMAXVLANID.class);
    }
}

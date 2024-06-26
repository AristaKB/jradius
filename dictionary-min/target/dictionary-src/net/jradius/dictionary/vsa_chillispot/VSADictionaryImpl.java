// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_chillispot;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_chillispot
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "ChilliSpot"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_ChilliSpotMaxInputOctets.class);
        map.put(new Long(2L), Attr_ChilliSpotMaxOutputOctets.class);
        map.put(new Long(3L), Attr_ChilliSpotMaxTotalOctets.class);
        map.put(new Long(4L), Attr_ChilliSpotBandwidthMaxUp.class);
        map.put(new Long(5L), Attr_ChilliSpotBandwidthMaxDown.class);
        map.put(new Long(6L), Attr_ChilliSpotConfig.class);
        map.put(new Long(7L), Attr_ChilliSpotLang.class);
        map.put(new Long(8L), Attr_ChilliSpotVersion.class);
        map.put(new Long(9L), Attr_ChilliSpotOriginalURL.class);
        map.put(new Long(10L), Attr_ChilliSpotAcctViewPoint.class);
        map.put(new Long(11L), Attr_ChilliSpotRequireUAM.class);
        map.put(new Long(12L), Attr_ChilliSpotRequireSplash.class);
        map.put(new Long(13L), Attr_ChilliSpotRouteToInterface.class);
        map.put(new Long(14L), Attr_ChilliSpotConfigFile.class);
        map.put(new Long(15L), Attr_ChilliSpotSessionState.class);
        map.put(new Long(16L), Attr_ChilliSpotSessionId.class);
        map.put(new Long(17L), Attr_ChilliSpotAPSessionId.class);
        map.put(new Long(18L), Attr_ChilliSpotUserAgent.class);
        map.put(new Long(19L), Attr_ChilliSpotAcceptLanguage.class);
        map.put(new Long(21L), Attr_ChilliSpotMaxInputGigawords.class);
        map.put(new Long(22L), Attr_ChilliSpotMaxOutputGigawords.class);
        map.put(new Long(23L), Attr_ChilliSpotMaxTotalGigawords.class);
        map.put(new Long(24L), Attr_ChilliSpotVLANId.class);
        map.put(new Long(25L), Attr_ChilliSpotLocation.class);
        map.put(new Long(26L), Attr_ChilliSpotOldLocation.class);
        map.put(new Long(27L), Attr_ChilliSpotLocationChangeCount.class);
        map.put(new Long(40L), Attr_ChilliSpotSysUptime.class);
        map.put(new Long(41L), Attr_ChilliSpotSysLoadAvg.class);
        map.put(new Long(42L), Attr_ChilliSpotSysMemory.class);
        map.put(new Long(50L), Attr_ChilliSpotDHCPVendorClassId.class);
        map.put(new Long(51L), Attr_ChilliSpotDHCPClientId.class);
        map.put(new Long(52L), Attr_ChilliSpotDHCPOptions.class);
        map.put(new Long(53L), Attr_ChilliSpotDHCPFilename.class);
        map.put(new Long(54L), Attr_ChilliSpotDHCPHostname.class);
        map.put(new Long(55L), Attr_ChilliSpotDHCPServerName.class);
        map.put(new Long(56L), Attr_ChilliSpotDHCPClientFQDN.class);
        map.put(new Long(57L), Attr_ChilliSpotDHCPParameterRequestList.class);
        map.put(new Long(60L), Attr_ChilliSpotDHCPIPAddress.class);
        map.put(new Long(61L), Attr_ChilliSpotDHCPNetmask.class);
        map.put(new Long(62L), Attr_ChilliSpotDHCPDNS1.class);
        map.put(new Long(63L), Attr_ChilliSpotDHCPDNS2.class);
        map.put(new Long(64L), Attr_ChilliSpotDHCPGateway.class);
        map.put(new Long(65L), Attr_ChilliSpotDHCPDomain.class);
        map.put(new Long(70L), Attr_ChilliSpotInjectURL.class);
        map.put(new Long(80L), Attr_ChilliSpotGardenInputOctets.class);
        map.put(new Long(81L), Attr_ChilliSpotGardenOutputOctets.class);
        map.put(new Long(82L), Attr_ChilliSpotGardenInputGigawords.class);
        map.put(new Long(83L), Attr_ChilliSpotGardenOutputGigawords.class);
        map.put(new Long(84L), Attr_ChilliSpotOtherInputOctets.class);
        map.put(new Long(85L), Attr_ChilliSpotOtherOutputOctets.class);
        map.put(new Long(86L), Attr_ChilliSpotOtherInputGigawords.class);
        map.put(new Long(87L), Attr_ChilliSpotOtherOutputGigawords.class);
        map.put(new Long(100L), Attr_ChilliSpotUAMAllowed.class);
        map.put(new Long(101L), Attr_ChilliSpotMACAllowed.class);
        map.put(new Long(102L), Attr_ChilliSpotInterval.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ChilliSpotMaxInputOctets.NAME, Attr_ChilliSpotMaxInputOctets.class);
        map.put(Attr_ChilliSpotMaxOutputOctets.NAME, Attr_ChilliSpotMaxOutputOctets.class);
        map.put(Attr_ChilliSpotMaxTotalOctets.NAME, Attr_ChilliSpotMaxTotalOctets.class);
        map.put(Attr_ChilliSpotBandwidthMaxUp.NAME, Attr_ChilliSpotBandwidthMaxUp.class);
        map.put(Attr_ChilliSpotBandwidthMaxDown.NAME, Attr_ChilliSpotBandwidthMaxDown.class);
        map.put(Attr_ChilliSpotConfig.NAME, Attr_ChilliSpotConfig.class);
        map.put(Attr_ChilliSpotLang.NAME, Attr_ChilliSpotLang.class);
        map.put(Attr_ChilliSpotVersion.NAME, Attr_ChilliSpotVersion.class);
        map.put(Attr_ChilliSpotOriginalURL.NAME, Attr_ChilliSpotOriginalURL.class);
        map.put(Attr_ChilliSpotAcctViewPoint.NAME, Attr_ChilliSpotAcctViewPoint.class);
        map.put(Attr_ChilliSpotRequireUAM.NAME, Attr_ChilliSpotRequireUAM.class);
        map.put(Attr_ChilliSpotRequireSplash.NAME, Attr_ChilliSpotRequireSplash.class);
        map.put(Attr_ChilliSpotRouteToInterface.NAME, Attr_ChilliSpotRouteToInterface.class);
        map.put(Attr_ChilliSpotConfigFile.NAME, Attr_ChilliSpotConfigFile.class);
        map.put(Attr_ChilliSpotSessionState.NAME, Attr_ChilliSpotSessionState.class);
        map.put(Attr_ChilliSpotSessionId.NAME, Attr_ChilliSpotSessionId.class);
        map.put(Attr_ChilliSpotAPSessionId.NAME, Attr_ChilliSpotAPSessionId.class);
        map.put(Attr_ChilliSpotUserAgent.NAME, Attr_ChilliSpotUserAgent.class);
        map.put(Attr_ChilliSpotAcceptLanguage.NAME, Attr_ChilliSpotAcceptLanguage.class);
        map.put(Attr_ChilliSpotMaxInputGigawords.NAME, Attr_ChilliSpotMaxInputGigawords.class);
        map.put(Attr_ChilliSpotMaxOutputGigawords.NAME, Attr_ChilliSpotMaxOutputGigawords.class);
        map.put(Attr_ChilliSpotMaxTotalGigawords.NAME, Attr_ChilliSpotMaxTotalGigawords.class);
        map.put(Attr_ChilliSpotVLANId.NAME, Attr_ChilliSpotVLANId.class);
        map.put(Attr_ChilliSpotLocation.NAME, Attr_ChilliSpotLocation.class);
        map.put(Attr_ChilliSpotOldLocation.NAME, Attr_ChilliSpotOldLocation.class);
        map.put(Attr_ChilliSpotLocationChangeCount.NAME, Attr_ChilliSpotLocationChangeCount.class);
        map.put(Attr_ChilliSpotSysUptime.NAME, Attr_ChilliSpotSysUptime.class);
        map.put(Attr_ChilliSpotSysLoadAvg.NAME, Attr_ChilliSpotSysLoadAvg.class);
        map.put(Attr_ChilliSpotSysMemory.NAME, Attr_ChilliSpotSysMemory.class);
        map.put(Attr_ChilliSpotDHCPVendorClassId.NAME, Attr_ChilliSpotDHCPVendorClassId.class);
        map.put(Attr_ChilliSpotDHCPClientId.NAME, Attr_ChilliSpotDHCPClientId.class);
        map.put(Attr_ChilliSpotDHCPOptions.NAME, Attr_ChilliSpotDHCPOptions.class);
        map.put(Attr_ChilliSpotDHCPFilename.NAME, Attr_ChilliSpotDHCPFilename.class);
        map.put(Attr_ChilliSpotDHCPHostname.NAME, Attr_ChilliSpotDHCPHostname.class);
        map.put(Attr_ChilliSpotDHCPServerName.NAME, Attr_ChilliSpotDHCPServerName.class);
        map.put(Attr_ChilliSpotDHCPClientFQDN.NAME, Attr_ChilliSpotDHCPClientFQDN.class);
        map.put(Attr_ChilliSpotDHCPParameterRequestList.NAME, Attr_ChilliSpotDHCPParameterRequestList.class);
        map.put(Attr_ChilliSpotDHCPIPAddress.NAME, Attr_ChilliSpotDHCPIPAddress.class);
        map.put(Attr_ChilliSpotDHCPNetmask.NAME, Attr_ChilliSpotDHCPNetmask.class);
        map.put(Attr_ChilliSpotDHCPDNS1.NAME, Attr_ChilliSpotDHCPDNS1.class);
        map.put(Attr_ChilliSpotDHCPDNS2.NAME, Attr_ChilliSpotDHCPDNS2.class);
        map.put(Attr_ChilliSpotDHCPGateway.NAME, Attr_ChilliSpotDHCPGateway.class);
        map.put(Attr_ChilliSpotDHCPDomain.NAME, Attr_ChilliSpotDHCPDomain.class);
        map.put(Attr_ChilliSpotInjectURL.NAME, Attr_ChilliSpotInjectURL.class);
        map.put(Attr_ChilliSpotGardenInputOctets.NAME, Attr_ChilliSpotGardenInputOctets.class);
        map.put(Attr_ChilliSpotGardenOutputOctets.NAME, Attr_ChilliSpotGardenOutputOctets.class);
        map.put(Attr_ChilliSpotGardenInputGigawords.NAME, Attr_ChilliSpotGardenInputGigawords.class);
        map.put(Attr_ChilliSpotGardenOutputGigawords.NAME, Attr_ChilliSpotGardenOutputGigawords.class);
        map.put(Attr_ChilliSpotOtherInputOctets.NAME, Attr_ChilliSpotOtherInputOctets.class);
        map.put(Attr_ChilliSpotOtherOutputOctets.NAME, Attr_ChilliSpotOtherOutputOctets.class);
        map.put(Attr_ChilliSpotOtherInputGigawords.NAME, Attr_ChilliSpotOtherInputGigawords.class);
        map.put(Attr_ChilliSpotOtherOutputGigawords.NAME, Attr_ChilliSpotOtherOutputGigawords.class);
        map.put(Attr_ChilliSpotUAMAllowed.NAME, Attr_ChilliSpotUAMAllowed.class);
        map.put(Attr_ChilliSpotMACAllowed.NAME, Attr_ChilliSpotMACAllowed.class);
        map.put(Attr_ChilliSpotInterval.NAME, Attr_ChilliSpotInterval.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_wimax
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "WiMAX"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_WiMAXCapability.class);
        map.put(new Long(257L), Attr_WiMAXRelease.class);
        map.put(new Long(513L), Attr_WiMAXAccountingCapabilities.class);
        map.put(new Long(769L), Attr_WiMAXHotliningCapabilities.class);
        map.put(new Long(1025L), Attr_WiMAXIdleModeNotificationCap.class);
        map.put(new Long(2L), Attr_WiMAXDeviceAuthenticationIndicator.class);
        map.put(new Long(3L), Attr_WiMAXGMTTimezoneoffset.class);
        map.put(new Long(4L), Attr_WiMAXAAASessionId.class);
        map.put(new Long(5L), Attr_WiMAXMSK.class);
        map.put(new Long(6L), Attr_WiMAXhHAIPMIP4.class);
        map.put(new Long(7L), Attr_WiMAXhHAIPMIP6.class);
        map.put(new Long(8L), Attr_WiMAXDHCPv4Server.class);
        map.put(new Long(9L), Attr_WiMAXDHCPv6Server.class);
        map.put(new Long(10L), Attr_WiMAXMNhHAMIP4Key.class);
        map.put(new Long(11L), Attr_WiMAXMNhHAMIP4SPI.class);
        map.put(new Long(12L), Attr_WiMAXMNhHAMIP6Key.class);
        map.put(new Long(13L), Attr_WiMAXMNhHAMIP6SPI.class);
        map.put(new Long(14L), Attr_WiMAXFARKKey.class);
        map.put(new Long(15L), Attr_WiMAXHARKKey.class);
        map.put(new Long(16L), Attr_WiMAXHARKSPI.class);
        map.put(new Long(17L), Attr_WiMAXHARKLifetime.class);
        map.put(new Long(18L), Attr_WiMAXRRQHAIP.class);
        map.put(new Long(19L), Attr_WiMAXRRQMNHAKey.class);
        map.put(new Long(20L), Attr_WiMAXRRQMNHASPI.class);
        map.put(new Long(21L), Attr_WiMAXSessionContinue.class);
        map.put(new Long(22L), Attr_WiMAXBeginningOfSession.class);
        map.put(new Long(23L), Attr_WiMAXIPTechnology.class);
        map.put(new Long(24L), Attr_WiMAXHotlineIndicator.class);
        map.put(new Long(25L), Attr_WiMAXPrepaidIndicator.class);
        map.put(new Long(26L), Attr_WiMAXPDFID.class);
        map.put(new Long(27L), Attr_WiMAXSDFID.class);
        map.put(new Long(28L), Attr_WiMAXPacketFlowDescriptor.class);
        map.put(new Long(284L), Attr_WiMAXPacketDataFlowId.class);
        map.put(new Long(540L), Attr_WiMAXServiceDataFlowId.class);
        map.put(new Long(796L), Attr_WiMAXServiceProfileId.class);
        map.put(new Long(1052L), Attr_WiMAXDirection.class);
        map.put(new Long(1308L), Attr_WiMAXActivationTrigger.class);
        map.put(new Long(1564L), Attr_WiMAXTransportType.class);
        map.put(new Long(1820L), Attr_WiMAXUplinkQOSId.class);
        map.put(new Long(2076L), Attr_WiMAXDownlinkQOSId.class);
        map.put(new Long(2332L), Attr_WiMAXUplinkClassifier.class);
        map.put(new Long(2588L), Attr_WiMAXDownlinkClassifier.class);
        map.put(new Long(29L), Attr_WiMAXQoSDescriptor.class);
        map.put(new Long(285L), Attr_WiMAXQoSId.class);
        map.put(new Long(541L), Attr_WiMAXGlobalServiceClassName.class);
        map.put(new Long(797L), Attr_WiMAXServiceClassName.class);
        map.put(new Long(1053L), Attr_WiMAXScheduleType.class);
        map.put(new Long(1309L), Attr_WiMAXTrafficPriority.class);
        map.put(new Long(1565L), Attr_WiMAXMaximumSustainedTrafficRate.class);
        map.put(new Long(1821L), Attr_WiMAXMinimumReservedTrafficRate.class);
        map.put(new Long(2077L), Attr_WiMAXMaximumTrafficBurst.class);
        map.put(new Long(2333L), Attr_WiMAXToleratedJitter.class);
        map.put(new Long(2589L), Attr_WiMAXMaximumLatency.class);
        map.put(new Long(2845L), Attr_WiMAXReducedResourcesCode.class);
        map.put(new Long(3101L), Attr_WiMAXMediaFlowType.class);
        map.put(new Long(3357L), Attr_WiMAXUnsolicitedGrantInterval.class);
        map.put(new Long(3613L), Attr_WiMAXSDUSize.class);
        map.put(new Long(3869L), Attr_WiMAXUnsolicitedPollingInterval.class);
        map.put(new Long(4125L), Attr_WiMAXMediaFlowDescriptionSDP.class);
        map.put(new Long(30L), Attr_WiMAXUplinkGrantedQoS.class);
        map.put(new Long(31L), Attr_WiMAXControlPacketsIn.class);
        map.put(new Long(32L), Attr_WiMAXControlOctetsIn.class);
        map.put(new Long(33L), Attr_WiMAXControlPacketsOut.class);
        map.put(new Long(34L), Attr_WiMAXControlOctetsOut.class);
        map.put(new Long(35L), Attr_WiMAXPPAC.class);
        map.put(new Long(291L), Attr_WiMAXAvailableInClient.class);
        map.put(new Long(36L), Attr_WiMAXSessionTerminationCapability.class);
        map.put(new Long(37L), Attr_WiMAXPPAQ.class);
        map.put(new Long(293L), Attr_WiMAXPPAQQuotaIdentifier.class);
        map.put(new Long(549L), Attr_WiMAXVolumeQuota.class);
        map.put(new Long(805L), Attr_WiMAXVolumeThreshold.class);
        map.put(new Long(1061L), Attr_WiMAXDurationQuota.class);
        map.put(new Long(1317L), Attr_WiMAXDurationThreshold.class);
        map.put(new Long(1573L), Attr_WiMAXResourceQuota.class);
        map.put(new Long(1829L), Attr_WiMAXResourceThreshold.class);
        map.put(new Long(2085L), Attr_WiMAXUpdateReason.class);
        map.put(new Long(2341L), Attr_WiMAXPrepaidServer.class);
        map.put(new Long(2597L), Attr_WiMAXServiceId.class);
        map.put(new Long(2853L), Attr_WiMAXRatingGroupId.class);
        map.put(new Long(3109L), Attr_WiMAXTerminationAction.class);
        map.put(new Long(3365L), Attr_WiMAXPoolId.class);
        map.put(new Long(3621L), Attr_WiMAXPoolMultiplier.class);
        map.put(new Long(3877L), Attr_WiMAXRequestedAction.class);
        map.put(new Long(4133L), Attr_WiMAXCheckBalanceResult.class);
        map.put(new Long(4389L), Attr_WiMAXCostInformationAVP.class);
        map.put(new Long(38L), Attr_WiMAXPrepaidTariffSwitching.class);
        map.put(new Long(294L), Attr_WiMAXPrepaidQuotaIdentifier.class);
        map.put(new Long(550L), Attr_WiMAXVolumeUsedAfter.class);
        map.put(new Long(806L), Attr_WiMAXTariffSwitchInterval.class);
        map.put(new Long(1062L), Attr_WiMAXTimeIntervalAfter.class);
        map.put(new Long(39L), Attr_WiMAXActiveTimeDuration.class);
        map.put(new Long(40L), Attr_WiMAXDHCPRK.class);
        map.put(new Long(41L), Attr_WiMAXDHCPRKKeyId.class);
        map.put(new Long(42L), Attr_WiMAXDHCPRKLifetime.class);
        map.put(new Long(43L), Attr_WiMAXDHCPMsgServerIP.class);
        map.put(new Long(44L), Attr_WiMAXIdleModeTransition.class);
        map.put(new Long(45L), Attr_WiMAXNAPId.class);
        map.put(new Long(46L), Attr_WiMAXBSId.class);
        map.put(new Long(47L), Attr_WiMAXLocation.class);
        map.put(new Long(48L), Attr_WiMAXAcctInputPacketsGigaword.class);
        map.put(new Long(49L), Attr_WiMAXAcctOutputPacketsGigaword.class);
        map.put(new Long(50L), Attr_WiMAXUplinkFlowDescription.class);
        map.put(new Long(51L), Attr_WiMAXBluCoaIPv6.class);
        map.put(new Long(52L), Attr_WiMAXDNSServer.class);
        map.put(new Long(53L), Attr_WiMAXHotlineProfileId.class);
        map.put(new Long(54L), Attr_WiMAXHTTPRedirectionRule.class);
        map.put(new Long(55L), Attr_WiMAXIPRedirectionRule.class);
        map.put(new Long(56L), Attr_WiMAXHotlineSessionTimer.class);
        map.put(new Long(57L), Attr_WiMAXNSPId.class);
        map.put(new Long(58L), Attr_WiMAXHARKKeyRequested.class);
        map.put(new Long(59L), Attr_WiMAXCountType.class);
        map.put(new Long(60L), Attr_WiMAXDMActionCode.class);
        map.put(new Long(61L), Attr_WiMAXFARKSPI.class);
        map.put(new Long(62L), Attr_WiMAXDownlinkFlowDescription.class);
        map.put(new Long(63L), Attr_WiMAXDownlinkGrantedQoS.class);
        map.put(new Long(64L), Attr_WiMAXvHAIPMIP4.class);
        map.put(new Long(65L), Attr_WiMAXvHAIPMIP6.class);
        map.put(new Long(66L), Attr_WiMAXvHAMIP4Key.class);
        map.put(new Long(67L), Attr_WiMAXvHARKKey.class);
        map.put(new Long(68L), Attr_WiMAXvHARKSPI.class);
        map.put(new Long(69L), Attr_WiMAXvHARKLifetime.class);
        map.put(new Long(70L), Attr_WiMAXMNvHAMIP6Key.class);
        map.put(new Long(71L), Attr_WiMAXMNvHAMIP4SPI.class);
        map.put(new Long(72L), Attr_WiMAXMNvHAMIP6SPI.class);
        map.put(new Long(73L), Attr_WiMAXvDHCPv4Server.class);
        map.put(new Long(74L), Attr_WiMAXvDHCPv6Server.class);
        map.put(new Long(75L), Attr_WiMAXvDHCPRK.class);
        map.put(new Long(76L), Attr_WiMAXvDHCPRKKeyID.class);
        map.put(new Long(77L), Attr_WiMAXvDHCPRKLifetime.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_WiMAXCapability.NAME, Attr_WiMAXCapability.class);
        map.put(Attr_WiMAXRelease.NAME, Attr_WiMAXRelease.class);
        map.put(Attr_WiMAXAccountingCapabilities.NAME, Attr_WiMAXAccountingCapabilities.class);
        map.put(Attr_WiMAXHotliningCapabilities.NAME, Attr_WiMAXHotliningCapabilities.class);
        map.put(Attr_WiMAXIdleModeNotificationCap.NAME, Attr_WiMAXIdleModeNotificationCap.class);
        map.put(Attr_WiMAXDeviceAuthenticationIndicator.NAME, Attr_WiMAXDeviceAuthenticationIndicator.class);
        map.put(Attr_WiMAXGMTTimezoneoffset.NAME, Attr_WiMAXGMTTimezoneoffset.class);
        map.put(Attr_WiMAXAAASessionId.NAME, Attr_WiMAXAAASessionId.class);
        map.put(Attr_WiMAXMSK.NAME, Attr_WiMAXMSK.class);
        map.put(Attr_WiMAXhHAIPMIP4.NAME, Attr_WiMAXhHAIPMIP4.class);
        map.put(Attr_WiMAXhHAIPMIP6.NAME, Attr_WiMAXhHAIPMIP6.class);
        map.put(Attr_WiMAXDHCPv4Server.NAME, Attr_WiMAXDHCPv4Server.class);
        map.put(Attr_WiMAXDHCPv6Server.NAME, Attr_WiMAXDHCPv6Server.class);
        map.put(Attr_WiMAXMNhHAMIP4Key.NAME, Attr_WiMAXMNhHAMIP4Key.class);
        map.put(Attr_WiMAXMNhHAMIP4SPI.NAME, Attr_WiMAXMNhHAMIP4SPI.class);
        map.put(Attr_WiMAXMNhHAMIP6Key.NAME, Attr_WiMAXMNhHAMIP6Key.class);
        map.put(Attr_WiMAXMNhHAMIP6SPI.NAME, Attr_WiMAXMNhHAMIP6SPI.class);
        map.put(Attr_WiMAXFARKKey.NAME, Attr_WiMAXFARKKey.class);
        map.put(Attr_WiMAXHARKKey.NAME, Attr_WiMAXHARKKey.class);
        map.put(Attr_WiMAXHARKSPI.NAME, Attr_WiMAXHARKSPI.class);
        map.put(Attr_WiMAXHARKLifetime.NAME, Attr_WiMAXHARKLifetime.class);
        map.put(Attr_WiMAXRRQHAIP.NAME, Attr_WiMAXRRQHAIP.class);
        map.put(Attr_WiMAXRRQMNHAKey.NAME, Attr_WiMAXRRQMNHAKey.class);
        map.put(Attr_WiMAXRRQMNHASPI.NAME, Attr_WiMAXRRQMNHASPI.class);
        map.put(Attr_WiMAXSessionContinue.NAME, Attr_WiMAXSessionContinue.class);
        map.put(Attr_WiMAXBeginningOfSession.NAME, Attr_WiMAXBeginningOfSession.class);
        map.put(Attr_WiMAXIPTechnology.NAME, Attr_WiMAXIPTechnology.class);
        map.put(Attr_WiMAXHotlineIndicator.NAME, Attr_WiMAXHotlineIndicator.class);
        map.put(Attr_WiMAXPrepaidIndicator.NAME, Attr_WiMAXPrepaidIndicator.class);
        map.put(Attr_WiMAXPDFID.NAME, Attr_WiMAXPDFID.class);
        map.put(Attr_WiMAXSDFID.NAME, Attr_WiMAXSDFID.class);
        map.put(Attr_WiMAXPacketFlowDescriptor.NAME, Attr_WiMAXPacketFlowDescriptor.class);
        map.put(Attr_WiMAXPacketDataFlowId.NAME, Attr_WiMAXPacketDataFlowId.class);
        map.put(Attr_WiMAXServiceDataFlowId.NAME, Attr_WiMAXServiceDataFlowId.class);
        map.put(Attr_WiMAXServiceProfileId.NAME, Attr_WiMAXServiceProfileId.class);
        map.put(Attr_WiMAXDirection.NAME, Attr_WiMAXDirection.class);
        map.put(Attr_WiMAXActivationTrigger.NAME, Attr_WiMAXActivationTrigger.class);
        map.put(Attr_WiMAXTransportType.NAME, Attr_WiMAXTransportType.class);
        map.put(Attr_WiMAXUplinkQOSId.NAME, Attr_WiMAXUplinkQOSId.class);
        map.put(Attr_WiMAXDownlinkQOSId.NAME, Attr_WiMAXDownlinkQOSId.class);
        map.put(Attr_WiMAXUplinkClassifier.NAME, Attr_WiMAXUplinkClassifier.class);
        map.put(Attr_WiMAXDownlinkClassifier.NAME, Attr_WiMAXDownlinkClassifier.class);
        map.put(Attr_WiMAXQoSDescriptor.NAME, Attr_WiMAXQoSDescriptor.class);
        map.put(Attr_WiMAXQoSId.NAME, Attr_WiMAXQoSId.class);
        map.put(Attr_WiMAXGlobalServiceClassName.NAME, Attr_WiMAXGlobalServiceClassName.class);
        map.put(Attr_WiMAXServiceClassName.NAME, Attr_WiMAXServiceClassName.class);
        map.put(Attr_WiMAXScheduleType.NAME, Attr_WiMAXScheduleType.class);
        map.put(Attr_WiMAXTrafficPriority.NAME, Attr_WiMAXTrafficPriority.class);
        map.put(Attr_WiMAXMaximumSustainedTrafficRate.NAME, Attr_WiMAXMaximumSustainedTrafficRate.class);
        map.put(Attr_WiMAXMinimumReservedTrafficRate.NAME, Attr_WiMAXMinimumReservedTrafficRate.class);
        map.put(Attr_WiMAXMaximumTrafficBurst.NAME, Attr_WiMAXMaximumTrafficBurst.class);
        map.put(Attr_WiMAXToleratedJitter.NAME, Attr_WiMAXToleratedJitter.class);
        map.put(Attr_WiMAXMaximumLatency.NAME, Attr_WiMAXMaximumLatency.class);
        map.put(Attr_WiMAXReducedResourcesCode.NAME, Attr_WiMAXReducedResourcesCode.class);
        map.put(Attr_WiMAXMediaFlowType.NAME, Attr_WiMAXMediaFlowType.class);
        map.put(Attr_WiMAXUnsolicitedGrantInterval.NAME, Attr_WiMAXUnsolicitedGrantInterval.class);
        map.put(Attr_WiMAXSDUSize.NAME, Attr_WiMAXSDUSize.class);
        map.put(Attr_WiMAXUnsolicitedPollingInterval.NAME, Attr_WiMAXUnsolicitedPollingInterval.class);
        map.put(Attr_WiMAXMediaFlowDescriptionSDP.NAME, Attr_WiMAXMediaFlowDescriptionSDP.class);
        map.put(Attr_WiMAXUplinkGrantedQoS.NAME, Attr_WiMAXUplinkGrantedQoS.class);
        map.put(Attr_WiMAXControlPacketsIn.NAME, Attr_WiMAXControlPacketsIn.class);
        map.put(Attr_WiMAXControlOctetsIn.NAME, Attr_WiMAXControlOctetsIn.class);
        map.put(Attr_WiMAXControlPacketsOut.NAME, Attr_WiMAXControlPacketsOut.class);
        map.put(Attr_WiMAXControlOctetsOut.NAME, Attr_WiMAXControlOctetsOut.class);
        map.put(Attr_WiMAXPPAC.NAME, Attr_WiMAXPPAC.class);
        map.put(Attr_WiMAXAvailableInClient.NAME, Attr_WiMAXAvailableInClient.class);
        map.put(Attr_WiMAXSessionTerminationCapability.NAME, Attr_WiMAXSessionTerminationCapability.class);
        map.put(Attr_WiMAXPPAQ.NAME, Attr_WiMAXPPAQ.class);
        map.put(Attr_WiMAXPPAQQuotaIdentifier.NAME, Attr_WiMAXPPAQQuotaIdentifier.class);
        map.put(Attr_WiMAXVolumeQuota.NAME, Attr_WiMAXVolumeQuota.class);
        map.put(Attr_WiMAXVolumeThreshold.NAME, Attr_WiMAXVolumeThreshold.class);
        map.put(Attr_WiMAXDurationQuota.NAME, Attr_WiMAXDurationQuota.class);
        map.put(Attr_WiMAXDurationThreshold.NAME, Attr_WiMAXDurationThreshold.class);
        map.put(Attr_WiMAXResourceQuota.NAME, Attr_WiMAXResourceQuota.class);
        map.put(Attr_WiMAXResourceThreshold.NAME, Attr_WiMAXResourceThreshold.class);
        map.put(Attr_WiMAXUpdateReason.NAME, Attr_WiMAXUpdateReason.class);
        map.put(Attr_WiMAXPrepaidServer.NAME, Attr_WiMAXPrepaidServer.class);
        map.put(Attr_WiMAXServiceId.NAME, Attr_WiMAXServiceId.class);
        map.put(Attr_WiMAXRatingGroupId.NAME, Attr_WiMAXRatingGroupId.class);
        map.put(Attr_WiMAXTerminationAction.NAME, Attr_WiMAXTerminationAction.class);
        map.put(Attr_WiMAXPoolId.NAME, Attr_WiMAXPoolId.class);
        map.put(Attr_WiMAXPoolMultiplier.NAME, Attr_WiMAXPoolMultiplier.class);
        map.put(Attr_WiMAXRequestedAction.NAME, Attr_WiMAXRequestedAction.class);
        map.put(Attr_WiMAXCheckBalanceResult.NAME, Attr_WiMAXCheckBalanceResult.class);
        map.put(Attr_WiMAXCostInformationAVP.NAME, Attr_WiMAXCostInformationAVP.class);
        map.put(Attr_WiMAXPrepaidTariffSwitching.NAME, Attr_WiMAXPrepaidTariffSwitching.class);
        map.put(Attr_WiMAXPrepaidQuotaIdentifier.NAME, Attr_WiMAXPrepaidQuotaIdentifier.class);
        map.put(Attr_WiMAXVolumeUsedAfter.NAME, Attr_WiMAXVolumeUsedAfter.class);
        map.put(Attr_WiMAXTariffSwitchInterval.NAME, Attr_WiMAXTariffSwitchInterval.class);
        map.put(Attr_WiMAXTimeIntervalAfter.NAME, Attr_WiMAXTimeIntervalAfter.class);
        map.put(Attr_WiMAXActiveTimeDuration.NAME, Attr_WiMAXActiveTimeDuration.class);
        map.put(Attr_WiMAXDHCPRK.NAME, Attr_WiMAXDHCPRK.class);
        map.put(Attr_WiMAXDHCPRKKeyId.NAME, Attr_WiMAXDHCPRKKeyId.class);
        map.put(Attr_WiMAXDHCPRKLifetime.NAME, Attr_WiMAXDHCPRKLifetime.class);
        map.put(Attr_WiMAXDHCPMsgServerIP.NAME, Attr_WiMAXDHCPMsgServerIP.class);
        map.put(Attr_WiMAXIdleModeTransition.NAME, Attr_WiMAXIdleModeTransition.class);
        map.put(Attr_WiMAXNAPId.NAME, Attr_WiMAXNAPId.class);
        map.put(Attr_WiMAXBSId.NAME, Attr_WiMAXBSId.class);
        map.put(Attr_WiMAXLocation.NAME, Attr_WiMAXLocation.class);
        map.put(Attr_WiMAXAcctInputPacketsGigaword.NAME, Attr_WiMAXAcctInputPacketsGigaword.class);
        map.put(Attr_WiMAXAcctOutputPacketsGigaword.NAME, Attr_WiMAXAcctOutputPacketsGigaword.class);
        map.put(Attr_WiMAXUplinkFlowDescription.NAME, Attr_WiMAXUplinkFlowDescription.class);
        map.put(Attr_WiMAXBluCoaIPv6.NAME, Attr_WiMAXBluCoaIPv6.class);
        map.put(Attr_WiMAXDNSServer.NAME, Attr_WiMAXDNSServer.class);
        map.put(Attr_WiMAXHotlineProfileId.NAME, Attr_WiMAXHotlineProfileId.class);
        map.put(Attr_WiMAXHTTPRedirectionRule.NAME, Attr_WiMAXHTTPRedirectionRule.class);
        map.put(Attr_WiMAXIPRedirectionRule.NAME, Attr_WiMAXIPRedirectionRule.class);
        map.put(Attr_WiMAXHotlineSessionTimer.NAME, Attr_WiMAXHotlineSessionTimer.class);
        map.put(Attr_WiMAXNSPId.NAME, Attr_WiMAXNSPId.class);
        map.put(Attr_WiMAXHARKKeyRequested.NAME, Attr_WiMAXHARKKeyRequested.class);
        map.put(Attr_WiMAXCountType.NAME, Attr_WiMAXCountType.class);
        map.put(Attr_WiMAXDMActionCode.NAME, Attr_WiMAXDMActionCode.class);
        map.put(Attr_WiMAXFARKSPI.NAME, Attr_WiMAXFARKSPI.class);
        map.put(Attr_WiMAXDownlinkFlowDescription.NAME, Attr_WiMAXDownlinkFlowDescription.class);
        map.put(Attr_WiMAXDownlinkGrantedQoS.NAME, Attr_WiMAXDownlinkGrantedQoS.class);
        map.put(Attr_WiMAXvHAIPMIP4.NAME, Attr_WiMAXvHAIPMIP4.class);
        map.put(Attr_WiMAXvHAIPMIP6.NAME, Attr_WiMAXvHAIPMIP6.class);
        map.put(Attr_WiMAXvHAMIP4Key.NAME, Attr_WiMAXvHAMIP4Key.class);
        map.put(Attr_WiMAXvHARKKey.NAME, Attr_WiMAXvHARKKey.class);
        map.put(Attr_WiMAXvHARKSPI.NAME, Attr_WiMAXvHARKSPI.class);
        map.put(Attr_WiMAXvHARKLifetime.NAME, Attr_WiMAXvHARKLifetime.class);
        map.put(Attr_WiMAXMNvHAMIP6Key.NAME, Attr_WiMAXMNvHAMIP6Key.class);
        map.put(Attr_WiMAXMNvHAMIP4SPI.NAME, Attr_WiMAXMNvHAMIP4SPI.class);
        map.put(Attr_WiMAXMNvHAMIP6SPI.NAME, Attr_WiMAXMNvHAMIP6SPI.class);
        map.put(Attr_WiMAXvDHCPv4Server.NAME, Attr_WiMAXvDHCPv4Server.class);
        map.put(Attr_WiMAXvDHCPv6Server.NAME, Attr_WiMAXvDHCPv6Server.class);
        map.put(Attr_WiMAXvDHCPRK.NAME, Attr_WiMAXvDHCPRK.class);
        map.put(Attr_WiMAXvDHCPRKKeyID.NAME, Attr_WiMAXvDHCPRKKeyID.class);
        map.put(Attr_WiMAXvDHCPRKLifetime.NAME, Attr_WiMAXvDHCPRKLifetime.class);
    }
}

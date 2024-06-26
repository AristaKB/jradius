// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_ascend
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Ascend"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(2L), Attr_AscendMaxSharedUsers.class);
        map.put(new Long(7L), Attr_AscendUUInfo.class);
        map.put(new Long(9L), Attr_AscendCIRTimer.class);
        map.put(new Long(10L), Attr_AscendFR08Mode.class);
        map.put(new Long(11L), Attr_AscendDestinationNasPort.class);
        map.put(new Long(12L), Attr_AscendFRSVCAddr.class);
        map.put(new Long(13L), Attr_AscendNASPortFormat.class);
        map.put(new Long(14L), Attr_AscendATMFaultManagement.class);
        map.put(new Long(15L), Attr_AscendATMLoopbackCellLoss.class);
        map.put(new Long(16L), Attr_AscendCktType.class);
        map.put(new Long(17L), Attr_AscendSVCEnabled.class);
        map.put(new Long(18L), Attr_AscendSessionType.class);
        map.put(new Long(19L), Attr_AscendH323Gatekeeper.class);
        map.put(new Long(20L), Attr_AscendGlobalCallId.class);
        map.put(new Long(21L), Attr_AscendH323ConferenceId.class);
        map.put(new Long(22L), Attr_AscendH323FegwAddress.class);
        map.put(new Long(23L), Attr_AscendH323DialedTime.class);
        map.put(new Long(24L), Attr_AscendDialedNumber.class);
        map.put(new Long(25L), Attr_AscendInterArrivalJitter.class);
        map.put(new Long(26L), Attr_AscendDroppedOctets.class);
        map.put(new Long(27L), Attr_AscendDroppedPackets.class);
        map.put(new Long(28L), Attr_AscendAuthDelay.class);
        map.put(new Long(29L), Attr_AscendX25PadX3Profile.class);
        map.put(new Long(30L), Attr_AscendX25PadX3Parameters.class);
        map.put(new Long(31L), Attr_AscendTunnelVRouterName.class);
        map.put(new Long(32L), Attr_AscendX25ReverseCharging.class);
        map.put(new Long(33L), Attr_AscendX25NuiPrompt.class);
        map.put(new Long(34L), Attr_AscendX25NuiPasswordPrompt.class);
        map.put(new Long(35L), Attr_AscendX25Cug.class);
        map.put(new Long(36L), Attr_AscendX25PadAlias1.class);
        map.put(new Long(37L), Attr_AscendX25PadAlias2.class);
        map.put(new Long(38L), Attr_AscendX25PadAlias3.class);
        map.put(new Long(39L), Attr_AscendX25X121Address.class);
        map.put(new Long(40L), Attr_AscendX25Nui.class);
        map.put(new Long(41L), Attr_AscendX25Rpoa.class);
        map.put(new Long(42L), Attr_AscendX25PadPrompt.class);
        map.put(new Long(43L), Attr_AscendX25PadBanner.class);
        map.put(new Long(44L), Attr_AscendX25ProfileName.class);
        map.put(new Long(45L), Attr_AscendRecvName.class);
        map.put(new Long(46L), Attr_AscendBiDirectionalAuth.class);
        map.put(new Long(47L), Attr_AscendMTU.class);
        map.put(new Long(48L), Attr_AscendCallDirection.class);
        map.put(new Long(49L), Attr_AscendServiceType.class);
        map.put(new Long(50L), Attr_AscendFilterRequired.class);
        map.put(new Long(51L), Attr_AscendTrafficShaper.class);
        map.put(new Long(52L), Attr_AscendAccessInterceptLEA.class);
        map.put(new Long(53L), Attr_AscendAccessInterceptLog.class);
        map.put(new Long(54L), Attr_AscendPrivateRouteTableID.class);
        map.put(new Long(55L), Attr_AscendPrivateRouteRequired.class);
        map.put(new Long(56L), Attr_AscendCacheRefresh.class);
        map.put(new Long(57L), Attr_AscendCacheTime.class);
        map.put(new Long(58L), Attr_AscendEgressEnabled.class);
        map.put(new Long(59L), Attr_AscendQOSUpstream.class);
        map.put(new Long(60L), Attr_AscendQOSDownstream.class);
        map.put(new Long(61L), Attr_AscendATMConnectVpi.class);
        map.put(new Long(62L), Attr_AscendATMConnectVci.class);
        map.put(new Long(63L), Attr_AscendATMConnectGroup.class);
        map.put(new Long(64L), Attr_AscendATMGroup.class);
        map.put(new Long(65L), Attr_AscendIPXHeaderCompression.class);
        map.put(new Long(66L), Attr_AscendCallingIdTypeOfNum.class);
        map.put(new Long(67L), Attr_AscendCallingIdNumberPlan.class);
        map.put(new Long(68L), Attr_AscendCallingIdPresentatn.class);
        map.put(new Long(69L), Attr_AscendCallingIdScreening.class);
        map.put(new Long(70L), Attr_AscendBIREnable.class);
        map.put(new Long(71L), Attr_AscendBIRProxy.class);
        map.put(new Long(72L), Attr_AscendBIRBridgeGroup.class);
        map.put(new Long(73L), Attr_AscendIPSECProfile.class);
        map.put(new Long(74L), Attr_AscendPPPoEEnable.class);
        map.put(new Long(75L), Attr_AscendBridgeNonPPPoE.class);
        map.put(new Long(76L), Attr_AscendATMDirect.class);
        map.put(new Long(77L), Attr_AscendATMDirectProfile.class);
        map.put(new Long(78L), Attr_AscendClientPrimaryWINS.class);
        map.put(new Long(79L), Attr_AscendClientSecondaryWINS.class);
        map.put(new Long(80L), Attr_AscendClientAssignWINS.class);
        map.put(new Long(81L), Attr_AscendAuthType.class);
        map.put(new Long(82L), Attr_AscendPortRedirProtocol.class);
        map.put(new Long(83L), Attr_AscendPortRedirPortnum.class);
        map.put(new Long(84L), Attr_AscendPortRedirServer.class);
        map.put(new Long(85L), Attr_AscendIPPoolChaining.class);
        map.put(new Long(86L), Attr_AscendOwnerIPAddr.class);
        map.put(new Long(87L), Attr_AscendIPTOS.class);
        map.put(new Long(88L), Attr_AscendIPTOSPrecedence.class);
        map.put(new Long(89L), Attr_AscendIPTOSApplyTo.class);
        map.put(new Long(90L), Attr_AscendFilter.class);
        map.put(new Long(91L), Attr_AscendTelnetProfile.class);
        map.put(new Long(92L), Attr_AscendDslRateType.class);
        map.put(new Long(93L), Attr_AscendRedirectNumber.class);
        map.put(new Long(94L), Attr_AscendATMVpi.class);
        map.put(new Long(95L), Attr_AscendATMVci.class);
        map.put(new Long(96L), Attr_AscendSourceIPCheck.class);
        map.put(new Long(97L), Attr_AscendDslRateMode.class);
        map.put(new Long(98L), Attr_AscendDslUpstreamLimit.class);
        map.put(new Long(99L), Attr_AscendDslDownstreamLimit.class);
        map.put(new Long(100L), Attr_AscendDslCIRRecvLimit.class);
        map.put(new Long(101L), Attr_AscendDslCIRXmitLimit.class);
        map.put(new Long(102L), Attr_AscendVRouterName.class);
        map.put(new Long(103L), Attr_AscendSourceAuth.class);
        map.put(new Long(104L), Attr_AscendPrivateRoute.class);
        map.put(new Long(105L), Attr_AscendNumberingPlanID.class);
        map.put(new Long(106L), Attr_AscendFRLinkStatusDLCI.class);
        map.put(new Long(107L), Attr_AscendCallingSubaddress.class);
        map.put(new Long(108L), Attr_AscendCallbackDelay.class);
        map.put(new Long(109L), Attr_AscendEndpointDisc.class);
        map.put(new Long(110L), Attr_AscendRemoteFW.class);
        map.put(new Long(111L), Attr_AscendMulticastGLeaveDelay.class);
        map.put(new Long(112L), Attr_AscendCBCPEnable.class);
        map.put(new Long(113L), Attr_AscendCBCPMode.class);
        map.put(new Long(114L), Attr_AscendCBCPDelay.class);
        map.put(new Long(115L), Attr_AscendCBCPTrunkGroup.class);
        map.put(new Long(116L), Attr_AscendAppletalkRoute.class);
        map.put(new Long(117L), Attr_AscendAppletalkPeerMode.class);
        map.put(new Long(118L), Attr_AscendRouteAppletalk.class);
        map.put(new Long(119L), Attr_AscendFCPParameter.class);
        map.put(new Long(120L), Attr_AscendModemPortNo.class);
        map.put(new Long(121L), Attr_AscendModemSlotNo.class);
        map.put(new Long(122L), Attr_AscendModemShelfNo.class);
        map.put(new Long(123L), Attr_AscendCallAttemptLimit.class);
        map.put(new Long(124L), Attr_AscendCallBlockDuration.class);
        map.put(new Long(125L), Attr_AscendMaximumCallDuration.class);
        map.put(new Long(126L), Attr_AscendTemporaryRtes.class);
        map.put(new Long(127L), Attr_AscendTunnelingProtocol.class);
        map.put(new Long(128L), Attr_AscendSharedProfileEnable.class);
        map.put(new Long(129L), Attr_AscendPrimaryHomeAgent.class);
        map.put(new Long(130L), Attr_AscendSecondaryHomeAgent.class);
        map.put(new Long(131L), Attr_AscendDialoutAllowed.class);
        map.put(new Long(132L), Attr_AscendClientGateway.class);
        map.put(new Long(133L), Attr_AscendBACPEnable.class);
        map.put(new Long(134L), Attr_AscendDHCPMaximumLeases.class);
        map.put(new Long(135L), Attr_AscendClientPrimaryDNS.class);
        map.put(new Long(136L), Attr_AscendClientSecondaryDNS.class);
        map.put(new Long(137L), Attr_AscendClientAssignDNS.class);
        map.put(new Long(138L), Attr_AscendUserAcctType.class);
        map.put(new Long(139L), Attr_AscendUserAcctHost.class);
        map.put(new Long(140L), Attr_AscendUserAcctPort.class);
        map.put(new Long(141L), Attr_AscendUserAcctKey.class);
        map.put(new Long(142L), Attr_AscendUserAcctBase.class);
        map.put(new Long(143L), Attr_AscendUserAcctTime.class);
        map.put(new Long(144L), Attr_AscendAssignIPClient.class);
        map.put(new Long(145L), Attr_AscendAssignIPServer.class);
        map.put(new Long(146L), Attr_AscendAssignIPGlobalPool.class);
        map.put(new Long(147L), Attr_AscendDHCPReply.class);
        map.put(new Long(148L), Attr_AscendDHCPPoolNumber.class);
        map.put(new Long(149L), Attr_AscendExpectCallback.class);
        map.put(new Long(150L), Attr_AscendEventType.class);
        map.put(new Long(151L), Attr_AscendSessionSvrKey.class);
        map.put(new Long(152L), Attr_AscendMulticastRateLimit.class);
        map.put(new Long(153L), Attr_AscendIFNetmask.class);
        map.put(new Long(154L), Attr_AscendRemoteAddr.class);
        map.put(new Long(155L), Attr_AscendMulticastClient.class);
        map.put(new Long(156L), Attr_AscendFRCircuitName.class);
        map.put(new Long(157L), Attr_AscendFRLinkUp.class);
        map.put(new Long(158L), Attr_AscendFRNailedGrp.class);
        map.put(new Long(159L), Attr_AscendFRType.class);
        map.put(new Long(160L), Attr_AscendFRLinkMgt.class);
        map.put(new Long(161L), Attr_AscendFRN391.class);
        map.put(new Long(162L), Attr_AscendFRDCEN392.class);
        map.put(new Long(163L), Attr_AscendFRDTEN392.class);
        map.put(new Long(164L), Attr_AscendFRDCEN393.class);
        map.put(new Long(165L), Attr_AscendFRDTEN393.class);
        map.put(new Long(166L), Attr_AscendFRT391.class);
        map.put(new Long(167L), Attr_AscendFRT392.class);
        map.put(new Long(168L), Attr_AscendBridgeAddress.class);
        map.put(new Long(169L), Attr_AscendTSIdleLimit.class);
        map.put(new Long(170L), Attr_AscendTSIdleMode.class);
        map.put(new Long(171L), Attr_AscendDBAMonitor.class);
        map.put(new Long(172L), Attr_AscendBaseChannelCount.class);
        map.put(new Long(173L), Attr_AscendMinimumChannels.class);
        map.put(new Long(174L), Attr_AscendIPXRoute.class);
        map.put(new Long(175L), Attr_AscendFT1Caller.class);
        map.put(new Long(176L), Attr_AscendBackup.class);
        map.put(new Long(177L), Attr_AscendCallType.class);
        map.put(new Long(178L), Attr_AscendGroup.class);
        map.put(new Long(179L), Attr_AscendFRDLCI.class);
        map.put(new Long(180L), Attr_AscendFRProfileName.class);
        map.put(new Long(181L), Attr_AscendAraPW.class);
        map.put(new Long(182L), Attr_AscendIPXNodeAddr.class);
        map.put(new Long(183L), Attr_AscendHomeAgentIPAddr.class);
        map.put(new Long(184L), Attr_AscendHomeAgentPassword.class);
        map.put(new Long(185L), Attr_AscendHomeNetworkName.class);
        map.put(new Long(186L), Attr_AscendHomeAgentUDPPort.class);
        map.put(new Long(187L), Attr_AscendMultilinkID.class);
        map.put(new Long(188L), Attr_AscendNumInMultilink.class);
        map.put(new Long(189L), Attr_AscendFirstDest.class);
        map.put(new Long(190L), Attr_AscendPreInputOctets.class);
        map.put(new Long(191L), Attr_AscendPreOutputOctets.class);
        map.put(new Long(192L), Attr_AscendPreInputPackets.class);
        map.put(new Long(193L), Attr_AscendPreOutputPackets.class);
        map.put(new Long(194L), Attr_AscendMaximumTime.class);
        map.put(new Long(195L), Attr_AscendDisconnectCause.class);
        map.put(new Long(196L), Attr_AscendConnectProgress.class);
        map.put(new Long(197L), Attr_AscendDataRate.class);
        map.put(new Long(198L), Attr_AscendPreSessionTime.class);
        map.put(new Long(199L), Attr_AscendTokenIdle.class);
        map.put(new Long(200L), Attr_AscendTokenImmediate.class);
        map.put(new Long(201L), Attr_AscendRequireAuth.class);
        map.put(new Long(202L), Attr_AscendNumberSessions.class);
        map.put(new Long(203L), Attr_AscendAuthenAlias.class);
        map.put(new Long(204L), Attr_AscendTokenExpiry.class);
        map.put(new Long(205L), Attr_AscendMenuSelector.class);
        map.put(new Long(206L), Attr_AscendMenuItem.class);
        map.put(new Long(207L), Attr_AscendPWWarntime.class);
        map.put(new Long(208L), Attr_AscendPWLifetime.class);
        map.put(new Long(209L), Attr_AscendIPDirect.class);
        map.put(new Long(210L), Attr_AscendPPPVJSlotComp.class);
        map.put(new Long(211L), Attr_AscendPPPVJ1172.class);
        map.put(new Long(212L), Attr_AscendPPPAsyncMap.class);
        map.put(new Long(213L), Attr_AscendThirdPrompt.class);
        map.put(new Long(214L), Attr_AscendSendSecret.class);
        map.put(new Long(215L), Attr_AscendReceiveSecret.class);
        map.put(new Long(216L), Attr_AscendIPXPeerMode.class);
        map.put(new Long(217L), Attr_AscendIPPoolDefinition.class);
        map.put(new Long(218L), Attr_AscendAssignIPPool.class);
        map.put(new Long(219L), Attr_AscendFRDirect.class);
        map.put(new Long(220L), Attr_AscendFRDirectProfile.class);
        map.put(new Long(221L), Attr_AscendFRDirectDLCI.class);
        map.put(new Long(222L), Attr_AscendHandleIPX.class);
        map.put(new Long(223L), Attr_AscendNetwaretimeout.class);
        map.put(new Long(224L), Attr_AscendIPXAlias.class);
        map.put(new Long(225L), Attr_AscendMetric.class);
        map.put(new Long(226L), Attr_AscendPRINumberType.class);
        map.put(new Long(227L), Attr_AscendDialNumber.class);
        map.put(new Long(228L), Attr_AscendRouteIP.class);
        map.put(new Long(229L), Attr_AscendRouteIPX.class);
        map.put(new Long(230L), Attr_AscendBridge.class);
        map.put(new Long(231L), Attr_AscendSendAuth.class);
        map.put(new Long(232L), Attr_AscendSendPasswd.class);
        map.put(new Long(233L), Attr_AscendLinkCompression.class);
        map.put(new Long(234L), Attr_AscendTargetUtil.class);
        map.put(new Long(235L), Attr_AscendMaximumChannels.class);
        map.put(new Long(236L), Attr_AscendIncChannelCount.class);
        map.put(new Long(237L), Attr_AscendDecChannelCount.class);
        map.put(new Long(238L), Attr_AscendSecondsOfHistory.class);
        map.put(new Long(239L), Attr_AscendHistoryWeighType.class);
        map.put(new Long(240L), Attr_AscendAddSeconds.class);
        map.put(new Long(241L), Attr_AscendRemoveSeconds.class);
        map.put(new Long(242L), Attr_AscendDataFilter.class);
        map.put(new Long(243L), Attr_AscendCallFilter.class);
        map.put(new Long(244L), Attr_AscendIdleLimit.class);
        map.put(new Long(245L), Attr_AscendPreemptLimit.class);
        map.put(new Long(246L), Attr_AscendCallback.class);
        map.put(new Long(247L), Attr_AscendDataSvc.class);
        map.put(new Long(248L), Attr_AscendForce56.class);
        map.put(new Long(249L), Attr_AscendBillingNumber.class);
        map.put(new Long(250L), Attr_AscendCallByCall.class);
        map.put(new Long(251L), Attr_AscendTransitNumber.class);
        map.put(new Long(252L), Attr_AscendHostInfo.class);
        map.put(new Long(253L), Attr_AscendPPPAddress.class);
        map.put(new Long(254L), Attr_AscendMPPIdlePercent.class);
        map.put(new Long(255L), Attr_AscendXmitRate.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_AscendMaxSharedUsers.NAME, Attr_AscendMaxSharedUsers.class);
        map.put(Attr_AscendUUInfo.NAME, Attr_AscendUUInfo.class);
        map.put(Attr_AscendCIRTimer.NAME, Attr_AscendCIRTimer.class);
        map.put(Attr_AscendFR08Mode.NAME, Attr_AscendFR08Mode.class);
        map.put(Attr_AscendDestinationNasPort.NAME, Attr_AscendDestinationNasPort.class);
        map.put(Attr_AscendFRSVCAddr.NAME, Attr_AscendFRSVCAddr.class);
        map.put(Attr_AscendNASPortFormat.NAME, Attr_AscendNASPortFormat.class);
        map.put(Attr_AscendATMFaultManagement.NAME, Attr_AscendATMFaultManagement.class);
        map.put(Attr_AscendATMLoopbackCellLoss.NAME, Attr_AscendATMLoopbackCellLoss.class);
        map.put(Attr_AscendCktType.NAME, Attr_AscendCktType.class);
        map.put(Attr_AscendSVCEnabled.NAME, Attr_AscendSVCEnabled.class);
        map.put(Attr_AscendSessionType.NAME, Attr_AscendSessionType.class);
        map.put(Attr_AscendH323Gatekeeper.NAME, Attr_AscendH323Gatekeeper.class);
        map.put(Attr_AscendGlobalCallId.NAME, Attr_AscendGlobalCallId.class);
        map.put(Attr_AscendH323ConferenceId.NAME, Attr_AscendH323ConferenceId.class);
        map.put(Attr_AscendH323FegwAddress.NAME, Attr_AscendH323FegwAddress.class);
        map.put(Attr_AscendH323DialedTime.NAME, Attr_AscendH323DialedTime.class);
        map.put(Attr_AscendDialedNumber.NAME, Attr_AscendDialedNumber.class);
        map.put(Attr_AscendInterArrivalJitter.NAME, Attr_AscendInterArrivalJitter.class);
        map.put(Attr_AscendDroppedOctets.NAME, Attr_AscendDroppedOctets.class);
        map.put(Attr_AscendDroppedPackets.NAME, Attr_AscendDroppedPackets.class);
        map.put(Attr_AscendAuthDelay.NAME, Attr_AscendAuthDelay.class);
        map.put(Attr_AscendX25PadX3Profile.NAME, Attr_AscendX25PadX3Profile.class);
        map.put(Attr_AscendX25PadX3Parameters.NAME, Attr_AscendX25PadX3Parameters.class);
        map.put(Attr_AscendTunnelVRouterName.NAME, Attr_AscendTunnelVRouterName.class);
        map.put(Attr_AscendX25ReverseCharging.NAME, Attr_AscendX25ReverseCharging.class);
        map.put(Attr_AscendX25NuiPrompt.NAME, Attr_AscendX25NuiPrompt.class);
        map.put(Attr_AscendX25NuiPasswordPrompt.NAME, Attr_AscendX25NuiPasswordPrompt.class);
        map.put(Attr_AscendX25Cug.NAME, Attr_AscendX25Cug.class);
        map.put(Attr_AscendX25PadAlias1.NAME, Attr_AscendX25PadAlias1.class);
        map.put(Attr_AscendX25PadAlias2.NAME, Attr_AscendX25PadAlias2.class);
        map.put(Attr_AscendX25PadAlias3.NAME, Attr_AscendX25PadAlias3.class);
        map.put(Attr_AscendX25X121Address.NAME, Attr_AscendX25X121Address.class);
        map.put(Attr_AscendX25Nui.NAME, Attr_AscendX25Nui.class);
        map.put(Attr_AscendX25Rpoa.NAME, Attr_AscendX25Rpoa.class);
        map.put(Attr_AscendX25PadPrompt.NAME, Attr_AscendX25PadPrompt.class);
        map.put(Attr_AscendX25PadBanner.NAME, Attr_AscendX25PadBanner.class);
        map.put(Attr_AscendX25ProfileName.NAME, Attr_AscendX25ProfileName.class);
        map.put(Attr_AscendRecvName.NAME, Attr_AscendRecvName.class);
        map.put(Attr_AscendBiDirectionalAuth.NAME, Attr_AscendBiDirectionalAuth.class);
        map.put(Attr_AscendMTU.NAME, Attr_AscendMTU.class);
        map.put(Attr_AscendCallDirection.NAME, Attr_AscendCallDirection.class);
        map.put(Attr_AscendServiceType.NAME, Attr_AscendServiceType.class);
        map.put(Attr_AscendFilterRequired.NAME, Attr_AscendFilterRequired.class);
        map.put(Attr_AscendTrafficShaper.NAME, Attr_AscendTrafficShaper.class);
        map.put(Attr_AscendAccessInterceptLEA.NAME, Attr_AscendAccessInterceptLEA.class);
        map.put(Attr_AscendAccessInterceptLog.NAME, Attr_AscendAccessInterceptLog.class);
        map.put(Attr_AscendPrivateRouteTableID.NAME, Attr_AscendPrivateRouteTableID.class);
        map.put(Attr_AscendPrivateRouteRequired.NAME, Attr_AscendPrivateRouteRequired.class);
        map.put(Attr_AscendCacheRefresh.NAME, Attr_AscendCacheRefresh.class);
        map.put(Attr_AscendCacheTime.NAME, Attr_AscendCacheTime.class);
        map.put(Attr_AscendEgressEnabled.NAME, Attr_AscendEgressEnabled.class);
        map.put(Attr_AscendQOSUpstream.NAME, Attr_AscendQOSUpstream.class);
        map.put(Attr_AscendQOSDownstream.NAME, Attr_AscendQOSDownstream.class);
        map.put(Attr_AscendATMConnectVpi.NAME, Attr_AscendATMConnectVpi.class);
        map.put(Attr_AscendATMConnectVci.NAME, Attr_AscendATMConnectVci.class);
        map.put(Attr_AscendATMConnectGroup.NAME, Attr_AscendATMConnectGroup.class);
        map.put(Attr_AscendATMGroup.NAME, Attr_AscendATMGroup.class);
        map.put(Attr_AscendIPXHeaderCompression.NAME, Attr_AscendIPXHeaderCompression.class);
        map.put(Attr_AscendCallingIdTypeOfNum.NAME, Attr_AscendCallingIdTypeOfNum.class);
        map.put(Attr_AscendCallingIdNumberPlan.NAME, Attr_AscendCallingIdNumberPlan.class);
        map.put(Attr_AscendCallingIdPresentatn.NAME, Attr_AscendCallingIdPresentatn.class);
        map.put(Attr_AscendCallingIdScreening.NAME, Attr_AscendCallingIdScreening.class);
        map.put(Attr_AscendBIREnable.NAME, Attr_AscendBIREnable.class);
        map.put(Attr_AscendBIRProxy.NAME, Attr_AscendBIRProxy.class);
        map.put(Attr_AscendBIRBridgeGroup.NAME, Attr_AscendBIRBridgeGroup.class);
        map.put(Attr_AscendIPSECProfile.NAME, Attr_AscendIPSECProfile.class);
        map.put(Attr_AscendPPPoEEnable.NAME, Attr_AscendPPPoEEnable.class);
        map.put(Attr_AscendBridgeNonPPPoE.NAME, Attr_AscendBridgeNonPPPoE.class);
        map.put(Attr_AscendATMDirect.NAME, Attr_AscendATMDirect.class);
        map.put(Attr_AscendATMDirectProfile.NAME, Attr_AscendATMDirectProfile.class);
        map.put(Attr_AscendClientPrimaryWINS.NAME, Attr_AscendClientPrimaryWINS.class);
        map.put(Attr_AscendClientSecondaryWINS.NAME, Attr_AscendClientSecondaryWINS.class);
        map.put(Attr_AscendClientAssignWINS.NAME, Attr_AscendClientAssignWINS.class);
        map.put(Attr_AscendAuthType.NAME, Attr_AscendAuthType.class);
        map.put(Attr_AscendPortRedirProtocol.NAME, Attr_AscendPortRedirProtocol.class);
        map.put(Attr_AscendPortRedirPortnum.NAME, Attr_AscendPortRedirPortnum.class);
        map.put(Attr_AscendPortRedirServer.NAME, Attr_AscendPortRedirServer.class);
        map.put(Attr_AscendIPPoolChaining.NAME, Attr_AscendIPPoolChaining.class);
        map.put(Attr_AscendOwnerIPAddr.NAME, Attr_AscendOwnerIPAddr.class);
        map.put(Attr_AscendIPTOS.NAME, Attr_AscendIPTOS.class);
        map.put(Attr_AscendIPTOSPrecedence.NAME, Attr_AscendIPTOSPrecedence.class);
        map.put(Attr_AscendIPTOSApplyTo.NAME, Attr_AscendIPTOSApplyTo.class);
        map.put(Attr_AscendFilter.NAME, Attr_AscendFilter.class);
        map.put(Attr_AscendTelnetProfile.NAME, Attr_AscendTelnetProfile.class);
        map.put(Attr_AscendDslRateType.NAME, Attr_AscendDslRateType.class);
        map.put(Attr_AscendRedirectNumber.NAME, Attr_AscendRedirectNumber.class);
        map.put(Attr_AscendATMVpi.NAME, Attr_AscendATMVpi.class);
        map.put(Attr_AscendATMVci.NAME, Attr_AscendATMVci.class);
        map.put(Attr_AscendSourceIPCheck.NAME, Attr_AscendSourceIPCheck.class);
        map.put(Attr_AscendDslRateMode.NAME, Attr_AscendDslRateMode.class);
        map.put(Attr_AscendDslUpstreamLimit.NAME, Attr_AscendDslUpstreamLimit.class);
        map.put(Attr_AscendDslDownstreamLimit.NAME, Attr_AscendDslDownstreamLimit.class);
        map.put(Attr_AscendDslCIRRecvLimit.NAME, Attr_AscendDslCIRRecvLimit.class);
        map.put(Attr_AscendDslCIRXmitLimit.NAME, Attr_AscendDslCIRXmitLimit.class);
        map.put(Attr_AscendVRouterName.NAME, Attr_AscendVRouterName.class);
        map.put(Attr_AscendSourceAuth.NAME, Attr_AscendSourceAuth.class);
        map.put(Attr_AscendPrivateRoute.NAME, Attr_AscendPrivateRoute.class);
        map.put(Attr_AscendNumberingPlanID.NAME, Attr_AscendNumberingPlanID.class);
        map.put(Attr_AscendFRLinkStatusDLCI.NAME, Attr_AscendFRLinkStatusDLCI.class);
        map.put(Attr_AscendCallingSubaddress.NAME, Attr_AscendCallingSubaddress.class);
        map.put(Attr_AscendCallbackDelay.NAME, Attr_AscendCallbackDelay.class);
        map.put(Attr_AscendEndpointDisc.NAME, Attr_AscendEndpointDisc.class);
        map.put(Attr_AscendRemoteFW.NAME, Attr_AscendRemoteFW.class);
        map.put(Attr_AscendMulticastGLeaveDelay.NAME, Attr_AscendMulticastGLeaveDelay.class);
        map.put(Attr_AscendCBCPEnable.NAME, Attr_AscendCBCPEnable.class);
        map.put(Attr_AscendCBCPMode.NAME, Attr_AscendCBCPMode.class);
        map.put(Attr_AscendCBCPDelay.NAME, Attr_AscendCBCPDelay.class);
        map.put(Attr_AscendCBCPTrunkGroup.NAME, Attr_AscendCBCPTrunkGroup.class);
        map.put(Attr_AscendAppletalkRoute.NAME, Attr_AscendAppletalkRoute.class);
        map.put(Attr_AscendAppletalkPeerMode.NAME, Attr_AscendAppletalkPeerMode.class);
        map.put(Attr_AscendRouteAppletalk.NAME, Attr_AscendRouteAppletalk.class);
        map.put(Attr_AscendFCPParameter.NAME, Attr_AscendFCPParameter.class);
        map.put(Attr_AscendModemPortNo.NAME, Attr_AscendModemPortNo.class);
        map.put(Attr_AscendModemSlotNo.NAME, Attr_AscendModemSlotNo.class);
        map.put(Attr_AscendModemShelfNo.NAME, Attr_AscendModemShelfNo.class);
        map.put(Attr_AscendCallAttemptLimit.NAME, Attr_AscendCallAttemptLimit.class);
        map.put(Attr_AscendCallBlockDuration.NAME, Attr_AscendCallBlockDuration.class);
        map.put(Attr_AscendMaximumCallDuration.NAME, Attr_AscendMaximumCallDuration.class);
        map.put(Attr_AscendTemporaryRtes.NAME, Attr_AscendTemporaryRtes.class);
        map.put(Attr_AscendTunnelingProtocol.NAME, Attr_AscendTunnelingProtocol.class);
        map.put(Attr_AscendSharedProfileEnable.NAME, Attr_AscendSharedProfileEnable.class);
        map.put(Attr_AscendPrimaryHomeAgent.NAME, Attr_AscendPrimaryHomeAgent.class);
        map.put(Attr_AscendSecondaryHomeAgent.NAME, Attr_AscendSecondaryHomeAgent.class);
        map.put(Attr_AscendDialoutAllowed.NAME, Attr_AscendDialoutAllowed.class);
        map.put(Attr_AscendClientGateway.NAME, Attr_AscendClientGateway.class);
        map.put(Attr_AscendBACPEnable.NAME, Attr_AscendBACPEnable.class);
        map.put(Attr_AscendDHCPMaximumLeases.NAME, Attr_AscendDHCPMaximumLeases.class);
        map.put(Attr_AscendClientPrimaryDNS.NAME, Attr_AscendClientPrimaryDNS.class);
        map.put(Attr_AscendClientSecondaryDNS.NAME, Attr_AscendClientSecondaryDNS.class);
        map.put(Attr_AscendClientAssignDNS.NAME, Attr_AscendClientAssignDNS.class);
        map.put(Attr_AscendUserAcctType.NAME, Attr_AscendUserAcctType.class);
        map.put(Attr_AscendUserAcctHost.NAME, Attr_AscendUserAcctHost.class);
        map.put(Attr_AscendUserAcctPort.NAME, Attr_AscendUserAcctPort.class);
        map.put(Attr_AscendUserAcctKey.NAME, Attr_AscendUserAcctKey.class);
        map.put(Attr_AscendUserAcctBase.NAME, Attr_AscendUserAcctBase.class);
        map.put(Attr_AscendUserAcctTime.NAME, Attr_AscendUserAcctTime.class);
        map.put(Attr_AscendAssignIPClient.NAME, Attr_AscendAssignIPClient.class);
        map.put(Attr_AscendAssignIPServer.NAME, Attr_AscendAssignIPServer.class);
        map.put(Attr_AscendAssignIPGlobalPool.NAME, Attr_AscendAssignIPGlobalPool.class);
        map.put(Attr_AscendDHCPReply.NAME, Attr_AscendDHCPReply.class);
        map.put(Attr_AscendDHCPPoolNumber.NAME, Attr_AscendDHCPPoolNumber.class);
        map.put(Attr_AscendExpectCallback.NAME, Attr_AscendExpectCallback.class);
        map.put(Attr_AscendEventType.NAME, Attr_AscendEventType.class);
        map.put(Attr_AscendSessionSvrKey.NAME, Attr_AscendSessionSvrKey.class);
        map.put(Attr_AscendMulticastRateLimit.NAME, Attr_AscendMulticastRateLimit.class);
        map.put(Attr_AscendIFNetmask.NAME, Attr_AscendIFNetmask.class);
        map.put(Attr_AscendRemoteAddr.NAME, Attr_AscendRemoteAddr.class);
        map.put(Attr_AscendMulticastClient.NAME, Attr_AscendMulticastClient.class);
        map.put(Attr_AscendFRCircuitName.NAME, Attr_AscendFRCircuitName.class);
        map.put(Attr_AscendFRLinkUp.NAME, Attr_AscendFRLinkUp.class);
        map.put(Attr_AscendFRNailedGrp.NAME, Attr_AscendFRNailedGrp.class);
        map.put(Attr_AscendFRType.NAME, Attr_AscendFRType.class);
        map.put(Attr_AscendFRLinkMgt.NAME, Attr_AscendFRLinkMgt.class);
        map.put(Attr_AscendFRN391.NAME, Attr_AscendFRN391.class);
        map.put(Attr_AscendFRDCEN392.NAME, Attr_AscendFRDCEN392.class);
        map.put(Attr_AscendFRDTEN392.NAME, Attr_AscendFRDTEN392.class);
        map.put(Attr_AscendFRDCEN393.NAME, Attr_AscendFRDCEN393.class);
        map.put(Attr_AscendFRDTEN393.NAME, Attr_AscendFRDTEN393.class);
        map.put(Attr_AscendFRT391.NAME, Attr_AscendFRT391.class);
        map.put(Attr_AscendFRT392.NAME, Attr_AscendFRT392.class);
        map.put(Attr_AscendBridgeAddress.NAME, Attr_AscendBridgeAddress.class);
        map.put(Attr_AscendTSIdleLimit.NAME, Attr_AscendTSIdleLimit.class);
        map.put(Attr_AscendTSIdleMode.NAME, Attr_AscendTSIdleMode.class);
        map.put(Attr_AscendDBAMonitor.NAME, Attr_AscendDBAMonitor.class);
        map.put(Attr_AscendBaseChannelCount.NAME, Attr_AscendBaseChannelCount.class);
        map.put(Attr_AscendMinimumChannels.NAME, Attr_AscendMinimumChannels.class);
        map.put(Attr_AscendIPXRoute.NAME, Attr_AscendIPXRoute.class);
        map.put(Attr_AscendFT1Caller.NAME, Attr_AscendFT1Caller.class);
        map.put(Attr_AscendBackup.NAME, Attr_AscendBackup.class);
        map.put(Attr_AscendCallType.NAME, Attr_AscendCallType.class);
        map.put(Attr_AscendGroup.NAME, Attr_AscendGroup.class);
        map.put(Attr_AscendFRDLCI.NAME, Attr_AscendFRDLCI.class);
        map.put(Attr_AscendFRProfileName.NAME, Attr_AscendFRProfileName.class);
        map.put(Attr_AscendAraPW.NAME, Attr_AscendAraPW.class);
        map.put(Attr_AscendIPXNodeAddr.NAME, Attr_AscendIPXNodeAddr.class);
        map.put(Attr_AscendHomeAgentIPAddr.NAME, Attr_AscendHomeAgentIPAddr.class);
        map.put(Attr_AscendHomeAgentPassword.NAME, Attr_AscendHomeAgentPassword.class);
        map.put(Attr_AscendHomeNetworkName.NAME, Attr_AscendHomeNetworkName.class);
        map.put(Attr_AscendHomeAgentUDPPort.NAME, Attr_AscendHomeAgentUDPPort.class);
        map.put(Attr_AscendMultilinkID.NAME, Attr_AscendMultilinkID.class);
        map.put(Attr_AscendNumInMultilink.NAME, Attr_AscendNumInMultilink.class);
        map.put(Attr_AscendFirstDest.NAME, Attr_AscendFirstDest.class);
        map.put(Attr_AscendPreInputOctets.NAME, Attr_AscendPreInputOctets.class);
        map.put(Attr_AscendPreOutputOctets.NAME, Attr_AscendPreOutputOctets.class);
        map.put(Attr_AscendPreInputPackets.NAME, Attr_AscendPreInputPackets.class);
        map.put(Attr_AscendPreOutputPackets.NAME, Attr_AscendPreOutputPackets.class);
        map.put(Attr_AscendMaximumTime.NAME, Attr_AscendMaximumTime.class);
        map.put(Attr_AscendDisconnectCause.NAME, Attr_AscendDisconnectCause.class);
        map.put(Attr_AscendConnectProgress.NAME, Attr_AscendConnectProgress.class);
        map.put(Attr_AscendDataRate.NAME, Attr_AscendDataRate.class);
        map.put(Attr_AscendPreSessionTime.NAME, Attr_AscendPreSessionTime.class);
        map.put(Attr_AscendTokenIdle.NAME, Attr_AscendTokenIdle.class);
        map.put(Attr_AscendTokenImmediate.NAME, Attr_AscendTokenImmediate.class);
        map.put(Attr_AscendRequireAuth.NAME, Attr_AscendRequireAuth.class);
        map.put(Attr_AscendNumberSessions.NAME, Attr_AscendNumberSessions.class);
        map.put(Attr_AscendAuthenAlias.NAME, Attr_AscendAuthenAlias.class);
        map.put(Attr_AscendTokenExpiry.NAME, Attr_AscendTokenExpiry.class);
        map.put(Attr_AscendMenuSelector.NAME, Attr_AscendMenuSelector.class);
        map.put(Attr_AscendMenuItem.NAME, Attr_AscendMenuItem.class);
        map.put(Attr_AscendPWWarntime.NAME, Attr_AscendPWWarntime.class);
        map.put(Attr_AscendPWLifetime.NAME, Attr_AscendPWLifetime.class);
        map.put(Attr_AscendIPDirect.NAME, Attr_AscendIPDirect.class);
        map.put(Attr_AscendPPPVJSlotComp.NAME, Attr_AscendPPPVJSlotComp.class);
        map.put(Attr_AscendPPPVJ1172.NAME, Attr_AscendPPPVJ1172.class);
        map.put(Attr_AscendPPPAsyncMap.NAME, Attr_AscendPPPAsyncMap.class);
        map.put(Attr_AscendThirdPrompt.NAME, Attr_AscendThirdPrompt.class);
        map.put(Attr_AscendSendSecret.NAME, Attr_AscendSendSecret.class);
        map.put(Attr_AscendReceiveSecret.NAME, Attr_AscendReceiveSecret.class);
        map.put(Attr_AscendIPXPeerMode.NAME, Attr_AscendIPXPeerMode.class);
        map.put(Attr_AscendIPPoolDefinition.NAME, Attr_AscendIPPoolDefinition.class);
        map.put(Attr_AscendAssignIPPool.NAME, Attr_AscendAssignIPPool.class);
        map.put(Attr_AscendFRDirect.NAME, Attr_AscendFRDirect.class);
        map.put(Attr_AscendFRDirectProfile.NAME, Attr_AscendFRDirectProfile.class);
        map.put(Attr_AscendFRDirectDLCI.NAME, Attr_AscendFRDirectDLCI.class);
        map.put(Attr_AscendHandleIPX.NAME, Attr_AscendHandleIPX.class);
        map.put(Attr_AscendNetwaretimeout.NAME, Attr_AscendNetwaretimeout.class);
        map.put(Attr_AscendIPXAlias.NAME, Attr_AscendIPXAlias.class);
        map.put(Attr_AscendMetric.NAME, Attr_AscendMetric.class);
        map.put(Attr_AscendPRINumberType.NAME, Attr_AscendPRINumberType.class);
        map.put(Attr_AscendDialNumber.NAME, Attr_AscendDialNumber.class);
        map.put(Attr_AscendRouteIP.NAME, Attr_AscendRouteIP.class);
        map.put(Attr_AscendRouteIPX.NAME, Attr_AscendRouteIPX.class);
        map.put(Attr_AscendBridge.NAME, Attr_AscendBridge.class);
        map.put(Attr_AscendSendAuth.NAME, Attr_AscendSendAuth.class);
        map.put(Attr_AscendSendPasswd.NAME, Attr_AscendSendPasswd.class);
        map.put(Attr_AscendLinkCompression.NAME, Attr_AscendLinkCompression.class);
        map.put(Attr_AscendTargetUtil.NAME, Attr_AscendTargetUtil.class);
        map.put(Attr_AscendMaximumChannels.NAME, Attr_AscendMaximumChannels.class);
        map.put(Attr_AscendIncChannelCount.NAME, Attr_AscendIncChannelCount.class);
        map.put(Attr_AscendDecChannelCount.NAME, Attr_AscendDecChannelCount.class);
        map.put(Attr_AscendSecondsOfHistory.NAME, Attr_AscendSecondsOfHistory.class);
        map.put(Attr_AscendHistoryWeighType.NAME, Attr_AscendHistoryWeighType.class);
        map.put(Attr_AscendAddSeconds.NAME, Attr_AscendAddSeconds.class);
        map.put(Attr_AscendRemoveSeconds.NAME, Attr_AscendRemoveSeconds.class);
        map.put(Attr_AscendDataFilter.NAME, Attr_AscendDataFilter.class);
        map.put(Attr_AscendCallFilter.NAME, Attr_AscendCallFilter.class);
        map.put(Attr_AscendIdleLimit.NAME, Attr_AscendIdleLimit.class);
        map.put(Attr_AscendPreemptLimit.NAME, Attr_AscendPreemptLimit.class);
        map.put(Attr_AscendCallback.NAME, Attr_AscendCallback.class);
        map.put(Attr_AscendDataSvc.NAME, Attr_AscendDataSvc.class);
        map.put(Attr_AscendForce56.NAME, Attr_AscendForce56.class);
        map.put(Attr_AscendBillingNumber.NAME, Attr_AscendBillingNumber.class);
        map.put(Attr_AscendCallByCall.NAME, Attr_AscendCallByCall.class);
        map.put(Attr_AscendTransitNumber.NAME, Attr_AscendTransitNumber.class);
        map.put(Attr_AscendHostInfo.NAME, Attr_AscendHostInfo.class);
        map.put(Attr_AscendPPPAddress.NAME, Attr_AscendPPPAddress.class);
        map.put(Attr_AscendMPPIdlePercent.NAME, Attr_AscendMPPIdlePercent.class);
        map.put(Attr_AscendXmitRate.NAME, Attr_AscendXmitRate.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redback;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_redback
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Redback"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_ClientDNSPri.class);
        map.put(new Long(2L), Attr_ClientDNSSec.class);
        map.put(new Long(3L), Attr_DHCPMaxLeases.class);
        map.put(new Long(4L), Attr_ContextName.class);
        map.put(new Long(5L), Attr_BridgeGroup.class);
        map.put(new Long(6L), Attr_BGAgingTime.class);
        map.put(new Long(7L), Attr_BGPathCost.class);
        map.put(new Long(8L), Attr_BGSpanDis.class);
        map.put(new Long(9L), Attr_BGTransBPDU.class);
        map.put(new Long(10L), Attr_RateLimitRate.class);
        map.put(new Long(11L), Attr_RateLimitBurst.class);
        map.put(new Long(12L), Attr_PoliceRate.class);
        map.put(new Long(13L), Attr_PoliceBurst.class);
        map.put(new Long(14L), Attr_SourceValidation.class);
        map.put(new Long(15L), Attr_TunnelDomain.class);
        map.put(new Long(16L), Attr_TunnelLocalName.class);
        map.put(new Long(17L), Attr_TunnelRemoteName.class);
        map.put(new Long(18L), Attr_TunnelFunction.class);
        map.put(new Long(19L), Attr_TunnelFlowControl.class);
        map.put(new Long(20L), Attr_TunnelStatic.class);
        map.put(new Long(21L), Attr_TunnelMaxSessions.class);
        map.put(new Long(22L), Attr_TunnelMaxTunnels.class);
        map.put(new Long(23L), Attr_TunnelSessionAuth.class);
        map.put(new Long(24L), Attr_TunnelWindow.class);
        map.put(new Long(25L), Attr_TunnelRetransmit.class);
        map.put(new Long(26L), Attr_TunnelCmdTimeout.class);
        map.put(new Long(27L), Attr_PPPOEURL.class);
        map.put(new Long(28L), Attr_PPPOEMOTM.class);
        map.put(new Long(29L), Attr_TunnelGroup.class);
        map.put(new Long(30L), Attr_TunnelContext.class);
        map.put(new Long(31L), Attr_TunnelAlgorithm.class);
        map.put(new Long(32L), Attr_TunnelDeadtime.class);
        map.put(new Long(33L), Attr_McastSend.class);
        map.put(new Long(34L), Attr_McastReceive.class);
        map.put(new Long(35L), Attr_McastMaxGroups.class);
        map.put(new Long(36L), Attr_IpAddressPoolName.class);
        map.put(new Long(37L), Attr_TunnelDNIS.class);
        map.put(new Long(38L), Attr_MediumType.class);
        map.put(new Long(39L), Attr_PVCEncapsulationType.class);
        map.put(new Long(40L), Attr_PVCProfileName.class);
        map.put(new Long(41L), Attr_PVCCircuitPadding.class);
        map.put(new Long(42L), Attr_BindType.class);
        map.put(new Long(43L), Attr_BindAuthProtocol.class);
        map.put(new Long(44L), Attr_BindAuthMaxSessions.class);
        map.put(new Long(45L), Attr_BindBypassBypass.class);
        map.put(new Long(46L), Attr_BindAuthContext.class);
        map.put(new Long(47L), Attr_BindAuthServiceGrp.class);
        map.put(new Long(48L), Attr_BindBypassContext.class);
        map.put(new Long(49L), Attr_BindIntContext.class);
        map.put(new Long(50L), Attr_BindTunContext.class);
        map.put(new Long(51L), Attr_BindSesContext.class);
        map.put(new Long(52L), Attr_BindDot1qSlot.class);
        map.put(new Long(53L), Attr_BindDot1qPort.class);
        map.put(new Long(54L), Attr_BindDot1qVlanTagId.class);
        map.put(new Long(55L), Attr_BindIntInterfaceName.class);
        map.put(new Long(56L), Attr_BindL2TPTunnelName.class);
        map.put(new Long(57L), Attr_BindL2TPFlowControl.class);
        map.put(new Long(58L), Attr_BindSubUserAtContext.class);
        map.put(new Long(59L), Attr_BindSubPassword.class);
        map.put(new Long(60L), Attr_IpHostAddr.class);
        map.put(new Long(61L), Attr_IPTOSField.class);
        map.put(new Long(62L), Attr_NASRealPort.class);
        map.put(new Long(63L), Attr_TunnelSessionAuthCtx.class);
        map.put(new Long(64L), Attr_TunnelSessionAuthServiceGrp.class);
        map.put(new Long(65L), Attr_TunnelRateLimitRate.class);
        map.put(new Long(66L), Attr_TunnelRateLimitBurst.class);
        map.put(new Long(67L), Attr_TunnelPoliceRate.class);
        map.put(new Long(68L), Attr_TunnelPoliceBurst.class);
        map.put(new Long(69L), Attr_TunnelL2FSecondPassword.class);
        map.put(new Long(70L), Attr_ACLDefinition.class);
        map.put(new Long(71L), Attr_PPPoEIPRouteAdd.class);
        map.put(new Long(72L), Attr_TTYLevelMax.class);
        map.put(new Long(73L), Attr_TTYLevelStart.class);
        map.put(new Long(76L), Attr_BindDHCPContext.class);
        map.put(new Long(77L), Attr_TunnelMobilGroup.class);
        map.put(new Long(78L), Attr_TunnelClientVPN.class);
        map.put(new Long(79L), Attr_TunnelServerVPN.class);
        map.put(new Long(84L), Attr_PPPCompression.class);
        map.put(new Long(85L), Attr_TunnelHelloTimer.class);
        map.put(new Long(86L), Attr_RedbackReason.class);
        map.put(new Long(87L), Attr_QosPolicyPolicing.class);
        map.put(new Long(88L), Attr_QosPolicyMetering.class);
        map.put(new Long(89L), Attr_QosPolicyQueuing.class);
        map.put(new Long(90L), Attr_IgmpServiceProfile.class);
        map.put(new Long(91L), Attr_SubProfileName.class);
        map.put(new Long(92L), Attr_ForwardPolicy.class);
        map.put(new Long(93L), Attr_RemotePort.class);
        map.put(new Long(94L), Attr_ReauthString.class);
        map.put(new Long(95L), Attr_ReauthMore.class);
        map.put(new Long(96L), Attr_AgentRemoteId.class);
        map.put(new Long(97L), Attr_AgentCircuitId.class);
        map.put(new Long(98L), Attr_PlatformType.class);
        map.put(new Long(99L), Attr_RBClientNBNSPri.class);
        map.put(new Long(100L), Attr_RBClientNBNSSec.class);
        map.put(new Long(101L), Attr_ShapingProfileName.class);
        map.put(new Long(103L), Attr_BridgeProfile.class);
        map.put(new Long(104L), Attr_IPInterface.class);
        map.put(new Long(105L), Attr_NATPolicyName.class);
        map.put(new Long(106L), Attr_RBNPMServiceId.class);
        map.put(new Long(107L), Attr_HTTPRedirectProfileName.class);
        map.put(new Long(108L), Attr_BindAutoSubUser.class);
        map.put(new Long(109L), Attr_BindAutoSubContext.class);
        map.put(new Long(110L), Attr_BindAutoSubPassword.class);
        map.put(new Long(111L), Attr_CircuitProtocolEncap.class);
        map.put(new Long(112L), Attr_OSVersion.class);
        map.put(new Long(113L), Attr_SessionTrafficLimit.class);
        map.put(new Long(114L), Attr_QOSReference.class);
        map.put(new Long(125L), Attr_DHCPVendorClassID.class);
        map.put(new Long(126L), Attr_QosRate.class);
        map.put(new Long(127L), Attr_DHCPVendorEncapOption.class);
        map.put(new Long(128L), Attr_AcctInputOctets64.class);
        map.put(new Long(129L), Attr_AcctOutputOctets64.class);
        map.put(new Long(130L), Attr_AcctInputPackets64.class);
        map.put(new Long(131L), Attr_AcctOutputPackets64.class);
        map.put(new Long(132L), Attr_AssignedIPAddress.class);
        map.put(new Long(133L), Attr_AcctMcastInOctets.class);
        map.put(new Long(134L), Attr_AcctMcastOutOctets.class);
        map.put(new Long(135L), Attr_AcctMcastInPackets.class);
        map.put(new Long(136L), Attr_AcctMcastOutPackets.class);
        map.put(new Long(137L), Attr_LACPort.class);
        map.put(new Long(138L), Attr_LACRealPort.class);
        map.put(new Long(139L), Attr_LACPortType.class);
        map.put(new Long(140L), Attr_LACRealPortType.class);
        map.put(new Long(141L), Attr_AcctDynAcEnt.class);
        map.put(new Long(142L), Attr_SessionErrorCode.class);
        map.put(new Long(143L), Attr_SessionErrorMsg.class);
        map.put(new Long(1L), Attr_ClientDNSPri.class);
        map.put(new Long(2L), Attr_ClientDNSSec.class);
        map.put(new Long(3L), Attr_DHCPMaxLeases.class);
        map.put(new Long(4L), Attr_ContextName.class);
        map.put(new Long(5L), Attr_BridgeGroup.class);
        map.put(new Long(6L), Attr_BGAgingTime.class);
        map.put(new Long(7L), Attr_BGPathCost.class);
        map.put(new Long(8L), Attr_BGSpanDis.class);
        map.put(new Long(9L), Attr_BGTransBPDU.class);
        map.put(new Long(10L), Attr_RateLimitRate.class);
        map.put(new Long(11L), Attr_RateLimitBurst.class);
        map.put(new Long(12L), Attr_PoliceRate.class);
        map.put(new Long(13L), Attr_PoliceBurst.class);
        map.put(new Long(14L), Attr_SourceValidation.class);
        map.put(new Long(15L), Attr_TunnelDomain.class);
        map.put(new Long(16L), Attr_TunnelLocalName.class);
        map.put(new Long(17L), Attr_TunnelRemoteName.class);
        map.put(new Long(18L), Attr_TunnelFunction.class);
        map.put(new Long(21L), Attr_TunnelMaxSessions.class);
        map.put(new Long(22L), Attr_TunnelMaxTunnels.class);
        map.put(new Long(23L), Attr_TunnelSessionAuth.class);
        map.put(new Long(24L), Attr_TunnelWindow.class);
        map.put(new Long(25L), Attr_TunnelRetransmit.class);
        map.put(new Long(26L), Attr_TunnelCmdTimeout.class);
        map.put(new Long(27L), Attr_PPPOEURL.class);
        map.put(new Long(28L), Attr_PPPOEMOTM.class);
        map.put(new Long(29L), Attr_TunnelGroup.class);
        map.put(new Long(30L), Attr_TunnelContext.class);
        map.put(new Long(31L), Attr_TunnelAlgorithm.class);
        map.put(new Long(32L), Attr_TunnelDeadtime.class);
        map.put(new Long(33L), Attr_McastSend.class);
        map.put(new Long(34L), Attr_McastReceive.class);
        map.put(new Long(35L), Attr_McastMaxGroups.class);
        map.put(new Long(36L), Attr_IpAddressPoolName.class);
        map.put(new Long(37L), Attr_TunnelDNIS.class);
        map.put(new Long(38L), Attr_MediumType.class);
        map.put(new Long(39L), Attr_PVCEncapsulationType.class);
        map.put(new Long(40L), Attr_PVCProfileName.class);
        map.put(new Long(41L), Attr_PVCCircuitPadding.class);
        map.put(new Long(42L), Attr_BindType.class);
        map.put(new Long(43L), Attr_BindAuthProtocol.class);
        map.put(new Long(44L), Attr_BindAuthMaxSessions.class);
        map.put(new Long(45L), Attr_BindBypassBypass.class);
        map.put(new Long(46L), Attr_BindAuthContext.class);
        map.put(new Long(47L), Attr_BindAuthServiceGrp.class);
        map.put(new Long(48L), Attr_BindBypassContext.class);
        map.put(new Long(49L), Attr_BindIntContext.class);
        map.put(new Long(50L), Attr_BindTunContext.class);
        map.put(new Long(51L), Attr_BindSesContext.class);
        map.put(new Long(52L), Attr_BindDot1qSlot.class);
        map.put(new Long(53L), Attr_BindDot1qPort.class);
        map.put(new Long(54L), Attr_BindDot1qVlanTagId.class);
        map.put(new Long(55L), Attr_BindIntInterfaceName.class);
        map.put(new Long(56L), Attr_BindL2TPTunnelName.class);
        map.put(new Long(57L), Attr_BindL2TPFlowControl.class);
        map.put(new Long(58L), Attr_BindSubUserAtContext.class);
        map.put(new Long(59L), Attr_BindSubPassword.class);
        map.put(new Long(60L), Attr_IpHostAddr.class);
        map.put(new Long(61L), Attr_IPTOSField.class);
        map.put(new Long(62L), Attr_NASRealPort.class);
        map.put(new Long(63L), Attr_TunnelSessionAuthCtx.class);
        map.put(new Long(64L), Attr_TunnelSessionAuthServiceGrp.class);
        map.put(new Long(65L), Attr_TunnelRateLimitRate.class);
        map.put(new Long(66L), Attr_TunnelRateLimitBurst.class);
        map.put(new Long(67L), Attr_TunnelPoliceRate.class);
        map.put(new Long(68L), Attr_TunnelPoliceBurst.class);
        map.put(new Long(69L), Attr_TunnelL2FSecondPassword.class);
        map.put(new Long(72L), Attr_TTYLevelMax.class);
        map.put(new Long(73L), Attr_TTYLevelStart.class);
        map.put(new Long(74L), Attr_TunnelChecksum.class);
        map.put(new Long(75L), Attr_TunnelProfile.class);
        map.put(new Long(80L), Attr_TunnelClientRhost.class);
        map.put(new Long(81L), Attr_TunnelServerRhost.class);
        map.put(new Long(82L), Attr_TunnelClientIntAddr.class);
        map.put(new Long(83L), Attr_TunnelServerIntAddr.class);
        map.put(new Long(87L), Attr_QosPolicingProfileName.class);
        map.put(new Long(88L), Attr_QosMeteringProfileName.class);
        map.put(new Long(90L), Attr_IGMPServiceProfileName.class);
        map.put(new Long(91L), Attr_SubscriberProfileName.class);
        map.put(new Long(94L), Attr_Reauth.class);
        map.put(new Long(99L), Attr_ClientNBNSPri.class);
        map.put(new Long(100L), Attr_ClientNBNSSec.class);
        map.put(new Long(103L), Attr_BGCctAddrMax.class);
        map.put(new Long(104L), Attr_IPInterfaceName.class);
        map.put(new Long(121L), Attr_RateLimitExcessBurst.class);
        map.put(new Long(122L), Attr_PoliceExcessBurst.class);
        map.put(new Long(123L), Attr_TunnelRateLimitExcessBurst.class);
        map.put(new Long(124L), Attr_TunnelPoliceExcessBurst.class);
        map.put(new Long(128L), Attr_AcctInputOctets64.class);
        map.put(new Long(129L), Attr_AcctOutputOctets64.class);
        map.put(new Long(130L), Attr_AcctInputPackets64.class);
        map.put(new Long(131L), Attr_AcctOutputPackets64.class);
        map.put(new Long(132L), Attr_AssignedIPAddress.class);
        map.put(new Long(133L), Attr_AcctMcastInOctets64.class);
        map.put(new Long(134L), Attr_AcctMcastOutOctets64.class);
        map.put(new Long(135L), Attr_AcctMcastInPackets64.class);
        map.put(new Long(136L), Attr_AcctMcastOutPackets64.class);
        map.put(new Long(137L), Attr_LACPort.class);
        map.put(new Long(138L), Attr_LACRealPort.class);
        map.put(new Long(139L), Attr_LACPortType.class);
        map.put(new Long(140L), Attr_LACRealPortType.class);
        map.put(new Long(141L), Attr_AcctDynAcEnt.class);
        map.put(new Long(142L), Attr_SessionErrorCode.class);
        map.put(new Long(143L), Attr_SessionErrorMsg.class);
        map.put(new Long(144L), Attr_AcctUpdateReason.class);
        map.put(new Long(145L), Attr_MacAddr.class);
        map.put(new Long(146L), Attr_VlanSourceInfo.class);
        map.put(new Long(147L), Attr_AcctMcastInOctets.class);
        map.put(new Long(148L), Attr_AcctMcastOutOctets.class);
        map.put(new Long(149L), Attr_AcctMcastInPackets.class);
        map.put(new Long(150L), Attr_AcctMcastOutPackets.class);
        map.put(new Long(151L), Attr_ReauthSessionId.class);
        map.put(new Long(156L), Attr_QOSRateInbound.class);
        map.put(new Long(157L), Attr_QOSRateOutbound.class);
        map.put(new Long(158L), Attr_RouteTag.class);
        map.put(new Long(159L), Attr_LIId.class);
        map.put(new Long(160L), Attr_LIMdAddress.class);
        map.put(new Long(161L), Attr_LIMdPort.class);
        map.put(new Long(162L), Attr_LIAction.class);
        map.put(new Long(163L), Attr_LIProfile.class);
        map.put(new Long(164L), Attr_DynamicPolicyFilter.class);
        map.put(new Long(165L), Attr_HTTPRedirectURL.class);
        map.put(new Long(166L), Attr_DSLActualRateUp.class);
        map.put(new Long(167L), Attr_DSLActualRateDown.class);
        map.put(new Long(168L), Attr_DSLMinRateUp.class);
        map.put(new Long(169L), Attr_DSLMinRateDown.class);
        map.put(new Long(170L), Attr_DSLAttainableRateUp.class);
        map.put(new Long(171L), Attr_DSLAttainableRateDown.class);
        map.put(new Long(172L), Attr_DSLMaxRateUp.class);
        map.put(new Long(173L), Attr_DSLMaxRateDown.class);
        map.put(new Long(174L), Attr_DSLMinLowPowerRateUp.class);
        map.put(new Long(175L), Attr_DSLMinLowPowerRateDown.class);
        map.put(new Long(176L), Attr_DSLMaxInterDelayUp.class);
        map.put(new Long(177L), Attr_DSLActualInterDelayUp.class);
        map.put(new Long(178L), Attr_DSLMaxInterDelayDown.class);
        map.put(new Long(179L), Attr_DSLActualInterDelayDown.class);
        map.put(new Long(180L), Attr_DSLLineState.class);
        map.put(new Long(181L), Attr_DSLL2Encapsulation.class);
        map.put(new Long(182L), Attr_DSLTransmissionSystem.class);
        map.put(new Long(183L), Attr_DSLPPPOAPPPOEInterWorkFlag.class);
        map.put(new Long(185L), Attr_DSLActualRateDownFactor.class);
        map.put(new Long(184L), Attr_DSLCombinedLineInfo.class);
        map.put(new Long(186L), Attr_ClassVolumelimit.class);
        map.put(new Long(187L), Attr_ClassVolumeInCounter.class);
        map.put(new Long(188L), Attr_ClassVolumeOutCounter.class);
        map.put(new Long(189L), Attr_FlowFACProfile.class);
        map.put(new Long(190L), Attr_ServiceName.class);
        map.put(new Long(191L), Attr_ServiceAction.class);
        map.put(new Long(192L), Attr_ServiceParameter.class);
        map.put(new Long(193L), Attr_ServiceErrorCause.class);
        map.put(new Long(194L), Attr_DeactivateServiceName.class);
        map.put(new Long(195L), Attr_QosProfileOverhead.class);
        map.put(new Long(196L), Attr_DynamicQoSParam.class);
        map.put(new Long(197L), Attr_AcctAltSessionID.class);
        map.put(new Long(198L), Attr_IdleTimeoutThreshold.class);
        map.put(new Long(199L), Attr_DoubleAuthentication.class);
        map.put(new Long(200L), Attr_SBCAdjacency.class);
        map.put(new Long(201L), Attr_DHCPField.class);
        map.put(new Long(202L), Attr_DHCPOption.class);
        map.put(new Long(203L), Attr_SecurityService.class);
        map.put(new Long(204L), Attr_ReauthServiceName.class);
        map.put(new Long(205L), Attr_FlowIPProfile.class);
        map.put(new Long(206L), Attr_RadiusThrottleWatermark.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ClientDNSPri.NAME, Attr_ClientDNSPri.class);
        map.put(Attr_ClientDNSSec.NAME, Attr_ClientDNSSec.class);
        map.put(Attr_DHCPMaxLeases.NAME, Attr_DHCPMaxLeases.class);
        map.put(Attr_ContextName.NAME, Attr_ContextName.class);
        map.put(Attr_BridgeGroup.NAME, Attr_BridgeGroup.class);
        map.put(Attr_BGAgingTime.NAME, Attr_BGAgingTime.class);
        map.put(Attr_BGPathCost.NAME, Attr_BGPathCost.class);
        map.put(Attr_BGSpanDis.NAME, Attr_BGSpanDis.class);
        map.put(Attr_BGTransBPDU.NAME, Attr_BGTransBPDU.class);
        map.put(Attr_RateLimitRate.NAME, Attr_RateLimitRate.class);
        map.put(Attr_RateLimitBurst.NAME, Attr_RateLimitBurst.class);
        map.put(Attr_PoliceRate.NAME, Attr_PoliceRate.class);
        map.put(Attr_PoliceBurst.NAME, Attr_PoliceBurst.class);
        map.put(Attr_SourceValidation.NAME, Attr_SourceValidation.class);
        map.put(Attr_TunnelDomain.NAME, Attr_TunnelDomain.class);
        map.put(Attr_TunnelLocalName.NAME, Attr_TunnelLocalName.class);
        map.put(Attr_TunnelRemoteName.NAME, Attr_TunnelRemoteName.class);
        map.put(Attr_TunnelFunction.NAME, Attr_TunnelFunction.class);
        map.put(Attr_TunnelFlowControl.NAME, Attr_TunnelFlowControl.class);
        map.put(Attr_TunnelStatic.NAME, Attr_TunnelStatic.class);
        map.put(Attr_TunnelMaxSessions.NAME, Attr_TunnelMaxSessions.class);
        map.put(Attr_TunnelMaxTunnels.NAME, Attr_TunnelMaxTunnels.class);
        map.put(Attr_TunnelSessionAuth.NAME, Attr_TunnelSessionAuth.class);
        map.put(Attr_TunnelWindow.NAME, Attr_TunnelWindow.class);
        map.put(Attr_TunnelRetransmit.NAME, Attr_TunnelRetransmit.class);
        map.put(Attr_TunnelCmdTimeout.NAME, Attr_TunnelCmdTimeout.class);
        map.put(Attr_PPPOEURL.NAME, Attr_PPPOEURL.class);
        map.put(Attr_PPPOEMOTM.NAME, Attr_PPPOEMOTM.class);
        map.put(Attr_TunnelGroup.NAME, Attr_TunnelGroup.class);
        map.put(Attr_TunnelContext.NAME, Attr_TunnelContext.class);
        map.put(Attr_TunnelAlgorithm.NAME, Attr_TunnelAlgorithm.class);
        map.put(Attr_TunnelDeadtime.NAME, Attr_TunnelDeadtime.class);
        map.put(Attr_McastSend.NAME, Attr_McastSend.class);
        map.put(Attr_McastReceive.NAME, Attr_McastReceive.class);
        map.put(Attr_McastMaxGroups.NAME, Attr_McastMaxGroups.class);
        map.put(Attr_IpAddressPoolName.NAME, Attr_IpAddressPoolName.class);
        map.put(Attr_TunnelDNIS.NAME, Attr_TunnelDNIS.class);
        map.put(Attr_MediumType.NAME, Attr_MediumType.class);
        map.put(Attr_PVCEncapsulationType.NAME, Attr_PVCEncapsulationType.class);
        map.put(Attr_PVCProfileName.NAME, Attr_PVCProfileName.class);
        map.put(Attr_PVCCircuitPadding.NAME, Attr_PVCCircuitPadding.class);
        map.put(Attr_BindType.NAME, Attr_BindType.class);
        map.put(Attr_BindAuthProtocol.NAME, Attr_BindAuthProtocol.class);
        map.put(Attr_BindAuthMaxSessions.NAME, Attr_BindAuthMaxSessions.class);
        map.put(Attr_BindBypassBypass.NAME, Attr_BindBypassBypass.class);
        map.put(Attr_BindAuthContext.NAME, Attr_BindAuthContext.class);
        map.put(Attr_BindAuthServiceGrp.NAME, Attr_BindAuthServiceGrp.class);
        map.put(Attr_BindBypassContext.NAME, Attr_BindBypassContext.class);
        map.put(Attr_BindIntContext.NAME, Attr_BindIntContext.class);
        map.put(Attr_BindTunContext.NAME, Attr_BindTunContext.class);
        map.put(Attr_BindSesContext.NAME, Attr_BindSesContext.class);
        map.put(Attr_BindDot1qSlot.NAME, Attr_BindDot1qSlot.class);
        map.put(Attr_BindDot1qPort.NAME, Attr_BindDot1qPort.class);
        map.put(Attr_BindDot1qVlanTagId.NAME, Attr_BindDot1qVlanTagId.class);
        map.put(Attr_BindIntInterfaceName.NAME, Attr_BindIntInterfaceName.class);
        map.put(Attr_BindL2TPTunnelName.NAME, Attr_BindL2TPTunnelName.class);
        map.put(Attr_BindL2TPFlowControl.NAME, Attr_BindL2TPFlowControl.class);
        map.put(Attr_BindSubUserAtContext.NAME, Attr_BindSubUserAtContext.class);
        map.put(Attr_BindSubPassword.NAME, Attr_BindSubPassword.class);
        map.put(Attr_IpHostAddr.NAME, Attr_IpHostAddr.class);
        map.put(Attr_IPTOSField.NAME, Attr_IPTOSField.class);
        map.put(Attr_NASRealPort.NAME, Attr_NASRealPort.class);
        map.put(Attr_TunnelSessionAuthCtx.NAME, Attr_TunnelSessionAuthCtx.class);
        map.put(Attr_TunnelSessionAuthServiceGrp.NAME, Attr_TunnelSessionAuthServiceGrp.class);
        map.put(Attr_TunnelRateLimitRate.NAME, Attr_TunnelRateLimitRate.class);
        map.put(Attr_TunnelRateLimitBurst.NAME, Attr_TunnelRateLimitBurst.class);
        map.put(Attr_TunnelPoliceRate.NAME, Attr_TunnelPoliceRate.class);
        map.put(Attr_TunnelPoliceBurst.NAME, Attr_TunnelPoliceBurst.class);
        map.put(Attr_TunnelL2FSecondPassword.NAME, Attr_TunnelL2FSecondPassword.class);
        map.put(Attr_ACLDefinition.NAME, Attr_ACLDefinition.class);
        map.put(Attr_PPPoEIPRouteAdd.NAME, Attr_PPPoEIPRouteAdd.class);
        map.put(Attr_TTYLevelMax.NAME, Attr_TTYLevelMax.class);
        map.put(Attr_TTYLevelStart.NAME, Attr_TTYLevelStart.class);
        map.put(Attr_BindDHCPContext.NAME, Attr_BindDHCPContext.class);
        map.put(Attr_TunnelMobilGroup.NAME, Attr_TunnelMobilGroup.class);
        map.put(Attr_TunnelClientVPN.NAME, Attr_TunnelClientVPN.class);
        map.put(Attr_TunnelServerVPN.NAME, Attr_TunnelServerVPN.class);
        map.put(Attr_PPPCompression.NAME, Attr_PPPCompression.class);
        map.put(Attr_TunnelHelloTimer.NAME, Attr_TunnelHelloTimer.class);
        map.put(Attr_RedbackReason.NAME, Attr_RedbackReason.class);
        map.put(Attr_QosPolicyPolicing.NAME, Attr_QosPolicyPolicing.class);
        map.put(Attr_QosPolicyMetering.NAME, Attr_QosPolicyMetering.class);
        map.put(Attr_QosPolicyQueuing.NAME, Attr_QosPolicyQueuing.class);
        map.put(Attr_IgmpServiceProfile.NAME, Attr_IgmpServiceProfile.class);
        map.put(Attr_SubProfileName.NAME, Attr_SubProfileName.class);
        map.put(Attr_ForwardPolicy.NAME, Attr_ForwardPolicy.class);
        map.put(Attr_RemotePort.NAME, Attr_RemotePort.class);
        map.put(Attr_ReauthString.NAME, Attr_ReauthString.class);
        map.put(Attr_ReauthMore.NAME, Attr_ReauthMore.class);
        map.put(Attr_AgentRemoteId.NAME, Attr_AgentRemoteId.class);
        map.put(Attr_AgentCircuitId.NAME, Attr_AgentCircuitId.class);
        map.put(Attr_PlatformType.NAME, Attr_PlatformType.class);
        map.put(Attr_RBClientNBNSPri.NAME, Attr_RBClientNBNSPri.class);
        map.put(Attr_RBClientNBNSSec.NAME, Attr_RBClientNBNSSec.class);
        map.put(Attr_ShapingProfileName.NAME, Attr_ShapingProfileName.class);
        map.put(Attr_BridgeProfile.NAME, Attr_BridgeProfile.class);
        map.put(Attr_IPInterface.NAME, Attr_IPInterface.class);
        map.put(Attr_NATPolicyName.NAME, Attr_NATPolicyName.class);
        map.put(Attr_RBNPMServiceId.NAME, Attr_RBNPMServiceId.class);
        map.put(Attr_HTTPRedirectProfileName.NAME, Attr_HTTPRedirectProfileName.class);
        map.put(Attr_BindAutoSubUser.NAME, Attr_BindAutoSubUser.class);
        map.put(Attr_BindAutoSubContext.NAME, Attr_BindAutoSubContext.class);
        map.put(Attr_BindAutoSubPassword.NAME, Attr_BindAutoSubPassword.class);
        map.put(Attr_CircuitProtocolEncap.NAME, Attr_CircuitProtocolEncap.class);
        map.put(Attr_OSVersion.NAME, Attr_OSVersion.class);
        map.put(Attr_SessionTrafficLimit.NAME, Attr_SessionTrafficLimit.class);
        map.put(Attr_QOSReference.NAME, Attr_QOSReference.class);
        map.put(Attr_DHCPVendorClassID.NAME, Attr_DHCPVendorClassID.class);
        map.put(Attr_QosRate.NAME, Attr_QosRate.class);
        map.put(Attr_DHCPVendorEncapOption.NAME, Attr_DHCPVendorEncapOption.class);
        map.put(Attr_AcctInputOctets64.NAME, Attr_AcctInputOctets64.class);
        map.put(Attr_AcctOutputOctets64.NAME, Attr_AcctOutputOctets64.class);
        map.put(Attr_AcctInputPackets64.NAME, Attr_AcctInputPackets64.class);
        map.put(Attr_AcctOutputPackets64.NAME, Attr_AcctOutputPackets64.class);
        map.put(Attr_AssignedIPAddress.NAME, Attr_AssignedIPAddress.class);
        map.put(Attr_AcctMcastInOctets.NAME, Attr_AcctMcastInOctets.class);
        map.put(Attr_AcctMcastOutOctets.NAME, Attr_AcctMcastOutOctets.class);
        map.put(Attr_AcctMcastInPackets.NAME, Attr_AcctMcastInPackets.class);
        map.put(Attr_AcctMcastOutPackets.NAME, Attr_AcctMcastOutPackets.class);
        map.put(Attr_LACPort.NAME, Attr_LACPort.class);
        map.put(Attr_LACRealPort.NAME, Attr_LACRealPort.class);
        map.put(Attr_LACPortType.NAME, Attr_LACPortType.class);
        map.put(Attr_LACRealPortType.NAME, Attr_LACRealPortType.class);
        map.put(Attr_AcctDynAcEnt.NAME, Attr_AcctDynAcEnt.class);
        map.put(Attr_SessionErrorCode.NAME, Attr_SessionErrorCode.class);
        map.put(Attr_SessionErrorMsg.NAME, Attr_SessionErrorMsg.class);
        map.put(Attr_ClientDNSPri.NAME, Attr_ClientDNSPri.class);
        map.put(Attr_ClientDNSSec.NAME, Attr_ClientDNSSec.class);
        map.put(Attr_DHCPMaxLeases.NAME, Attr_DHCPMaxLeases.class);
        map.put(Attr_ContextName.NAME, Attr_ContextName.class);
        map.put(Attr_BridgeGroup.NAME, Attr_BridgeGroup.class);
        map.put(Attr_BGAgingTime.NAME, Attr_BGAgingTime.class);
        map.put(Attr_BGPathCost.NAME, Attr_BGPathCost.class);
        map.put(Attr_BGSpanDis.NAME, Attr_BGSpanDis.class);
        map.put(Attr_BGTransBPDU.NAME, Attr_BGTransBPDU.class);
        map.put(Attr_RateLimitRate.NAME, Attr_RateLimitRate.class);
        map.put(Attr_RateLimitBurst.NAME, Attr_RateLimitBurst.class);
        map.put(Attr_PoliceRate.NAME, Attr_PoliceRate.class);
        map.put(Attr_PoliceBurst.NAME, Attr_PoliceBurst.class);
        map.put(Attr_SourceValidation.NAME, Attr_SourceValidation.class);
        map.put(Attr_TunnelDomain.NAME, Attr_TunnelDomain.class);
        map.put(Attr_TunnelLocalName.NAME, Attr_TunnelLocalName.class);
        map.put(Attr_TunnelRemoteName.NAME, Attr_TunnelRemoteName.class);
        map.put(Attr_TunnelFunction.NAME, Attr_TunnelFunction.class);
        map.put(Attr_TunnelMaxSessions.NAME, Attr_TunnelMaxSessions.class);
        map.put(Attr_TunnelMaxTunnels.NAME, Attr_TunnelMaxTunnels.class);
        map.put(Attr_TunnelSessionAuth.NAME, Attr_TunnelSessionAuth.class);
        map.put(Attr_TunnelWindow.NAME, Attr_TunnelWindow.class);
        map.put(Attr_TunnelRetransmit.NAME, Attr_TunnelRetransmit.class);
        map.put(Attr_TunnelCmdTimeout.NAME, Attr_TunnelCmdTimeout.class);
        map.put(Attr_PPPOEURL.NAME, Attr_PPPOEURL.class);
        map.put(Attr_PPPOEMOTM.NAME, Attr_PPPOEMOTM.class);
        map.put(Attr_TunnelGroup.NAME, Attr_TunnelGroup.class);
        map.put(Attr_TunnelContext.NAME, Attr_TunnelContext.class);
        map.put(Attr_TunnelAlgorithm.NAME, Attr_TunnelAlgorithm.class);
        map.put(Attr_TunnelDeadtime.NAME, Attr_TunnelDeadtime.class);
        map.put(Attr_McastSend.NAME, Attr_McastSend.class);
        map.put(Attr_McastReceive.NAME, Attr_McastReceive.class);
        map.put(Attr_McastMaxGroups.NAME, Attr_McastMaxGroups.class);
        map.put(Attr_IpAddressPoolName.NAME, Attr_IpAddressPoolName.class);
        map.put(Attr_TunnelDNIS.NAME, Attr_TunnelDNIS.class);
        map.put(Attr_MediumType.NAME, Attr_MediumType.class);
        map.put(Attr_PVCEncapsulationType.NAME, Attr_PVCEncapsulationType.class);
        map.put(Attr_PVCProfileName.NAME, Attr_PVCProfileName.class);
        map.put(Attr_PVCCircuitPadding.NAME, Attr_PVCCircuitPadding.class);
        map.put(Attr_BindType.NAME, Attr_BindType.class);
        map.put(Attr_BindAuthProtocol.NAME, Attr_BindAuthProtocol.class);
        map.put(Attr_BindAuthMaxSessions.NAME, Attr_BindAuthMaxSessions.class);
        map.put(Attr_BindBypassBypass.NAME, Attr_BindBypassBypass.class);
        map.put(Attr_BindAuthContext.NAME, Attr_BindAuthContext.class);
        map.put(Attr_BindAuthServiceGrp.NAME, Attr_BindAuthServiceGrp.class);
        map.put(Attr_BindBypassContext.NAME, Attr_BindBypassContext.class);
        map.put(Attr_BindIntContext.NAME, Attr_BindIntContext.class);
        map.put(Attr_BindTunContext.NAME, Attr_BindTunContext.class);
        map.put(Attr_BindSesContext.NAME, Attr_BindSesContext.class);
        map.put(Attr_BindDot1qSlot.NAME, Attr_BindDot1qSlot.class);
        map.put(Attr_BindDot1qPort.NAME, Attr_BindDot1qPort.class);
        map.put(Attr_BindDot1qVlanTagId.NAME, Attr_BindDot1qVlanTagId.class);
        map.put(Attr_BindIntInterfaceName.NAME, Attr_BindIntInterfaceName.class);
        map.put(Attr_BindL2TPTunnelName.NAME, Attr_BindL2TPTunnelName.class);
        map.put(Attr_BindL2TPFlowControl.NAME, Attr_BindL2TPFlowControl.class);
        map.put(Attr_BindSubUserAtContext.NAME, Attr_BindSubUserAtContext.class);
        map.put(Attr_BindSubPassword.NAME, Attr_BindSubPassword.class);
        map.put(Attr_IpHostAddr.NAME, Attr_IpHostAddr.class);
        map.put(Attr_IPTOSField.NAME, Attr_IPTOSField.class);
        map.put(Attr_NASRealPort.NAME, Attr_NASRealPort.class);
        map.put(Attr_TunnelSessionAuthCtx.NAME, Attr_TunnelSessionAuthCtx.class);
        map.put(Attr_TunnelSessionAuthServiceGrp.NAME, Attr_TunnelSessionAuthServiceGrp.class);
        map.put(Attr_TunnelRateLimitRate.NAME, Attr_TunnelRateLimitRate.class);
        map.put(Attr_TunnelRateLimitBurst.NAME, Attr_TunnelRateLimitBurst.class);
        map.put(Attr_TunnelPoliceRate.NAME, Attr_TunnelPoliceRate.class);
        map.put(Attr_TunnelPoliceBurst.NAME, Attr_TunnelPoliceBurst.class);
        map.put(Attr_TunnelL2FSecondPassword.NAME, Attr_TunnelL2FSecondPassword.class);
        map.put(Attr_TTYLevelMax.NAME, Attr_TTYLevelMax.class);
        map.put(Attr_TTYLevelStart.NAME, Attr_TTYLevelStart.class);
        map.put(Attr_TunnelChecksum.NAME, Attr_TunnelChecksum.class);
        map.put(Attr_TunnelProfile.NAME, Attr_TunnelProfile.class);
        map.put(Attr_TunnelClientRhost.NAME, Attr_TunnelClientRhost.class);
        map.put(Attr_TunnelServerRhost.NAME, Attr_TunnelServerRhost.class);
        map.put(Attr_TunnelClientIntAddr.NAME, Attr_TunnelClientIntAddr.class);
        map.put(Attr_TunnelServerIntAddr.NAME, Attr_TunnelServerIntAddr.class);
        map.put(Attr_QosPolicingProfileName.NAME, Attr_QosPolicingProfileName.class);
        map.put(Attr_QosMeteringProfileName.NAME, Attr_QosMeteringProfileName.class);
        map.put(Attr_IGMPServiceProfileName.NAME, Attr_IGMPServiceProfileName.class);
        map.put(Attr_SubscriberProfileName.NAME, Attr_SubscriberProfileName.class);
        map.put(Attr_Reauth.NAME, Attr_Reauth.class);
        map.put(Attr_ClientNBNSPri.NAME, Attr_ClientNBNSPri.class);
        map.put(Attr_ClientNBNSSec.NAME, Attr_ClientNBNSSec.class);
        map.put(Attr_BGCctAddrMax.NAME, Attr_BGCctAddrMax.class);
        map.put(Attr_IPInterfaceName.NAME, Attr_IPInterfaceName.class);
        map.put(Attr_RateLimitExcessBurst.NAME, Attr_RateLimitExcessBurst.class);
        map.put(Attr_PoliceExcessBurst.NAME, Attr_PoliceExcessBurst.class);
        map.put(Attr_TunnelRateLimitExcessBurst.NAME, Attr_TunnelRateLimitExcessBurst.class);
        map.put(Attr_TunnelPoliceExcessBurst.NAME, Attr_TunnelPoliceExcessBurst.class);
        map.put(Attr_AcctInputOctets64.NAME, Attr_AcctInputOctets64.class);
        map.put(Attr_AcctOutputOctets64.NAME, Attr_AcctOutputOctets64.class);
        map.put(Attr_AcctInputPackets64.NAME, Attr_AcctInputPackets64.class);
        map.put(Attr_AcctOutputPackets64.NAME, Attr_AcctOutputPackets64.class);
        map.put(Attr_AssignedIPAddress.NAME, Attr_AssignedIPAddress.class);
        map.put(Attr_AcctMcastInOctets64.NAME, Attr_AcctMcastInOctets64.class);
        map.put(Attr_AcctMcastOutOctets64.NAME, Attr_AcctMcastOutOctets64.class);
        map.put(Attr_AcctMcastInPackets64.NAME, Attr_AcctMcastInPackets64.class);
        map.put(Attr_AcctMcastOutPackets64.NAME, Attr_AcctMcastOutPackets64.class);
        map.put(Attr_LACPort.NAME, Attr_LACPort.class);
        map.put(Attr_LACRealPort.NAME, Attr_LACRealPort.class);
        map.put(Attr_LACPortType.NAME, Attr_LACPortType.class);
        map.put(Attr_LACRealPortType.NAME, Attr_LACRealPortType.class);
        map.put(Attr_AcctDynAcEnt.NAME, Attr_AcctDynAcEnt.class);
        map.put(Attr_SessionErrorCode.NAME, Attr_SessionErrorCode.class);
        map.put(Attr_SessionErrorMsg.NAME, Attr_SessionErrorMsg.class);
        map.put(Attr_AcctUpdateReason.NAME, Attr_AcctUpdateReason.class);
        map.put(Attr_MacAddr.NAME, Attr_MacAddr.class);
        map.put(Attr_VlanSourceInfo.NAME, Attr_VlanSourceInfo.class);
        map.put(Attr_AcctMcastInOctets.NAME, Attr_AcctMcastInOctets.class);
        map.put(Attr_AcctMcastOutOctets.NAME, Attr_AcctMcastOutOctets.class);
        map.put(Attr_AcctMcastInPackets.NAME, Attr_AcctMcastInPackets.class);
        map.put(Attr_AcctMcastOutPackets.NAME, Attr_AcctMcastOutPackets.class);
        map.put(Attr_ReauthSessionId.NAME, Attr_ReauthSessionId.class);
        map.put(Attr_QOSRateInbound.NAME, Attr_QOSRateInbound.class);
        map.put(Attr_QOSRateOutbound.NAME, Attr_QOSRateOutbound.class);
        map.put(Attr_RouteTag.NAME, Attr_RouteTag.class);
        map.put(Attr_LIId.NAME, Attr_LIId.class);
        map.put(Attr_LIMdAddress.NAME, Attr_LIMdAddress.class);
        map.put(Attr_LIMdPort.NAME, Attr_LIMdPort.class);
        map.put(Attr_LIAction.NAME, Attr_LIAction.class);
        map.put(Attr_LIProfile.NAME, Attr_LIProfile.class);
        map.put(Attr_DynamicPolicyFilter.NAME, Attr_DynamicPolicyFilter.class);
        map.put(Attr_HTTPRedirectURL.NAME, Attr_HTTPRedirectURL.class);
        map.put(Attr_DSLActualRateUp.NAME, Attr_DSLActualRateUp.class);
        map.put(Attr_DSLActualRateDown.NAME, Attr_DSLActualRateDown.class);
        map.put(Attr_DSLMinRateUp.NAME, Attr_DSLMinRateUp.class);
        map.put(Attr_DSLMinRateDown.NAME, Attr_DSLMinRateDown.class);
        map.put(Attr_DSLAttainableRateUp.NAME, Attr_DSLAttainableRateUp.class);
        map.put(Attr_DSLAttainableRateDown.NAME, Attr_DSLAttainableRateDown.class);
        map.put(Attr_DSLMaxRateUp.NAME, Attr_DSLMaxRateUp.class);
        map.put(Attr_DSLMaxRateDown.NAME, Attr_DSLMaxRateDown.class);
        map.put(Attr_DSLMinLowPowerRateUp.NAME, Attr_DSLMinLowPowerRateUp.class);
        map.put(Attr_DSLMinLowPowerRateDown.NAME, Attr_DSLMinLowPowerRateDown.class);
        map.put(Attr_DSLMaxInterDelayUp.NAME, Attr_DSLMaxInterDelayUp.class);
        map.put(Attr_DSLActualInterDelayUp.NAME, Attr_DSLActualInterDelayUp.class);
        map.put(Attr_DSLMaxInterDelayDown.NAME, Attr_DSLMaxInterDelayDown.class);
        map.put(Attr_DSLActualInterDelayDown.NAME, Attr_DSLActualInterDelayDown.class);
        map.put(Attr_DSLLineState.NAME, Attr_DSLLineState.class);
        map.put(Attr_DSLL2Encapsulation.NAME, Attr_DSLL2Encapsulation.class);
        map.put(Attr_DSLTransmissionSystem.NAME, Attr_DSLTransmissionSystem.class);
        map.put(Attr_DSLPPPOAPPPOEInterWorkFlag.NAME, Attr_DSLPPPOAPPPOEInterWorkFlag.class);
        map.put(Attr_DSLActualRateDownFactor.NAME, Attr_DSLActualRateDownFactor.class);
        map.put(Attr_DSLCombinedLineInfo.NAME, Attr_DSLCombinedLineInfo.class);
        map.put(Attr_ClassVolumelimit.NAME, Attr_ClassVolumelimit.class);
        map.put(Attr_ClassVolumeInCounter.NAME, Attr_ClassVolumeInCounter.class);
        map.put(Attr_ClassVolumeOutCounter.NAME, Attr_ClassVolumeOutCounter.class);
        map.put(Attr_FlowFACProfile.NAME, Attr_FlowFACProfile.class);
        map.put(Attr_ServiceName.NAME, Attr_ServiceName.class);
        map.put(Attr_ServiceAction.NAME, Attr_ServiceAction.class);
        map.put(Attr_ServiceParameter.NAME, Attr_ServiceParameter.class);
        map.put(Attr_ServiceErrorCause.NAME, Attr_ServiceErrorCause.class);
        map.put(Attr_DeactivateServiceName.NAME, Attr_DeactivateServiceName.class);
        map.put(Attr_QosProfileOverhead.NAME, Attr_QosProfileOverhead.class);
        map.put(Attr_DynamicQoSParam.NAME, Attr_DynamicQoSParam.class);
        map.put(Attr_AcctAltSessionID.NAME, Attr_AcctAltSessionID.class);
        map.put(Attr_IdleTimeoutThreshold.NAME, Attr_IdleTimeoutThreshold.class);
        map.put(Attr_DoubleAuthentication.NAME, Attr_DoubleAuthentication.class);
        map.put(Attr_SBCAdjacency.NAME, Attr_SBCAdjacency.class);
        map.put(Attr_DHCPField.NAME, Attr_DHCPField.class);
        map.put(Attr_DHCPOption.NAME, Attr_DHCPOption.class);
        map.put(Attr_SecurityService.NAME, Attr_SecurityService.class);
        map.put(Attr_ReauthServiceName.NAME, Attr_ReauthServiceName.class);
        map.put(Attr_FlowIPProfile.NAME, Attr_FlowIPProfile.class);
        map.put(Attr_RadiusThrottleWatermark.NAME, Attr_RadiusThrottleWatermark.class);
    }
}

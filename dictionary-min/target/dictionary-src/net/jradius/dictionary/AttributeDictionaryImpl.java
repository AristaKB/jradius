// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary;

import java.util.Map;

import net.jradius.packet.attribute.AttributeDictionary;

/**
 * Dictionary for package net.jradius.dictionary
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class AttributeDictionaryImpl implements AttributeDictionary
{
    public void loadVendorCodes(Map<Long, Class<?>> map)
    {
        map.put(new Long(3561L), net.jradius.dictionary.vsa_adsl.forum.VSADictionaryImpl.class);
        map.put(new Long(31515L), net.jradius.dictionary.vsa_coova.VSADictionaryImpl.class);
        map.put(new Long(14559L), net.jradius.dictionary.vsa_chillispot.VSADictionaryImpl.class);
        map.put(new Long(311L), net.jradius.dictionary.vsa_microsoft.VSADictionaryImpl.class);
    }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(2L), Attr_Password.class);
        map.put(new Long(4L), Attr_ClientId.class);
        map.put(new Long(5L), Attr_ClientPortId.class);
        map.put(new Long(6L), Attr_UserServiceType.class);
        map.put(new Long(8L), Attr_FramedAddress.class);
        map.put(new Long(9L), Attr_FramedNetmask.class);
        map.put(new Long(11L), Attr_FramedFilterId.class);
        map.put(new Long(14L), Attr_LoginHost.class);
        map.put(new Long(16L), Attr_LoginPort.class);
        map.put(new Long(17L), Attr_OldPassword.class);
        map.put(new Long(18L), Attr_PortMessage.class);
        map.put(new Long(19L), Attr_DialbackNo.class);
        map.put(new Long(20L), Attr_DialbackName.class);
        map.put(new Long(24L), Attr_ChallengeState.class);
        map.put(new Long(19L), Attr_LoginCallbackNumber.class);
        map.put(new Long(20L), Attr_FramedCallbackId.class);
        map.put(new Long(30L), Attr_ClientPortDNIS.class);
        map.put(new Long(31L), Attr_CallerID.class);
        map.put(new Long(1L), Attr_UserName.class);
        map.put(new Long(2L), Attr_UserPassword.class);
        map.put(new Long(3L), Attr_CHAPPassword.class);
        map.put(new Long(4L), Attr_NASIPAddress.class);
        map.put(new Long(5L), Attr_NASPort.class);
        map.put(new Long(6L), Attr_ServiceType.class);
        map.put(new Long(7L), Attr_FramedProtocol.class);
        map.put(new Long(8L), Attr_FramedIPAddress.class);
        map.put(new Long(9L), Attr_FramedIPNetmask.class);
        map.put(new Long(10L), Attr_FramedRouting.class);
        map.put(new Long(11L), Attr_FilterId.class);
        map.put(new Long(12L), Attr_FramedMTU.class);
        map.put(new Long(13L), Attr_FramedCompression.class);
        map.put(new Long(14L), Attr_LoginIPHost.class);
        map.put(new Long(15L), Attr_LoginService.class);
        map.put(new Long(16L), Attr_LoginTCPPort.class);
        map.put(new Long(18L), Attr_ReplyMessage.class);
        map.put(new Long(19L), Attr_CallbackNumber.class);
        map.put(new Long(20L), Attr_CallbackId.class);
        map.put(new Long(22L), Attr_FramedRoute.class);
        map.put(new Long(23L), Attr_FramedIPXNetwork.class);
        map.put(new Long(24L), Attr_State.class);
        map.put(new Long(25L), Attr_Class.class);
        map.put(new Long(26L), Attr_VendorSpecific.class);
        map.put(new Long(27L), Attr_SessionTimeout.class);
        map.put(new Long(28L), Attr_IdleTimeout.class);
        map.put(new Long(29L), Attr_TerminationAction.class);
        map.put(new Long(30L), Attr_CalledStationId.class);
        map.put(new Long(31L), Attr_CallingStationId.class);
        map.put(new Long(32L), Attr_NASIdentifier.class);
        map.put(new Long(33L), Attr_ProxyState.class);
        map.put(new Long(34L), Attr_LoginLATService.class);
        map.put(new Long(35L), Attr_LoginLATNode.class);
        map.put(new Long(36L), Attr_LoginLATGroup.class);
        map.put(new Long(37L), Attr_FramedAppleTalkLink.class);
        map.put(new Long(38L), Attr_FramedAppleTalkNetwork.class);
        map.put(new Long(39L), Attr_FramedAppleTalkZone.class);
        map.put(new Long(60L), Attr_CHAPChallenge.class);
        map.put(new Long(61L), Attr_NASPortType.class);
        map.put(new Long(62L), Attr_PortLimit.class);
        map.put(new Long(63L), Attr_LoginLATPort.class);
        map.put(new Long(40L), Attr_AcctStatusType.class);
        map.put(new Long(41L), Attr_AcctDelayTime.class);
        map.put(new Long(42L), Attr_AcctInputOctets.class);
        map.put(new Long(43L), Attr_AcctOutputOctets.class);
        map.put(new Long(44L), Attr_AcctSessionId.class);
        map.put(new Long(45L), Attr_AcctAuthentic.class);
        map.put(new Long(46L), Attr_AcctSessionTime.class);
        map.put(new Long(47L), Attr_AcctInputPackets.class);
        map.put(new Long(48L), Attr_AcctOutputPackets.class);
        map.put(new Long(49L), Attr_AcctTerminateCause.class);
        map.put(new Long(50L), Attr_AcctMultiSessionId.class);
        map.put(new Long(51L), Attr_AcctLinkCount.class);
        map.put(new Long(68L), Attr_AcctTunnelConnection.class);
        map.put(new Long(86L), Attr_AcctTunnelPacketsLost.class);
        map.put(new Long(64L), Attr_TunnelType.class);
        map.put(new Long(65L), Attr_TunnelMediumType.class);
        map.put(new Long(66L), Attr_TunnelClientEndpoint.class);
        map.put(new Long(67L), Attr_TunnelServerEndpoint.class);
        map.put(new Long(69L), Attr_TunnelPassword.class);
        map.put(new Long(81L), Attr_TunnelPrivateGroupId.class);
        map.put(new Long(82L), Attr_TunnelAssignmentId.class);
        map.put(new Long(83L), Attr_TunnelPreference.class);
        map.put(new Long(90L), Attr_TunnelClientAuthId.class);
        map.put(new Long(91L), Attr_TunnelServerAuthId.class);
        map.put(new Long(52L), Attr_AcctInputGigawords.class);
        map.put(new Long(53L), Attr_AcctOutputGigawords.class);
        map.put(new Long(55L), Attr_EventTimestamp.class);
        map.put(new Long(70L), Attr_ARAPPassword.class);
        map.put(new Long(71L), Attr_ARAPFeatures.class);
        map.put(new Long(72L), Attr_ARAPZoneAccess.class);
        map.put(new Long(73L), Attr_ARAPSecurity.class);
        map.put(new Long(74L), Attr_ARAPSecurityData.class);
        map.put(new Long(75L), Attr_PasswordRetry.class);
        map.put(new Long(76L), Attr_Prompt.class);
        map.put(new Long(77L), Attr_ConnectInfo.class);
        map.put(new Long(78L), Attr_ConfigurationToken.class);
        map.put(new Long(79L), Attr_EAPMessage.class);
        map.put(new Long(80L), Attr_MessageAuthenticator.class);
        map.put(new Long(84L), Attr_ARAPChallengeResponse.class);
        map.put(new Long(85L), Attr_AcctInterimInterval.class);
        map.put(new Long(87L), Attr_NASPortId.class);
        map.put(new Long(88L), Attr_FramedPool.class);
        map.put(new Long(95L), Attr_NASIPv6Address.class);
        map.put(new Long(96L), Attr_FramedInterfaceId.class);
        map.put(new Long(97L), Attr_FramedIPv6Prefix.class);
        map.put(new Long(98L), Attr_LoginIPv6Host.class);
        map.put(new Long(99L), Attr_FramedIPv6Route.class);
        map.put(new Long(100L), Attr_FramedIPv6Pool.class);
        map.put(new Long(101L), Attr_ErrorCause.class);
        map.put(new Long(102L), Attr_EAPKeyName.class);
        map.put(new Long(89L), Attr_ChargeableUserIdentity.class);
        map.put(new Long(56L), Attr_EgressVLANID.class);
        map.put(new Long(57L), Attr_IngressFilters.class);
        map.put(new Long(58L), Attr_EgressVLANName.class);
        map.put(new Long(59L), Attr_UserPriorityTable.class);
        map.put(new Long(123L), Attr_DelegatedIPv6Prefix.class);
        map.put(new Long(92L), Attr_NASFilterRule.class);
        map.put(new Long(126L), Attr_OperatorName.class);
        map.put(new Long(127L), Attr_LocationInformation.class);
        map.put(new Long(128L), Attr_LocationData.class);
        map.put(new Long(129L), Attr_BasicLocationPolicyRules.class);
        map.put(new Long(130L), Attr_ExtendedLocationPolicyRules.class);
        map.put(new Long(131L), Attr_LocationCapable.class);
        map.put(new Long(132L), Attr_RequestedLocationInfo.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_Password.NAME, Attr_Password.class);
        map.put(Attr_ClientId.NAME, Attr_ClientId.class);
        map.put(Attr_ClientPortId.NAME, Attr_ClientPortId.class);
        map.put(Attr_UserServiceType.NAME, Attr_UserServiceType.class);
        map.put(Attr_FramedAddress.NAME, Attr_FramedAddress.class);
        map.put(Attr_FramedNetmask.NAME, Attr_FramedNetmask.class);
        map.put(Attr_FramedFilterId.NAME, Attr_FramedFilterId.class);
        map.put(Attr_LoginHost.NAME, Attr_LoginHost.class);
        map.put(Attr_LoginPort.NAME, Attr_LoginPort.class);
        map.put(Attr_OldPassword.NAME, Attr_OldPassword.class);
        map.put(Attr_PortMessage.NAME, Attr_PortMessage.class);
        map.put(Attr_DialbackNo.NAME, Attr_DialbackNo.class);
        map.put(Attr_DialbackName.NAME, Attr_DialbackName.class);
        map.put(Attr_ChallengeState.NAME, Attr_ChallengeState.class);
        map.put(Attr_LoginCallbackNumber.NAME, Attr_LoginCallbackNumber.class);
        map.put(Attr_FramedCallbackId.NAME, Attr_FramedCallbackId.class);
        map.put(Attr_ClientPortDNIS.NAME, Attr_ClientPortDNIS.class);
        map.put(Attr_CallerID.NAME, Attr_CallerID.class);
        map.put(Attr_UserName.NAME, Attr_UserName.class);
        map.put(Attr_UserPassword.NAME, Attr_UserPassword.class);
        map.put(Attr_CHAPPassword.NAME, Attr_CHAPPassword.class);
        map.put(Attr_NASIPAddress.NAME, Attr_NASIPAddress.class);
        map.put(Attr_NASPort.NAME, Attr_NASPort.class);
        map.put(Attr_ServiceType.NAME, Attr_ServiceType.class);
        map.put(Attr_FramedProtocol.NAME, Attr_FramedProtocol.class);
        map.put(Attr_FramedIPAddress.NAME, Attr_FramedIPAddress.class);
        map.put(Attr_FramedIPNetmask.NAME, Attr_FramedIPNetmask.class);
        map.put(Attr_FramedRouting.NAME, Attr_FramedRouting.class);
        map.put(Attr_FilterId.NAME, Attr_FilterId.class);
        map.put(Attr_FramedMTU.NAME, Attr_FramedMTU.class);
        map.put(Attr_FramedCompression.NAME, Attr_FramedCompression.class);
        map.put(Attr_LoginIPHost.NAME, Attr_LoginIPHost.class);
        map.put(Attr_LoginService.NAME, Attr_LoginService.class);
        map.put(Attr_LoginTCPPort.NAME, Attr_LoginTCPPort.class);
        map.put(Attr_ReplyMessage.NAME, Attr_ReplyMessage.class);
        map.put(Attr_CallbackNumber.NAME, Attr_CallbackNumber.class);
        map.put(Attr_CallbackId.NAME, Attr_CallbackId.class);
        map.put(Attr_FramedRoute.NAME, Attr_FramedRoute.class);
        map.put(Attr_FramedIPXNetwork.NAME, Attr_FramedIPXNetwork.class);
        map.put(Attr_State.NAME, Attr_State.class);
        map.put(Attr_Class.NAME, Attr_Class.class);
        map.put(Attr_VendorSpecific.NAME, Attr_VendorSpecific.class);
        map.put(Attr_SessionTimeout.NAME, Attr_SessionTimeout.class);
        map.put(Attr_IdleTimeout.NAME, Attr_IdleTimeout.class);
        map.put(Attr_TerminationAction.NAME, Attr_TerminationAction.class);
        map.put(Attr_CalledStationId.NAME, Attr_CalledStationId.class);
        map.put(Attr_CallingStationId.NAME, Attr_CallingStationId.class);
        map.put(Attr_NASIdentifier.NAME, Attr_NASIdentifier.class);
        map.put(Attr_ProxyState.NAME, Attr_ProxyState.class);
        map.put(Attr_LoginLATService.NAME, Attr_LoginLATService.class);
        map.put(Attr_LoginLATNode.NAME, Attr_LoginLATNode.class);
        map.put(Attr_LoginLATGroup.NAME, Attr_LoginLATGroup.class);
        map.put(Attr_FramedAppleTalkLink.NAME, Attr_FramedAppleTalkLink.class);
        map.put(Attr_FramedAppleTalkNetwork.NAME, Attr_FramedAppleTalkNetwork.class);
        map.put(Attr_FramedAppleTalkZone.NAME, Attr_FramedAppleTalkZone.class);
        map.put(Attr_CHAPChallenge.NAME, Attr_CHAPChallenge.class);
        map.put(Attr_NASPortType.NAME, Attr_NASPortType.class);
        map.put(Attr_PortLimit.NAME, Attr_PortLimit.class);
        map.put(Attr_LoginLATPort.NAME, Attr_LoginLATPort.class);
        map.put(Attr_AcctStatusType.NAME, Attr_AcctStatusType.class);
        map.put(Attr_AcctDelayTime.NAME, Attr_AcctDelayTime.class);
        map.put(Attr_AcctInputOctets.NAME, Attr_AcctInputOctets.class);
        map.put(Attr_AcctOutputOctets.NAME, Attr_AcctOutputOctets.class);
        map.put(Attr_AcctSessionId.NAME, Attr_AcctSessionId.class);
        map.put(Attr_AcctAuthentic.NAME, Attr_AcctAuthentic.class);
        map.put(Attr_AcctSessionTime.NAME, Attr_AcctSessionTime.class);
        map.put(Attr_AcctInputPackets.NAME, Attr_AcctInputPackets.class);
        map.put(Attr_AcctOutputPackets.NAME, Attr_AcctOutputPackets.class);
        map.put(Attr_AcctTerminateCause.NAME, Attr_AcctTerminateCause.class);
        map.put(Attr_AcctMultiSessionId.NAME, Attr_AcctMultiSessionId.class);
        map.put(Attr_AcctLinkCount.NAME, Attr_AcctLinkCount.class);
        map.put(Attr_AcctTunnelConnection.NAME, Attr_AcctTunnelConnection.class);
        map.put(Attr_AcctTunnelPacketsLost.NAME, Attr_AcctTunnelPacketsLost.class);
        map.put(Attr_TunnelType.NAME, Attr_TunnelType.class);
        map.put(Attr_TunnelMediumType.NAME, Attr_TunnelMediumType.class);
        map.put(Attr_TunnelClientEndpoint.NAME, Attr_TunnelClientEndpoint.class);
        map.put(Attr_TunnelServerEndpoint.NAME, Attr_TunnelServerEndpoint.class);
        map.put(Attr_TunnelPassword.NAME, Attr_TunnelPassword.class);
        map.put(Attr_TunnelPrivateGroupId.NAME, Attr_TunnelPrivateGroupId.class);
        map.put(Attr_TunnelAssignmentId.NAME, Attr_TunnelAssignmentId.class);
        map.put(Attr_TunnelPreference.NAME, Attr_TunnelPreference.class);
        map.put(Attr_TunnelClientAuthId.NAME, Attr_TunnelClientAuthId.class);
        map.put(Attr_TunnelServerAuthId.NAME, Attr_TunnelServerAuthId.class);
        map.put(Attr_AcctInputGigawords.NAME, Attr_AcctInputGigawords.class);
        map.put(Attr_AcctOutputGigawords.NAME, Attr_AcctOutputGigawords.class);
        map.put(Attr_EventTimestamp.NAME, Attr_EventTimestamp.class);
        map.put(Attr_ARAPPassword.NAME, Attr_ARAPPassword.class);
        map.put(Attr_ARAPFeatures.NAME, Attr_ARAPFeatures.class);
        map.put(Attr_ARAPZoneAccess.NAME, Attr_ARAPZoneAccess.class);
        map.put(Attr_ARAPSecurity.NAME, Attr_ARAPSecurity.class);
        map.put(Attr_ARAPSecurityData.NAME, Attr_ARAPSecurityData.class);
        map.put(Attr_PasswordRetry.NAME, Attr_PasswordRetry.class);
        map.put(Attr_Prompt.NAME, Attr_Prompt.class);
        map.put(Attr_ConnectInfo.NAME, Attr_ConnectInfo.class);
        map.put(Attr_ConfigurationToken.NAME, Attr_ConfigurationToken.class);
        map.put(Attr_EAPMessage.NAME, Attr_EAPMessage.class);
        map.put(Attr_MessageAuthenticator.NAME, Attr_MessageAuthenticator.class);
        map.put(Attr_ARAPChallengeResponse.NAME, Attr_ARAPChallengeResponse.class);
        map.put(Attr_AcctInterimInterval.NAME, Attr_AcctInterimInterval.class);
        map.put(Attr_NASPortId.NAME, Attr_NASPortId.class);
        map.put(Attr_FramedPool.NAME, Attr_FramedPool.class);
        map.put(Attr_NASIPv6Address.NAME, Attr_NASIPv6Address.class);
        map.put(Attr_FramedInterfaceId.NAME, Attr_FramedInterfaceId.class);
        map.put(Attr_FramedIPv6Prefix.NAME, Attr_FramedIPv6Prefix.class);
        map.put(Attr_LoginIPv6Host.NAME, Attr_LoginIPv6Host.class);
        map.put(Attr_FramedIPv6Route.NAME, Attr_FramedIPv6Route.class);
        map.put(Attr_FramedIPv6Pool.NAME, Attr_FramedIPv6Pool.class);
        map.put(Attr_ErrorCause.NAME, Attr_ErrorCause.class);
        map.put(Attr_EAPKeyName.NAME, Attr_EAPKeyName.class);
        map.put(Attr_ChargeableUserIdentity.NAME, Attr_ChargeableUserIdentity.class);
        map.put(Attr_EgressVLANID.NAME, Attr_EgressVLANID.class);
        map.put(Attr_IngressFilters.NAME, Attr_IngressFilters.class);
        map.put(Attr_EgressVLANName.NAME, Attr_EgressVLANName.class);
        map.put(Attr_UserPriorityTable.NAME, Attr_UserPriorityTable.class);
        map.put(Attr_DelegatedIPv6Prefix.NAME, Attr_DelegatedIPv6Prefix.class);
        map.put(Attr_NASFilterRule.NAME, Attr_NASFilterRule.class);
        map.put(Attr_OperatorName.NAME, Attr_OperatorName.class);
        map.put(Attr_LocationInformation.NAME, Attr_LocationInformation.class);
        map.put(Attr_LocationData.NAME, Attr_LocationData.class);
        map.put(Attr_BasicLocationPolicyRules.NAME, Attr_BasicLocationPolicyRules.class);
        map.put(Attr_ExtendedLocationPolicyRules.NAME, Attr_ExtendedLocationPolicyRules.class);
        map.put(Attr_LocationCapable.NAME, Attr_LocationCapable.class);
        map.put(Attr_RequestedLocationInfo.NAME, Attr_RequestedLocationInfo.class);
    }
}

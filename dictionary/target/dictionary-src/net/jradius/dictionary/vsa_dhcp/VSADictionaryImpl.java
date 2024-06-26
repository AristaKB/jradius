// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_dhcp
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "DHCP"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(256L), Attr_DHCPOpcode.class);
        map.put(new Long(257L), Attr_DHCPHardwareType.class);
        map.put(new Long(258L), Attr_DHCPHardwareAddressLength.class);
        map.put(new Long(259L), Attr_DHCPHopCount.class);
        map.put(new Long(260L), Attr_DHCPTransactionId.class);
        map.put(new Long(261L), Attr_DHCPNumberofSeconds.class);
        map.put(new Long(262L), Attr_DHCPFlags.class);
        map.put(new Long(263L), Attr_DHCPClientIPAddress.class);
        map.put(new Long(264L), Attr_DHCPYourIPAddress.class);
        map.put(new Long(265L), Attr_DHCPServerIPAddress.class);
        map.put(new Long(266L), Attr_DHCPGatewayIPAddress.class);
        map.put(new Long(267L), Attr_DHCPClientHardwareAddress.class);
        map.put(new Long(268L), Attr_DHCPServerHostName.class);
        map.put(new Long(270L), Attr_DHCPRelayToIPAddress.class);
        map.put(new Long(1L), Attr_DHCPSubnetMask.class);
        map.put(new Long(2L), Attr_DHCPTimeOffset.class);
        map.put(new Long(3L), Attr_DHCPRouterAddress.class);
        map.put(new Long(4L), Attr_DHCPTimeServer.class);
        map.put(new Long(5L), Attr_DHCPIEN116NameServer.class);
        map.put(new Long(6L), Attr_DHCPDomainNameServer.class);
        map.put(new Long(7L), Attr_DHCPLogServer.class);
        map.put(new Long(8L), Attr_DHCPQuotesServer.class);
        map.put(new Long(9L), Attr_DHCPLPRServer.class);
        map.put(new Long(10L), Attr_DHCPImpressServer.class);
        map.put(new Long(11L), Attr_DHCPRLPServer.class);
        map.put(new Long(12L), Attr_DHCPHostname.class);
        map.put(new Long(13L), Attr_DHCPBootFileSize.class);
        map.put(new Long(14L), Attr_DHCPMeritDumpFile.class);
        map.put(new Long(15L), Attr_DHCPDomainName.class);
        map.put(new Long(16L), Attr_DHCPSwapServer.class);
        map.put(new Long(17L), Attr_DHCPRootPath.class);
        map.put(new Long(18L), Attr_DHCPBootpExtensionsPath.class);
        map.put(new Long(19L), Attr_DHCPIPForwardEnable.class);
        map.put(new Long(20L), Attr_DHCPSourceRouteEnable.class);
        map.put(new Long(21L), Attr_DHCPPolicyFilter.class);
        map.put(new Long(22L), Attr_DHCPMaxDatagramReassemblySz.class);
        map.put(new Long(23L), Attr_DHCPDefaultIPTTL.class);
        map.put(new Long(24L), Attr_DHCPPathMTUAgingTimeout.class);
        map.put(new Long(25L), Attr_DHCPPathMTUPlateauTable.class);
        map.put(new Long(26L), Attr_DHCPInterfaceMTUSize.class);
        map.put(new Long(27L), Attr_DHCPAllSubnetsAreLocal.class);
        map.put(new Long(28L), Attr_DHCPBroadcastAddress.class);
        map.put(new Long(29L), Attr_DHCPPerformMaskDiscovery.class);
        map.put(new Long(30L), Attr_DHCPProvideMaskToOthers.class);
        map.put(new Long(31L), Attr_DHCPPerformRouterDiscovery.class);
        map.put(new Long(32L), Attr_DHCPRouterSolicitationAddress.class);
        map.put(new Long(33L), Attr_DHCPStaticRoutes.class);
        map.put(new Long(34L), Attr_DHCPTrailerEncapsulation.class);
        map.put(new Long(35L), Attr_DHCPARPCacheTimeout.class);
        map.put(new Long(36L), Attr_DHCPEthernetEncapsulation.class);
        map.put(new Long(37L), Attr_DHCPDefaultTCPTTL.class);
        map.put(new Long(38L), Attr_DHCPKeepAliveInterval.class);
        map.put(new Long(39L), Attr_DHCPKeepAliveGarbage.class);
        map.put(new Long(40L), Attr_DHCPNISDomainName.class);
        map.put(new Long(41L), Attr_DHCPNISServers.class);
        map.put(new Long(42L), Attr_DHCPNTPServers.class);
        map.put(new Long(43L), Attr_DHCPVendor.class);
        map.put(new Long(44L), Attr_DHCPNETBIOSNameServers.class);
        map.put(new Long(45L), Attr_DHCPNETBIOSDgmDistServers.class);
        map.put(new Long(46L), Attr_DHCPNETBIOSNodeType.class);
        map.put(new Long(47L), Attr_DHCPNETBIOS.class);
        map.put(new Long(48L), Attr_DHCPXWindowFontServer.class);
        map.put(new Long(49L), Attr_DHCPXWindowDisplayMgr.class);
        map.put(new Long(50L), Attr_DHCPRequestedIPAddress.class);
        map.put(new Long(51L), Attr_DHCPIPAddressLeaseTime.class);
        map.put(new Long(52L), Attr_DHCPOverload.class);
        map.put(new Long(53L), Attr_DHCPMessageType.class);
        map.put(new Long(54L), Attr_DHCPDHCPServerIdentifier.class);
        map.put(new Long(55L), Attr_DHCPParameterRequestList.class);
        map.put(new Long(56L), Attr_DHCPDHCPErrorMessage.class);
        map.put(new Long(57L), Attr_DHCPDHCPMaximumMsgSize.class);
        map.put(new Long(58L), Attr_DHCPRenewalTime.class);
        map.put(new Long(59L), Attr_DHCPRebindingTime.class);
        map.put(new Long(60L), Attr_DHCPVendorClassIdentifier.class);
        map.put(new Long(61L), Attr_DHCPClientIdentifier.class);
        map.put(new Long(62L), Attr_DHCPNetwareDomainName.class);
        map.put(new Long(63L), Attr_DHCPNetwareSubOptions.class);
        map.put(new Long(64L), Attr_DHCPNISClientDomainName.class);
        map.put(new Long(65L), Attr_DHCPNISServerAddress.class);
        map.put(new Long(66L), Attr_DHCPTFTPServerName.class);
        map.put(new Long(67L), Attr_DHCPBootFileName.class);
        map.put(new Long(68L), Attr_DHCPHomeAgentAddress.class);
        map.put(new Long(69L), Attr_DHCPSMTPServerAddress.class);
        map.put(new Long(70L), Attr_DHCPPOP3ServerAddress.class);
        map.put(new Long(71L), Attr_DHCPNNTPServerAddress.class);
        map.put(new Long(72L), Attr_DHCPWWWServerAddress.class);
        map.put(new Long(73L), Attr_DHCPFingerServerAddress.class);
        map.put(new Long(74L), Attr_DHCPIRCServerAddress.class);
        map.put(new Long(75L), Attr_DHCPStreetTalkServerAddress.class);
        map.put(new Long(76L), Attr_DHCPSTDAServerAddress.class);
        map.put(new Long(77L), Attr_DHCPUserClass.class);
        map.put(new Long(78L), Attr_DHCPDirectoryAgent.class);
        map.put(new Long(79L), Attr_DHCPServiceScope.class);
        map.put(new Long(80L), Attr_DHCPRapidCommit.class);
        map.put(new Long(81L), Attr_DHCPClientFQDN.class);
        map.put(new Long(82L), Attr_DHCPRelayAgentInformation.class);
        map.put(new Long(338L), Attr_DHCPAgentCircuitId.class);
        map.put(new Long(594L), Attr_DHCPAgentRemoteId.class);
        map.put(new Long(338L), Attr_DHCPRelayCircuitId.class);
        map.put(new Long(594L), Attr_DHCPRelayRemoteId.class);
        map.put(new Long(1106L), Attr_DHCPDocsisDeviceClass.class);
        map.put(new Long(1362L), Attr_DHCPRelayLinkSelection.class);
        map.put(new Long(1618L), Attr_DHCPSubscriberId.class);
        map.put(new Long(1874L), Attr_DHCPRADIUSAttributes.class);
        map.put(new Long(2130L), Attr_DHCPAuthenticationInformation.class);
        map.put(new Long(2386L), Attr_DHCPVendorSpecificInformation.class);
        map.put(new Long(2642L), Attr_DHCPRelayAgentFlags.class);
        map.put(new Long(2898L), Attr_DHCPServerIdentifierOverride.class);
        map.put(new Long(83L), Attr_DHCPiSNS.class);
        map.put(new Long(85L), Attr_DHCPNDSServers.class);
        map.put(new Long(86L), Attr_DHCPNDSTreeName.class);
        map.put(new Long(87L), Attr_DHCPNDSContext.class);
        map.put(new Long(90L), Attr_DHCPAuthentication.class);
        map.put(new Long(91L), Attr_DHCPClientLastTxnTime.class);
        map.put(new Long(92L), Attr_DHCPassociatedip.class);
        map.put(new Long(93L), Attr_DHCPClientSystem.class);
        map.put(new Long(94L), Attr_DHCPClientNDI.class);
        map.put(new Long(95L), Attr_DHCPLDAP.class);
        map.put(new Long(97L), Attr_DHCPUUIDGUID.class);
        map.put(new Long(98L), Attr_DHCPUserAuth.class);
        map.put(new Long(112L), Attr_DHCPNetinfoAddress.class);
        map.put(new Long(113L), Attr_DHCPNetinfoTag.class);
        map.put(new Long(114L), Attr_DHCPURL.class);
        map.put(new Long(116L), Attr_DHCPAutoConfig.class);
        map.put(new Long(117L), Attr_DHCPNameServiceSearch.class);
        map.put(new Long(118L), Attr_DHCPSubnetSelectionOption.class);
        map.put(new Long(119L), Attr_DHCPDomainSearch.class);
        map.put(new Long(120L), Attr_DHCPSIPServersDHCPOption.class);
        map.put(new Long(121L), Attr_DHCPClasslessStaticRoute.class);
        map.put(new Long(122L), Attr_DHCPCCC.class);
        map.put(new Long(123L), Attr_DHCPGeoConfOption.class);
        map.put(new Long(124L), Attr_DHCPVIVendorClass.class);
        map.put(new Long(125L), Attr_DHCPVIVendorSpecific.class);
        map.put(new Long(128L), Attr_DHCPEtherboot.class);
        map.put(new Long(128L), Attr_DHCPTFTPServerIPAddress.class);
        map.put(new Long(129L), Attr_DHCPCallServerIPaddress.class);
        map.put(new Long(130L), Attr_DHCPEthernetInterface.class);
        map.put(new Long(130L), Attr_DHCPVendorDiscriminationStr.class);
        map.put(new Long(131L), Attr_DHCPRemoteStatsSvrIPAddress.class);
        map.put(new Long(132L), Attr_DHCPIEEE8021QL2Priority.class);
        map.put(new Long(133L), Attr_DHCPIEEE8021PVLANID.class);
        map.put(new Long(134L), Attr_DHCPDiffservCodePoint.class);
        map.put(new Long(135L), Attr_DHCPHTTPProxy.class);
        map.put(new Long(150L), Attr_DHCPCiscoTFTPServerIPAddresses.class);
        map.put(new Long(255L), Attr_DHCPEndOfOptions.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_DHCPOpcode.NAME, Attr_DHCPOpcode.class);
        map.put(Attr_DHCPHardwareType.NAME, Attr_DHCPHardwareType.class);
        map.put(Attr_DHCPHardwareAddressLength.NAME, Attr_DHCPHardwareAddressLength.class);
        map.put(Attr_DHCPHopCount.NAME, Attr_DHCPHopCount.class);
        map.put(Attr_DHCPTransactionId.NAME, Attr_DHCPTransactionId.class);
        map.put(Attr_DHCPNumberofSeconds.NAME, Attr_DHCPNumberofSeconds.class);
        map.put(Attr_DHCPFlags.NAME, Attr_DHCPFlags.class);
        map.put(Attr_DHCPClientIPAddress.NAME, Attr_DHCPClientIPAddress.class);
        map.put(Attr_DHCPYourIPAddress.NAME, Attr_DHCPYourIPAddress.class);
        map.put(Attr_DHCPServerIPAddress.NAME, Attr_DHCPServerIPAddress.class);
        map.put(Attr_DHCPGatewayIPAddress.NAME, Attr_DHCPGatewayIPAddress.class);
        map.put(Attr_DHCPClientHardwareAddress.NAME, Attr_DHCPClientHardwareAddress.class);
        map.put(Attr_DHCPServerHostName.NAME, Attr_DHCPServerHostName.class);
        map.put(Attr_DHCPRelayToIPAddress.NAME, Attr_DHCPRelayToIPAddress.class);
        map.put(Attr_DHCPSubnetMask.NAME, Attr_DHCPSubnetMask.class);
        map.put(Attr_DHCPTimeOffset.NAME, Attr_DHCPTimeOffset.class);
        map.put(Attr_DHCPRouterAddress.NAME, Attr_DHCPRouterAddress.class);
        map.put(Attr_DHCPTimeServer.NAME, Attr_DHCPTimeServer.class);
        map.put(Attr_DHCPIEN116NameServer.NAME, Attr_DHCPIEN116NameServer.class);
        map.put(Attr_DHCPDomainNameServer.NAME, Attr_DHCPDomainNameServer.class);
        map.put(Attr_DHCPLogServer.NAME, Attr_DHCPLogServer.class);
        map.put(Attr_DHCPQuotesServer.NAME, Attr_DHCPQuotesServer.class);
        map.put(Attr_DHCPLPRServer.NAME, Attr_DHCPLPRServer.class);
        map.put(Attr_DHCPImpressServer.NAME, Attr_DHCPImpressServer.class);
        map.put(Attr_DHCPRLPServer.NAME, Attr_DHCPRLPServer.class);
        map.put(Attr_DHCPHostname.NAME, Attr_DHCPHostname.class);
        map.put(Attr_DHCPBootFileSize.NAME, Attr_DHCPBootFileSize.class);
        map.put(Attr_DHCPMeritDumpFile.NAME, Attr_DHCPMeritDumpFile.class);
        map.put(Attr_DHCPDomainName.NAME, Attr_DHCPDomainName.class);
        map.put(Attr_DHCPSwapServer.NAME, Attr_DHCPSwapServer.class);
        map.put(Attr_DHCPRootPath.NAME, Attr_DHCPRootPath.class);
        map.put(Attr_DHCPBootpExtensionsPath.NAME, Attr_DHCPBootpExtensionsPath.class);
        map.put(Attr_DHCPIPForwardEnable.NAME, Attr_DHCPIPForwardEnable.class);
        map.put(Attr_DHCPSourceRouteEnable.NAME, Attr_DHCPSourceRouteEnable.class);
        map.put(Attr_DHCPPolicyFilter.NAME, Attr_DHCPPolicyFilter.class);
        map.put(Attr_DHCPMaxDatagramReassemblySz.NAME, Attr_DHCPMaxDatagramReassemblySz.class);
        map.put(Attr_DHCPDefaultIPTTL.NAME, Attr_DHCPDefaultIPTTL.class);
        map.put(Attr_DHCPPathMTUAgingTimeout.NAME, Attr_DHCPPathMTUAgingTimeout.class);
        map.put(Attr_DHCPPathMTUPlateauTable.NAME, Attr_DHCPPathMTUPlateauTable.class);
        map.put(Attr_DHCPInterfaceMTUSize.NAME, Attr_DHCPInterfaceMTUSize.class);
        map.put(Attr_DHCPAllSubnetsAreLocal.NAME, Attr_DHCPAllSubnetsAreLocal.class);
        map.put(Attr_DHCPBroadcastAddress.NAME, Attr_DHCPBroadcastAddress.class);
        map.put(Attr_DHCPPerformMaskDiscovery.NAME, Attr_DHCPPerformMaskDiscovery.class);
        map.put(Attr_DHCPProvideMaskToOthers.NAME, Attr_DHCPProvideMaskToOthers.class);
        map.put(Attr_DHCPPerformRouterDiscovery.NAME, Attr_DHCPPerformRouterDiscovery.class);
        map.put(Attr_DHCPRouterSolicitationAddress.NAME, Attr_DHCPRouterSolicitationAddress.class);
        map.put(Attr_DHCPStaticRoutes.NAME, Attr_DHCPStaticRoutes.class);
        map.put(Attr_DHCPTrailerEncapsulation.NAME, Attr_DHCPTrailerEncapsulation.class);
        map.put(Attr_DHCPARPCacheTimeout.NAME, Attr_DHCPARPCacheTimeout.class);
        map.put(Attr_DHCPEthernetEncapsulation.NAME, Attr_DHCPEthernetEncapsulation.class);
        map.put(Attr_DHCPDefaultTCPTTL.NAME, Attr_DHCPDefaultTCPTTL.class);
        map.put(Attr_DHCPKeepAliveInterval.NAME, Attr_DHCPKeepAliveInterval.class);
        map.put(Attr_DHCPKeepAliveGarbage.NAME, Attr_DHCPKeepAliveGarbage.class);
        map.put(Attr_DHCPNISDomainName.NAME, Attr_DHCPNISDomainName.class);
        map.put(Attr_DHCPNISServers.NAME, Attr_DHCPNISServers.class);
        map.put(Attr_DHCPNTPServers.NAME, Attr_DHCPNTPServers.class);
        map.put(Attr_DHCPVendor.NAME, Attr_DHCPVendor.class);
        map.put(Attr_DHCPNETBIOSNameServers.NAME, Attr_DHCPNETBIOSNameServers.class);
        map.put(Attr_DHCPNETBIOSDgmDistServers.NAME, Attr_DHCPNETBIOSDgmDistServers.class);
        map.put(Attr_DHCPNETBIOSNodeType.NAME, Attr_DHCPNETBIOSNodeType.class);
        map.put(Attr_DHCPNETBIOS.NAME, Attr_DHCPNETBIOS.class);
        map.put(Attr_DHCPXWindowFontServer.NAME, Attr_DHCPXWindowFontServer.class);
        map.put(Attr_DHCPXWindowDisplayMgr.NAME, Attr_DHCPXWindowDisplayMgr.class);
        map.put(Attr_DHCPRequestedIPAddress.NAME, Attr_DHCPRequestedIPAddress.class);
        map.put(Attr_DHCPIPAddressLeaseTime.NAME, Attr_DHCPIPAddressLeaseTime.class);
        map.put(Attr_DHCPOverload.NAME, Attr_DHCPOverload.class);
        map.put(Attr_DHCPMessageType.NAME, Attr_DHCPMessageType.class);
        map.put(Attr_DHCPDHCPServerIdentifier.NAME, Attr_DHCPDHCPServerIdentifier.class);
        map.put(Attr_DHCPParameterRequestList.NAME, Attr_DHCPParameterRequestList.class);
        map.put(Attr_DHCPDHCPErrorMessage.NAME, Attr_DHCPDHCPErrorMessage.class);
        map.put(Attr_DHCPDHCPMaximumMsgSize.NAME, Attr_DHCPDHCPMaximumMsgSize.class);
        map.put(Attr_DHCPRenewalTime.NAME, Attr_DHCPRenewalTime.class);
        map.put(Attr_DHCPRebindingTime.NAME, Attr_DHCPRebindingTime.class);
        map.put(Attr_DHCPVendorClassIdentifier.NAME, Attr_DHCPVendorClassIdentifier.class);
        map.put(Attr_DHCPClientIdentifier.NAME, Attr_DHCPClientIdentifier.class);
        map.put(Attr_DHCPNetwareDomainName.NAME, Attr_DHCPNetwareDomainName.class);
        map.put(Attr_DHCPNetwareSubOptions.NAME, Attr_DHCPNetwareSubOptions.class);
        map.put(Attr_DHCPNISClientDomainName.NAME, Attr_DHCPNISClientDomainName.class);
        map.put(Attr_DHCPNISServerAddress.NAME, Attr_DHCPNISServerAddress.class);
        map.put(Attr_DHCPTFTPServerName.NAME, Attr_DHCPTFTPServerName.class);
        map.put(Attr_DHCPBootFileName.NAME, Attr_DHCPBootFileName.class);
        map.put(Attr_DHCPHomeAgentAddress.NAME, Attr_DHCPHomeAgentAddress.class);
        map.put(Attr_DHCPSMTPServerAddress.NAME, Attr_DHCPSMTPServerAddress.class);
        map.put(Attr_DHCPPOP3ServerAddress.NAME, Attr_DHCPPOP3ServerAddress.class);
        map.put(Attr_DHCPNNTPServerAddress.NAME, Attr_DHCPNNTPServerAddress.class);
        map.put(Attr_DHCPWWWServerAddress.NAME, Attr_DHCPWWWServerAddress.class);
        map.put(Attr_DHCPFingerServerAddress.NAME, Attr_DHCPFingerServerAddress.class);
        map.put(Attr_DHCPIRCServerAddress.NAME, Attr_DHCPIRCServerAddress.class);
        map.put(Attr_DHCPStreetTalkServerAddress.NAME, Attr_DHCPStreetTalkServerAddress.class);
        map.put(Attr_DHCPSTDAServerAddress.NAME, Attr_DHCPSTDAServerAddress.class);
        map.put(Attr_DHCPUserClass.NAME, Attr_DHCPUserClass.class);
        map.put(Attr_DHCPDirectoryAgent.NAME, Attr_DHCPDirectoryAgent.class);
        map.put(Attr_DHCPServiceScope.NAME, Attr_DHCPServiceScope.class);
        map.put(Attr_DHCPRapidCommit.NAME, Attr_DHCPRapidCommit.class);
        map.put(Attr_DHCPClientFQDN.NAME, Attr_DHCPClientFQDN.class);
        map.put(Attr_DHCPRelayAgentInformation.NAME, Attr_DHCPRelayAgentInformation.class);
        map.put(Attr_DHCPAgentCircuitId.NAME, Attr_DHCPAgentCircuitId.class);
        map.put(Attr_DHCPAgentRemoteId.NAME, Attr_DHCPAgentRemoteId.class);
        map.put(Attr_DHCPRelayCircuitId.NAME, Attr_DHCPRelayCircuitId.class);
        map.put(Attr_DHCPRelayRemoteId.NAME, Attr_DHCPRelayRemoteId.class);
        map.put(Attr_DHCPDocsisDeviceClass.NAME, Attr_DHCPDocsisDeviceClass.class);
        map.put(Attr_DHCPRelayLinkSelection.NAME, Attr_DHCPRelayLinkSelection.class);
        map.put(Attr_DHCPSubscriberId.NAME, Attr_DHCPSubscriberId.class);
        map.put(Attr_DHCPRADIUSAttributes.NAME, Attr_DHCPRADIUSAttributes.class);
        map.put(Attr_DHCPAuthenticationInformation.NAME, Attr_DHCPAuthenticationInformation.class);
        map.put(Attr_DHCPVendorSpecificInformation.NAME, Attr_DHCPVendorSpecificInformation.class);
        map.put(Attr_DHCPRelayAgentFlags.NAME, Attr_DHCPRelayAgentFlags.class);
        map.put(Attr_DHCPServerIdentifierOverride.NAME, Attr_DHCPServerIdentifierOverride.class);
        map.put(Attr_DHCPiSNS.NAME, Attr_DHCPiSNS.class);
        map.put(Attr_DHCPNDSServers.NAME, Attr_DHCPNDSServers.class);
        map.put(Attr_DHCPNDSTreeName.NAME, Attr_DHCPNDSTreeName.class);
        map.put(Attr_DHCPNDSContext.NAME, Attr_DHCPNDSContext.class);
        map.put(Attr_DHCPAuthentication.NAME, Attr_DHCPAuthentication.class);
        map.put(Attr_DHCPClientLastTxnTime.NAME, Attr_DHCPClientLastTxnTime.class);
        map.put(Attr_DHCPassociatedip.NAME, Attr_DHCPassociatedip.class);
        map.put(Attr_DHCPClientSystem.NAME, Attr_DHCPClientSystem.class);
        map.put(Attr_DHCPClientNDI.NAME, Attr_DHCPClientNDI.class);
        map.put(Attr_DHCPLDAP.NAME, Attr_DHCPLDAP.class);
        map.put(Attr_DHCPUUIDGUID.NAME, Attr_DHCPUUIDGUID.class);
        map.put(Attr_DHCPUserAuth.NAME, Attr_DHCPUserAuth.class);
        map.put(Attr_DHCPNetinfoAddress.NAME, Attr_DHCPNetinfoAddress.class);
        map.put(Attr_DHCPNetinfoTag.NAME, Attr_DHCPNetinfoTag.class);
        map.put(Attr_DHCPURL.NAME, Attr_DHCPURL.class);
        map.put(Attr_DHCPAutoConfig.NAME, Attr_DHCPAutoConfig.class);
        map.put(Attr_DHCPNameServiceSearch.NAME, Attr_DHCPNameServiceSearch.class);
        map.put(Attr_DHCPSubnetSelectionOption.NAME, Attr_DHCPSubnetSelectionOption.class);
        map.put(Attr_DHCPDomainSearch.NAME, Attr_DHCPDomainSearch.class);
        map.put(Attr_DHCPSIPServersDHCPOption.NAME, Attr_DHCPSIPServersDHCPOption.class);
        map.put(Attr_DHCPClasslessStaticRoute.NAME, Attr_DHCPClasslessStaticRoute.class);
        map.put(Attr_DHCPCCC.NAME, Attr_DHCPCCC.class);
        map.put(Attr_DHCPGeoConfOption.NAME, Attr_DHCPGeoConfOption.class);
        map.put(Attr_DHCPVIVendorClass.NAME, Attr_DHCPVIVendorClass.class);
        map.put(Attr_DHCPVIVendorSpecific.NAME, Attr_DHCPVIVendorSpecific.class);
        map.put(Attr_DHCPEtherboot.NAME, Attr_DHCPEtherboot.class);
        map.put(Attr_DHCPTFTPServerIPAddress.NAME, Attr_DHCPTFTPServerIPAddress.class);
        map.put(Attr_DHCPCallServerIPaddress.NAME, Attr_DHCPCallServerIPaddress.class);
        map.put(Attr_DHCPEthernetInterface.NAME, Attr_DHCPEthernetInterface.class);
        map.put(Attr_DHCPVendorDiscriminationStr.NAME, Attr_DHCPVendorDiscriminationStr.class);
        map.put(Attr_DHCPRemoteStatsSvrIPAddress.NAME, Attr_DHCPRemoteStatsSvrIPAddress.class);
        map.put(Attr_DHCPIEEE8021QL2Priority.NAME, Attr_DHCPIEEE8021QL2Priority.class);
        map.put(Attr_DHCPIEEE8021PVLANID.NAME, Attr_DHCPIEEE8021PVLANID.class);
        map.put(Attr_DHCPDiffservCodePoint.NAME, Attr_DHCPDiffservCodePoint.class);
        map.put(Attr_DHCPHTTPProxy.NAME, Attr_DHCPHTTPProxy.class);
        map.put(Attr_DHCPCiscoTFTPServerIPAddresses.NAME, Attr_DHCPCiscoTFTPServerIPAddresses.class);
        map.put(Attr_DHCPEndOfOptions.NAME, Attr_DHCPEndOfOptions.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ericsson;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_ericsson
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Ericsson"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(3L), Attr_EricssonViGBalance.class);
        map.put(new Long(4L), Attr_EricssonViGCodec.class);
        map.put(new Long(5L), Attr_EricssonViGCurrency.class);
        map.put(new Long(6L), Attr_EricssonViGCurrencyQuote.class);
        map.put(new Long(8L), Attr_EricssonViGEndpointType.class);
        map.put(new Long(9L), Attr_EricssonViGSequenceNumber.class);
        map.put(new Long(11L), Attr_EricssonViGAccessAgentIPAddress.class);
        map.put(new Long(12L), Attr_EricssonViGQoSClass.class);
        map.put(new Long(14L), Attr_EricssonViGDigestResponse.class);
        map.put(new Long(15L), Attr_EricssonViGDigestAttributes.class);
        map.put(new Long(16L), Attr_EricssonViGBusinessAgreementName.class);
        map.put(new Long(17L), Attr_EricssonViGCallRole.class);
        map.put(new Long(20L), Attr_EricssonViGRemoteSKUAIPAddress.class);
        map.put(new Long(23L), Attr_EricssonViGSite.class);
        map.put(new Long(32L), Attr_EricssonViGTTLrelative.class);
        map.put(new Long(33L), Attr_EricssonViGAccounterrorreason.class);
        map.put(new Long(34L), Attr_EricssonViGLayeridentity.class);
        map.put(new Long(35L), Attr_EricssonViGMajorprotocolversion.class);
        map.put(new Long(36L), Attr_EricssonViGMinorprotocolversion.class);
        map.put(new Long(37L), Attr_EricssonViGAuthenticationtype.class);
        map.put(new Long(38L), Attr_EricssonViGTrustedaccess.class);
        map.put(new Long(39L), Attr_EricssonViGUsername.class);
        map.put(new Long(40L), Attr_EricssonViGGlobaluniquecallID.class);
        map.put(new Long(41L), Attr_EricssonViGGlobaluniqueserviceID.class);
        map.put(new Long(42L), Attr_EricssonViGInteriminterval.class);
        map.put(new Long(43L), Attr_EricssonViGAliveIndicator.class);
        map.put(new Long(44L), Attr_EricssonViGTTLAbsolute.class);
        map.put(new Long(45L), Attr_EricssonViGTTLStartEvent.class);
        map.put(new Long(46L), Attr_EricssonViGSKIPaddress.class);
        map.put(new Long(47L), Attr_EricssonViGUAIPaddress.class);
        map.put(new Long(48L), Attr_EricssonViGSAIPaddress.class);
        map.put(new Long(49L), Attr_EricssonViGCallinge164number.class);
        map.put(new Long(50L), Attr_EricssonViGCallingH323Id.class);
        map.put(new Long(51L), Attr_EricssonViGCallingEmailaddress.class);
        map.put(new Long(52L), Attr_EricssonViGDiallede164number.class);
        map.put(new Long(53L), Attr_EricssonViGDialledH323Id.class);
        map.put(new Long(54L), Attr_EricssonViGDialledEmailaddress.class);
        map.put(new Long(55L), Attr_EricssonViGRoutede164number.class);
        map.put(new Long(56L), Attr_EricssonViGRoutedH323Id.class);
        map.put(new Long(57L), Attr_EricssonViGRoutedEmailaddress.class);
        map.put(new Long(58L), Attr_EricssonViGSiteKeepername.class);
        map.put(new Long(59L), Attr_EricssonViGAccessGroupname.class);
        map.put(new Long(60L), Attr_EricssonViGAccessAgentname.class);
        map.put(new Long(61L), Attr_EricssonViGUseragentgroupname.class);
        map.put(new Long(62L), Attr_EricssonViGUseragentname.class);
        map.put(new Long(63L), Attr_EricssonViGRoutingtariff.class);
        map.put(new Long(64L), Attr_EricssonViGReselectioncounter.class);
        map.put(new Long(65L), Attr_EricssonViGCPNdigits.class);
        map.put(new Long(66L), Attr_EricssonViGCPNTON.class);
        map.put(new Long(67L), Attr_EricssonViGCPNNP.class);
        map.put(new Long(68L), Attr_EricssonViGCPNPI.class);
        map.put(new Long(69L), Attr_EricssonViGCPNSI.class);
        map.put(new Long(70L), Attr_EricssonViGDiallednumdigits.class);
        map.put(new Long(71L), Attr_EricssonViGDiallednumTON.class);
        map.put(new Long(72L), Attr_EricssonViGDiallednumNP.class);
        map.put(new Long(73L), Attr_EricssonViGRoutingnumdigits.class);
        map.put(new Long(74L), Attr_EricssonViGRoutingnumTON.class);
        map.put(new Long(75L), Attr_EricssonViGRoutingnumNP.class);
        map.put(new Long(76L), Attr_EricssonViGRedirectingnumdigits.class);
        map.put(new Long(77L), Attr_EricssonViGRedirectingnumTON.class);
        map.put(new Long(78L), Attr_EricssonViGRedirectingnumNP.class);
        map.put(new Long(79L), Attr_EricssonViGRedirectingnumPI.class);
        map.put(new Long(80L), Attr_EricssonViGRedirectingnumRFD.class);
        map.put(new Long(81L), Attr_EricssonViGTimestampUTC.class);
        map.put(new Long(82L), Attr_EricssonViGTimestampTZ.class);
        map.put(new Long(83L), Attr_EricssonViGTimestampDST.class);
        map.put(new Long(84L), Attr_EricssonViGSessionroutingduration.class);
        map.put(new Long(85L), Attr_EricssonViGSessionringingduration.class);
        map.put(new Long(86L), Attr_EricssonViGAccesstype.class);
        map.put(new Long(87L), Attr_EricssonViGRequestedbandwidth.class);
        map.put(new Long(88L), Attr_EricssonViGAllowedbandwidth.class);
        map.put(new Long(89L), Attr_EricssonViGMediachannelcount.class);
        map.put(new Long(90L), Attr_EricssonViGVoicemediarecforward.class);
        map.put(new Long(91L), Attr_EricssonViGVoicemediarecbackward.class);
        map.put(new Long(92L), Attr_EricssonViGVideomediarecforward.class);
        map.put(new Long(93L), Attr_EricssonViGVideomediarecbackward.class);
        map.put(new Long(94L), Attr_EricssonViGFaxmediarecforward.class);
        map.put(new Long(95L), Attr_EricssonViGFaxmediarecbackward.class);
        map.put(new Long(96L), Attr_EricssonViGDatamediarecforward.class);
        map.put(new Long(97L), Attr_EricssonViGDatamediarecbackward.class);
        map.put(new Long(98L), Attr_EricssonViGChargingCase.class);
        map.put(new Long(99L), Attr_EricssonViGRelcausecodingstd.class);
        map.put(new Long(100L), Attr_EricssonViGRelcauselocation.class);
        map.put(new Long(101L), Attr_EricssonViGRelcauseclass.class);
        map.put(new Long(102L), Attr_EricssonViGRelcausevalue.class);
        map.put(new Long(103L), Attr_EricssonViGRelreason.class);
        map.put(new Long(104L), Attr_EricssonViGInternalRelreasonval.class);
        map.put(new Long(105L), Attr_EricssonViGInternalRelreasonorig.class);
        map.put(new Long(106L), Attr_EricssonViGServiceID.class);
        map.put(new Long(107L), Attr_EricssonViGUserID.class);
        map.put(new Long(108L), Attr_EricssonViGServiceName.class);
        map.put(new Long(109L), Attr_EricssonViGTestCallIndicator.class);
        map.put(new Long(110L), Attr_EricssonViGEmergencyCallIndicator.class);
        map.put(new Long(111L), Attr_EricssonViGCallingID.class);
        map.put(new Long(112L), Attr_EricssonViGCalledID.class);
        map.put(new Long(113L), Attr_EricssonViGTranslatedID.class);
        map.put(new Long(114L), Attr_EricssonViGCallingUserGroupID.class);
        map.put(new Long(115L), Attr_EricssonViGCallingUsrSubGroupID.class);
        map.put(new Long(116L), Attr_EricssonViGCalledUsrGroupID.class);
        map.put(new Long(117L), Attr_EricssonViGCalledUsrSubGroupID.class);
        map.put(new Long(118L), Attr_EricssonViGTerminalType.class);
        map.put(new Long(119L), Attr_EricssonViGServiceDuration.class);
        map.put(new Long(120L), Attr_EricssonViGServiceExecutionResult.class);
        map.put(new Long(121L), Attr_EricssonViGServiceExeRsltDesc.class);
        map.put(new Long(122L), Attr_EricssonViGServiceDescription.class);
        map.put(new Long(123L), Attr_EricssonViGServiceSpecificInfo.class);
        map.put(new Long(124L), Attr_EricssonViGProxyIPAddress.class);
        map.put(new Long(125L), Attr_EricssonViGAuthDataRequest.class);
        map.put(new Long(126L), Attr_EricssonViGIPTTimeStamp.class);
        map.put(new Long(127L), Attr_EricssonViGUserNameInfo.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_EricssonViGBalance.NAME, Attr_EricssonViGBalance.class);
        map.put(Attr_EricssonViGCodec.NAME, Attr_EricssonViGCodec.class);
        map.put(Attr_EricssonViGCurrency.NAME, Attr_EricssonViGCurrency.class);
        map.put(Attr_EricssonViGCurrencyQuote.NAME, Attr_EricssonViGCurrencyQuote.class);
        map.put(Attr_EricssonViGEndpointType.NAME, Attr_EricssonViGEndpointType.class);
        map.put(Attr_EricssonViGSequenceNumber.NAME, Attr_EricssonViGSequenceNumber.class);
        map.put(Attr_EricssonViGAccessAgentIPAddress.NAME, Attr_EricssonViGAccessAgentIPAddress.class);
        map.put(Attr_EricssonViGQoSClass.NAME, Attr_EricssonViGQoSClass.class);
        map.put(Attr_EricssonViGDigestResponse.NAME, Attr_EricssonViGDigestResponse.class);
        map.put(Attr_EricssonViGDigestAttributes.NAME, Attr_EricssonViGDigestAttributes.class);
        map.put(Attr_EricssonViGBusinessAgreementName.NAME, Attr_EricssonViGBusinessAgreementName.class);
        map.put(Attr_EricssonViGCallRole.NAME, Attr_EricssonViGCallRole.class);
        map.put(Attr_EricssonViGRemoteSKUAIPAddress.NAME, Attr_EricssonViGRemoteSKUAIPAddress.class);
        map.put(Attr_EricssonViGSite.NAME, Attr_EricssonViGSite.class);
        map.put(Attr_EricssonViGTTLrelative.NAME, Attr_EricssonViGTTLrelative.class);
        map.put(Attr_EricssonViGAccounterrorreason.NAME, Attr_EricssonViGAccounterrorreason.class);
        map.put(Attr_EricssonViGLayeridentity.NAME, Attr_EricssonViGLayeridentity.class);
        map.put(Attr_EricssonViGMajorprotocolversion.NAME, Attr_EricssonViGMajorprotocolversion.class);
        map.put(Attr_EricssonViGMinorprotocolversion.NAME, Attr_EricssonViGMinorprotocolversion.class);
        map.put(Attr_EricssonViGAuthenticationtype.NAME, Attr_EricssonViGAuthenticationtype.class);
        map.put(Attr_EricssonViGTrustedaccess.NAME, Attr_EricssonViGTrustedaccess.class);
        map.put(Attr_EricssonViGUsername.NAME, Attr_EricssonViGUsername.class);
        map.put(Attr_EricssonViGGlobaluniquecallID.NAME, Attr_EricssonViGGlobaluniquecallID.class);
        map.put(Attr_EricssonViGGlobaluniqueserviceID.NAME, Attr_EricssonViGGlobaluniqueserviceID.class);
        map.put(Attr_EricssonViGInteriminterval.NAME, Attr_EricssonViGInteriminterval.class);
        map.put(Attr_EricssonViGAliveIndicator.NAME, Attr_EricssonViGAliveIndicator.class);
        map.put(Attr_EricssonViGTTLAbsolute.NAME, Attr_EricssonViGTTLAbsolute.class);
        map.put(Attr_EricssonViGTTLStartEvent.NAME, Attr_EricssonViGTTLStartEvent.class);
        map.put(Attr_EricssonViGSKIPaddress.NAME, Attr_EricssonViGSKIPaddress.class);
        map.put(Attr_EricssonViGUAIPaddress.NAME, Attr_EricssonViGUAIPaddress.class);
        map.put(Attr_EricssonViGSAIPaddress.NAME, Attr_EricssonViGSAIPaddress.class);
        map.put(Attr_EricssonViGCallinge164number.NAME, Attr_EricssonViGCallinge164number.class);
        map.put(Attr_EricssonViGCallingH323Id.NAME, Attr_EricssonViGCallingH323Id.class);
        map.put(Attr_EricssonViGCallingEmailaddress.NAME, Attr_EricssonViGCallingEmailaddress.class);
        map.put(Attr_EricssonViGDiallede164number.NAME, Attr_EricssonViGDiallede164number.class);
        map.put(Attr_EricssonViGDialledH323Id.NAME, Attr_EricssonViGDialledH323Id.class);
        map.put(Attr_EricssonViGDialledEmailaddress.NAME, Attr_EricssonViGDialledEmailaddress.class);
        map.put(Attr_EricssonViGRoutede164number.NAME, Attr_EricssonViGRoutede164number.class);
        map.put(Attr_EricssonViGRoutedH323Id.NAME, Attr_EricssonViGRoutedH323Id.class);
        map.put(Attr_EricssonViGRoutedEmailaddress.NAME, Attr_EricssonViGRoutedEmailaddress.class);
        map.put(Attr_EricssonViGSiteKeepername.NAME, Attr_EricssonViGSiteKeepername.class);
        map.put(Attr_EricssonViGAccessGroupname.NAME, Attr_EricssonViGAccessGroupname.class);
        map.put(Attr_EricssonViGAccessAgentname.NAME, Attr_EricssonViGAccessAgentname.class);
        map.put(Attr_EricssonViGUseragentgroupname.NAME, Attr_EricssonViGUseragentgroupname.class);
        map.put(Attr_EricssonViGUseragentname.NAME, Attr_EricssonViGUseragentname.class);
        map.put(Attr_EricssonViGRoutingtariff.NAME, Attr_EricssonViGRoutingtariff.class);
        map.put(Attr_EricssonViGReselectioncounter.NAME, Attr_EricssonViGReselectioncounter.class);
        map.put(Attr_EricssonViGCPNdigits.NAME, Attr_EricssonViGCPNdigits.class);
        map.put(Attr_EricssonViGCPNTON.NAME, Attr_EricssonViGCPNTON.class);
        map.put(Attr_EricssonViGCPNNP.NAME, Attr_EricssonViGCPNNP.class);
        map.put(Attr_EricssonViGCPNPI.NAME, Attr_EricssonViGCPNPI.class);
        map.put(Attr_EricssonViGCPNSI.NAME, Attr_EricssonViGCPNSI.class);
        map.put(Attr_EricssonViGDiallednumdigits.NAME, Attr_EricssonViGDiallednumdigits.class);
        map.put(Attr_EricssonViGDiallednumTON.NAME, Attr_EricssonViGDiallednumTON.class);
        map.put(Attr_EricssonViGDiallednumNP.NAME, Attr_EricssonViGDiallednumNP.class);
        map.put(Attr_EricssonViGRoutingnumdigits.NAME, Attr_EricssonViGRoutingnumdigits.class);
        map.put(Attr_EricssonViGRoutingnumTON.NAME, Attr_EricssonViGRoutingnumTON.class);
        map.put(Attr_EricssonViGRoutingnumNP.NAME, Attr_EricssonViGRoutingnumNP.class);
        map.put(Attr_EricssonViGRedirectingnumdigits.NAME, Attr_EricssonViGRedirectingnumdigits.class);
        map.put(Attr_EricssonViGRedirectingnumTON.NAME, Attr_EricssonViGRedirectingnumTON.class);
        map.put(Attr_EricssonViGRedirectingnumNP.NAME, Attr_EricssonViGRedirectingnumNP.class);
        map.put(Attr_EricssonViGRedirectingnumPI.NAME, Attr_EricssonViGRedirectingnumPI.class);
        map.put(Attr_EricssonViGRedirectingnumRFD.NAME, Attr_EricssonViGRedirectingnumRFD.class);
        map.put(Attr_EricssonViGTimestampUTC.NAME, Attr_EricssonViGTimestampUTC.class);
        map.put(Attr_EricssonViGTimestampTZ.NAME, Attr_EricssonViGTimestampTZ.class);
        map.put(Attr_EricssonViGTimestampDST.NAME, Attr_EricssonViGTimestampDST.class);
        map.put(Attr_EricssonViGSessionroutingduration.NAME, Attr_EricssonViGSessionroutingduration.class);
        map.put(Attr_EricssonViGSessionringingduration.NAME, Attr_EricssonViGSessionringingduration.class);
        map.put(Attr_EricssonViGAccesstype.NAME, Attr_EricssonViGAccesstype.class);
        map.put(Attr_EricssonViGRequestedbandwidth.NAME, Attr_EricssonViGRequestedbandwidth.class);
        map.put(Attr_EricssonViGAllowedbandwidth.NAME, Attr_EricssonViGAllowedbandwidth.class);
        map.put(Attr_EricssonViGMediachannelcount.NAME, Attr_EricssonViGMediachannelcount.class);
        map.put(Attr_EricssonViGVoicemediarecforward.NAME, Attr_EricssonViGVoicemediarecforward.class);
        map.put(Attr_EricssonViGVoicemediarecbackward.NAME, Attr_EricssonViGVoicemediarecbackward.class);
        map.put(Attr_EricssonViGVideomediarecforward.NAME, Attr_EricssonViGVideomediarecforward.class);
        map.put(Attr_EricssonViGVideomediarecbackward.NAME, Attr_EricssonViGVideomediarecbackward.class);
        map.put(Attr_EricssonViGFaxmediarecforward.NAME, Attr_EricssonViGFaxmediarecforward.class);
        map.put(Attr_EricssonViGFaxmediarecbackward.NAME, Attr_EricssonViGFaxmediarecbackward.class);
        map.put(Attr_EricssonViGDatamediarecforward.NAME, Attr_EricssonViGDatamediarecforward.class);
        map.put(Attr_EricssonViGDatamediarecbackward.NAME, Attr_EricssonViGDatamediarecbackward.class);
        map.put(Attr_EricssonViGChargingCase.NAME, Attr_EricssonViGChargingCase.class);
        map.put(Attr_EricssonViGRelcausecodingstd.NAME, Attr_EricssonViGRelcausecodingstd.class);
        map.put(Attr_EricssonViGRelcauselocation.NAME, Attr_EricssonViGRelcauselocation.class);
        map.put(Attr_EricssonViGRelcauseclass.NAME, Attr_EricssonViGRelcauseclass.class);
        map.put(Attr_EricssonViGRelcausevalue.NAME, Attr_EricssonViGRelcausevalue.class);
        map.put(Attr_EricssonViGRelreason.NAME, Attr_EricssonViGRelreason.class);
        map.put(Attr_EricssonViGInternalRelreasonval.NAME, Attr_EricssonViGInternalRelreasonval.class);
        map.put(Attr_EricssonViGInternalRelreasonorig.NAME, Attr_EricssonViGInternalRelreasonorig.class);
        map.put(Attr_EricssonViGServiceID.NAME, Attr_EricssonViGServiceID.class);
        map.put(Attr_EricssonViGUserID.NAME, Attr_EricssonViGUserID.class);
        map.put(Attr_EricssonViGServiceName.NAME, Attr_EricssonViGServiceName.class);
        map.put(Attr_EricssonViGTestCallIndicator.NAME, Attr_EricssonViGTestCallIndicator.class);
        map.put(Attr_EricssonViGEmergencyCallIndicator.NAME, Attr_EricssonViGEmergencyCallIndicator.class);
        map.put(Attr_EricssonViGCallingID.NAME, Attr_EricssonViGCallingID.class);
        map.put(Attr_EricssonViGCalledID.NAME, Attr_EricssonViGCalledID.class);
        map.put(Attr_EricssonViGTranslatedID.NAME, Attr_EricssonViGTranslatedID.class);
        map.put(Attr_EricssonViGCallingUserGroupID.NAME, Attr_EricssonViGCallingUserGroupID.class);
        map.put(Attr_EricssonViGCallingUsrSubGroupID.NAME, Attr_EricssonViGCallingUsrSubGroupID.class);
        map.put(Attr_EricssonViGCalledUsrGroupID.NAME, Attr_EricssonViGCalledUsrGroupID.class);
        map.put(Attr_EricssonViGCalledUsrSubGroupID.NAME, Attr_EricssonViGCalledUsrSubGroupID.class);
        map.put(Attr_EricssonViGTerminalType.NAME, Attr_EricssonViGTerminalType.class);
        map.put(Attr_EricssonViGServiceDuration.NAME, Attr_EricssonViGServiceDuration.class);
        map.put(Attr_EricssonViGServiceExecutionResult.NAME, Attr_EricssonViGServiceExecutionResult.class);
        map.put(Attr_EricssonViGServiceExeRsltDesc.NAME, Attr_EricssonViGServiceExeRsltDesc.class);
        map.put(Attr_EricssonViGServiceDescription.NAME, Attr_EricssonViGServiceDescription.class);
        map.put(Attr_EricssonViGServiceSpecificInfo.NAME, Attr_EricssonViGServiceSpecificInfo.class);
        map.put(Attr_EricssonViGProxyIPAddress.NAME, Attr_EricssonViGProxyIPAddress.class);
        map.put(Attr_EricssonViGAuthDataRequest.NAME, Attr_EricssonViGAuthDataRequest.class);
        map.put(Attr_EricssonViGIPTTimeStamp.NAME, Attr_EricssonViGIPTTimeStamp.class);
        map.put(Attr_EricssonViGUserNameInfo.NAME, Attr_EricssonViGUserNameInfo.class);
    }
}

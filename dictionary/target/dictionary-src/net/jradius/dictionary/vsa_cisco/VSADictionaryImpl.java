// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_cisco;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_cisco
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Cisco"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_CiscoAVPair.class);
        map.put(new Long(2L), Attr_CiscoNASPort.class);
        map.put(new Long(3L), Attr_CiscoFaxAccountIdOrigin.class);
        map.put(new Long(4L), Attr_CiscoFaxMsgId.class);
        map.put(new Long(5L), Attr_CiscoFaxPages.class);
        map.put(new Long(6L), Attr_CiscoFaxCoverpageFlag.class);
        map.put(new Long(7L), Attr_CiscoFaxModemTime.class);
        map.put(new Long(8L), Attr_CiscoFaxConnectSpeed.class);
        map.put(new Long(9L), Attr_CiscoFaxRecipientCount.class);
        map.put(new Long(10L), Attr_CiscoFaxProcessAbortFlag.class);
        map.put(new Long(11L), Attr_CiscoFaxDsnAddress.class);
        map.put(new Long(12L), Attr_CiscoFaxDsnFlag.class);
        map.put(new Long(13L), Attr_CiscoFaxMdnAddress.class);
        map.put(new Long(14L), Attr_CiscoFaxMdnFlag.class);
        map.put(new Long(15L), Attr_CiscoFaxAuthStatus.class);
        map.put(new Long(16L), Attr_CiscoEmailServerAddress.class);
        map.put(new Long(17L), Attr_CiscoEmailServerAckFlag.class);
        map.put(new Long(18L), Attr_CiscoGatewayId.class);
        map.put(new Long(19L), Attr_CiscoCallType.class);
        map.put(new Long(20L), Attr_CiscoPortUsed.class);
        map.put(new Long(21L), Attr_CiscoAbortCause.class);
        map.put(new Long(23L), Attr_h323remoteaddress.class);
        map.put(new Long(24L), Attr_h323confid.class);
        map.put(new Long(25L), Attr_h323setuptime.class);
        map.put(new Long(26L), Attr_h323callorigin.class);
        map.put(new Long(27L), Attr_h323calltype.class);
        map.put(new Long(28L), Attr_h323connecttime.class);
        map.put(new Long(29L), Attr_h323disconnecttime.class);
        map.put(new Long(30L), Attr_h323disconnectcause.class);
        map.put(new Long(31L), Attr_h323voicequality.class);
        map.put(new Long(33L), Attr_h323gwid.class);
        map.put(new Long(35L), Attr_h323incomingconfid.class);
        map.put(new Long(37L), Attr_CiscoPolicyUp.class);
        map.put(new Long(38L), Attr_CiscoPolicyDown.class);
        map.put(new Long(100L), Attr_sipconfid.class);
        map.put(new Long(101L), Attr_h323creditamount.class);
        map.put(new Long(102L), Attr_h323credittime.class);
        map.put(new Long(103L), Attr_h323returncode.class);
        map.put(new Long(104L), Attr_h323promptid.class);
        map.put(new Long(105L), Attr_h323timeandday.class);
        map.put(new Long(106L), Attr_h323redirectnumber.class);
        map.put(new Long(107L), Attr_h323preferredlang.class);
        map.put(new Long(108L), Attr_h323redirectipaddress.class);
        map.put(new Long(109L), Attr_h323billingmodel.class);
        map.put(new Long(110L), Attr_h323currency.class);
        map.put(new Long(111L), Attr_subscriber.class);
        map.put(new Long(112L), Attr_gwrxdcdn.class);
        map.put(new Long(113L), Attr_gwfinalxlatedcdn.class);
        map.put(new Long(114L), Attr_remotemediaaddress.class);
        map.put(new Long(115L), Attr_releasesource.class);
        map.put(new Long(116L), Attr_gwrxdcgn.class);
        map.put(new Long(117L), Attr_gwfinalxlatedcgn.class);
        map.put(new Long(141L), Attr_callid.class);
        map.put(new Long(142L), Attr_sessionprotocol.class);
        map.put(new Long(143L), Attr_method.class);
        map.put(new Long(144L), Attr_prevhopvia.class);
        map.put(new Long(145L), Attr_prevhopip.class);
        map.put(new Long(146L), Attr_incomingrequri.class);
        map.put(new Long(147L), Attr_outgoingrequri.class);
        map.put(new Long(148L), Attr_nexthopip.class);
        map.put(new Long(149L), Attr_nexthopdn.class);
        map.put(new Long(150L), Attr_siphdr.class);
        map.put(new Long(187L), Attr_CiscoMultilinkID.class);
        map.put(new Long(188L), Attr_CiscoNumInMultilink.class);
        map.put(new Long(190L), Attr_CiscoPreInputOctets.class);
        map.put(new Long(191L), Attr_CiscoPreOutputOctets.class);
        map.put(new Long(192L), Attr_CiscoPreInputPackets.class);
        map.put(new Long(193L), Attr_CiscoPreOutputPackets.class);
        map.put(new Long(194L), Attr_CiscoMaximumTime.class);
        map.put(new Long(195L), Attr_CiscoDisconnectCause.class);
        map.put(new Long(197L), Attr_CiscoDataRate.class);
        map.put(new Long(198L), Attr_CiscoPreSessionTime.class);
        map.put(new Long(208L), Attr_CiscoPWLifetime.class);
        map.put(new Long(209L), Attr_CiscoIPDirect.class);
        map.put(new Long(210L), Attr_CiscoPPPVJSlotComp.class);
        map.put(new Long(212L), Attr_CiscoPPPAsyncMap.class);
        map.put(new Long(217L), Attr_CiscoIPPoolDefinition.class);
        map.put(new Long(218L), Attr_CiscoAssignIPPool.class);
        map.put(new Long(228L), Attr_CiscoRouteIP.class);
        map.put(new Long(233L), Attr_CiscoLinkCompression.class);
        map.put(new Long(234L), Attr_CiscoTargetUtil.class);
        map.put(new Long(235L), Attr_CiscoMaximumChannels.class);
        map.put(new Long(242L), Attr_CiscoDataFilter.class);
        map.put(new Long(243L), Attr_CiscoCallFilter.class);
        map.put(new Long(244L), Attr_CiscoIdleLimit.class);
        map.put(new Long(249L), Attr_CiscoSubscriberPassword.class);
        map.put(new Long(250L), Attr_CiscoAccountInfo.class);
        map.put(new Long(251L), Attr_CiscoServiceInfo.class);
        map.put(new Long(252L), Attr_CiscoCommandCode.class);
        map.put(new Long(253L), Attr_CiscoControlInfo.class);
        map.put(new Long(255L), Attr_CiscoXmitRate.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_CiscoAVPair.NAME, Attr_CiscoAVPair.class);
        map.put(Attr_CiscoNASPort.NAME, Attr_CiscoNASPort.class);
        map.put(Attr_CiscoFaxAccountIdOrigin.NAME, Attr_CiscoFaxAccountIdOrigin.class);
        map.put(Attr_CiscoFaxMsgId.NAME, Attr_CiscoFaxMsgId.class);
        map.put(Attr_CiscoFaxPages.NAME, Attr_CiscoFaxPages.class);
        map.put(Attr_CiscoFaxCoverpageFlag.NAME, Attr_CiscoFaxCoverpageFlag.class);
        map.put(Attr_CiscoFaxModemTime.NAME, Attr_CiscoFaxModemTime.class);
        map.put(Attr_CiscoFaxConnectSpeed.NAME, Attr_CiscoFaxConnectSpeed.class);
        map.put(Attr_CiscoFaxRecipientCount.NAME, Attr_CiscoFaxRecipientCount.class);
        map.put(Attr_CiscoFaxProcessAbortFlag.NAME, Attr_CiscoFaxProcessAbortFlag.class);
        map.put(Attr_CiscoFaxDsnAddress.NAME, Attr_CiscoFaxDsnAddress.class);
        map.put(Attr_CiscoFaxDsnFlag.NAME, Attr_CiscoFaxDsnFlag.class);
        map.put(Attr_CiscoFaxMdnAddress.NAME, Attr_CiscoFaxMdnAddress.class);
        map.put(Attr_CiscoFaxMdnFlag.NAME, Attr_CiscoFaxMdnFlag.class);
        map.put(Attr_CiscoFaxAuthStatus.NAME, Attr_CiscoFaxAuthStatus.class);
        map.put(Attr_CiscoEmailServerAddress.NAME, Attr_CiscoEmailServerAddress.class);
        map.put(Attr_CiscoEmailServerAckFlag.NAME, Attr_CiscoEmailServerAckFlag.class);
        map.put(Attr_CiscoGatewayId.NAME, Attr_CiscoGatewayId.class);
        map.put(Attr_CiscoCallType.NAME, Attr_CiscoCallType.class);
        map.put(Attr_CiscoPortUsed.NAME, Attr_CiscoPortUsed.class);
        map.put(Attr_CiscoAbortCause.NAME, Attr_CiscoAbortCause.class);
        map.put(Attr_h323remoteaddress.NAME, Attr_h323remoteaddress.class);
        map.put(Attr_h323confid.NAME, Attr_h323confid.class);
        map.put(Attr_h323setuptime.NAME, Attr_h323setuptime.class);
        map.put(Attr_h323callorigin.NAME, Attr_h323callorigin.class);
        map.put(Attr_h323calltype.NAME, Attr_h323calltype.class);
        map.put(Attr_h323connecttime.NAME, Attr_h323connecttime.class);
        map.put(Attr_h323disconnecttime.NAME, Attr_h323disconnecttime.class);
        map.put(Attr_h323disconnectcause.NAME, Attr_h323disconnectcause.class);
        map.put(Attr_h323voicequality.NAME, Attr_h323voicequality.class);
        map.put(Attr_h323gwid.NAME, Attr_h323gwid.class);
        map.put(Attr_h323incomingconfid.NAME, Attr_h323incomingconfid.class);
        map.put(Attr_CiscoPolicyUp.NAME, Attr_CiscoPolicyUp.class);
        map.put(Attr_CiscoPolicyDown.NAME, Attr_CiscoPolicyDown.class);
        map.put(Attr_sipconfid.NAME, Attr_sipconfid.class);
        map.put(Attr_h323creditamount.NAME, Attr_h323creditamount.class);
        map.put(Attr_h323credittime.NAME, Attr_h323credittime.class);
        map.put(Attr_h323returncode.NAME, Attr_h323returncode.class);
        map.put(Attr_h323promptid.NAME, Attr_h323promptid.class);
        map.put(Attr_h323timeandday.NAME, Attr_h323timeandday.class);
        map.put(Attr_h323redirectnumber.NAME, Attr_h323redirectnumber.class);
        map.put(Attr_h323preferredlang.NAME, Attr_h323preferredlang.class);
        map.put(Attr_h323redirectipaddress.NAME, Attr_h323redirectipaddress.class);
        map.put(Attr_h323billingmodel.NAME, Attr_h323billingmodel.class);
        map.put(Attr_h323currency.NAME, Attr_h323currency.class);
        map.put(Attr_subscriber.NAME, Attr_subscriber.class);
        map.put(Attr_gwrxdcdn.NAME, Attr_gwrxdcdn.class);
        map.put(Attr_gwfinalxlatedcdn.NAME, Attr_gwfinalxlatedcdn.class);
        map.put(Attr_remotemediaaddress.NAME, Attr_remotemediaaddress.class);
        map.put(Attr_releasesource.NAME, Attr_releasesource.class);
        map.put(Attr_gwrxdcgn.NAME, Attr_gwrxdcgn.class);
        map.put(Attr_gwfinalxlatedcgn.NAME, Attr_gwfinalxlatedcgn.class);
        map.put(Attr_callid.NAME, Attr_callid.class);
        map.put(Attr_sessionprotocol.NAME, Attr_sessionprotocol.class);
        map.put(Attr_method.NAME, Attr_method.class);
        map.put(Attr_prevhopvia.NAME, Attr_prevhopvia.class);
        map.put(Attr_prevhopip.NAME, Attr_prevhopip.class);
        map.put(Attr_incomingrequri.NAME, Attr_incomingrequri.class);
        map.put(Attr_outgoingrequri.NAME, Attr_outgoingrequri.class);
        map.put(Attr_nexthopip.NAME, Attr_nexthopip.class);
        map.put(Attr_nexthopdn.NAME, Attr_nexthopdn.class);
        map.put(Attr_siphdr.NAME, Attr_siphdr.class);
        map.put(Attr_CiscoMultilinkID.NAME, Attr_CiscoMultilinkID.class);
        map.put(Attr_CiscoNumInMultilink.NAME, Attr_CiscoNumInMultilink.class);
        map.put(Attr_CiscoPreInputOctets.NAME, Attr_CiscoPreInputOctets.class);
        map.put(Attr_CiscoPreOutputOctets.NAME, Attr_CiscoPreOutputOctets.class);
        map.put(Attr_CiscoPreInputPackets.NAME, Attr_CiscoPreInputPackets.class);
        map.put(Attr_CiscoPreOutputPackets.NAME, Attr_CiscoPreOutputPackets.class);
        map.put(Attr_CiscoMaximumTime.NAME, Attr_CiscoMaximumTime.class);
        map.put(Attr_CiscoDisconnectCause.NAME, Attr_CiscoDisconnectCause.class);
        map.put(Attr_CiscoDataRate.NAME, Attr_CiscoDataRate.class);
        map.put(Attr_CiscoPreSessionTime.NAME, Attr_CiscoPreSessionTime.class);
        map.put(Attr_CiscoPWLifetime.NAME, Attr_CiscoPWLifetime.class);
        map.put(Attr_CiscoIPDirect.NAME, Attr_CiscoIPDirect.class);
        map.put(Attr_CiscoPPPVJSlotComp.NAME, Attr_CiscoPPPVJSlotComp.class);
        map.put(Attr_CiscoPPPAsyncMap.NAME, Attr_CiscoPPPAsyncMap.class);
        map.put(Attr_CiscoIPPoolDefinition.NAME, Attr_CiscoIPPoolDefinition.class);
        map.put(Attr_CiscoAssignIPPool.NAME, Attr_CiscoAssignIPPool.class);
        map.put(Attr_CiscoRouteIP.NAME, Attr_CiscoRouteIP.class);
        map.put(Attr_CiscoLinkCompression.NAME, Attr_CiscoLinkCompression.class);
        map.put(Attr_CiscoTargetUtil.NAME, Attr_CiscoTargetUtil.class);
        map.put(Attr_CiscoMaximumChannels.NAME, Attr_CiscoMaximumChannels.class);
        map.put(Attr_CiscoDataFilter.NAME, Attr_CiscoDataFilter.class);
        map.put(Attr_CiscoCallFilter.NAME, Attr_CiscoCallFilter.class);
        map.put(Attr_CiscoIdleLimit.NAME, Attr_CiscoIdleLimit.class);
        map.put(Attr_CiscoSubscriberPassword.NAME, Attr_CiscoSubscriberPassword.class);
        map.put(Attr_CiscoAccountInfo.NAME, Attr_CiscoAccountInfo.class);
        map.put(Attr_CiscoServiceInfo.NAME, Attr_CiscoServiceInfo.class);
        map.put(Attr_CiscoCommandCode.NAME, Attr_CiscoCommandCode.class);
        map.put(Attr_CiscoControlInfo.NAME, Attr_CiscoControlInfo.class);
        map.put(Attr_CiscoXmitRate.NAME, Attr_CiscoXmitRate.class);
    }
}
// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_freeradius;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_freeradius
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "FreeRADIUS"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_FreeRADIUSProxiedTo.class);
        map.put(new Long(2L), Attr_FreeRADIUSAcctSessionStartTime.class);
        map.put(new Long(127L), Attr_FreeRADIUSStatisticsType.class);
        map.put(new Long(128L), Attr_FreeRADIUSTotalAccessRequests.class);
        map.put(new Long(129L), Attr_FreeRADIUSTotalAccessAccepts.class);
        map.put(new Long(130L), Attr_FreeRADIUSTotalAccessRejects.class);
        map.put(new Long(131L), Attr_FreeRADIUSTotalAccessChallenges.class);
        map.put(new Long(132L), Attr_FreeRADIUSTotalAuthResponses.class);
        map.put(new Long(133L), Attr_FreeRADIUSTotalAuthDuplicateRequests.class);
        map.put(new Long(134L), Attr_FreeRADIUSTotalAuthMalformedRequests.class);
        map.put(new Long(135L), Attr_FreeRADIUSTotalAuthInvalidRequests.class);
        map.put(new Long(136L), Attr_FreeRADIUSTotalAuthDroppedRequests.class);
        map.put(new Long(137L), Attr_FreeRADIUSTotalAuthUnknownTypes.class);
        map.put(new Long(138L), Attr_FreeRADIUSTotalProxyAccessRequests.class);
        map.put(new Long(139L), Attr_FreeRADIUSTotalProxyAccessAccepts.class);
        map.put(new Long(140L), Attr_FreeRADIUSTotalProxyAccessRejects.class);
        map.put(new Long(141L), Attr_FreeRADIUSTotalProxyAccessChallenges.class);
        map.put(new Long(142L), Attr_FreeRADIUSTotalProxyAuthResponses.class);
        map.put(new Long(143L), Attr_FreeRADIUSTotalProxyAuthDuplicateRequests.class);
        map.put(new Long(144L), Attr_FreeRADIUSTotalProxyAuthMalformedRequests.class);
        map.put(new Long(145L), Attr_FreeRADIUSTotalProxyAuthInvalidRequests.class);
        map.put(new Long(146L), Attr_FreeRADIUSTotalProxyAuthDroppedRequests.class);
        map.put(new Long(147L), Attr_FreeRADIUSTotalProxyAuthUnknownTypes.class);
        map.put(new Long(148L), Attr_FreeRADIUSTotalAccountingRequests.class);
        map.put(new Long(149L), Attr_FreeRADIUSTotalAccountingResponses.class);
        map.put(new Long(150L), Attr_FreeRADIUSTotalAcctDuplicateRequests.class);
        map.put(new Long(151L), Attr_FreeRADIUSTotalAcctMalformedRequests.class);
        map.put(new Long(152L), Attr_FreeRADIUSTotalAcctInvalidRequests.class);
        map.put(new Long(153L), Attr_FreeRADIUSTotalAcctDroppedRequests.class);
        map.put(new Long(154L), Attr_FreeRADIUSTotalAcctUnknownTypes.class);
        map.put(new Long(155L), Attr_FreeRADIUSTotalProxyAccountingRequests.class);
        map.put(new Long(156L), Attr_FreeRADIUSTotalProxyAccountingResponses.class);
        map.put(new Long(157L), Attr_FreeRADIUSTotalProxyAcctDuplicateRequests.class);
        map.put(new Long(158L), Attr_FreeRADIUSTotalProxyAcctMalformedRequests.class);
        map.put(new Long(159L), Attr_FreeRADIUSTotalProxyAcctInvalidRequests.class);
        map.put(new Long(160L), Attr_FreeRADIUSTotalProxyAcctDroppedRequests.class);
        map.put(new Long(161L), Attr_FreeRADIUSTotalProxyAcctUnknownTypes.class);
        map.put(new Long(162L), Attr_FreeRADIUSQueueLenInternal.class);
        map.put(new Long(163L), Attr_FreeRADIUSQueueLenProxy.class);
        map.put(new Long(164L), Attr_FreeRADIUSQueueLenAuth.class);
        map.put(new Long(165L), Attr_FreeRADIUSQueueLenAcct.class);
        map.put(new Long(166L), Attr_FreeRADIUSQueueLenDetail.class);
        map.put(new Long(167L), Attr_FreeRADIUSStatsClientIPAddress.class);
        map.put(new Long(168L), Attr_FreeRADIUSStatsClientNumber.class);
        map.put(new Long(169L), Attr_FreeRADIUSStatsClientNetmask.class);
        map.put(new Long(170L), Attr_FreeRADIUSStatsServerIPAddress.class);
        map.put(new Long(171L), Attr_FreeRADIUSStatsServerPort.class);
        map.put(new Long(172L), Attr_FreeRADIUSStatsServerOutstandingRequests.class);
        map.put(new Long(173L), Attr_FreeRADIUSStatsServerState.class);
        map.put(new Long(174L), Attr_FreeRADIUSStatsServerTimeOfDeath.class);
        map.put(new Long(175L), Attr_FreeRADIUSStatsServerTimeOfLife.class);
        map.put(new Long(176L), Attr_FreeRADIUSStatsStartTime.class);
        map.put(new Long(177L), Attr_FreeRADIUSStatsHUPTime.class);
        map.put(new Long(178L), Attr_FreeRADIUSServerEMAWindow.class);
        map.put(new Long(179L), Attr_FreeRADIUSServerEMAUSECWindow1.class);
        map.put(new Long(180L), Attr_FreeRADIUSServerEMAUSECWindow10.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_FreeRADIUSProxiedTo.NAME, Attr_FreeRADIUSProxiedTo.class);
        map.put(Attr_FreeRADIUSAcctSessionStartTime.NAME, Attr_FreeRADIUSAcctSessionStartTime.class);
        map.put(Attr_FreeRADIUSStatisticsType.NAME, Attr_FreeRADIUSStatisticsType.class);
        map.put(Attr_FreeRADIUSTotalAccessRequests.NAME, Attr_FreeRADIUSTotalAccessRequests.class);
        map.put(Attr_FreeRADIUSTotalAccessAccepts.NAME, Attr_FreeRADIUSTotalAccessAccepts.class);
        map.put(Attr_FreeRADIUSTotalAccessRejects.NAME, Attr_FreeRADIUSTotalAccessRejects.class);
        map.put(Attr_FreeRADIUSTotalAccessChallenges.NAME, Attr_FreeRADIUSTotalAccessChallenges.class);
        map.put(Attr_FreeRADIUSTotalAuthResponses.NAME, Attr_FreeRADIUSTotalAuthResponses.class);
        map.put(Attr_FreeRADIUSTotalAuthDuplicateRequests.NAME, Attr_FreeRADIUSTotalAuthDuplicateRequests.class);
        map.put(Attr_FreeRADIUSTotalAuthMalformedRequests.NAME, Attr_FreeRADIUSTotalAuthMalformedRequests.class);
        map.put(Attr_FreeRADIUSTotalAuthInvalidRequests.NAME, Attr_FreeRADIUSTotalAuthInvalidRequests.class);
        map.put(Attr_FreeRADIUSTotalAuthDroppedRequests.NAME, Attr_FreeRADIUSTotalAuthDroppedRequests.class);
        map.put(Attr_FreeRADIUSTotalAuthUnknownTypes.NAME, Attr_FreeRADIUSTotalAuthUnknownTypes.class);
        map.put(Attr_FreeRADIUSTotalProxyAccessRequests.NAME, Attr_FreeRADIUSTotalProxyAccessRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAccessAccepts.NAME, Attr_FreeRADIUSTotalProxyAccessAccepts.class);
        map.put(Attr_FreeRADIUSTotalProxyAccessRejects.NAME, Attr_FreeRADIUSTotalProxyAccessRejects.class);
        map.put(Attr_FreeRADIUSTotalProxyAccessChallenges.NAME, Attr_FreeRADIUSTotalProxyAccessChallenges.class);
        map.put(Attr_FreeRADIUSTotalProxyAuthResponses.NAME, Attr_FreeRADIUSTotalProxyAuthResponses.class);
        map.put(Attr_FreeRADIUSTotalProxyAuthDuplicateRequests.NAME, Attr_FreeRADIUSTotalProxyAuthDuplicateRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAuthMalformedRequests.NAME, Attr_FreeRADIUSTotalProxyAuthMalformedRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAuthInvalidRequests.NAME, Attr_FreeRADIUSTotalProxyAuthInvalidRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAuthDroppedRequests.NAME, Attr_FreeRADIUSTotalProxyAuthDroppedRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAuthUnknownTypes.NAME, Attr_FreeRADIUSTotalProxyAuthUnknownTypes.class);
        map.put(Attr_FreeRADIUSTotalAccountingRequests.NAME, Attr_FreeRADIUSTotalAccountingRequests.class);
        map.put(Attr_FreeRADIUSTotalAccountingResponses.NAME, Attr_FreeRADIUSTotalAccountingResponses.class);
        map.put(Attr_FreeRADIUSTotalAcctDuplicateRequests.NAME, Attr_FreeRADIUSTotalAcctDuplicateRequests.class);
        map.put(Attr_FreeRADIUSTotalAcctMalformedRequests.NAME, Attr_FreeRADIUSTotalAcctMalformedRequests.class);
        map.put(Attr_FreeRADIUSTotalAcctInvalidRequests.NAME, Attr_FreeRADIUSTotalAcctInvalidRequests.class);
        map.put(Attr_FreeRADIUSTotalAcctDroppedRequests.NAME, Attr_FreeRADIUSTotalAcctDroppedRequests.class);
        map.put(Attr_FreeRADIUSTotalAcctUnknownTypes.NAME, Attr_FreeRADIUSTotalAcctUnknownTypes.class);
        map.put(Attr_FreeRADIUSTotalProxyAccountingRequests.NAME, Attr_FreeRADIUSTotalProxyAccountingRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAccountingResponses.NAME, Attr_FreeRADIUSTotalProxyAccountingResponses.class);
        map.put(Attr_FreeRADIUSTotalProxyAcctDuplicateRequests.NAME, Attr_FreeRADIUSTotalProxyAcctDuplicateRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAcctMalformedRequests.NAME, Attr_FreeRADIUSTotalProxyAcctMalformedRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAcctInvalidRequests.NAME, Attr_FreeRADIUSTotalProxyAcctInvalidRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAcctDroppedRequests.NAME, Attr_FreeRADIUSTotalProxyAcctDroppedRequests.class);
        map.put(Attr_FreeRADIUSTotalProxyAcctUnknownTypes.NAME, Attr_FreeRADIUSTotalProxyAcctUnknownTypes.class);
        map.put(Attr_FreeRADIUSQueueLenInternal.NAME, Attr_FreeRADIUSQueueLenInternal.class);
        map.put(Attr_FreeRADIUSQueueLenProxy.NAME, Attr_FreeRADIUSQueueLenProxy.class);
        map.put(Attr_FreeRADIUSQueueLenAuth.NAME, Attr_FreeRADIUSQueueLenAuth.class);
        map.put(Attr_FreeRADIUSQueueLenAcct.NAME, Attr_FreeRADIUSQueueLenAcct.class);
        map.put(Attr_FreeRADIUSQueueLenDetail.NAME, Attr_FreeRADIUSQueueLenDetail.class);
        map.put(Attr_FreeRADIUSStatsClientIPAddress.NAME, Attr_FreeRADIUSStatsClientIPAddress.class);
        map.put(Attr_FreeRADIUSStatsClientNumber.NAME, Attr_FreeRADIUSStatsClientNumber.class);
        map.put(Attr_FreeRADIUSStatsClientNetmask.NAME, Attr_FreeRADIUSStatsClientNetmask.class);
        map.put(Attr_FreeRADIUSStatsServerIPAddress.NAME, Attr_FreeRADIUSStatsServerIPAddress.class);
        map.put(Attr_FreeRADIUSStatsServerPort.NAME, Attr_FreeRADIUSStatsServerPort.class);
        map.put(Attr_FreeRADIUSStatsServerOutstandingRequests.NAME, Attr_FreeRADIUSStatsServerOutstandingRequests.class);
        map.put(Attr_FreeRADIUSStatsServerState.NAME, Attr_FreeRADIUSStatsServerState.class);
        map.put(Attr_FreeRADIUSStatsServerTimeOfDeath.NAME, Attr_FreeRADIUSStatsServerTimeOfDeath.class);
        map.put(Attr_FreeRADIUSStatsServerTimeOfLife.NAME, Attr_FreeRADIUSStatsServerTimeOfLife.class);
        map.put(Attr_FreeRADIUSStatsStartTime.NAME, Attr_FreeRADIUSStatsStartTime.class);
        map.put(Attr_FreeRADIUSStatsHUPTime.NAME, Attr_FreeRADIUSStatsHUPTime.class);
        map.put(Attr_FreeRADIUSServerEMAWindow.NAME, Attr_FreeRADIUSServerEMAWindow.class);
        map.put(Attr_FreeRADIUSServerEMAUSECWindow1.NAME, Attr_FreeRADIUSServerEMAUSECWindow1.class);
        map.put(Attr_FreeRADIUSServerEMAUSECWindow10.NAME, Attr_FreeRADIUSServerEMAUSECWindow10.class);
    }
}
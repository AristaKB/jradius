// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_huawei;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_huawei
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Huawei"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_HuaweiInputBurstSize.class);
        map.put(new Long(2L), Attr_HuaweiInputAverageRate.class);
        map.put(new Long(3L), Attr_HuaweiInputPeakRate.class);
        map.put(new Long(4L), Attr_HuaweiOutputBurstSize.class);
        map.put(new Long(5L), Attr_HuaweiOutputAverageRate.class);
        map.put(new Long(6L), Attr_HuaweiOutputPeakRate.class);
        map.put(new Long(7L), Attr_HuaweiInKbBeforeTSwitch.class);
        map.put(new Long(8L), Attr_HuaweiOutKbBeforeTSwitch.class);
        map.put(new Long(9L), Attr_HuaweiInPktBeforeTSwitch.class);
        map.put(new Long(10L), Attr_HuaweiOutPktBeforeTSwitch.class);
        map.put(new Long(11L), Attr_HuaweiInKbAfterTSwitch.class);
        map.put(new Long(12L), Attr_HuaweiOutKbAfterTSwitch.class);
        map.put(new Long(13L), Attr_HuaweiInPktAfterTSwitch.class);
        map.put(new Long(14L), Attr_HuaweiOutPktAfterTSwitch.class);
        map.put(new Long(15L), Attr_HuaweiRemanentVolume.class);
        map.put(new Long(16L), Attr_HuaweiTariffSwitchInterval.class);
        map.put(new Long(17L), Attr_HuaweiISPID.class);
        map.put(new Long(18L), Attr_HuaweiMaxUsersPerLogicPort.class);
        map.put(new Long(20L), Attr_HuaweiCommand.class);
        map.put(new Long(22L), Attr_HuaweiPriority.class);
        map.put(new Long(24L), Attr_HuaweiControlIdentifier.class);
        map.put(new Long(25L), Attr_HuaweiResultCode.class);
        map.put(new Long(26L), Attr_HuaweiConnectID.class);
        map.put(new Long(27L), Attr_HuaweiPortalURL.class);
        map.put(new Long(28L), Attr_HuaweiFTPDirectory.class);
        map.put(new Long(29L), Attr_HuaweiExecPrivilege.class);
        map.put(new Long(30L), Attr_HuaweiIPAddress.class);
        map.put(new Long(31L), Attr_HuaweiQosProfileName.class);
        map.put(new Long(39L), Attr_HuaweiDestnationIPAddr.class);
        map.put(new Long(40L), Attr_HuaweiDestnationVolume.class);
        map.put(new Long(59L), Attr_HuaweiStartupStamp.class);
        map.put(new Long(60L), Attr_HuaweiIPHostAddr.class);
        map.put(new Long(64L), Attr_HuaweiVTName.class);
        map.put(new Long(70L), Attr_HuaweiPPPNCPType.class);
        map.put(new Long(71L), Attr_HuaweiVSIName.class);
        map.put(new Long(72L), Attr_HuaweiSubnetMask.class);
        map.put(new Long(73L), Attr_HuaweiGatewayAddress.class);
        map.put(new Long(74L), Attr_HuaweiLeaseTime.class);
        map.put(new Long(75L), Attr_HuaweiPrimaryWINS.class);
        map.put(new Long(76L), Attr_HuaweiSecondaryWINS.class);
        map.put(new Long(77L), Attr_HuaweiInputPeakBurstSize.class);
        map.put(new Long(78L), Attr_HuaweiOutputPeakBurstSize.class);
        map.put(new Long(79L), Attr_HuaweiReducedCIR.class);
        map.put(new Long(80L), Attr_HuaweiTunnelSessionLimit.class);
        map.put(new Long(81L), Attr_HuaweiZoneName.class);
        map.put(new Long(82L), Attr_HuaweiDataFilter.class);
        map.put(new Long(83L), Attr_HuaweiAccessService.class);
        map.put(new Long(84L), Attr_HuaweiHWAccountingLevel.class);
        map.put(new Long(85L), Attr_HuaweiHWPortalMode.class);
        map.put(new Long(86L), Attr_HuaweiHWDPIPolicyName.class);
        map.put(new Long(87L), Attr_huaweiPolicyRoute.class);
        map.put(new Long(88L), Attr_HuaweiFramedPool.class);
        map.put(new Long(89L), Attr_HuaweiHWL2TPTerminateCause.class);
        map.put(new Long(90L), Attr_HuaweiHWMultiAccountMode.class);
        map.put(new Long(91L), Attr_HuaweiQueueProfile.class);
        map.put(new Long(92L), Attr_HuaweiLayer4SessionLimit.class);
        map.put(new Long(93L), Attr_HuaweiMulticastProfile.class);
        map.put(new Long(94L), Attr_HuaweiVPNInstance.class);
        map.put(new Long(95L), Attr_HuaweiPolicyName.class);
        map.put(new Long(96L), Attr_HuaweiTunnelGroupName.class);
        map.put(new Long(97L), Attr_HuaweiMulticastSourceGroup.class);
        map.put(new Long(98L), Attr_HuaweiMulticastReceiveGroup.class);
        map.put(new Long(99L), Attr_HuaweiUserMulticastType.class);
        map.put(new Long(100L), Attr_HuaweiReducedPIR.class);
        map.put(new Long(101L), Attr_HuaweiLIID.class);
        map.put(new Long(102L), Attr_HuaweiLIMdAddress.class);
        map.put(new Long(103L), Attr_HuaweiLIMdPort.class);
        map.put(new Long(104L), Attr_HuaweiLIMdVpnInstance.class);
        map.put(new Long(105L), Attr_HuaweiServiceChgCmd.class);
        map.put(new Long(106L), Attr_HuaweiAcctPacketType.class);
        map.put(new Long(107L), Attr_HuaweiCallReference.class);
        map.put(new Long(108L), Attr_HuaweiPSTNPort.class);
        map.put(new Long(109L), Attr_HuaweiVoipServiceType.class);
        map.put(new Long(110L), Attr_HuaweiAcctConnectionTime.class);
        map.put(new Long(112L), Attr_HuaweiErrorReason.class);
        map.put(new Long(113L), Attr_HuaweiRemainMonney.class);
        map.put(new Long(123L), Attr_HuaweiOrgGKipaddr.class);
        map.put(new Long(124L), Attr_HuaweiOrgGWipaddr.class);
        map.put(new Long(125L), Attr_HuaweiDstGKipaddr.class);
        map.put(new Long(126L), Attr_HuaweiDstGWipaddr.class);
        map.put(new Long(127L), Attr_HuaweiAccessNum.class);
        map.put(new Long(128L), Attr_HuaweiRemainTime.class);
        map.put(new Long(131L), Attr_HuaweiCodecType.class);
        map.put(new Long(132L), Attr_HuaweiTransferNum.class);
        map.put(new Long(133L), Attr_HuaweiNewUserName.class);
        map.put(new Long(134L), Attr_HuaweiTransferStationId.class);
        map.put(new Long(135L), Attr_HuaweiPrimaryDNS.class);
        map.put(new Long(136L), Attr_HuaweiSecondaryDNS.class);
        map.put(new Long(137L), Attr_HuaweiONLYAccountType.class);
        map.put(new Long(138L), Attr_HuaweiDomainName.class);
        map.put(new Long(139L), Attr_HuaweiANCPProfile.class);
        map.put(new Long(140L), Attr_HuaweiHTTPRedirectURL.class);
        map.put(new Long(141L), Attr_HuaweiLoopbackAddress.class);
        map.put(new Long(142L), Attr_HuaweiQoSProfileType.class);
        map.put(new Long(143L), Attr_HuaweiHWMaxListNum.class);
        map.put(new Long(254L), Attr_HuaweiVersion.class);
        map.put(new Long(255L), Attr_HuaweiProductID.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_HuaweiInputBurstSize.NAME, Attr_HuaweiInputBurstSize.class);
        map.put(Attr_HuaweiInputAverageRate.NAME, Attr_HuaweiInputAverageRate.class);
        map.put(Attr_HuaweiInputPeakRate.NAME, Attr_HuaweiInputPeakRate.class);
        map.put(Attr_HuaweiOutputBurstSize.NAME, Attr_HuaweiOutputBurstSize.class);
        map.put(Attr_HuaweiOutputAverageRate.NAME, Attr_HuaweiOutputAverageRate.class);
        map.put(Attr_HuaweiOutputPeakRate.NAME, Attr_HuaweiOutputPeakRate.class);
        map.put(Attr_HuaweiInKbBeforeTSwitch.NAME, Attr_HuaweiInKbBeforeTSwitch.class);
        map.put(Attr_HuaweiOutKbBeforeTSwitch.NAME, Attr_HuaweiOutKbBeforeTSwitch.class);
        map.put(Attr_HuaweiInPktBeforeTSwitch.NAME, Attr_HuaweiInPktBeforeTSwitch.class);
        map.put(Attr_HuaweiOutPktBeforeTSwitch.NAME, Attr_HuaweiOutPktBeforeTSwitch.class);
        map.put(Attr_HuaweiInKbAfterTSwitch.NAME, Attr_HuaweiInKbAfterTSwitch.class);
        map.put(Attr_HuaweiOutKbAfterTSwitch.NAME, Attr_HuaweiOutKbAfterTSwitch.class);
        map.put(Attr_HuaweiInPktAfterTSwitch.NAME, Attr_HuaweiInPktAfterTSwitch.class);
        map.put(Attr_HuaweiOutPktAfterTSwitch.NAME, Attr_HuaweiOutPktAfterTSwitch.class);
        map.put(Attr_HuaweiRemanentVolume.NAME, Attr_HuaweiRemanentVolume.class);
        map.put(Attr_HuaweiTariffSwitchInterval.NAME, Attr_HuaweiTariffSwitchInterval.class);
        map.put(Attr_HuaweiISPID.NAME, Attr_HuaweiISPID.class);
        map.put(Attr_HuaweiMaxUsersPerLogicPort.NAME, Attr_HuaweiMaxUsersPerLogicPort.class);
        map.put(Attr_HuaweiCommand.NAME, Attr_HuaweiCommand.class);
        map.put(Attr_HuaweiPriority.NAME, Attr_HuaweiPriority.class);
        map.put(Attr_HuaweiControlIdentifier.NAME, Attr_HuaweiControlIdentifier.class);
        map.put(Attr_HuaweiResultCode.NAME, Attr_HuaweiResultCode.class);
        map.put(Attr_HuaweiConnectID.NAME, Attr_HuaweiConnectID.class);
        map.put(Attr_HuaweiPortalURL.NAME, Attr_HuaweiPortalURL.class);
        map.put(Attr_HuaweiFTPDirectory.NAME, Attr_HuaweiFTPDirectory.class);
        map.put(Attr_HuaweiExecPrivilege.NAME, Attr_HuaweiExecPrivilege.class);
        map.put(Attr_HuaweiIPAddress.NAME, Attr_HuaweiIPAddress.class);
        map.put(Attr_HuaweiQosProfileName.NAME, Attr_HuaweiQosProfileName.class);
        map.put(Attr_HuaweiDestnationIPAddr.NAME, Attr_HuaweiDestnationIPAddr.class);
        map.put(Attr_HuaweiDestnationVolume.NAME, Attr_HuaweiDestnationVolume.class);
        map.put(Attr_HuaweiStartupStamp.NAME, Attr_HuaweiStartupStamp.class);
        map.put(Attr_HuaweiIPHostAddr.NAME, Attr_HuaweiIPHostAddr.class);
        map.put(Attr_HuaweiVTName.NAME, Attr_HuaweiVTName.class);
        map.put(Attr_HuaweiPPPNCPType.NAME, Attr_HuaweiPPPNCPType.class);
        map.put(Attr_HuaweiVSIName.NAME, Attr_HuaweiVSIName.class);
        map.put(Attr_HuaweiSubnetMask.NAME, Attr_HuaweiSubnetMask.class);
        map.put(Attr_HuaweiGatewayAddress.NAME, Attr_HuaweiGatewayAddress.class);
        map.put(Attr_HuaweiLeaseTime.NAME, Attr_HuaweiLeaseTime.class);
        map.put(Attr_HuaweiPrimaryWINS.NAME, Attr_HuaweiPrimaryWINS.class);
        map.put(Attr_HuaweiSecondaryWINS.NAME, Attr_HuaweiSecondaryWINS.class);
        map.put(Attr_HuaweiInputPeakBurstSize.NAME, Attr_HuaweiInputPeakBurstSize.class);
        map.put(Attr_HuaweiOutputPeakBurstSize.NAME, Attr_HuaweiOutputPeakBurstSize.class);
        map.put(Attr_HuaweiReducedCIR.NAME, Attr_HuaweiReducedCIR.class);
        map.put(Attr_HuaweiTunnelSessionLimit.NAME, Attr_HuaweiTunnelSessionLimit.class);
        map.put(Attr_HuaweiZoneName.NAME, Attr_HuaweiZoneName.class);
        map.put(Attr_HuaweiDataFilter.NAME, Attr_HuaweiDataFilter.class);
        map.put(Attr_HuaweiAccessService.NAME, Attr_HuaweiAccessService.class);
        map.put(Attr_HuaweiHWAccountingLevel.NAME, Attr_HuaweiHWAccountingLevel.class);
        map.put(Attr_HuaweiHWPortalMode.NAME, Attr_HuaweiHWPortalMode.class);
        map.put(Attr_HuaweiHWDPIPolicyName.NAME, Attr_HuaweiHWDPIPolicyName.class);
        map.put(Attr_huaweiPolicyRoute.NAME, Attr_huaweiPolicyRoute.class);
        map.put(Attr_HuaweiFramedPool.NAME, Attr_HuaweiFramedPool.class);
        map.put(Attr_HuaweiHWL2TPTerminateCause.NAME, Attr_HuaweiHWL2TPTerminateCause.class);
        map.put(Attr_HuaweiHWMultiAccountMode.NAME, Attr_HuaweiHWMultiAccountMode.class);
        map.put(Attr_HuaweiQueueProfile.NAME, Attr_HuaweiQueueProfile.class);
        map.put(Attr_HuaweiLayer4SessionLimit.NAME, Attr_HuaweiLayer4SessionLimit.class);
        map.put(Attr_HuaweiMulticastProfile.NAME, Attr_HuaweiMulticastProfile.class);
        map.put(Attr_HuaweiVPNInstance.NAME, Attr_HuaweiVPNInstance.class);
        map.put(Attr_HuaweiPolicyName.NAME, Attr_HuaweiPolicyName.class);
        map.put(Attr_HuaweiTunnelGroupName.NAME, Attr_HuaweiTunnelGroupName.class);
        map.put(Attr_HuaweiMulticastSourceGroup.NAME, Attr_HuaweiMulticastSourceGroup.class);
        map.put(Attr_HuaweiMulticastReceiveGroup.NAME, Attr_HuaweiMulticastReceiveGroup.class);
        map.put(Attr_HuaweiUserMulticastType.NAME, Attr_HuaweiUserMulticastType.class);
        map.put(Attr_HuaweiReducedPIR.NAME, Attr_HuaweiReducedPIR.class);
        map.put(Attr_HuaweiLIID.NAME, Attr_HuaweiLIID.class);
        map.put(Attr_HuaweiLIMdAddress.NAME, Attr_HuaweiLIMdAddress.class);
        map.put(Attr_HuaweiLIMdPort.NAME, Attr_HuaweiLIMdPort.class);
        map.put(Attr_HuaweiLIMdVpnInstance.NAME, Attr_HuaweiLIMdVpnInstance.class);
        map.put(Attr_HuaweiServiceChgCmd.NAME, Attr_HuaweiServiceChgCmd.class);
        map.put(Attr_HuaweiAcctPacketType.NAME, Attr_HuaweiAcctPacketType.class);
        map.put(Attr_HuaweiCallReference.NAME, Attr_HuaweiCallReference.class);
        map.put(Attr_HuaweiPSTNPort.NAME, Attr_HuaweiPSTNPort.class);
        map.put(Attr_HuaweiVoipServiceType.NAME, Attr_HuaweiVoipServiceType.class);
        map.put(Attr_HuaweiAcctConnectionTime.NAME, Attr_HuaweiAcctConnectionTime.class);
        map.put(Attr_HuaweiErrorReason.NAME, Attr_HuaweiErrorReason.class);
        map.put(Attr_HuaweiRemainMonney.NAME, Attr_HuaweiRemainMonney.class);
        map.put(Attr_HuaweiOrgGKipaddr.NAME, Attr_HuaweiOrgGKipaddr.class);
        map.put(Attr_HuaweiOrgGWipaddr.NAME, Attr_HuaweiOrgGWipaddr.class);
        map.put(Attr_HuaweiDstGKipaddr.NAME, Attr_HuaweiDstGKipaddr.class);
        map.put(Attr_HuaweiDstGWipaddr.NAME, Attr_HuaweiDstGWipaddr.class);
        map.put(Attr_HuaweiAccessNum.NAME, Attr_HuaweiAccessNum.class);
        map.put(Attr_HuaweiRemainTime.NAME, Attr_HuaweiRemainTime.class);
        map.put(Attr_HuaweiCodecType.NAME, Attr_HuaweiCodecType.class);
        map.put(Attr_HuaweiTransferNum.NAME, Attr_HuaweiTransferNum.class);
        map.put(Attr_HuaweiNewUserName.NAME, Attr_HuaweiNewUserName.class);
        map.put(Attr_HuaweiTransferStationId.NAME, Attr_HuaweiTransferStationId.class);
        map.put(Attr_HuaweiPrimaryDNS.NAME, Attr_HuaweiPrimaryDNS.class);
        map.put(Attr_HuaweiSecondaryDNS.NAME, Attr_HuaweiSecondaryDNS.class);
        map.put(Attr_HuaweiONLYAccountType.NAME, Attr_HuaweiONLYAccountType.class);
        map.put(Attr_HuaweiDomainName.NAME, Attr_HuaweiDomainName.class);
        map.put(Attr_HuaweiANCPProfile.NAME, Attr_HuaweiANCPProfile.class);
        map.put(Attr_HuaweiHTTPRedirectURL.NAME, Attr_HuaweiHTTPRedirectURL.class);
        map.put(Attr_HuaweiLoopbackAddress.NAME, Attr_HuaweiLoopbackAddress.class);
        map.put(Attr_HuaweiQoSProfileType.NAME, Attr_HuaweiQoSProfileType.class);
        map.put(Attr_HuaweiHWMaxListNum.NAME, Attr_HuaweiHWMaxListNum.class);
        map.put(Attr_HuaweiVersion.NAME, Attr_HuaweiVersion.class);
        map.put(Attr_HuaweiProductID.NAME, Attr_HuaweiProductID.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_starent;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_starent
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Starent"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_SNVPNID.class);
        map.put(new Long(2L), Attr_SNVPNName.class);
        map.put(new Long(3L), Attr_SNDisconnectReason.class);
        map.put(new Long(4L), Attr_SNPPPProgressCode.class);
        map.put(new Long(5L), Attr_SNPrimaryDNSServer.class);
        map.put(new Long(6L), Attr_SNSecondaryDNSServer.class);
        map.put(new Long(7L), Attr_SNReCHAPInterval.class);
        map.put(new Long(8L), Attr_SNIPPoolName.class);
        map.put(new Long(9L), Attr_SNPPPDataCompression.class);
        map.put(new Long(10L), Attr_SNIPFilterIn.class);
        map.put(new Long(11L), Attr_SNIPFilterOut.class);
        map.put(new Long(13L), Attr_SNLocalIPAddress.class);
        map.put(new Long(14L), Attr_SNIPSourceValidation.class);
        map.put(new Long(15L), Attr_SNPPPOutboundPassword.class);
        map.put(new Long(16L), Attr_SNPPPKeepalive.class);
        map.put(new Long(17L), Attr_SNIPInACL.class);
        map.put(new Long(18L), Attr_SNIPOutACL.class);
        map.put(new Long(19L), Attr_SNPPPDataCompressionMode.class);
        map.put(new Long(20L), Attr_SNSubscriberPermission.class);
        map.put(new Long(21L), Attr_SNAdminPermission.class);
        map.put(new Long(22L), Attr_SNSimultaneousSIPMIP.class);
        map.put(new Long(23L), Attr_SNMinCompressSize.class);
        map.put(new Long(200L), Attr_SNAPPPUnfrdataInOct.class);
        map.put(new Long(201L), Attr_SNAPPPUnfrdataOutOct.class);
        map.put(new Long(1001L), Attr_SNAPPPCtrlInputOctets.class);
        map.put(new Long(1002L), Attr_SNAPPPCtrlOutputOctets.class);
        map.put(new Long(1003L), Attr_SNAPPPCtrlInputPackets.class);
        map.put(new Long(1004L), Attr_SNAPPPCtrlOutputPackets.class);
        map.put(new Long(1005L), Attr_SNAPPPFramedInputOctets.class);
        map.put(new Long(1006L), Attr_SNAPPPFramedOutputOctets.class);
        map.put(new Long(1007L), Attr_SNAPPPDiscardsInput.class);
        map.put(new Long(1008L), Attr_SNAPPPDiscardsOutput.class);
        map.put(new Long(1009L), Attr_SNAPPPErrorsInput.class);
        map.put(new Long(1010L), Attr_SNAPPPErrorsOutput.class);
        map.put(new Long(1011L), Attr_SNAPPPBadAddr.class);
        map.put(new Long(1012L), Attr_SNAPPPBadCtrl.class);
        map.put(new Long(1013L), Attr_SNAPPPPacketTooLong.class);
        map.put(new Long(1014L), Attr_SNAPPPBadFCS.class);
        map.put(new Long(1015L), Attr_SNAPPPEchoReqInput.class);
        map.put(new Long(1016L), Attr_SNAPPPEchoReqOutput.class);
        map.put(new Long(1017L), Attr_SNAPPPEchoRspInput.class);
        map.put(new Long(1018L), Attr_SNAPPPEchoRspOutput.class);
        map.put(new Long(1019L), Attr_SNARPRRQRcvdTotal.class);
        map.put(new Long(1020L), Attr_SNARPRRQRcvdAccReg.class);
        map.put(new Long(1021L), Attr_SNARPRRQRcvdAccDereg.class);
        map.put(new Long(1022L), Attr_SNARPRRQRcvdMsgAuthFail.class);
        map.put(new Long(1023L), Attr_SNARPRRQRcvdMisID.class);
        map.put(new Long(1024L), Attr_SNARPRRQRcvdBadlyFormed.class);
        map.put(new Long(1025L), Attr_SNARPRRQRcvdVIDUnsupported.class);
        map.put(new Long(1026L), Attr_SNARPRRQRcvdTBitNotSet.class);
        map.put(new Long(1027L), Attr_SNARPRAKRcvdTotal.class);
        map.put(new Long(1028L), Attr_SNARPRAKRcvdAccAck.class);
        map.put(new Long(1029L), Attr_SNARPRAKRcvdMsgAuthFail.class);
        map.put(new Long(1030L), Attr_SNARPRAKRcvdMisID.class);
        map.put(new Long(1031L), Attr_SNARPRegReplySentTotal.class);
        map.put(new Long(1032L), Attr_SNARPRegReplySentAccReg.class);
        map.put(new Long(1033L), Attr_SNARPRegReplySentAccDereg.class);
        map.put(new Long(1034L), Attr_SNARPRegReplySentBadReq.class);
        map.put(new Long(1035L), Attr_SNARPRegReplySentDenied.class);
        map.put(new Long(1036L), Attr_SNARPRegReplySentMisID.class);
        map.put(new Long(1037L), Attr_SNARPRegReplySentSendErr.class);
        map.put(new Long(1038L), Attr_SNARPRegUpdSent.class);
        map.put(new Long(1039L), Attr_SNARPRegUpdReSent.class);
        map.put(new Long(1040L), Attr_SNARPRegUpdSendErr.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_SNVPNID.NAME, Attr_SNVPNID.class);
        map.put(Attr_SNVPNName.NAME, Attr_SNVPNName.class);
        map.put(Attr_SNDisconnectReason.NAME, Attr_SNDisconnectReason.class);
        map.put(Attr_SNPPPProgressCode.NAME, Attr_SNPPPProgressCode.class);
        map.put(Attr_SNPrimaryDNSServer.NAME, Attr_SNPrimaryDNSServer.class);
        map.put(Attr_SNSecondaryDNSServer.NAME, Attr_SNSecondaryDNSServer.class);
        map.put(Attr_SNReCHAPInterval.NAME, Attr_SNReCHAPInterval.class);
        map.put(Attr_SNIPPoolName.NAME, Attr_SNIPPoolName.class);
        map.put(Attr_SNPPPDataCompression.NAME, Attr_SNPPPDataCompression.class);
        map.put(Attr_SNIPFilterIn.NAME, Attr_SNIPFilterIn.class);
        map.put(Attr_SNIPFilterOut.NAME, Attr_SNIPFilterOut.class);
        map.put(Attr_SNLocalIPAddress.NAME, Attr_SNLocalIPAddress.class);
        map.put(Attr_SNIPSourceValidation.NAME, Attr_SNIPSourceValidation.class);
        map.put(Attr_SNPPPOutboundPassword.NAME, Attr_SNPPPOutboundPassword.class);
        map.put(Attr_SNPPPKeepalive.NAME, Attr_SNPPPKeepalive.class);
        map.put(Attr_SNIPInACL.NAME, Attr_SNIPInACL.class);
        map.put(Attr_SNIPOutACL.NAME, Attr_SNIPOutACL.class);
        map.put(Attr_SNPPPDataCompressionMode.NAME, Attr_SNPPPDataCompressionMode.class);
        map.put(Attr_SNSubscriberPermission.NAME, Attr_SNSubscriberPermission.class);
        map.put(Attr_SNAdminPermission.NAME, Attr_SNAdminPermission.class);
        map.put(Attr_SNSimultaneousSIPMIP.NAME, Attr_SNSimultaneousSIPMIP.class);
        map.put(Attr_SNMinCompressSize.NAME, Attr_SNMinCompressSize.class);
        map.put(Attr_SNAPPPUnfrdataInOct.NAME, Attr_SNAPPPUnfrdataInOct.class);
        map.put(Attr_SNAPPPUnfrdataOutOct.NAME, Attr_SNAPPPUnfrdataOutOct.class);
        map.put(Attr_SNAPPPCtrlInputOctets.NAME, Attr_SNAPPPCtrlInputOctets.class);
        map.put(Attr_SNAPPPCtrlOutputOctets.NAME, Attr_SNAPPPCtrlOutputOctets.class);
        map.put(Attr_SNAPPPCtrlInputPackets.NAME, Attr_SNAPPPCtrlInputPackets.class);
        map.put(Attr_SNAPPPCtrlOutputPackets.NAME, Attr_SNAPPPCtrlOutputPackets.class);
        map.put(Attr_SNAPPPFramedInputOctets.NAME, Attr_SNAPPPFramedInputOctets.class);
        map.put(Attr_SNAPPPFramedOutputOctets.NAME, Attr_SNAPPPFramedOutputOctets.class);
        map.put(Attr_SNAPPPDiscardsInput.NAME, Attr_SNAPPPDiscardsInput.class);
        map.put(Attr_SNAPPPDiscardsOutput.NAME, Attr_SNAPPPDiscardsOutput.class);
        map.put(Attr_SNAPPPErrorsInput.NAME, Attr_SNAPPPErrorsInput.class);
        map.put(Attr_SNAPPPErrorsOutput.NAME, Attr_SNAPPPErrorsOutput.class);
        map.put(Attr_SNAPPPBadAddr.NAME, Attr_SNAPPPBadAddr.class);
        map.put(Attr_SNAPPPBadCtrl.NAME, Attr_SNAPPPBadCtrl.class);
        map.put(Attr_SNAPPPPacketTooLong.NAME, Attr_SNAPPPPacketTooLong.class);
        map.put(Attr_SNAPPPBadFCS.NAME, Attr_SNAPPPBadFCS.class);
        map.put(Attr_SNAPPPEchoReqInput.NAME, Attr_SNAPPPEchoReqInput.class);
        map.put(Attr_SNAPPPEchoReqOutput.NAME, Attr_SNAPPPEchoReqOutput.class);
        map.put(Attr_SNAPPPEchoRspInput.NAME, Attr_SNAPPPEchoRspInput.class);
        map.put(Attr_SNAPPPEchoRspOutput.NAME, Attr_SNAPPPEchoRspOutput.class);
        map.put(Attr_SNARPRRQRcvdTotal.NAME, Attr_SNARPRRQRcvdTotal.class);
        map.put(Attr_SNARPRRQRcvdAccReg.NAME, Attr_SNARPRRQRcvdAccReg.class);
        map.put(Attr_SNARPRRQRcvdAccDereg.NAME, Attr_SNARPRRQRcvdAccDereg.class);
        map.put(Attr_SNARPRRQRcvdMsgAuthFail.NAME, Attr_SNARPRRQRcvdMsgAuthFail.class);
        map.put(Attr_SNARPRRQRcvdMisID.NAME, Attr_SNARPRRQRcvdMisID.class);
        map.put(Attr_SNARPRRQRcvdBadlyFormed.NAME, Attr_SNARPRRQRcvdBadlyFormed.class);
        map.put(Attr_SNARPRRQRcvdVIDUnsupported.NAME, Attr_SNARPRRQRcvdVIDUnsupported.class);
        map.put(Attr_SNARPRRQRcvdTBitNotSet.NAME, Attr_SNARPRRQRcvdTBitNotSet.class);
        map.put(Attr_SNARPRAKRcvdTotal.NAME, Attr_SNARPRAKRcvdTotal.class);
        map.put(Attr_SNARPRAKRcvdAccAck.NAME, Attr_SNARPRAKRcvdAccAck.class);
        map.put(Attr_SNARPRAKRcvdMsgAuthFail.NAME, Attr_SNARPRAKRcvdMsgAuthFail.class);
        map.put(Attr_SNARPRAKRcvdMisID.NAME, Attr_SNARPRAKRcvdMisID.class);
        map.put(Attr_SNARPRegReplySentTotal.NAME, Attr_SNARPRegReplySentTotal.class);
        map.put(Attr_SNARPRegReplySentAccReg.NAME, Attr_SNARPRegReplySentAccReg.class);
        map.put(Attr_SNARPRegReplySentAccDereg.NAME, Attr_SNARPRegReplySentAccDereg.class);
        map.put(Attr_SNARPRegReplySentBadReq.NAME, Attr_SNARPRegReplySentBadReq.class);
        map.put(Attr_SNARPRegReplySentDenied.NAME, Attr_SNARPRegReplySentDenied.class);
        map.put(Attr_SNARPRegReplySentMisID.NAME, Attr_SNARPRegReplySentMisID.class);
        map.put(Attr_SNARPRegReplySentSendErr.NAME, Attr_SNARPRegReplySentSendErr.class);
        map.put(Attr_SNARPRegUpdSent.NAME, Attr_SNARPRegUpdSent.class);
        map.put(Attr_SNARPRegUpdReSent.NAME, Attr_SNARPRegUpdReSent.class);
        map.put(Attr_SNARPRegUpdSendErr.NAME, Attr_SNARPRegUpdSendErr.class);
    }
}

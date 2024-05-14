// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-Failure-to-Connect-Reason<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x0069<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> dtrDrop (1)
 * <li> escapeSequence (2)
 * <li> athCommand (3)
 * <li> carrierLoss (4)
 * <li> inactivityTimout (5)
 * <li> mnpIncompatible (6)
 * <li> undefined (7)
 * <li> remotePassword (8)
 * <li> linkPassword (9)
 * <li> retransmitLimit (10)
 * <li> linkDisconnectMsgRec (11)
 * <li> noLoopCurrent (12)
 * <li> invalidSpeed (13)
 * <li> unableToRetrain (14)
 * <li> managementCommand (15)
 * <li> noDialTone (16)
 * <li> keyAbort (17)
 * <li> lineBusy (18)
 * <li> noAnswer (19)
 * <li> voice (20)
 * <li> noAnswerTone (21)
 * <li> noCarrier (22)
 * <li> undetermined (23)
 * <li> v42SabmeTimeout (24)
 * <li> v42BreakTimeout (25)
 * <li> v42DisconnectCmd (26)
 * <li> v42IdExchangeFail (27)
 * <li> v42BadSetup (28)
 * <li> v42InvalidCodeWord (29)
 * <li> v42StringToLong (30)
 * <li> v42InvalidCommand (31)
 * <li> none (32)
 * <li> v32Cleardown (33)
 * <li> dialSecurity (34)
 * <li> remoteAccessDenied (35)
 * <li> loopLoss (36)
 * <li> ds0Teardown (37)
 * <li> promptNotEnabled (38)
 * <li> noPromptingInSync (39)
 * <li> nonArqMode (40)
 * <li> modeIncompatible (41)
 * <li> noPromptInNonARQ (42)
 * <li> dialBackLink (43)
 * <li> linkAbort (44)
 * <li> autopassFailed (45)
 * <li> pbGenericError (46)
 * <li> pbLinkErrTxPreAck (47)
 * <li> pbLinkErrTxTardyACK (48)
 * <li> pbTransmitBusTimeout (49)
 * <li> pbReceiveBusTimeout (50)
 * <li> pbLinkErrTxTAL (51)
 * <li> pbLinkErrRxTAL (52)
 * <li> pbTransmitMasterTimeout (53)
 * <li> pbClockMissing (54)
 * <li> pbReceivedLsWhileLinkUp (55)
 * <li> pbOutOfSequenceFrame (56)
 * <li> pbBadFrame (57)
 * <li> pbAckWaitTimeout (58)
 * <li> pbReceivedAckSeqErr (59)
 * <li> pbReceiveOvrflwRNRFail (60)
 * <li> pbReceiveMsgBufOvrflw (61)
 * <li> rcvdGatewayDiscCmd (62)
 * <li> tokenPassingTimeout (63)
 * <li> dspInterruptTimeout (64)
 * <li> mnpProtocolViolation (65)
 * <li> class2FaxHangupCmd (66)
 * <li> hstSpeedSwitchTimeout (67)
 * <li> tooManyUnacked (68)
 * <li> timerExpired (69)
 * <li> t1Glare (70)
 * <li> priDialoutRqTimeout (71)
 * <li> abortAnlgDstOvrIsdn (72)
 * <li> normalUserCallClear (73)
 * <li> normalUnspecified (74)
 * <li> bearerIncompatibility (75)
 * <li> protocolErrorEvent (76)
 * <li> abnormalDisconnect (77)
 * <li> invalidCauseValue (78)
 * <li> resourceUnavailable (79)
 * <li> remoteHungUpDuringTraining (80)
 * <li> trainingTimeout (81)
 * <li> incomingModemNotAvailable (82)
 * <li> incomingInvalidBearerCap (83)
 * <li> incomingInvalidChannelID (84)
 * <li> incomingInvalidProgInd (85)
 * <li> incomingInvalidCallingPty (86)
 * <li> incomingInvalidCalledPty (87)
 * <li> incomingCallBlock (88)
 * <li> incomingLoopStNoRingOff (89)
 * <li> outgoingTelcoDisconnect (90)
 * <li> outgoingEMWinkTimeout (91)
 * <li> outgoingEMWinkTooShort (92)
 * <li> outgoingNoChannelAvail (93)
 * <li> dspReboot (94)
 * <li> noDSPRespToKA (95)
 * <li> noDSPRespToDisc (96)
 * <li> dspTailPtrInvalid (97)
 * <li> dspHeadPtrInvalid (98)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRFailuretoConnectReason extends VSAttribute
{
    public static final String NAME = "USR-Failure-to-Connect-Reason";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x0069;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long dtrDrop = new Long(1L);
    public static final Long escapeSequence = new Long(2L);
    public static final Long athCommand = new Long(3L);
    public static final Long carrierLoss = new Long(4L);
    public static final Long inactivityTimout = new Long(5L);
    public static final Long mnpIncompatible = new Long(6L);
    public static final Long undefined = new Long(7L);
    public static final Long remotePassword = new Long(8L);
    public static final Long linkPassword = new Long(9L);
    public static final Long retransmitLimit = new Long(10L);
    public static final Long linkDisconnectMsgRec = new Long(11L);
    public static final Long noLoopCurrent = new Long(12L);
    public static final Long invalidSpeed = new Long(13L);
    public static final Long unableToRetrain = new Long(14L);
    public static final Long managementCommand = new Long(15L);
    public static final Long noDialTone = new Long(16L);
    public static final Long keyAbort = new Long(17L);
    public static final Long lineBusy = new Long(18L);
    public static final Long noAnswer = new Long(19L);
    public static final Long voice = new Long(20L);
    public static final Long noAnswerTone = new Long(21L);
    public static final Long noCarrier = new Long(22L);
    public static final Long undetermined = new Long(23L);
    public static final Long v42SabmeTimeout = new Long(24L);
    public static final Long v42BreakTimeout = new Long(25L);
    public static final Long v42DisconnectCmd = new Long(26L);
    public static final Long v42IdExchangeFail = new Long(27L);
    public static final Long v42BadSetup = new Long(28L);
    public static final Long v42InvalidCodeWord = new Long(29L);
    public static final Long v42StringToLong = new Long(30L);
    public static final Long v42InvalidCommand = new Long(31L);
    public static final Long none = new Long(32L);
    public static final Long v32Cleardown = new Long(33L);
    public static final Long dialSecurity = new Long(34L);
    public static final Long remoteAccessDenied = new Long(35L);
    public static final Long loopLoss = new Long(36L);
    public static final Long ds0Teardown = new Long(37L);
    public static final Long promptNotEnabled = new Long(38L);
    public static final Long noPromptingInSync = new Long(39L);
    public static final Long nonArqMode = new Long(40L);
    public static final Long modeIncompatible = new Long(41L);
    public static final Long noPromptInNonARQ = new Long(42L);
    public static final Long dialBackLink = new Long(43L);
    public static final Long linkAbort = new Long(44L);
    public static final Long autopassFailed = new Long(45L);
    public static final Long pbGenericError = new Long(46L);
    public static final Long pbLinkErrTxPreAck = new Long(47L);
    public static final Long pbLinkErrTxTardyACK = new Long(48L);
    public static final Long pbTransmitBusTimeout = new Long(49L);
    public static final Long pbReceiveBusTimeout = new Long(50L);
    public static final Long pbLinkErrTxTAL = new Long(51L);
    public static final Long pbLinkErrRxTAL = new Long(52L);
    public static final Long pbTransmitMasterTimeout = new Long(53L);
    public static final Long pbClockMissing = new Long(54L);
    public static final Long pbReceivedLsWhileLinkUp = new Long(55L);
    public static final Long pbOutOfSequenceFrame = new Long(56L);
    public static final Long pbBadFrame = new Long(57L);
    public static final Long pbAckWaitTimeout = new Long(58L);
    public static final Long pbReceivedAckSeqErr = new Long(59L);
    public static final Long pbReceiveOvrflwRNRFail = new Long(60L);
    public static final Long pbReceiveMsgBufOvrflw = new Long(61L);
    public static final Long rcvdGatewayDiscCmd = new Long(62L);
    public static final Long tokenPassingTimeout = new Long(63L);
    public static final Long dspInterruptTimeout = new Long(64L);
    public static final Long mnpProtocolViolation = new Long(65L);
    public static final Long class2FaxHangupCmd = new Long(66L);
    public static final Long hstSpeedSwitchTimeout = new Long(67L);
    public static final Long tooManyUnacked = new Long(68L);
    public static final Long timerExpired = new Long(69L);
    public static final Long t1Glare = new Long(70L);
    public static final Long priDialoutRqTimeout = new Long(71L);
    public static final Long abortAnlgDstOvrIsdn = new Long(72L);
    public static final Long normalUserCallClear = new Long(73L);
    public static final Long normalUnspecified = new Long(74L);
    public static final Long bearerIncompatibility = new Long(75L);
    public static final Long protocolErrorEvent = new Long(76L);
    public static final Long abnormalDisconnect = new Long(77L);
    public static final Long invalidCauseValue = new Long(78L);
    public static final Long resourceUnavailable = new Long(79L);
    public static final Long remoteHungUpDuringTraining = new Long(80L);
    public static final Long trainingTimeout = new Long(81L);
    public static final Long incomingModemNotAvailable = new Long(82L);
    public static final Long incomingInvalidBearerCap = new Long(83L);
    public static final Long incomingInvalidChannelID = new Long(84L);
    public static final Long incomingInvalidProgInd = new Long(85L);
    public static final Long incomingInvalidCallingPty = new Long(86L);
    public static final Long incomingInvalidCalledPty = new Long(87L);
    public static final Long incomingCallBlock = new Long(88L);
    public static final Long incomingLoopStNoRingOff = new Long(89L);
    public static final Long outgoingTelcoDisconnect = new Long(90L);
    public static final Long outgoingEMWinkTimeout = new Long(91L);
    public static final Long outgoingEMWinkTooShort = new Long(92L);
    public static final Long outgoingNoChannelAvail = new Long(93L);
    public static final Long dspReboot = new Long(94L);
    public static final Long noDSPRespToKA = new Long(95L);
    public static final Long noDSPRespToDisc = new Long(96L);
    public static final Long dspTailPtrInvalid = new Long(97L);
    public static final Long dspHeadPtrInvalid = new Long(98L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L),new Long(16L),new Long(17L),new Long(18L),new Long(19L),new Long(20L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L),new Long(28L),new Long(29L),new Long(30L),new Long(31L),new Long(32L),new Long(33L),new Long(34L),new Long(35L),new Long(36L),new Long(37L),new Long(38L),new Long(39L),new Long(40L),new Long(41L),new Long(42L),new Long(43L),new Long(44L),new Long(45L),new Long(46L),new Long(47L),new Long(48L),new Long(49L),new Long(50L),new Long(51L),new Long(52L),new Long(53L),new Long(54L),new Long(55L),new Long(56L),new Long(57L),new Long(58L),new Long(59L),new Long(60L),new Long(61L),new Long(62L),new Long(63L),new Long(64L),new Long(65L),new Long(66L),new Long(67L),new Long(68L),new Long(69L),new Long(70L),new Long(71L),new Long(72L),new Long(73L),new Long(74L),new Long(75L),new Long(76L),new Long(77L),new Long(78L),new Long(79L),new Long(80L),new Long(81L),new Long(82L),new Long(83L),new Long(84L),new Long(85L),new Long(86L),new Long(87L),new Long(88L),new Long(89L),new Long(90L),new Long(91L),new Long(92L),new Long(93L),new Long(94L),new Long(95L),new Long(96L),new Long(97L),new Long(98L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("dtrDrop".equals(name)) return new Long(1L);
            if ("escapeSequence".equals(name)) return new Long(2L);
            if ("athCommand".equals(name)) return new Long(3L);
            if ("carrierLoss".equals(name)) return new Long(4L);
            if ("inactivityTimout".equals(name)) return new Long(5L);
            if ("mnpIncompatible".equals(name)) return new Long(6L);
            if ("undefined".equals(name)) return new Long(7L);
            if ("remotePassword".equals(name)) return new Long(8L);
            if ("linkPassword".equals(name)) return new Long(9L);
            if ("retransmitLimit".equals(name)) return new Long(10L);
            if ("linkDisconnectMsgRec".equals(name)) return new Long(11L);
            if ("noLoopCurrent".equals(name)) return new Long(12L);
            if ("invalidSpeed".equals(name)) return new Long(13L);
            if ("unableToRetrain".equals(name)) return new Long(14L);
            if ("managementCommand".equals(name)) return new Long(15L);
            if ("noDialTone".equals(name)) return new Long(16L);
            if ("keyAbort".equals(name)) return new Long(17L);
            if ("lineBusy".equals(name)) return new Long(18L);
            if ("noAnswer".equals(name)) return new Long(19L);
            if ("voice".equals(name)) return new Long(20L);
            if ("noAnswerTone".equals(name)) return new Long(21L);
            if ("noCarrier".equals(name)) return new Long(22L);
            if ("undetermined".equals(name)) return new Long(23L);
            if ("v42SabmeTimeout".equals(name)) return new Long(24L);
            if ("v42BreakTimeout".equals(name)) return new Long(25L);
            if ("v42DisconnectCmd".equals(name)) return new Long(26L);
            if ("v42IdExchangeFail".equals(name)) return new Long(27L);
            if ("v42BadSetup".equals(name)) return new Long(28L);
            if ("v42InvalidCodeWord".equals(name)) return new Long(29L);
            if ("v42StringToLong".equals(name)) return new Long(30L);
            if ("v42InvalidCommand".equals(name)) return new Long(31L);
            if ("none".equals(name)) return new Long(32L);
            if ("v32Cleardown".equals(name)) return new Long(33L);
            if ("dialSecurity".equals(name)) return new Long(34L);
            if ("remoteAccessDenied".equals(name)) return new Long(35L);
            if ("loopLoss".equals(name)) return new Long(36L);
            if ("ds0Teardown".equals(name)) return new Long(37L);
            if ("promptNotEnabled".equals(name)) return new Long(38L);
            if ("noPromptingInSync".equals(name)) return new Long(39L);
            if ("nonArqMode".equals(name)) return new Long(40L);
            if ("modeIncompatible".equals(name)) return new Long(41L);
            if ("noPromptInNonARQ".equals(name)) return new Long(42L);
            if ("dialBackLink".equals(name)) return new Long(43L);
            if ("linkAbort".equals(name)) return new Long(44L);
            if ("autopassFailed".equals(name)) return new Long(45L);
            if ("pbGenericError".equals(name)) return new Long(46L);
            if ("pbLinkErrTxPreAck".equals(name)) return new Long(47L);
            if ("pbLinkErrTxTardyACK".equals(name)) return new Long(48L);
            if ("pbTransmitBusTimeout".equals(name)) return new Long(49L);
            if ("pbReceiveBusTimeout".equals(name)) return new Long(50L);
            if ("pbLinkErrTxTAL".equals(name)) return new Long(51L);
            if ("pbLinkErrRxTAL".equals(name)) return new Long(52L);
            if ("pbTransmitMasterTimeout".equals(name)) return new Long(53L);
            if ("pbClockMissing".equals(name)) return new Long(54L);
            if ("pbReceivedLsWhileLinkUp".equals(name)) return new Long(55L);
            if ("pbOutOfSequenceFrame".equals(name)) return new Long(56L);
            if ("pbBadFrame".equals(name)) return new Long(57L);
            if ("pbAckWaitTimeout".equals(name)) return new Long(58L);
            if ("pbReceivedAckSeqErr".equals(name)) return new Long(59L);
            if ("pbReceiveOvrflwRNRFail".equals(name)) return new Long(60L);
            if ("pbReceiveMsgBufOvrflw".equals(name)) return new Long(61L);
            if ("rcvdGatewayDiscCmd".equals(name)) return new Long(62L);
            if ("tokenPassingTimeout".equals(name)) return new Long(63L);
            if ("dspInterruptTimeout".equals(name)) return new Long(64L);
            if ("mnpProtocolViolation".equals(name)) return new Long(65L);
            if ("class2FaxHangupCmd".equals(name)) return new Long(66L);
            if ("hstSpeedSwitchTimeout".equals(name)) return new Long(67L);
            if ("tooManyUnacked".equals(name)) return new Long(68L);
            if ("timerExpired".equals(name)) return new Long(69L);
            if ("t1Glare".equals(name)) return new Long(70L);
            if ("priDialoutRqTimeout".equals(name)) return new Long(71L);
            if ("abortAnlgDstOvrIsdn".equals(name)) return new Long(72L);
            if ("normalUserCallClear".equals(name)) return new Long(73L);
            if ("normalUnspecified".equals(name)) return new Long(74L);
            if ("bearerIncompatibility".equals(name)) return new Long(75L);
            if ("protocolErrorEvent".equals(name)) return new Long(76L);
            if ("abnormalDisconnect".equals(name)) return new Long(77L);
            if ("invalidCauseValue".equals(name)) return new Long(78L);
            if ("resourceUnavailable".equals(name)) return new Long(79L);
            if ("remoteHungUpDuringTraining".equals(name)) return new Long(80L);
            if ("trainingTimeout".equals(name)) return new Long(81L);
            if ("incomingModemNotAvailable".equals(name)) return new Long(82L);
            if ("incomingInvalidBearerCap".equals(name)) return new Long(83L);
            if ("incomingInvalidChannelID".equals(name)) return new Long(84L);
            if ("incomingInvalidProgInd".equals(name)) return new Long(85L);
            if ("incomingInvalidCallingPty".equals(name)) return new Long(86L);
            if ("incomingInvalidCalledPty".equals(name)) return new Long(87L);
            if ("incomingCallBlock".equals(name)) return new Long(88L);
            if ("incomingLoopStNoRingOff".equals(name)) return new Long(89L);
            if ("outgoingTelcoDisconnect".equals(name)) return new Long(90L);
            if ("outgoingEMWinkTimeout".equals(name)) return new Long(91L);
            if ("outgoingEMWinkTooShort".equals(name)) return new Long(92L);
            if ("outgoingNoChannelAvail".equals(name)) return new Long(93L);
            if ("dspReboot".equals(name)) return new Long(94L);
            if ("noDSPRespToKA".equals(name)) return new Long(95L);
            if ("noDSPRespToDisc".equals(name)) return new Long(96L);
            if ("dspTailPtrInvalid".equals(name)) return new Long(97L);
            if ("dspHeadPtrInvalid".equals(name)) return new Long(98L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "dtrDrop";
            if (new Long(2L).equals(value)) return "escapeSequence";
            if (new Long(3L).equals(value)) return "athCommand";
            if (new Long(4L).equals(value)) return "carrierLoss";
            if (new Long(5L).equals(value)) return "inactivityTimout";
            if (new Long(6L).equals(value)) return "mnpIncompatible";
            if (new Long(7L).equals(value)) return "undefined";
            if (new Long(8L).equals(value)) return "remotePassword";
            if (new Long(9L).equals(value)) return "linkPassword";
            if (new Long(10L).equals(value)) return "retransmitLimit";
            if (new Long(11L).equals(value)) return "linkDisconnectMsgRec";
            if (new Long(12L).equals(value)) return "noLoopCurrent";
            if (new Long(13L).equals(value)) return "invalidSpeed";
            if (new Long(14L).equals(value)) return "unableToRetrain";
            if (new Long(15L).equals(value)) return "managementCommand";
            if (new Long(16L).equals(value)) return "noDialTone";
            if (new Long(17L).equals(value)) return "keyAbort";
            if (new Long(18L).equals(value)) return "lineBusy";
            if (new Long(19L).equals(value)) return "noAnswer";
            if (new Long(20L).equals(value)) return "voice";
            if (new Long(21L).equals(value)) return "noAnswerTone";
            if (new Long(22L).equals(value)) return "noCarrier";
            if (new Long(23L).equals(value)) return "undetermined";
            if (new Long(24L).equals(value)) return "v42SabmeTimeout";
            if (new Long(25L).equals(value)) return "v42BreakTimeout";
            if (new Long(26L).equals(value)) return "v42DisconnectCmd";
            if (new Long(27L).equals(value)) return "v42IdExchangeFail";
            if (new Long(28L).equals(value)) return "v42BadSetup";
            if (new Long(29L).equals(value)) return "v42InvalidCodeWord";
            if (new Long(30L).equals(value)) return "v42StringToLong";
            if (new Long(31L).equals(value)) return "v42InvalidCommand";
            if (new Long(32L).equals(value)) return "none";
            if (new Long(33L).equals(value)) return "v32Cleardown";
            if (new Long(34L).equals(value)) return "dialSecurity";
            if (new Long(35L).equals(value)) return "remoteAccessDenied";
            if (new Long(36L).equals(value)) return "loopLoss";
            if (new Long(37L).equals(value)) return "ds0Teardown";
            if (new Long(38L).equals(value)) return "promptNotEnabled";
            if (new Long(39L).equals(value)) return "noPromptingInSync";
            if (new Long(40L).equals(value)) return "nonArqMode";
            if (new Long(41L).equals(value)) return "modeIncompatible";
            if (new Long(42L).equals(value)) return "noPromptInNonARQ";
            if (new Long(43L).equals(value)) return "dialBackLink";
            if (new Long(44L).equals(value)) return "linkAbort";
            if (new Long(45L).equals(value)) return "autopassFailed";
            if (new Long(46L).equals(value)) return "pbGenericError";
            if (new Long(47L).equals(value)) return "pbLinkErrTxPreAck";
            if (new Long(48L).equals(value)) return "pbLinkErrTxTardyACK";
            if (new Long(49L).equals(value)) return "pbTransmitBusTimeout";
            if (new Long(50L).equals(value)) return "pbReceiveBusTimeout";
            if (new Long(51L).equals(value)) return "pbLinkErrTxTAL";
            if (new Long(52L).equals(value)) return "pbLinkErrRxTAL";
            if (new Long(53L).equals(value)) return "pbTransmitMasterTimeout";
            if (new Long(54L).equals(value)) return "pbClockMissing";
            if (new Long(55L).equals(value)) return "pbReceivedLsWhileLinkUp";
            if (new Long(56L).equals(value)) return "pbOutOfSequenceFrame";
            if (new Long(57L).equals(value)) return "pbBadFrame";
            if (new Long(58L).equals(value)) return "pbAckWaitTimeout";
            if (new Long(59L).equals(value)) return "pbReceivedAckSeqErr";
            if (new Long(60L).equals(value)) return "pbReceiveOvrflwRNRFail";
            if (new Long(61L).equals(value)) return "pbReceiveMsgBufOvrflw";
            if (new Long(62L).equals(value)) return "rcvdGatewayDiscCmd";
            if (new Long(63L).equals(value)) return "tokenPassingTimeout";
            if (new Long(64L).equals(value)) return "dspInterruptTimeout";
            if (new Long(65L).equals(value)) return "mnpProtocolViolation";
            if (new Long(66L).equals(value)) return "class2FaxHangupCmd";
            if (new Long(67L).equals(value)) return "hstSpeedSwitchTimeout";
            if (new Long(68L).equals(value)) return "tooManyUnacked";
            if (new Long(69L).equals(value)) return "timerExpired";
            if (new Long(70L).equals(value)) return "t1Glare";
            if (new Long(71L).equals(value)) return "priDialoutRqTimeout";
            if (new Long(72L).equals(value)) return "abortAnlgDstOvrIsdn";
            if (new Long(73L).equals(value)) return "normalUserCallClear";
            if (new Long(74L).equals(value)) return "normalUnspecified";
            if (new Long(75L).equals(value)) return "bearerIncompatibility";
            if (new Long(76L).equals(value)) return "protocolErrorEvent";
            if (new Long(77L).equals(value)) return "abnormalDisconnect";
            if (new Long(78L).equals(value)) return "invalidCauseValue";
            if (new Long(79L).equals(value)) return "resourceUnavailable";
            if (new Long(80L).equals(value)) return "remoteHungUpDuringTraining";
            if (new Long(81L).equals(value)) return "trainingTimeout";
            if (new Long(82L).equals(value)) return "incomingModemNotAvailable";
            if (new Long(83L).equals(value)) return "incomingInvalidBearerCap";
            if (new Long(84L).equals(value)) return "incomingInvalidChannelID";
            if (new Long(85L).equals(value)) return "incomingInvalidProgInd";
            if (new Long(86L).equals(value)) return "incomingInvalidCallingPty";
            if (new Long(87L).equals(value)) return "incomingInvalidCalledPty";
            if (new Long(88L).equals(value)) return "incomingCallBlock";
            if (new Long(89L).equals(value)) return "incomingLoopStNoRingOff";
            if (new Long(90L).equals(value)) return "outgoingTelcoDisconnect";
            if (new Long(91L).equals(value)) return "outgoingEMWinkTimeout";
            if (new Long(92L).equals(value)) return "outgoingEMWinkTooShort";
            if (new Long(93L).equals(value)) return "outgoingNoChannelAvail";
            if (new Long(94L).equals(value)) return "dspReboot";
            if (new Long(95L).equals(value)) return "noDSPRespToKA";
            if (new Long(96L).equals(value)) return "noDSPRespToDisc";
            if (new Long(97L).equals(value)) return "dspTailPtrInvalid";
            if (new Long(98L).equals(value)) return "dspHeadPtrInvalid";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("4,0");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_USRFailuretoConnectReason()
    {
        setup();
    }

    public Attr_USRFailuretoConnectReason(Serializable o)
    {
        setup(o);
    }
}

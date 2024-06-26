// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: X-Ascend-Disconnect-Cause<br>
 * Attribute Type: 195<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> No-Reason (0)
 * <li> Not-Applicable (1)
 * <li> Unknown (2)
 * <li> Call-Disconnected (3)
 * <li> CLID-Authentication-Failed (4)
 * <li> CLID-RADIUS-Timeout (5)
 * <li> Modem-No-DCD (10)
 * <li> DCD-Detected-Then-Inactive (11)
 * <li> Modem-Invalid-Result-Codes (12)
 * <li> TermSrv-User-Quit (20)
 * <li> TermSrv-Idle-Timeout (21)
 * <li> TermSrv-Exit-Telnet (22)
 * <li> TermSrv-No-IPaddr (23)
 * <li> TermSrv-Exit-Raw-TCP (24)
 * <li> TermSrv-Exit-Login-Failed (25)
 * <li> TermSrv-Exit-Raw-TCP-Disabled (26)
 * <li> TermSrv-CTRL-C-In-Login (27)
 * <li> TermSrv-Destroyed (28)
 * <li> TermSrv-User-Closed-VCon (29)
 * <li> TermSrv-VCon-Destroyed (30)
 * <li> TermSrv-Exit-Rlogin (31)
 * <li> TermSrv-Bad-Rlogin-Option (32)
 * <li> TermSrv-Not-Enough-Resources (33)
 * <li> MPP-No-NULL-Msg-Timeout (35)
 * <li> PPP-LCP-Timeout (40)
 * <li> PPP-LCP-Negotion-Failed (41)
 * <li> PPP-PAP-Auth-Failed (42)
 * <li> PPP-CHAP-Auth-Failed (43)
 * <li> PPP-Rmt-Auth-Failed (44)
 * <li> PPP-Rcv-Terminate-Req (45)
 * <li> PPP-Rcv-Close-Event (46)
 * <li> PPP-No-NCPs-Open (47)
 * <li> PPP-MP-Bundle-Unknown (48)
 * <li> PPP-LCP-Close-MP-Add-Fail (49)
 * <li> Session-Table-Full (50)
 * <li> Out-Of-Resources (51)
 * <li> Invalid-IP-Address (52)
 * <li> Hostname-Resolution-Failed (53)
 * <li> Bad-Or-Missing-Port-Number (54)
 * <li> Host-Reset (60)
 * <li> Connection-Refused (61)
 * <li> Connection-Timeout (62)
 * <li> Connection-Closed (63)
 * <li> Network-Unreachable (64)
 * <li> Host-Unreachable (65)
 * <li> Network-Unreachable-Admin (66)
 * <li> Host-Unreachable-Admin (67)
 * <li> Port-Unreachable (68)
 * <li> Session-Timeout (100)
 * <li> Invalid-Incoming-User (101)
 * <li> Disconnect-Due-To-Callback (102)
 * <li> Proto-Disabled-Or-Unsupported (120)
 * <li> Disconnect-Req-By-RADIUS (150)
 * <li> Disconnect-Req-By-Local-Admin (151)
 * <li> V110-Timeout-Sync-Retry-Exceed (160)
 * <li> PPP-Auth-Timeout-Exceeded (170)
 * <li> User-Executed-Do-Hangup (180)
 * <li> Remote-End-Hung-Up (185)
 * <li> Resource-Has-Been-Quiesced (190)
 * <li> Max-Call-Duration-Reached (195)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendDisconnectCause extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Disconnect-Cause";
    public static final long TYPE = 195;

    public static final long serialVersionUID = TYPE;

    public static final Long NoReason = new Long(0L);
    public static final Long NotApplicable = new Long(1L);
    public static final Long Unknown = new Long(2L);
    public static final Long CallDisconnected = new Long(3L);
    public static final Long CLIDAuthenticationFailed = new Long(4L);
    public static final Long CLIDRADIUSTimeout = new Long(5L);
    public static final Long ModemNoDCD = new Long(10L);
    public static final Long DCDDetectedThenInactive = new Long(11L);
    public static final Long ModemInvalidResultCodes = new Long(12L);
    public static final Long TermSrvUserQuit = new Long(20L);
    public static final Long TermSrvIdleTimeout = new Long(21L);
    public static final Long TermSrvExitTelnet = new Long(22L);
    public static final Long TermSrvNoIPaddr = new Long(23L);
    public static final Long TermSrvExitRawTCP = new Long(24L);
    public static final Long TermSrvExitLoginFailed = new Long(25L);
    public static final Long TermSrvExitRawTCPDisabled = new Long(26L);
    public static final Long TermSrvCTRLCInLogin = new Long(27L);
    public static final Long TermSrvDestroyed = new Long(28L);
    public static final Long TermSrvUserClosedVCon = new Long(29L);
    public static final Long TermSrvVConDestroyed = new Long(30L);
    public static final Long TermSrvExitRlogin = new Long(31L);
    public static final Long TermSrvBadRloginOption = new Long(32L);
    public static final Long TermSrvNotEnoughResources = new Long(33L);
    public static final Long MPPNoNULLMsgTimeout = new Long(35L);
    public static final Long PPPLCPTimeout = new Long(40L);
    public static final Long PPPLCPNegotionFailed = new Long(41L);
    public static final Long PPPPAPAuthFailed = new Long(42L);
    public static final Long PPPCHAPAuthFailed = new Long(43L);
    public static final Long PPPRmtAuthFailed = new Long(44L);
    public static final Long PPPRcvTerminateReq = new Long(45L);
    public static final Long PPPRcvCloseEvent = new Long(46L);
    public static final Long PPPNoNCPsOpen = new Long(47L);
    public static final Long PPPMPBundleUnknown = new Long(48L);
    public static final Long PPPLCPCloseMPAddFail = new Long(49L);
    public static final Long SessionTableFull = new Long(50L);
    public static final Long OutOfResources = new Long(51L);
    public static final Long InvalidIPAddress = new Long(52L);
    public static final Long HostnameResolutionFailed = new Long(53L);
    public static final Long BadOrMissingPortNumber = new Long(54L);
    public static final Long HostReset = new Long(60L);
    public static final Long ConnectionRefused = new Long(61L);
    public static final Long ConnectionTimeout = new Long(62L);
    public static final Long ConnectionClosed = new Long(63L);
    public static final Long NetworkUnreachable = new Long(64L);
    public static final Long HostUnreachable = new Long(65L);
    public static final Long NetworkUnreachableAdmin = new Long(66L);
    public static final Long HostUnreachableAdmin = new Long(67L);
    public static final Long PortUnreachable = new Long(68L);
    public static final Long SessionTimeout = new Long(100L);
    public static final Long InvalidIncomingUser = new Long(101L);
    public static final Long DisconnectDueToCallback = new Long(102L);
    public static final Long ProtoDisabledOrUnsupported = new Long(120L);
    public static final Long DisconnectReqByRADIUS = new Long(150L);
    public static final Long DisconnectReqByLocalAdmin = new Long(151L);
    public static final Long V110TimeoutSyncRetryExceed = new Long(160L);
    public static final Long PPPAuthTimeoutExceeded = new Long(170L);
    public static final Long UserExecutedDoHangup = new Long(180L);
    public static final Long RemoteEndHungUp = new Long(185L);
    public static final Long ResourceHasBeenQuiesced = new Long(190L);
    public static final Long MaxCallDurationReached = new Long(195L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(10L),new Long(11L),new Long(12L),new Long(20L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L),new Long(28L),new Long(29L),new Long(30L),new Long(31L),new Long(32L),new Long(33L),new Long(35L),new Long(40L),new Long(41L),new Long(42L),new Long(43L),new Long(44L),new Long(45L),new Long(46L),new Long(47L),new Long(48L),new Long(49L),new Long(50L),new Long(51L),new Long(52L),new Long(53L),new Long(54L),new Long(60L),new Long(61L),new Long(62L),new Long(63L),new Long(64L),new Long(65L),new Long(66L),new Long(67L),new Long(68L),new Long(100L),new Long(101L),new Long(102L),new Long(120L),new Long(150L),new Long(151L),new Long(160L),new Long(170L),new Long(180L),new Long(185L),new Long(190L),new Long(195L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("No-Reason".equals(name)) return new Long(0L);
            if ("Not-Applicable".equals(name)) return new Long(1L);
            if ("Unknown".equals(name)) return new Long(2L);
            if ("Call-Disconnected".equals(name)) return new Long(3L);
            if ("CLID-Authentication-Failed".equals(name)) return new Long(4L);
            if ("CLID-RADIUS-Timeout".equals(name)) return new Long(5L);
            if ("Modem-No-DCD".equals(name)) return new Long(10L);
            if ("DCD-Detected-Then-Inactive".equals(name)) return new Long(11L);
            if ("Modem-Invalid-Result-Codes".equals(name)) return new Long(12L);
            if ("TermSrv-User-Quit".equals(name)) return new Long(20L);
            if ("TermSrv-Idle-Timeout".equals(name)) return new Long(21L);
            if ("TermSrv-Exit-Telnet".equals(name)) return new Long(22L);
            if ("TermSrv-No-IPaddr".equals(name)) return new Long(23L);
            if ("TermSrv-Exit-Raw-TCP".equals(name)) return new Long(24L);
            if ("TermSrv-Exit-Login-Failed".equals(name)) return new Long(25L);
            if ("TermSrv-Exit-Raw-TCP-Disabled".equals(name)) return new Long(26L);
            if ("TermSrv-CTRL-C-In-Login".equals(name)) return new Long(27L);
            if ("TermSrv-Destroyed".equals(name)) return new Long(28L);
            if ("TermSrv-User-Closed-VCon".equals(name)) return new Long(29L);
            if ("TermSrv-VCon-Destroyed".equals(name)) return new Long(30L);
            if ("TermSrv-Exit-Rlogin".equals(name)) return new Long(31L);
            if ("TermSrv-Bad-Rlogin-Option".equals(name)) return new Long(32L);
            if ("TermSrv-Not-Enough-Resources".equals(name)) return new Long(33L);
            if ("MPP-No-NULL-Msg-Timeout".equals(name)) return new Long(35L);
            if ("PPP-LCP-Timeout".equals(name)) return new Long(40L);
            if ("PPP-LCP-Negotion-Failed".equals(name)) return new Long(41L);
            if ("PPP-PAP-Auth-Failed".equals(name)) return new Long(42L);
            if ("PPP-CHAP-Auth-Failed".equals(name)) return new Long(43L);
            if ("PPP-Rmt-Auth-Failed".equals(name)) return new Long(44L);
            if ("PPP-Rcv-Terminate-Req".equals(name)) return new Long(45L);
            if ("PPP-Rcv-Close-Event".equals(name)) return new Long(46L);
            if ("PPP-No-NCPs-Open".equals(name)) return new Long(47L);
            if ("PPP-MP-Bundle-Unknown".equals(name)) return new Long(48L);
            if ("PPP-LCP-Close-MP-Add-Fail".equals(name)) return new Long(49L);
            if ("Session-Table-Full".equals(name)) return new Long(50L);
            if ("Out-Of-Resources".equals(name)) return new Long(51L);
            if ("Invalid-IP-Address".equals(name)) return new Long(52L);
            if ("Hostname-Resolution-Failed".equals(name)) return new Long(53L);
            if ("Bad-Or-Missing-Port-Number".equals(name)) return new Long(54L);
            if ("Host-Reset".equals(name)) return new Long(60L);
            if ("Connection-Refused".equals(name)) return new Long(61L);
            if ("Connection-Timeout".equals(name)) return new Long(62L);
            if ("Connection-Closed".equals(name)) return new Long(63L);
            if ("Network-Unreachable".equals(name)) return new Long(64L);
            if ("Host-Unreachable".equals(name)) return new Long(65L);
            if ("Network-Unreachable-Admin".equals(name)) return new Long(66L);
            if ("Host-Unreachable-Admin".equals(name)) return new Long(67L);
            if ("Port-Unreachable".equals(name)) return new Long(68L);
            if ("Session-Timeout".equals(name)) return new Long(100L);
            if ("Invalid-Incoming-User".equals(name)) return new Long(101L);
            if ("Disconnect-Due-To-Callback".equals(name)) return new Long(102L);
            if ("Proto-Disabled-Or-Unsupported".equals(name)) return new Long(120L);
            if ("Disconnect-Req-By-RADIUS".equals(name)) return new Long(150L);
            if ("Disconnect-Req-By-Local-Admin".equals(name)) return new Long(151L);
            if ("V110-Timeout-Sync-Retry-Exceed".equals(name)) return new Long(160L);
            if ("PPP-Auth-Timeout-Exceeded".equals(name)) return new Long(170L);
            if ("User-Executed-Do-Hangup".equals(name)) return new Long(180L);
            if ("Remote-End-Hung-Up".equals(name)) return new Long(185L);
            if ("Resource-Has-Been-Quiesced".equals(name)) return new Long(190L);
            if ("Max-Call-Duration-Reached".equals(name)) return new Long(195L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "No-Reason";
            if (new Long(1L).equals(value)) return "Not-Applicable";
            if (new Long(2L).equals(value)) return "Unknown";
            if (new Long(3L).equals(value)) return "Call-Disconnected";
            if (new Long(4L).equals(value)) return "CLID-Authentication-Failed";
            if (new Long(5L).equals(value)) return "CLID-RADIUS-Timeout";
            if (new Long(10L).equals(value)) return "Modem-No-DCD";
            if (new Long(11L).equals(value)) return "DCD-Detected-Then-Inactive";
            if (new Long(12L).equals(value)) return "Modem-Invalid-Result-Codes";
            if (new Long(20L).equals(value)) return "TermSrv-User-Quit";
            if (new Long(21L).equals(value)) return "TermSrv-Idle-Timeout";
            if (new Long(22L).equals(value)) return "TermSrv-Exit-Telnet";
            if (new Long(23L).equals(value)) return "TermSrv-No-IPaddr";
            if (new Long(24L).equals(value)) return "TermSrv-Exit-Raw-TCP";
            if (new Long(25L).equals(value)) return "TermSrv-Exit-Login-Failed";
            if (new Long(26L).equals(value)) return "TermSrv-Exit-Raw-TCP-Disabled";
            if (new Long(27L).equals(value)) return "TermSrv-CTRL-C-In-Login";
            if (new Long(28L).equals(value)) return "TermSrv-Destroyed";
            if (new Long(29L).equals(value)) return "TermSrv-User-Closed-VCon";
            if (new Long(30L).equals(value)) return "TermSrv-VCon-Destroyed";
            if (new Long(31L).equals(value)) return "TermSrv-Exit-Rlogin";
            if (new Long(32L).equals(value)) return "TermSrv-Bad-Rlogin-Option";
            if (new Long(33L).equals(value)) return "TermSrv-Not-Enough-Resources";
            if (new Long(35L).equals(value)) return "MPP-No-NULL-Msg-Timeout";
            if (new Long(40L).equals(value)) return "PPP-LCP-Timeout";
            if (new Long(41L).equals(value)) return "PPP-LCP-Negotion-Failed";
            if (new Long(42L).equals(value)) return "PPP-PAP-Auth-Failed";
            if (new Long(43L).equals(value)) return "PPP-CHAP-Auth-Failed";
            if (new Long(44L).equals(value)) return "PPP-Rmt-Auth-Failed";
            if (new Long(45L).equals(value)) return "PPP-Rcv-Terminate-Req";
            if (new Long(46L).equals(value)) return "PPP-Rcv-Close-Event";
            if (new Long(47L).equals(value)) return "PPP-No-NCPs-Open";
            if (new Long(48L).equals(value)) return "PPP-MP-Bundle-Unknown";
            if (new Long(49L).equals(value)) return "PPP-LCP-Close-MP-Add-Fail";
            if (new Long(50L).equals(value)) return "Session-Table-Full";
            if (new Long(51L).equals(value)) return "Out-Of-Resources";
            if (new Long(52L).equals(value)) return "Invalid-IP-Address";
            if (new Long(53L).equals(value)) return "Hostname-Resolution-Failed";
            if (new Long(54L).equals(value)) return "Bad-Or-Missing-Port-Number";
            if (new Long(60L).equals(value)) return "Host-Reset";
            if (new Long(61L).equals(value)) return "Connection-Refused";
            if (new Long(62L).equals(value)) return "Connection-Timeout";
            if (new Long(63L).equals(value)) return "Connection-Closed";
            if (new Long(64L).equals(value)) return "Network-Unreachable";
            if (new Long(65L).equals(value)) return "Host-Unreachable";
            if (new Long(66L).equals(value)) return "Network-Unreachable-Admin";
            if (new Long(67L).equals(value)) return "Host-Unreachable-Admin";
            if (new Long(68L).equals(value)) return "Port-Unreachable";
            if (new Long(100L).equals(value)) return "Session-Timeout";
            if (new Long(101L).equals(value)) return "Invalid-Incoming-User";
            if (new Long(102L).equals(value)) return "Disconnect-Due-To-Callback";
            if (new Long(120L).equals(value)) return "Proto-Disabled-Or-Unsupported";
            if (new Long(150L).equals(value)) return "Disconnect-Req-By-RADIUS";
            if (new Long(151L).equals(value)) return "Disconnect-Req-By-Local-Admin";
            if (new Long(160L).equals(value)) return "V110-Timeout-Sync-Retry-Exceed";
            if (new Long(170L).equals(value)) return "PPP-Auth-Timeout-Exceeded";
            if (new Long(180L).equals(value)) return "User-Executed-Do-Hangup";
            if (new Long(185L).equals(value)) return "Remote-End-Hung-Up";
            if (new Long(190L).equals(value)) return "Resource-Has-Been-Quiesced";
            if (new Long(195L).equals(value)) return "Max-Call-Duration-Reached";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 195;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendDisconnectCause()
    {
        setup();
    }

    public Attr_XAscendDisconnectCause(Serializable o)
    {
        setup(o);
    }
}

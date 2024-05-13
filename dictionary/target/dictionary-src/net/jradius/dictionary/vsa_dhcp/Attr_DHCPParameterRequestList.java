// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_dhcp;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: DHCP-Parameter-Request-List<br>
 * Attribute Type: 26<br>
 * Vendor Id: 54<br>
 * VSA Type: 55<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> DHCP-Subnet-Mask (1)
 * <li> DHCP-Time-Offset (2)
 * <li> DHCP-Router-Address (3)
 * <li> DHCP-Time-Server (4)
 * <li> DHCP-IEN-116-Name-Server (5)
 * <li> DHCP-Domain-Name-Server (6)
 * <li> DHCP-Log-Server (7)
 * <li> DHCP-Quotes-Server (8)
 * <li> DHCP-LPR-Server (9)
 * <li> DHCP-Impress-Server (10)
 * <li> DHCP-RLP-Server (11)
 * <li> DHCP-Hostname (12)
 * <li> DHCP-Boot-File-Size (13)
 * <li> DHCP-Merit-Dump-File (14)
 * <li> DHCP-Domain-Name (15)
 * <li> DHCP-Swap-Server (16)
 * <li> DHCP-Root-Path (17)
 * <li> DHCP-Bootp-Extensions-Path (18)
 * <li> DHCP-IP-Forward-Enable (19)
 * <li> DHCP-Source-Route-Enable (20)
 * <li> DHCP-Policy-Filter (21)
 * <li> DHCP-Max-Datagram-Reassembly-Sz (22)
 * <li> DHCP-Default-IP-TTL (23)
 * <li> DHCP-Path-MTU-Aging-Timeout (24)
 * <li> DHCP-Path-MTU-Plateau-Table (25)
 * <li> DHCP-Interface-MTU-Size (26)
 * <li> DHCP-All-Subnets-Are-Local (27)
 * <li> DHCP-Broadcast-Address (28)
 * <li> DHCP-Perform-Mask-Discovery (29)
 * <li> DHCP-Provide-Mask-To-Others (30)
 * <li> DHCP-Perform-Router-Discovery (31)
 * <li> DHCP-Router-Solicitation-Address (32)
 * <li> DHCP-Static-Routes (33)
 * <li> DHCP-Trailer-Encapsulation (34)
 * <li> DHCP-ARP-Cache-Timeout (35)
 * <li> DHCP-Ethernet-Encapsulation (36)
 * <li> DHCP-Default-TCP-TTL (37)
 * <li> DHCP-Keep-Alive-Interval (38)
 * <li> DHCP-Keep=Alive-Garbage (39)
 * <li> DHCP-NIS-Domain-Name (40)
 * <li> DHCP-NIS-Servers (41)
 * <li> DHCP-NTP-Servers (42)
 * <li> DHCP-Vendor (43)
 * <li> DHCP-NETBIOS-Name-Servers (44)
 * <li> DHCP-NETBIOS-Dgm-Dist-Servers (45)
 * <li> DHCP-NETBIOS-Node-Type (46)
 * <li> DHCP-NETBIOS (47)
 * <li> DHCP-X-Window-Font-Server (48)
 * <li> DHCP-X-Window-Display-Mgr (49)
 * <li> DHCP-Requested-IP-Address (50)
 * <li> DHCP-IP-Address-Lease-Time (51)
 * <li> DHCP-Overload (52)
 * <li> DHCP-Message-Type (53)
 * <li> DHCP-DHCP-Server-Identifier (54)
 * <li> DHCP-Parameter-Request-List (55)
 * <li> DHCP-DHCP-Error-Message (56)
 * <li> DHCP-DHCP-Maximum-Msg-Size (57)
 * <li> DHCP-Renewal-Time (58)
 * <li> DHCP-Rebinding-Time (59)
 * <li> DHCP-Class-Identifier (60)
 * <li> DHCP-Client-Identifier (61)
 * <li> DHCP-Netware-Domain-Name (62)
 * <li> DHCP-Netware-Sub-Options (63)
 * <li> DHCP-NIS-Client-Domain-Name (64)
 * <li> DHCP-NIS-Server-Address (65)
 * <li> DHCP-TFTP-Server-Name (66)
 * <li> DHCP-Boot-File-Name (67)
 * <li> DHCP-Home-Agent-Address (68)
 * <li> DHCP-SMTP-Server-Address (69)
 * <li> DHCP-POP3-Server-Address (70)
 * <li> DHCP-NNTP-Server-Address (71)
 * <li> DHCP-WWW-Server-Address (72)
 * <li> DHCP-Finger-Server-Address (73)
 * <li> DHCP-IRC-Server-Address (74)
 * <li> DHCP-StreetTalk-Server-Address (75)
 * <li> DHCP-STDA-Server-Address (76)
 * <li> DHCP-User-Class (77)
 * <li> DHCP-Directory-Agent (78)
 * <li> DHCP-Service-Scope (79)
 * <li> DHCP-Rapid-Commit (80)
 * <li> DHCP-Client-FQDN (81)
 * <li> DHCP-Relay-Agent-Information (82)
 * <li> DHCP-iSNS (83)
 * <li> DHCP-NDS-Servers (85)
 * <li> DHCP-NDS-Tree-Name (86)
 * <li> DHCP-NDS-Context (87)
 * <li> DHCP-Authentication (90)
 * <li> DHCP-Client-Last-Txn-Time (91)
 * <li> DHCP-associated-ip (92)
 * <li> DHCP-Client-System (93)
 * <li> DHCP-Client-NDI (94)
 * <li> DHCP-LDAP (95)
 * <li> DHCP-UUID/GUID (97)
 * <li> DHCP-User-Auth (98)
 * <li> DHCP-Netinfo-Address (112)
 * <li> DHCP-Netinfo-Tag (113)
 * <li> DHCP-URL (114)
 * <li> DHCP-Auto-Config (116)
 * <li> DHCP-Name-Service-Search (117)
 * <li> DHCP-Subnet-Selection-Option (118)
 * <li> DHCP-Domain-Search (119)
 * <li> DHCP-SIP-Servers-DHCP-Option (120)
 * <li> DHCP-Classless-Static-Route (121)
 * <li> DHCP-CCC (122)
 * <li> DHCP-GeoConf-Option (123)
 * <li> DHCP-V-I-Vendor-Class (124)
 * <li> DHCP-V-I-Vendor-Specific (125)
 * <li> DHCP-Etherboot (128)
 * <li> DHCP-TFTP-Server-IP-Address (128)
 * <li> DHCP-Call-Server-IP-address (129)
 * <li> DHCP-Ethernet-Interface (130)
 * <li> DHCP-Vendor-Discrimination-Str (130)
 * <li> DHCP-Remote-Stats-Svr-IP-Address (131)
 * <li> DHCP-IEEE-802.1P-VLAN-ID (132)
 * <li> DHCP-IEEE-802.1Q-L2-Priority (133)
 * <li> DHCP-Diffserv-Code-Point (134)
 * <li> DHCP-HTTP-Proxy (135)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_DHCPParameterRequestList extends VSAttribute
{
    public static final String NAME = "DHCP-Parameter-Request-List";
    public static final int VENDOR_ID = 54;
    public static final int VSA_TYPE = 55;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long DHCPSubnetMask = new Long(1L);
    public static final Long DHCPTimeOffset = new Long(2L);
    public static final Long DHCPRouterAddress = new Long(3L);
    public static final Long DHCPTimeServer = new Long(4L);
    public static final Long DHCPIEN116NameServer = new Long(5L);
    public static final Long DHCPDomainNameServer = new Long(6L);
    public static final Long DHCPLogServer = new Long(7L);
    public static final Long DHCPQuotesServer = new Long(8L);
    public static final Long DHCPLPRServer = new Long(9L);
    public static final Long DHCPImpressServer = new Long(10L);
    public static final Long DHCPRLPServer = new Long(11L);
    public static final Long DHCPHostname = new Long(12L);
    public static final Long DHCPBootFileSize = new Long(13L);
    public static final Long DHCPMeritDumpFile = new Long(14L);
    public static final Long DHCPDomainName = new Long(15L);
    public static final Long DHCPSwapServer = new Long(16L);
    public static final Long DHCPRootPath = new Long(17L);
    public static final Long DHCPBootpExtensionsPath = new Long(18L);
    public static final Long DHCPIPForwardEnable = new Long(19L);
    public static final Long DHCPSourceRouteEnable = new Long(20L);
    public static final Long DHCPPolicyFilter = new Long(21L);
    public static final Long DHCPMaxDatagramReassemblySz = new Long(22L);
    public static final Long DHCPDefaultIPTTL = new Long(23L);
    public static final Long DHCPPathMTUAgingTimeout = new Long(24L);
    public static final Long DHCPPathMTUPlateauTable = new Long(25L);
    public static final Long DHCPInterfaceMTUSize = new Long(26L);
    public static final Long DHCPAllSubnetsAreLocal = new Long(27L);
    public static final Long DHCPBroadcastAddress = new Long(28L);
    public static final Long DHCPPerformMaskDiscovery = new Long(29L);
    public static final Long DHCPProvideMaskToOthers = new Long(30L);
    public static final Long DHCPPerformRouterDiscovery = new Long(31L);
    public static final Long DHCPRouterSolicitationAddress = new Long(32L);
    public static final Long DHCPStaticRoutes = new Long(33L);
    public static final Long DHCPTrailerEncapsulation = new Long(34L);
    public static final Long DHCPARPCacheTimeout = new Long(35L);
    public static final Long DHCPEthernetEncapsulation = new Long(36L);
    public static final Long DHCPDefaultTCPTTL = new Long(37L);
    public static final Long DHCPKeepAliveInterval = new Long(38L);
    public static final Long DHCPKeepAliveGarbage = new Long(39L);
    public static final Long DHCPNISDomainName = new Long(40L);
    public static final Long DHCPNISServers = new Long(41L);
    public static final Long DHCPNTPServers = new Long(42L);
    public static final Long DHCPVendor = new Long(43L);
    public static final Long DHCPNETBIOSNameServers = new Long(44L);
    public static final Long DHCPNETBIOSDgmDistServers = new Long(45L);
    public static final Long DHCPNETBIOSNodeType = new Long(46L);
    public static final Long DHCPNETBIOS = new Long(47L);
    public static final Long DHCPXWindowFontServer = new Long(48L);
    public static final Long DHCPXWindowDisplayMgr = new Long(49L);
    public static final Long DHCPRequestedIPAddress = new Long(50L);
    public static final Long DHCPIPAddressLeaseTime = new Long(51L);
    public static final Long DHCPOverload = new Long(52L);
    public static final Long DHCPMessageType = new Long(53L);
    public static final Long DHCPDHCPServerIdentifier = new Long(54L);
    public static final Long DHCPParameterRequestList = new Long(55L);
    public static final Long DHCPDHCPErrorMessage = new Long(56L);
    public static final Long DHCPDHCPMaximumMsgSize = new Long(57L);
    public static final Long DHCPRenewalTime = new Long(58L);
    public static final Long DHCPRebindingTime = new Long(59L);
    public static final Long DHCPClassIdentifier = new Long(60L);
    public static final Long DHCPClientIdentifier = new Long(61L);
    public static final Long DHCPNetwareDomainName = new Long(62L);
    public static final Long DHCPNetwareSubOptions = new Long(63L);
    public static final Long DHCPNISClientDomainName = new Long(64L);
    public static final Long DHCPNISServerAddress = new Long(65L);
    public static final Long DHCPTFTPServerName = new Long(66L);
    public static final Long DHCPBootFileName = new Long(67L);
    public static final Long DHCPHomeAgentAddress = new Long(68L);
    public static final Long DHCPSMTPServerAddress = new Long(69L);
    public static final Long DHCPPOP3ServerAddress = new Long(70L);
    public static final Long DHCPNNTPServerAddress = new Long(71L);
    public static final Long DHCPWWWServerAddress = new Long(72L);
    public static final Long DHCPFingerServerAddress = new Long(73L);
    public static final Long DHCPIRCServerAddress = new Long(74L);
    public static final Long DHCPStreetTalkServerAddress = new Long(75L);
    public static final Long DHCPSTDAServerAddress = new Long(76L);
    public static final Long DHCPUserClass = new Long(77L);
    public static final Long DHCPDirectoryAgent = new Long(78L);
    public static final Long DHCPServiceScope = new Long(79L);
    public static final Long DHCPRapidCommit = new Long(80L);
    public static final Long DHCPClientFQDN = new Long(81L);
    public static final Long DHCPRelayAgentInformation = new Long(82L);
    public static final Long DHCPiSNS = new Long(83L);
    public static final Long DHCPNDSServers = new Long(85L);
    public static final Long DHCPNDSTreeName = new Long(86L);
    public static final Long DHCPNDSContext = new Long(87L);
    public static final Long DHCPAuthentication = new Long(90L);
    public static final Long DHCPClientLastTxnTime = new Long(91L);
    public static final Long DHCPassociatedip = new Long(92L);
    public static final Long DHCPClientSystem = new Long(93L);
    public static final Long DHCPClientNDI = new Long(94L);
    public static final Long DHCPLDAP = new Long(95L);
    public static final Long DHCPUUIDGUID = new Long(97L);
    public static final Long DHCPUserAuth = new Long(98L);
    public static final Long DHCPNetinfoAddress = new Long(112L);
    public static final Long DHCPNetinfoTag = new Long(113L);
    public static final Long DHCPURL = new Long(114L);
    public static final Long DHCPAutoConfig = new Long(116L);
    public static final Long DHCPNameServiceSearch = new Long(117L);
    public static final Long DHCPSubnetSelectionOption = new Long(118L);
    public static final Long DHCPDomainSearch = new Long(119L);
    public static final Long DHCPSIPServersDHCPOption = new Long(120L);
    public static final Long DHCPClasslessStaticRoute = new Long(121L);
    public static final Long DHCPCCC = new Long(122L);
    public static final Long DHCPGeoConfOption = new Long(123L);
    public static final Long DHCPVIVendorClass = new Long(124L);
    public static final Long DHCPVIVendorSpecific = new Long(125L);
    public static final Long DHCPEtherboot = new Long(128L);
    public static final Long DHCPTFTPServerIPAddress = new Long(128L);
    public static final Long DHCPCallServerIPaddress = new Long(129L);
    public static final Long DHCPEthernetInterface = new Long(130L);
    public static final Long DHCPVendorDiscriminationStr = new Long(130L);
    public static final Long DHCPRemoteStatsSvrIPAddress = new Long(131L);
    public static final Long DHCPIEEE8021PVLANID = new Long(132L);
    public static final Long DHCPIEEE8021QL2Priority = new Long(133L);
    public static final Long DHCPDiffservCodePoint = new Long(134L);
    public static final Long DHCPHTTPProxy = new Long(135L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L),new Long(16L),new Long(17L),new Long(18L),new Long(19L),new Long(20L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L),new Long(28L),new Long(29L),new Long(30L),new Long(31L),new Long(32L),new Long(33L),new Long(34L),new Long(35L),new Long(36L),new Long(37L),new Long(38L),new Long(39L),new Long(40L),new Long(41L),new Long(42L),new Long(43L),new Long(44L),new Long(45L),new Long(46L),new Long(47L),new Long(48L),new Long(49L),new Long(50L),new Long(51L),new Long(52L),new Long(53L),new Long(54L),new Long(55L),new Long(56L),new Long(57L),new Long(58L),new Long(59L),new Long(60L),new Long(61L),new Long(62L),new Long(63L),new Long(64L),new Long(65L),new Long(66L),new Long(67L),new Long(68L),new Long(69L),new Long(70L),new Long(71L),new Long(72L),new Long(73L),new Long(74L),new Long(75L),new Long(76L),new Long(77L),new Long(78L),new Long(79L),new Long(80L),new Long(81L),new Long(82L),new Long(83L),new Long(85L),new Long(86L),new Long(87L),new Long(90L),new Long(91L),new Long(92L),new Long(93L),new Long(94L),new Long(95L),new Long(97L),new Long(98L),new Long(112L),new Long(113L),new Long(114L),new Long(116L),new Long(117L),new Long(118L),new Long(119L),new Long(120L),new Long(121L),new Long(122L),new Long(123L),new Long(124L),new Long(125L),new Long(128L),new Long(129L),new Long(130L),new Long(131L),new Long(132L),new Long(133L),new Long(134L),new Long(135L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("DHCP-Subnet-Mask".equals(name)) return new Long(1L);
            if ("DHCP-Time-Offset".equals(name)) return new Long(2L);
            if ("DHCP-Router-Address".equals(name)) return new Long(3L);
            if ("DHCP-Time-Server".equals(name)) return new Long(4L);
            if ("DHCP-IEN-116-Name-Server".equals(name)) return new Long(5L);
            if ("DHCP-Domain-Name-Server".equals(name)) return new Long(6L);
            if ("DHCP-Log-Server".equals(name)) return new Long(7L);
            if ("DHCP-Quotes-Server".equals(name)) return new Long(8L);
            if ("DHCP-LPR-Server".equals(name)) return new Long(9L);
            if ("DHCP-Impress-Server".equals(name)) return new Long(10L);
            if ("DHCP-RLP-Server".equals(name)) return new Long(11L);
            if ("DHCP-Hostname".equals(name)) return new Long(12L);
            if ("DHCP-Boot-File-Size".equals(name)) return new Long(13L);
            if ("DHCP-Merit-Dump-File".equals(name)) return new Long(14L);
            if ("DHCP-Domain-Name".equals(name)) return new Long(15L);
            if ("DHCP-Swap-Server".equals(name)) return new Long(16L);
            if ("DHCP-Root-Path".equals(name)) return new Long(17L);
            if ("DHCP-Bootp-Extensions-Path".equals(name)) return new Long(18L);
            if ("DHCP-IP-Forward-Enable".equals(name)) return new Long(19L);
            if ("DHCP-Source-Route-Enable".equals(name)) return new Long(20L);
            if ("DHCP-Policy-Filter".equals(name)) return new Long(21L);
            if ("DHCP-Max-Datagram-Reassembly-Sz".equals(name)) return new Long(22L);
            if ("DHCP-Default-IP-TTL".equals(name)) return new Long(23L);
            if ("DHCP-Path-MTU-Aging-Timeout".equals(name)) return new Long(24L);
            if ("DHCP-Path-MTU-Plateau-Table".equals(name)) return new Long(25L);
            if ("DHCP-Interface-MTU-Size".equals(name)) return new Long(26L);
            if ("DHCP-All-Subnets-Are-Local".equals(name)) return new Long(27L);
            if ("DHCP-Broadcast-Address".equals(name)) return new Long(28L);
            if ("DHCP-Perform-Mask-Discovery".equals(name)) return new Long(29L);
            if ("DHCP-Provide-Mask-To-Others".equals(name)) return new Long(30L);
            if ("DHCP-Perform-Router-Discovery".equals(name)) return new Long(31L);
            if ("DHCP-Router-Solicitation-Address".equals(name)) return new Long(32L);
            if ("DHCP-Static-Routes".equals(name)) return new Long(33L);
            if ("DHCP-Trailer-Encapsulation".equals(name)) return new Long(34L);
            if ("DHCP-ARP-Cache-Timeout".equals(name)) return new Long(35L);
            if ("DHCP-Ethernet-Encapsulation".equals(name)) return new Long(36L);
            if ("DHCP-Default-TCP-TTL".equals(name)) return new Long(37L);
            if ("DHCP-Keep-Alive-Interval".equals(name)) return new Long(38L);
            if ("DHCP-Keep=Alive-Garbage".equals(name)) return new Long(39L);
            if ("DHCP-NIS-Domain-Name".equals(name)) return new Long(40L);
            if ("DHCP-NIS-Servers".equals(name)) return new Long(41L);
            if ("DHCP-NTP-Servers".equals(name)) return new Long(42L);
            if ("DHCP-Vendor".equals(name)) return new Long(43L);
            if ("DHCP-NETBIOS-Name-Servers".equals(name)) return new Long(44L);
            if ("DHCP-NETBIOS-Dgm-Dist-Servers".equals(name)) return new Long(45L);
            if ("DHCP-NETBIOS-Node-Type".equals(name)) return new Long(46L);
            if ("DHCP-NETBIOS".equals(name)) return new Long(47L);
            if ("DHCP-X-Window-Font-Server".equals(name)) return new Long(48L);
            if ("DHCP-X-Window-Display-Mgr".equals(name)) return new Long(49L);
            if ("DHCP-Requested-IP-Address".equals(name)) return new Long(50L);
            if ("DHCP-IP-Address-Lease-Time".equals(name)) return new Long(51L);
            if ("DHCP-Overload".equals(name)) return new Long(52L);
            if ("DHCP-Message-Type".equals(name)) return new Long(53L);
            if ("DHCP-DHCP-Server-Identifier".equals(name)) return new Long(54L);
            if ("DHCP-Parameter-Request-List".equals(name)) return new Long(55L);
            if ("DHCP-DHCP-Error-Message".equals(name)) return new Long(56L);
            if ("DHCP-DHCP-Maximum-Msg-Size".equals(name)) return new Long(57L);
            if ("DHCP-Renewal-Time".equals(name)) return new Long(58L);
            if ("DHCP-Rebinding-Time".equals(name)) return new Long(59L);
            if ("DHCP-Class-Identifier".equals(name)) return new Long(60L);
            if ("DHCP-Client-Identifier".equals(name)) return new Long(61L);
            if ("DHCP-Netware-Domain-Name".equals(name)) return new Long(62L);
            if ("DHCP-Netware-Sub-Options".equals(name)) return new Long(63L);
            if ("DHCP-NIS-Client-Domain-Name".equals(name)) return new Long(64L);
            if ("DHCP-NIS-Server-Address".equals(name)) return new Long(65L);
            if ("DHCP-TFTP-Server-Name".equals(name)) return new Long(66L);
            if ("DHCP-Boot-File-Name".equals(name)) return new Long(67L);
            if ("DHCP-Home-Agent-Address".equals(name)) return new Long(68L);
            if ("DHCP-SMTP-Server-Address".equals(name)) return new Long(69L);
            if ("DHCP-POP3-Server-Address".equals(name)) return new Long(70L);
            if ("DHCP-NNTP-Server-Address".equals(name)) return new Long(71L);
            if ("DHCP-WWW-Server-Address".equals(name)) return new Long(72L);
            if ("DHCP-Finger-Server-Address".equals(name)) return new Long(73L);
            if ("DHCP-IRC-Server-Address".equals(name)) return new Long(74L);
            if ("DHCP-StreetTalk-Server-Address".equals(name)) return new Long(75L);
            if ("DHCP-STDA-Server-Address".equals(name)) return new Long(76L);
            if ("DHCP-User-Class".equals(name)) return new Long(77L);
            if ("DHCP-Directory-Agent".equals(name)) return new Long(78L);
            if ("DHCP-Service-Scope".equals(name)) return new Long(79L);
            if ("DHCP-Rapid-Commit".equals(name)) return new Long(80L);
            if ("DHCP-Client-FQDN".equals(name)) return new Long(81L);
            if ("DHCP-Relay-Agent-Information".equals(name)) return new Long(82L);
            if ("DHCP-iSNS".equals(name)) return new Long(83L);
            if ("DHCP-NDS-Servers".equals(name)) return new Long(85L);
            if ("DHCP-NDS-Tree-Name".equals(name)) return new Long(86L);
            if ("DHCP-NDS-Context".equals(name)) return new Long(87L);
            if ("DHCP-Authentication".equals(name)) return new Long(90L);
            if ("DHCP-Client-Last-Txn-Time".equals(name)) return new Long(91L);
            if ("DHCP-associated-ip".equals(name)) return new Long(92L);
            if ("DHCP-Client-System".equals(name)) return new Long(93L);
            if ("DHCP-Client-NDI".equals(name)) return new Long(94L);
            if ("DHCP-LDAP".equals(name)) return new Long(95L);
            if ("DHCP-UUID/GUID".equals(name)) return new Long(97L);
            if ("DHCP-User-Auth".equals(name)) return new Long(98L);
            if ("DHCP-Netinfo-Address".equals(name)) return new Long(112L);
            if ("DHCP-Netinfo-Tag".equals(name)) return new Long(113L);
            if ("DHCP-URL".equals(name)) return new Long(114L);
            if ("DHCP-Auto-Config".equals(name)) return new Long(116L);
            if ("DHCP-Name-Service-Search".equals(name)) return new Long(117L);
            if ("DHCP-Subnet-Selection-Option".equals(name)) return new Long(118L);
            if ("DHCP-Domain-Search".equals(name)) return new Long(119L);
            if ("DHCP-SIP-Servers-DHCP-Option".equals(name)) return new Long(120L);
            if ("DHCP-Classless-Static-Route".equals(name)) return new Long(121L);
            if ("DHCP-CCC".equals(name)) return new Long(122L);
            if ("DHCP-GeoConf-Option".equals(name)) return new Long(123L);
            if ("DHCP-V-I-Vendor-Class".equals(name)) return new Long(124L);
            if ("DHCP-V-I-Vendor-Specific".equals(name)) return new Long(125L);
            if ("DHCP-Etherboot".equals(name)) return new Long(128L);
            if ("DHCP-TFTP-Server-IP-Address".equals(name)) return new Long(128L);
            if ("DHCP-Call-Server-IP-address".equals(name)) return new Long(129L);
            if ("DHCP-Ethernet-Interface".equals(name)) return new Long(130L);
            if ("DHCP-Vendor-Discrimination-Str".equals(name)) return new Long(130L);
            if ("DHCP-Remote-Stats-Svr-IP-Address".equals(name)) return new Long(131L);
            if ("DHCP-IEEE-802.1P-VLAN-ID".equals(name)) return new Long(132L);
            if ("DHCP-IEEE-802.1Q-L2-Priority".equals(name)) return new Long(133L);
            if ("DHCP-Diffserv-Code-Point".equals(name)) return new Long(134L);
            if ("DHCP-HTTP-Proxy".equals(name)) return new Long(135L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "DHCP-Subnet-Mask";
            if (new Long(2L).equals(value)) return "DHCP-Time-Offset";
            if (new Long(3L).equals(value)) return "DHCP-Router-Address";
            if (new Long(4L).equals(value)) return "DHCP-Time-Server";
            if (new Long(5L).equals(value)) return "DHCP-IEN-116-Name-Server";
            if (new Long(6L).equals(value)) return "DHCP-Domain-Name-Server";
            if (new Long(7L).equals(value)) return "DHCP-Log-Server";
            if (new Long(8L).equals(value)) return "DHCP-Quotes-Server";
            if (new Long(9L).equals(value)) return "DHCP-LPR-Server";
            if (new Long(10L).equals(value)) return "DHCP-Impress-Server";
            if (new Long(11L).equals(value)) return "DHCP-RLP-Server";
            if (new Long(12L).equals(value)) return "DHCP-Hostname";
            if (new Long(13L).equals(value)) return "DHCP-Boot-File-Size";
            if (new Long(14L).equals(value)) return "DHCP-Merit-Dump-File";
            if (new Long(15L).equals(value)) return "DHCP-Domain-Name";
            if (new Long(16L).equals(value)) return "DHCP-Swap-Server";
            if (new Long(17L).equals(value)) return "DHCP-Root-Path";
            if (new Long(18L).equals(value)) return "DHCP-Bootp-Extensions-Path";
            if (new Long(19L).equals(value)) return "DHCP-IP-Forward-Enable";
            if (new Long(20L).equals(value)) return "DHCP-Source-Route-Enable";
            if (new Long(21L).equals(value)) return "DHCP-Policy-Filter";
            if (new Long(22L).equals(value)) return "DHCP-Max-Datagram-Reassembly-Sz";
            if (new Long(23L).equals(value)) return "DHCP-Default-IP-TTL";
            if (new Long(24L).equals(value)) return "DHCP-Path-MTU-Aging-Timeout";
            if (new Long(25L).equals(value)) return "DHCP-Path-MTU-Plateau-Table";
            if (new Long(26L).equals(value)) return "DHCP-Interface-MTU-Size";
            if (new Long(27L).equals(value)) return "DHCP-All-Subnets-Are-Local";
            if (new Long(28L).equals(value)) return "DHCP-Broadcast-Address";
            if (new Long(29L).equals(value)) return "DHCP-Perform-Mask-Discovery";
            if (new Long(30L).equals(value)) return "DHCP-Provide-Mask-To-Others";
            if (new Long(31L).equals(value)) return "DHCP-Perform-Router-Discovery";
            if (new Long(32L).equals(value)) return "DHCP-Router-Solicitation-Address";
            if (new Long(33L).equals(value)) return "DHCP-Static-Routes";
            if (new Long(34L).equals(value)) return "DHCP-Trailer-Encapsulation";
            if (new Long(35L).equals(value)) return "DHCP-ARP-Cache-Timeout";
            if (new Long(36L).equals(value)) return "DHCP-Ethernet-Encapsulation";
            if (new Long(37L).equals(value)) return "DHCP-Default-TCP-TTL";
            if (new Long(38L).equals(value)) return "DHCP-Keep-Alive-Interval";
            if (new Long(39L).equals(value)) return "DHCP-Keep=Alive-Garbage";
            if (new Long(40L).equals(value)) return "DHCP-NIS-Domain-Name";
            if (new Long(41L).equals(value)) return "DHCP-NIS-Servers";
            if (new Long(42L).equals(value)) return "DHCP-NTP-Servers";
            if (new Long(43L).equals(value)) return "DHCP-Vendor";
            if (new Long(44L).equals(value)) return "DHCP-NETBIOS-Name-Servers";
            if (new Long(45L).equals(value)) return "DHCP-NETBIOS-Dgm-Dist-Servers";
            if (new Long(46L).equals(value)) return "DHCP-NETBIOS-Node-Type";
            if (new Long(47L).equals(value)) return "DHCP-NETBIOS";
            if (new Long(48L).equals(value)) return "DHCP-X-Window-Font-Server";
            if (new Long(49L).equals(value)) return "DHCP-X-Window-Display-Mgr";
            if (new Long(50L).equals(value)) return "DHCP-Requested-IP-Address";
            if (new Long(51L).equals(value)) return "DHCP-IP-Address-Lease-Time";
            if (new Long(52L).equals(value)) return "DHCP-Overload";
            if (new Long(53L).equals(value)) return "DHCP-Message-Type";
            if (new Long(54L).equals(value)) return "DHCP-DHCP-Server-Identifier";
            if (new Long(55L).equals(value)) return "DHCP-Parameter-Request-List";
            if (new Long(56L).equals(value)) return "DHCP-DHCP-Error-Message";
            if (new Long(57L).equals(value)) return "DHCP-DHCP-Maximum-Msg-Size";
            if (new Long(58L).equals(value)) return "DHCP-Renewal-Time";
            if (new Long(59L).equals(value)) return "DHCP-Rebinding-Time";
            if (new Long(60L).equals(value)) return "DHCP-Class-Identifier";
            if (new Long(61L).equals(value)) return "DHCP-Client-Identifier";
            if (new Long(62L).equals(value)) return "DHCP-Netware-Domain-Name";
            if (new Long(63L).equals(value)) return "DHCP-Netware-Sub-Options";
            if (new Long(64L).equals(value)) return "DHCP-NIS-Client-Domain-Name";
            if (new Long(65L).equals(value)) return "DHCP-NIS-Server-Address";
            if (new Long(66L).equals(value)) return "DHCP-TFTP-Server-Name";
            if (new Long(67L).equals(value)) return "DHCP-Boot-File-Name";
            if (new Long(68L).equals(value)) return "DHCP-Home-Agent-Address";
            if (new Long(69L).equals(value)) return "DHCP-SMTP-Server-Address";
            if (new Long(70L).equals(value)) return "DHCP-POP3-Server-Address";
            if (new Long(71L).equals(value)) return "DHCP-NNTP-Server-Address";
            if (new Long(72L).equals(value)) return "DHCP-WWW-Server-Address";
            if (new Long(73L).equals(value)) return "DHCP-Finger-Server-Address";
            if (new Long(74L).equals(value)) return "DHCP-IRC-Server-Address";
            if (new Long(75L).equals(value)) return "DHCP-StreetTalk-Server-Address";
            if (new Long(76L).equals(value)) return "DHCP-STDA-Server-Address";
            if (new Long(77L).equals(value)) return "DHCP-User-Class";
            if (new Long(78L).equals(value)) return "DHCP-Directory-Agent";
            if (new Long(79L).equals(value)) return "DHCP-Service-Scope";
            if (new Long(80L).equals(value)) return "DHCP-Rapid-Commit";
            if (new Long(81L).equals(value)) return "DHCP-Client-FQDN";
            if (new Long(82L).equals(value)) return "DHCP-Relay-Agent-Information";
            if (new Long(83L).equals(value)) return "DHCP-iSNS";
            if (new Long(85L).equals(value)) return "DHCP-NDS-Servers";
            if (new Long(86L).equals(value)) return "DHCP-NDS-Tree-Name";
            if (new Long(87L).equals(value)) return "DHCP-NDS-Context";
            if (new Long(90L).equals(value)) return "DHCP-Authentication";
            if (new Long(91L).equals(value)) return "DHCP-Client-Last-Txn-Time";
            if (new Long(92L).equals(value)) return "DHCP-associated-ip";
            if (new Long(93L).equals(value)) return "DHCP-Client-System";
            if (new Long(94L).equals(value)) return "DHCP-Client-NDI";
            if (new Long(95L).equals(value)) return "DHCP-LDAP";
            if (new Long(97L).equals(value)) return "DHCP-UUID/GUID";
            if (new Long(98L).equals(value)) return "DHCP-User-Auth";
            if (new Long(112L).equals(value)) return "DHCP-Netinfo-Address";
            if (new Long(113L).equals(value)) return "DHCP-Netinfo-Tag";
            if (new Long(114L).equals(value)) return "DHCP-URL";
            if (new Long(116L).equals(value)) return "DHCP-Auto-Config";
            if (new Long(117L).equals(value)) return "DHCP-Name-Service-Search";
            if (new Long(118L).equals(value)) return "DHCP-Subnet-Selection-Option";
            if (new Long(119L).equals(value)) return "DHCP-Domain-Search";
            if (new Long(120L).equals(value)) return "DHCP-SIP-Servers-DHCP-Option";
            if (new Long(121L).equals(value)) return "DHCP-Classless-Static-Route";
            if (new Long(122L).equals(value)) return "DHCP-CCC";
            if (new Long(123L).equals(value)) return "DHCP-GeoConf-Option";
            if (new Long(124L).equals(value)) return "DHCP-V-I-Vendor-Class";
            if (new Long(125L).equals(value)) return "DHCP-V-I-Vendor-Specific";
            if (new Long(128L).equals(value)) return "DHCP-Etherboot";
            if (new Long(129L).equals(value)) return "DHCP-Call-Server-IP-address";
            if (new Long(130L).equals(value)) return "DHCP-Ethernet-Interface";
            if (new Long(131L).equals(value)) return "DHCP-Remote-Stats-Svr-IP-Address";
            if (new Long(132L).equals(value)) return "DHCP-IEEE-802.1P-VLAN-ID";
            if (new Long(133L).equals(value)) return "DHCP-IEEE-802.1Q-L2-Priority";
            if (new Long(134L).equals(value)) return "DHCP-Diffserv-Code-Point";
            if (new Long(135L).equals(value)) return "DHCP-HTTP-Proxy";
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
        setFormat("2,1");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_DHCPParameterRequestList()
    {
        setup();
    }

    public Attr_DHCPParameterRequestList(Serializable o)
    {
        setup(o);
    }
}
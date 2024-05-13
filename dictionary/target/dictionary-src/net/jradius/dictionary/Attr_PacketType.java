// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Packet-Type<br>
 * Attribute Type: 1047 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Access-Request (1)
 * <li> Access-Accept (2)
 * <li> Access-Reject (3)
 * <li> Accounting-Request (4)
 * <li> Accounting-Response (5)
 * <li> Accounting-Status (6)
 * <li> Password-Request (7)
 * <li> Password-Accept (8)
 * <li> Password-Reject (9)
 * <li> Accounting-Message (10)
 * <li> Access-Challenge (11)
 * <li> Status-Server (12)
 * <li> Status-Client (13)
 * <li> Resource-Free-Request (21)
 * <li> Resource-Free-Response (22)
 * <li> Resource-Query-Request (23)
 * <li> Resource-Query-Response (24)
 * <li> Alternate-Resource-Reclaim-Request (25)
 * <li> NAS-Reboot-Request (26)
 * <li> NAS-Reboot-Response (27)
 * <li> Next-Passcode (29)
 * <li> New-Pin (30)
 * <li> Terminate-Session (31)
 * <li> Password-Expired (32)
 * <li> Event-Request (33)
 * <li> Event-Response (34)
 * <li> Disconnect-Request (40)
 * <li> Disconnect-ACK (41)
 * <li> Disconnect-NAK (42)
 * <li> CoA-Request (43)
 * <li> CoA-ACK (44)
 * <li> CoA-NAK (45)
 * <li> IP-Address-Allocate (50)
 * <li> IP-Address-Release (51)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PacketType extends RadiusAttribute
{
    public static final String NAME = "Packet-Type";
    public static final long TYPE = 1047;

    public static final long serialVersionUID = TYPE;

    public static final Long AccessRequest = new Long(1L);
    public static final Long AccessAccept = new Long(2L);
    public static final Long AccessReject = new Long(3L);
    public static final Long AccountingRequest = new Long(4L);
    public static final Long AccountingResponse = new Long(5L);
    public static final Long AccountingStatus = new Long(6L);
    public static final Long PasswordRequest = new Long(7L);
    public static final Long PasswordAccept = new Long(8L);
    public static final Long PasswordReject = new Long(9L);
    public static final Long AccountingMessage = new Long(10L);
    public static final Long AccessChallenge = new Long(11L);
    public static final Long StatusServer = new Long(12L);
    public static final Long StatusClient = new Long(13L);
    public static final Long ResourceFreeRequest = new Long(21L);
    public static final Long ResourceFreeResponse = new Long(22L);
    public static final Long ResourceQueryRequest = new Long(23L);
    public static final Long ResourceQueryResponse = new Long(24L);
    public static final Long AlternateResourceReclaimRequest = new Long(25L);
    public static final Long NASRebootRequest = new Long(26L);
    public static final Long NASRebootResponse = new Long(27L);
    public static final Long NextPasscode = new Long(29L);
    public static final Long NewPin = new Long(30L);
    public static final Long TerminateSession = new Long(31L);
    public static final Long PasswordExpired = new Long(32L);
    public static final Long EventRequest = new Long(33L);
    public static final Long EventResponse = new Long(34L);
    public static final Long DisconnectRequest = new Long(40L);
    public static final Long DisconnectACK = new Long(41L);
    public static final Long DisconnectNAK = new Long(42L);
    public static final Long CoARequest = new Long(43L);
    public static final Long CoAACK = new Long(44L);
    public static final Long CoANAK = new Long(45L);
    public static final Long IPAddressAllocate = new Long(50L);
    public static final Long IPAddressRelease = new Long(51L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L),new Long(29L),new Long(30L),new Long(31L),new Long(32L),new Long(33L),new Long(34L),new Long(40L),new Long(41L),new Long(42L),new Long(43L),new Long(44L),new Long(45L),new Long(50L),new Long(51L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Access-Request".equals(name)) return new Long(1L);
            if ("Access-Accept".equals(name)) return new Long(2L);
            if ("Access-Reject".equals(name)) return new Long(3L);
            if ("Accounting-Request".equals(name)) return new Long(4L);
            if ("Accounting-Response".equals(name)) return new Long(5L);
            if ("Accounting-Status".equals(name)) return new Long(6L);
            if ("Password-Request".equals(name)) return new Long(7L);
            if ("Password-Accept".equals(name)) return new Long(8L);
            if ("Password-Reject".equals(name)) return new Long(9L);
            if ("Accounting-Message".equals(name)) return new Long(10L);
            if ("Access-Challenge".equals(name)) return new Long(11L);
            if ("Status-Server".equals(name)) return new Long(12L);
            if ("Status-Client".equals(name)) return new Long(13L);
            if ("Resource-Free-Request".equals(name)) return new Long(21L);
            if ("Resource-Free-Response".equals(name)) return new Long(22L);
            if ("Resource-Query-Request".equals(name)) return new Long(23L);
            if ("Resource-Query-Response".equals(name)) return new Long(24L);
            if ("Alternate-Resource-Reclaim-Request".equals(name)) return new Long(25L);
            if ("NAS-Reboot-Request".equals(name)) return new Long(26L);
            if ("NAS-Reboot-Response".equals(name)) return new Long(27L);
            if ("Next-Passcode".equals(name)) return new Long(29L);
            if ("New-Pin".equals(name)) return new Long(30L);
            if ("Terminate-Session".equals(name)) return new Long(31L);
            if ("Password-Expired".equals(name)) return new Long(32L);
            if ("Event-Request".equals(name)) return new Long(33L);
            if ("Event-Response".equals(name)) return new Long(34L);
            if ("Disconnect-Request".equals(name)) return new Long(40L);
            if ("Disconnect-ACK".equals(name)) return new Long(41L);
            if ("Disconnect-NAK".equals(name)) return new Long(42L);
            if ("CoA-Request".equals(name)) return new Long(43L);
            if ("CoA-ACK".equals(name)) return new Long(44L);
            if ("CoA-NAK".equals(name)) return new Long(45L);
            if ("IP-Address-Allocate".equals(name)) return new Long(50L);
            if ("IP-Address-Release".equals(name)) return new Long(51L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Access-Request";
            if (new Long(2L).equals(value)) return "Access-Accept";
            if (new Long(3L).equals(value)) return "Access-Reject";
            if (new Long(4L).equals(value)) return "Accounting-Request";
            if (new Long(5L).equals(value)) return "Accounting-Response";
            if (new Long(6L).equals(value)) return "Accounting-Status";
            if (new Long(7L).equals(value)) return "Password-Request";
            if (new Long(8L).equals(value)) return "Password-Accept";
            if (new Long(9L).equals(value)) return "Password-Reject";
            if (new Long(10L).equals(value)) return "Accounting-Message";
            if (new Long(11L).equals(value)) return "Access-Challenge";
            if (new Long(12L).equals(value)) return "Status-Server";
            if (new Long(13L).equals(value)) return "Status-Client";
            if (new Long(21L).equals(value)) return "Resource-Free-Request";
            if (new Long(22L).equals(value)) return "Resource-Free-Response";
            if (new Long(23L).equals(value)) return "Resource-Query-Request";
            if (new Long(24L).equals(value)) return "Resource-Query-Response";
            if (new Long(25L).equals(value)) return "Alternate-Resource-Reclaim-Request";
            if (new Long(26L).equals(value)) return "NAS-Reboot-Request";
            if (new Long(27L).equals(value)) return "NAS-Reboot-Response";
            if (new Long(29L).equals(value)) return "Next-Passcode";
            if (new Long(30L).equals(value)) return "New-Pin";
            if (new Long(31L).equals(value)) return "Terminate-Session";
            if (new Long(32L).equals(value)) return "Password-Expired";
            if (new Long(33L).equals(value)) return "Event-Request";
            if (new Long(34L).equals(value)) return "Event-Response";
            if (new Long(40L).equals(value)) return "Disconnect-Request";
            if (new Long(41L).equals(value)) return "Disconnect-ACK";
            if (new Long(42L).equals(value)) return "Disconnect-NAK";
            if (new Long(43L).equals(value)) return "CoA-Request";
            if (new Long(44L).equals(value)) return "CoA-ACK";
            if (new Long(45L).equals(value)) return "CoA-NAK";
            if (new Long(50L).equals(value)) return "IP-Address-Allocate";
            if (new Long(51L).equals(value)) return "IP-Address-Release";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 1047;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_PacketType()
    {
        setup();
    }

    public Attr_PacketType(Serializable o)
    {
        setup(o);
    }
}

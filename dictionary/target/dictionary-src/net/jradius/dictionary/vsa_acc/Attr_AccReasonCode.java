// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_acc;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Acc-Reason-Code<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5<br>
 * VSA Type: 1<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> No-reason-No-Failure (0)
 * <li> Resource-shortage (1)
 * <li> Session-already-open (2)
 * <li> Too-many-RADIUS-users (3)
 * <li> No-authentification-server (4)
 * <li> No-authentification-response (5)
 * <li> No-accounting-server (6)
 * <li> No-accounting-response (7)
 * <li> Access-Denied (8)
 * <li> Temporary-buffer-shortage (9)
 * <li> Protocol-error (10)
 * <li> Invalid-attribute (11)
 * <li> Invalid-service-type (12)
 * <li> Invalid-framed-protocol (13)
 * <li> Invalid-attribute-value (14)
 * <li> Invalid-user-information (15)
 * <li> Invalid-IP-address (16)
 * <li> Invalid-integer-syntax (17)
 * <li> Invalid-NAS-port (18)
 * <li> Requested-by-user (19)
 * <li> Network-disconnect (20)
 * <li> Service-interruption (21)
 * <li> Physical-port-error (22)
 * <li> Idle-timeout (23)
 * <li> Session-timeout (24)
 * <li> Administrative-reset (25)
 * <li> NAS-reload-or-reset (26)
 * <li> NAS-error (27)
 * <li> NAS-request (28)
 * <li> Undefined-reason-given (29)
 * <li> Conflicting-attributes (30)
 * <li> Port-limit-exceeded (31)
 * <li> Facility-not-available (32)
 * <li> Internal-config-error (33)
 * <li> Bad-route-specification (34)
 * <li> Access-Partition-bind-failure (35)
 * <li> Security-violation (36)
 * <li> Request-type-conflict (37)
 * <li> Configuration-disallowed (38)
 * <li> Missing-attribute (39)
 * <li> Invalid-request (40)
 * <li> Missing-parameter (41)
 * <li> Invalid-parameter (42)
 * <li> Call-cleared-with-cause (43)
 * <li> Inopportune-config-request (44)
 * <li> Invalid-config-parameter (45)
 * <li> Missing-config-parameter (46)
 * <li> Incompatible-service-profile (47)
 * <li> Administrative-reset-2 (48)
 * <li> Administrative-reload (49)
 * <li> Port-unneeded (50)
 * <li> Port-preempted (51)
 * <li> Port-suspended (52)
 * <li> Service-unavailable (53)
 * <li> Callback (54)
 * <li> User-error (55)
 * <li> Host-request (56)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AccReasonCode extends VSAttribute
{
    public static final String NAME = "Acc-Reason-Code";
    public static final int VENDOR_ID = 5;
    public static final int VSA_TYPE = 1;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long NoreasonNoFailure = new Long(0L);
    public static final Long Resourceshortage = new Long(1L);
    public static final Long Sessionalreadyopen = new Long(2L);
    public static final Long ToomanyRADIUSusers = new Long(3L);
    public static final Long Noauthentificationserver = new Long(4L);
    public static final Long Noauthentificationresponse = new Long(5L);
    public static final Long Noaccountingserver = new Long(6L);
    public static final Long Noaccountingresponse = new Long(7L);
    public static final Long AccessDenied = new Long(8L);
    public static final Long Temporarybuffershortage = new Long(9L);
    public static final Long Protocolerror = new Long(10L);
    public static final Long Invalidattribute = new Long(11L);
    public static final Long Invalidservicetype = new Long(12L);
    public static final Long Invalidframedprotocol = new Long(13L);
    public static final Long Invalidattributevalue = new Long(14L);
    public static final Long Invaliduserinformation = new Long(15L);
    public static final Long InvalidIPaddress = new Long(16L);
    public static final Long Invalidintegersyntax = new Long(17L);
    public static final Long InvalidNASport = new Long(18L);
    public static final Long Requestedbyuser = new Long(19L);
    public static final Long Networkdisconnect = new Long(20L);
    public static final Long Serviceinterruption = new Long(21L);
    public static final Long Physicalporterror = new Long(22L);
    public static final Long Idletimeout = new Long(23L);
    public static final Long Sessiontimeout = new Long(24L);
    public static final Long Administrativereset = new Long(25L);
    public static final Long NASreloadorreset = new Long(26L);
    public static final Long NASerror = new Long(27L);
    public static final Long NASrequest = new Long(28L);
    public static final Long Undefinedreasongiven = new Long(29L);
    public static final Long Conflictingattributes = new Long(30L);
    public static final Long Portlimitexceeded = new Long(31L);
    public static final Long Facilitynotavailable = new Long(32L);
    public static final Long Internalconfigerror = new Long(33L);
    public static final Long Badroutespecification = new Long(34L);
    public static final Long AccessPartitionbindfailure = new Long(35L);
    public static final Long Securityviolation = new Long(36L);
    public static final Long Requesttypeconflict = new Long(37L);
    public static final Long Configurationdisallowed = new Long(38L);
    public static final Long Missingattribute = new Long(39L);
    public static final Long Invalidrequest = new Long(40L);
    public static final Long Missingparameter = new Long(41L);
    public static final Long Invalidparameter = new Long(42L);
    public static final Long Callclearedwithcause = new Long(43L);
    public static final Long Inopportuneconfigrequest = new Long(44L);
    public static final Long Invalidconfigparameter = new Long(45L);
    public static final Long Missingconfigparameter = new Long(46L);
    public static final Long Incompatibleserviceprofile = new Long(47L);
    public static final Long Administrativereset2 = new Long(48L);
    public static final Long Administrativereload = new Long(49L);
    public static final Long Portunneeded = new Long(50L);
    public static final Long Portpreempted = new Long(51L);
    public static final Long Portsuspended = new Long(52L);
    public static final Long Serviceunavailable = new Long(53L);
    public static final Long Callback = new Long(54L);
    public static final Long Usererror = new Long(55L);
    public static final Long Hostrequest = new Long(56L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L),new Long(16L),new Long(17L),new Long(18L),new Long(19L),new Long(20L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L),new Long(28L),new Long(29L),new Long(30L),new Long(31L),new Long(32L),new Long(33L),new Long(34L),new Long(35L),new Long(36L),new Long(37L),new Long(38L),new Long(39L),new Long(40L),new Long(41L),new Long(42L),new Long(43L),new Long(44L),new Long(45L),new Long(46L),new Long(47L),new Long(48L),new Long(49L),new Long(50L),new Long(51L),new Long(52L),new Long(53L),new Long(54L),new Long(55L),new Long(56L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("No-reason-No-Failure".equals(name)) return new Long(0L);
            if ("Resource-shortage".equals(name)) return new Long(1L);
            if ("Session-already-open".equals(name)) return new Long(2L);
            if ("Too-many-RADIUS-users".equals(name)) return new Long(3L);
            if ("No-authentification-server".equals(name)) return new Long(4L);
            if ("No-authentification-response".equals(name)) return new Long(5L);
            if ("No-accounting-server".equals(name)) return new Long(6L);
            if ("No-accounting-response".equals(name)) return new Long(7L);
            if ("Access-Denied".equals(name)) return new Long(8L);
            if ("Temporary-buffer-shortage".equals(name)) return new Long(9L);
            if ("Protocol-error".equals(name)) return new Long(10L);
            if ("Invalid-attribute".equals(name)) return new Long(11L);
            if ("Invalid-service-type".equals(name)) return new Long(12L);
            if ("Invalid-framed-protocol".equals(name)) return new Long(13L);
            if ("Invalid-attribute-value".equals(name)) return new Long(14L);
            if ("Invalid-user-information".equals(name)) return new Long(15L);
            if ("Invalid-IP-address".equals(name)) return new Long(16L);
            if ("Invalid-integer-syntax".equals(name)) return new Long(17L);
            if ("Invalid-NAS-port".equals(name)) return new Long(18L);
            if ("Requested-by-user".equals(name)) return new Long(19L);
            if ("Network-disconnect".equals(name)) return new Long(20L);
            if ("Service-interruption".equals(name)) return new Long(21L);
            if ("Physical-port-error".equals(name)) return new Long(22L);
            if ("Idle-timeout".equals(name)) return new Long(23L);
            if ("Session-timeout".equals(name)) return new Long(24L);
            if ("Administrative-reset".equals(name)) return new Long(25L);
            if ("NAS-reload-or-reset".equals(name)) return new Long(26L);
            if ("NAS-error".equals(name)) return new Long(27L);
            if ("NAS-request".equals(name)) return new Long(28L);
            if ("Undefined-reason-given".equals(name)) return new Long(29L);
            if ("Conflicting-attributes".equals(name)) return new Long(30L);
            if ("Port-limit-exceeded".equals(name)) return new Long(31L);
            if ("Facility-not-available".equals(name)) return new Long(32L);
            if ("Internal-config-error".equals(name)) return new Long(33L);
            if ("Bad-route-specification".equals(name)) return new Long(34L);
            if ("Access-Partition-bind-failure".equals(name)) return new Long(35L);
            if ("Security-violation".equals(name)) return new Long(36L);
            if ("Request-type-conflict".equals(name)) return new Long(37L);
            if ("Configuration-disallowed".equals(name)) return new Long(38L);
            if ("Missing-attribute".equals(name)) return new Long(39L);
            if ("Invalid-request".equals(name)) return new Long(40L);
            if ("Missing-parameter".equals(name)) return new Long(41L);
            if ("Invalid-parameter".equals(name)) return new Long(42L);
            if ("Call-cleared-with-cause".equals(name)) return new Long(43L);
            if ("Inopportune-config-request".equals(name)) return new Long(44L);
            if ("Invalid-config-parameter".equals(name)) return new Long(45L);
            if ("Missing-config-parameter".equals(name)) return new Long(46L);
            if ("Incompatible-service-profile".equals(name)) return new Long(47L);
            if ("Administrative-reset-2".equals(name)) return new Long(48L);
            if ("Administrative-reload".equals(name)) return new Long(49L);
            if ("Port-unneeded".equals(name)) return new Long(50L);
            if ("Port-preempted".equals(name)) return new Long(51L);
            if ("Port-suspended".equals(name)) return new Long(52L);
            if ("Service-unavailable".equals(name)) return new Long(53L);
            if ("Callback".equals(name)) return new Long(54L);
            if ("User-error".equals(name)) return new Long(55L);
            if ("Host-request".equals(name)) return new Long(56L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "No-reason-No-Failure";
            if (new Long(1L).equals(value)) return "Resource-shortage";
            if (new Long(2L).equals(value)) return "Session-already-open";
            if (new Long(3L).equals(value)) return "Too-many-RADIUS-users";
            if (new Long(4L).equals(value)) return "No-authentification-server";
            if (new Long(5L).equals(value)) return "No-authentification-response";
            if (new Long(6L).equals(value)) return "No-accounting-server";
            if (new Long(7L).equals(value)) return "No-accounting-response";
            if (new Long(8L).equals(value)) return "Access-Denied";
            if (new Long(9L).equals(value)) return "Temporary-buffer-shortage";
            if (new Long(10L).equals(value)) return "Protocol-error";
            if (new Long(11L).equals(value)) return "Invalid-attribute";
            if (new Long(12L).equals(value)) return "Invalid-service-type";
            if (new Long(13L).equals(value)) return "Invalid-framed-protocol";
            if (new Long(14L).equals(value)) return "Invalid-attribute-value";
            if (new Long(15L).equals(value)) return "Invalid-user-information";
            if (new Long(16L).equals(value)) return "Invalid-IP-address";
            if (new Long(17L).equals(value)) return "Invalid-integer-syntax";
            if (new Long(18L).equals(value)) return "Invalid-NAS-port";
            if (new Long(19L).equals(value)) return "Requested-by-user";
            if (new Long(20L).equals(value)) return "Network-disconnect";
            if (new Long(21L).equals(value)) return "Service-interruption";
            if (new Long(22L).equals(value)) return "Physical-port-error";
            if (new Long(23L).equals(value)) return "Idle-timeout";
            if (new Long(24L).equals(value)) return "Session-timeout";
            if (new Long(25L).equals(value)) return "Administrative-reset";
            if (new Long(26L).equals(value)) return "NAS-reload-or-reset";
            if (new Long(27L).equals(value)) return "NAS-error";
            if (new Long(28L).equals(value)) return "NAS-request";
            if (new Long(29L).equals(value)) return "Undefined-reason-given";
            if (new Long(30L).equals(value)) return "Conflicting-attributes";
            if (new Long(31L).equals(value)) return "Port-limit-exceeded";
            if (new Long(32L).equals(value)) return "Facility-not-available";
            if (new Long(33L).equals(value)) return "Internal-config-error";
            if (new Long(34L).equals(value)) return "Bad-route-specification";
            if (new Long(35L).equals(value)) return "Access-Partition-bind-failure";
            if (new Long(36L).equals(value)) return "Security-violation";
            if (new Long(37L).equals(value)) return "Request-type-conflict";
            if (new Long(38L).equals(value)) return "Configuration-disallowed";
            if (new Long(39L).equals(value)) return "Missing-attribute";
            if (new Long(40L).equals(value)) return "Invalid-request";
            if (new Long(41L).equals(value)) return "Missing-parameter";
            if (new Long(42L).equals(value)) return "Invalid-parameter";
            if (new Long(43L).equals(value)) return "Call-cleared-with-cause";
            if (new Long(44L).equals(value)) return "Inopportune-config-request";
            if (new Long(45L).equals(value)) return "Invalid-config-parameter";
            if (new Long(46L).equals(value)) return "Missing-config-parameter";
            if (new Long(47L).equals(value)) return "Incompatible-service-profile";
            if (new Long(48L).equals(value)) return "Administrative-reset-2";
            if (new Long(49L).equals(value)) return "Administrative-reload";
            if (new Long(50L).equals(value)) return "Port-unneeded";
            if (new Long(51L).equals(value)) return "Port-preempted";
            if (new Long(52L).equals(value)) return "Port-suspended";
            if (new Long(53L).equals(value)) return "Service-unavailable";
            if (new Long(54L).equals(value)) return "Callback";
            if (new Long(55L).equals(value)) return "User-error";
            if (new Long(56L).equals(value)) return "Host-request";
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
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_AccReasonCode()
    {
        setup();
    }

    public Attr_AccReasonCode(Serializable o)
    {
        setup(o);
    }
}

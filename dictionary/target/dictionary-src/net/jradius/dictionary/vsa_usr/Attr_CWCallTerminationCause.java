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
 * Attribute Name: CW-Call-Termination-Cause<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x8036<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> CAUSE-UNKNOWN (0)
 * <li> CAUSE-CLD-PARTY-TERMINATE (1)
 * <li> CAUSE-CLG-PARTY-TERMINATE (2)
 * <li> CAUSE-ACCT-BAL-DEPLETED (3)
 * <li> CAUSE-NO-EGR-PORTS-AVAIL (4)
 * <li> CAUSE-H225-UNABLE-TO-CON (5)
 * <li> CAUSE-H245-UNABLE-TO-CON (6)
 * <li> CAUSE-INGR-FACILITY-DISC (7)
 * <li> CAUSE-EGR-FACILITY-DISC (8)
 * <li> CAUSE-DIR-SERVER-DOWN (9)
 * <li> CAUSE-RATING-SERVER-DOWN (10)
 * <li> CAUSE-GATEWAY-SHUTDOWN (11)
 * <li> CAUSE-GTKPR-TERMINATE (12)
 * <li> CAUSE-GTKPR-SHUTDOWN-GTWAY (13)
 * <li> CAUSE-BUSY (14)
 * <li> CAUSE-ABANDON (15)
 * <li> CAUSE-INVALID-LOGIN-LIMIT (16)
 * <li> CAUSE-NOACCTNUMBER-ENTRY (17)
 * <li> CAUSE-SUSPENDED-ACCT-LOGIN (18)
 * <li> CAUSE-AUTHENT-SERVER-DOWN (19)
 * <li> CAUSE-GATEKEEPER-TIMEOUT (20)
 * <li> CAUSE-GATEWAY-NO-RESOURCES (21)
 * <li> CAUSE-ACCT-INUSE (22)
 * <li> CAUSE-DEBIT-ACCT-BAL-ZERO (23)
 * <li> CAUSE-DEBIT-ACCTBAL-INSUFF (24)
 * <li> CAUSE-INVALID-DESTNUMBER-THRESH (25)
 * <li> CAUSE-NO-DESTNUMBER-ENTRY (26)
 * <li> CAUSE-SEQUENCE-DIALING-THRESH (27)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CWCallTerminationCause extends VSAttribute
{
    public static final String NAME = "CW-Call-Termination-Cause";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x8036;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long CAUSEUNKNOWN = new Long(0L);
    public static final Long CAUSECLDPARTYTERMINATE = new Long(1L);
    public static final Long CAUSECLGPARTYTERMINATE = new Long(2L);
    public static final Long CAUSEACCTBALDEPLETED = new Long(3L);
    public static final Long CAUSENOEGRPORTSAVAIL = new Long(4L);
    public static final Long CAUSEH225UNABLETOCON = new Long(5L);
    public static final Long CAUSEH245UNABLETOCON = new Long(6L);
    public static final Long CAUSEINGRFACILITYDISC = new Long(7L);
    public static final Long CAUSEEGRFACILITYDISC = new Long(8L);
    public static final Long CAUSEDIRSERVERDOWN = new Long(9L);
    public static final Long CAUSERATINGSERVERDOWN = new Long(10L);
    public static final Long CAUSEGATEWAYSHUTDOWN = new Long(11L);
    public static final Long CAUSEGTKPRTERMINATE = new Long(12L);
    public static final Long CAUSEGTKPRSHUTDOWNGTWAY = new Long(13L);
    public static final Long CAUSEBUSY = new Long(14L);
    public static final Long CAUSEABANDON = new Long(15L);
    public static final Long CAUSEINVALIDLOGINLIMIT = new Long(16L);
    public static final Long CAUSENOACCTNUMBERENTRY = new Long(17L);
    public static final Long CAUSESUSPENDEDACCTLOGIN = new Long(18L);
    public static final Long CAUSEAUTHENTSERVERDOWN = new Long(19L);
    public static final Long CAUSEGATEKEEPERTIMEOUT = new Long(20L);
    public static final Long CAUSEGATEWAYNORESOURCES = new Long(21L);
    public static final Long CAUSEACCTINUSE = new Long(22L);
    public static final Long CAUSEDEBITACCTBALZERO = new Long(23L);
    public static final Long CAUSEDEBITACCTBALINSUFF = new Long(24L);
    public static final Long CAUSEINVALIDDESTNUMBERTHRESH = new Long(25L);
    public static final Long CAUSENODESTNUMBERENTRY = new Long(26L);
    public static final Long CAUSESEQUENCEDIALINGTHRESH = new Long(27L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L),new Long(9L),new Long(10L),new Long(11L),new Long(12L),new Long(13L),new Long(14L),new Long(15L),new Long(16L),new Long(17L),new Long(18L),new Long(19L),new Long(20L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("CAUSE-UNKNOWN".equals(name)) return new Long(0L);
            if ("CAUSE-CLD-PARTY-TERMINATE".equals(name)) return new Long(1L);
            if ("CAUSE-CLG-PARTY-TERMINATE".equals(name)) return new Long(2L);
            if ("CAUSE-ACCT-BAL-DEPLETED".equals(name)) return new Long(3L);
            if ("CAUSE-NO-EGR-PORTS-AVAIL".equals(name)) return new Long(4L);
            if ("CAUSE-H225-UNABLE-TO-CON".equals(name)) return new Long(5L);
            if ("CAUSE-H245-UNABLE-TO-CON".equals(name)) return new Long(6L);
            if ("CAUSE-INGR-FACILITY-DISC".equals(name)) return new Long(7L);
            if ("CAUSE-EGR-FACILITY-DISC".equals(name)) return new Long(8L);
            if ("CAUSE-DIR-SERVER-DOWN".equals(name)) return new Long(9L);
            if ("CAUSE-RATING-SERVER-DOWN".equals(name)) return new Long(10L);
            if ("CAUSE-GATEWAY-SHUTDOWN".equals(name)) return new Long(11L);
            if ("CAUSE-GTKPR-TERMINATE".equals(name)) return new Long(12L);
            if ("CAUSE-GTKPR-SHUTDOWN-GTWAY".equals(name)) return new Long(13L);
            if ("CAUSE-BUSY".equals(name)) return new Long(14L);
            if ("CAUSE-ABANDON".equals(name)) return new Long(15L);
            if ("CAUSE-INVALID-LOGIN-LIMIT".equals(name)) return new Long(16L);
            if ("CAUSE-NOACCTNUMBER-ENTRY".equals(name)) return new Long(17L);
            if ("CAUSE-SUSPENDED-ACCT-LOGIN".equals(name)) return new Long(18L);
            if ("CAUSE-AUTHENT-SERVER-DOWN".equals(name)) return new Long(19L);
            if ("CAUSE-GATEKEEPER-TIMEOUT".equals(name)) return new Long(20L);
            if ("CAUSE-GATEWAY-NO-RESOURCES".equals(name)) return new Long(21L);
            if ("CAUSE-ACCT-INUSE".equals(name)) return new Long(22L);
            if ("CAUSE-DEBIT-ACCT-BAL-ZERO".equals(name)) return new Long(23L);
            if ("CAUSE-DEBIT-ACCTBAL-INSUFF".equals(name)) return new Long(24L);
            if ("CAUSE-INVALID-DESTNUMBER-THRESH".equals(name)) return new Long(25L);
            if ("CAUSE-NO-DESTNUMBER-ENTRY".equals(name)) return new Long(26L);
            if ("CAUSE-SEQUENCE-DIALING-THRESH".equals(name)) return new Long(27L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "CAUSE-UNKNOWN";
            if (new Long(1L).equals(value)) return "CAUSE-CLD-PARTY-TERMINATE";
            if (new Long(2L).equals(value)) return "CAUSE-CLG-PARTY-TERMINATE";
            if (new Long(3L).equals(value)) return "CAUSE-ACCT-BAL-DEPLETED";
            if (new Long(4L).equals(value)) return "CAUSE-NO-EGR-PORTS-AVAIL";
            if (new Long(5L).equals(value)) return "CAUSE-H225-UNABLE-TO-CON";
            if (new Long(6L).equals(value)) return "CAUSE-H245-UNABLE-TO-CON";
            if (new Long(7L).equals(value)) return "CAUSE-INGR-FACILITY-DISC";
            if (new Long(8L).equals(value)) return "CAUSE-EGR-FACILITY-DISC";
            if (new Long(9L).equals(value)) return "CAUSE-DIR-SERVER-DOWN";
            if (new Long(10L).equals(value)) return "CAUSE-RATING-SERVER-DOWN";
            if (new Long(11L).equals(value)) return "CAUSE-GATEWAY-SHUTDOWN";
            if (new Long(12L).equals(value)) return "CAUSE-GTKPR-TERMINATE";
            if (new Long(13L).equals(value)) return "CAUSE-GTKPR-SHUTDOWN-GTWAY";
            if (new Long(14L).equals(value)) return "CAUSE-BUSY";
            if (new Long(15L).equals(value)) return "CAUSE-ABANDON";
            if (new Long(16L).equals(value)) return "CAUSE-INVALID-LOGIN-LIMIT";
            if (new Long(17L).equals(value)) return "CAUSE-NOACCTNUMBER-ENTRY";
            if (new Long(18L).equals(value)) return "CAUSE-SUSPENDED-ACCT-LOGIN";
            if (new Long(19L).equals(value)) return "CAUSE-AUTHENT-SERVER-DOWN";
            if (new Long(20L).equals(value)) return "CAUSE-GATEKEEPER-TIMEOUT";
            if (new Long(21L).equals(value)) return "CAUSE-GATEWAY-NO-RESOURCES";
            if (new Long(22L).equals(value)) return "CAUSE-ACCT-INUSE";
            if (new Long(23L).equals(value)) return "CAUSE-DEBIT-ACCT-BAL-ZERO";
            if (new Long(24L).equals(value)) return "CAUSE-DEBIT-ACCTBAL-INSUFF";
            if (new Long(25L).equals(value)) return "CAUSE-INVALID-DESTNUMBER-THRESH";
            if (new Long(26L).equals(value)) return "CAUSE-NO-DESTNUMBER-ENTRY";
            if (new Long(27L).equals(value)) return "CAUSE-SEQUENCE-DIALING-THRESH";
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

    public Attr_CWCallTerminationCause()
    {
        setup();
    }

    public Attr_CWCallTerminationCause(Serializable o)
    {
        setup(o);
    }
}

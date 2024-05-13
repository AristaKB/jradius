// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-Request-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0xf001<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Access-Request (1)
 * <li> Access-Accept (2)
 * <li> Access-Reject (3)
 * <li> Accounting-Request (4)
 * <li> Accounting-Response (5)
 * <li> Access-Password-Change (7)
 * <li> Access-Password-Ack (8)
 * <li> Access-Password-Reject (9)
 * <li> Access-Challenge (11)
 * <li> Status-Server (12)
 * <li> Status-Client (13)
 * <li> Resource-Free-Request (21)
 * <li> Resource-Free-Response (22)
 * <li> Resource-Query-Request (23)
 * <li> Resource-Query-Response (24)
 * <li> Disconnect-User (25)
 * <li> NAS-Reboot-Request (26)
 * <li> NAS-Reboot-Response (27)
 * <li> Tacacs-Message (253)
 * <li> Reserved (255)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRRequestType extends VSAttribute
{
    public static final String NAME = "USR-Request-Type";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0xf001;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AccessRequest = new Long(1L);
    public static final Long AccessAccept = new Long(2L);
    public static final Long AccessReject = new Long(3L);
    public static final Long AccountingRequest = new Long(4L);
    public static final Long AccountingResponse = new Long(5L);
    public static final Long AccessPasswordChange = new Long(7L);
    public static final Long AccessPasswordAck = new Long(8L);
    public static final Long AccessPasswordReject = new Long(9L);
    public static final Long AccessChallenge = new Long(11L);
    public static final Long StatusServer = new Long(12L);
    public static final Long StatusClient = new Long(13L);
    public static final Long ResourceFreeRequest = new Long(21L);
    public static final Long ResourceFreeResponse = new Long(22L);
    public static final Long ResourceQueryRequest = new Long(23L);
    public static final Long ResourceQueryResponse = new Long(24L);
    public static final Long DisconnectUser = new Long(25L);
    public static final Long NASRebootRequest = new Long(26L);
    public static final Long NASRebootResponse = new Long(27L);
    public static final Long TacacsMessage = new Long(253L);
    public static final Long Reserved = new Long(255L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(7L),new Long(8L),new Long(9L),new Long(11L),new Long(12L),new Long(13L),new Long(21L),new Long(22L),new Long(23L),new Long(24L),new Long(25L),new Long(26L),new Long(27L),new Long(253L),new Long(255L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Access-Request".equals(name)) return new Long(1L);
            if ("Access-Accept".equals(name)) return new Long(2L);
            if ("Access-Reject".equals(name)) return new Long(3L);
            if ("Accounting-Request".equals(name)) return new Long(4L);
            if ("Accounting-Response".equals(name)) return new Long(5L);
            if ("Access-Password-Change".equals(name)) return new Long(7L);
            if ("Access-Password-Ack".equals(name)) return new Long(8L);
            if ("Access-Password-Reject".equals(name)) return new Long(9L);
            if ("Access-Challenge".equals(name)) return new Long(11L);
            if ("Status-Server".equals(name)) return new Long(12L);
            if ("Status-Client".equals(name)) return new Long(13L);
            if ("Resource-Free-Request".equals(name)) return new Long(21L);
            if ("Resource-Free-Response".equals(name)) return new Long(22L);
            if ("Resource-Query-Request".equals(name)) return new Long(23L);
            if ("Resource-Query-Response".equals(name)) return new Long(24L);
            if ("Disconnect-User".equals(name)) return new Long(25L);
            if ("NAS-Reboot-Request".equals(name)) return new Long(26L);
            if ("NAS-Reboot-Response".equals(name)) return new Long(27L);
            if ("Tacacs-Message".equals(name)) return new Long(253L);
            if ("Reserved".equals(name)) return new Long(255L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Access-Request";
            if (new Long(2L).equals(value)) return "Access-Accept";
            if (new Long(3L).equals(value)) return "Access-Reject";
            if (new Long(4L).equals(value)) return "Accounting-Request";
            if (new Long(5L).equals(value)) return "Accounting-Response";
            if (new Long(7L).equals(value)) return "Access-Password-Change";
            if (new Long(8L).equals(value)) return "Access-Password-Ack";
            if (new Long(9L).equals(value)) return "Access-Password-Reject";
            if (new Long(11L).equals(value)) return "Access-Challenge";
            if (new Long(12L).equals(value)) return "Status-Server";
            if (new Long(13L).equals(value)) return "Status-Client";
            if (new Long(21L).equals(value)) return "Resource-Free-Request";
            if (new Long(22L).equals(value)) return "Resource-Free-Response";
            if (new Long(23L).equals(value)) return "Resource-Query-Request";
            if (new Long(24L).equals(value)) return "Resource-Query-Response";
            if (new Long(25L).equals(value)) return "Disconnect-User";
            if (new Long(26L).equals(value)) return "NAS-Reboot-Request";
            if (new Long(27L).equals(value)) return "NAS-Reboot-Response";
            if (new Long(253L).equals(value)) return "Tacacs-Message";
            if (new Long(255L).equals(value)) return "Reserved";
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

    public Attr_USRRequestType()
    {
        setup();
    }

    public Attr_USRRequestType(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_ascend;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Ascend-Service-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 49<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Ascend-Service-Type-ATM (20)
 * <li> Ascend-Service-Type-Combinet (7)
 * <li> Ascend-Service-Type-EuRaw (9)
 * <li> Ascend-Service-Type-EuUi (10)
 * <li> Ascend-Service-Type-FR (8)
 * <li> Ascend-Service-Type-HdlcNrm (21)
 * <li> Ascend-Service-Type-IpFax (19)
 * <li> Ascend-Service-Type-MP (15)
 * <li> Ascend-Service-Type-MPP (5)
 * <li> Ascend-Service-Type-NetToNet (25)
 * <li> Ascend-Service-Type-None (1)
 * <li> Ascend-Service-Type-NotUsed (0)
 * <li> Ascend-Service-Type-Other (2)
 * <li> Ascend-Service-Type-PPP (3)
 * <li> Ascend-Service-Type-PseuTunPPP (18)
 * <li> Ascend-Service-Type-RawTcp (13)
 * <li> Ascend-Service-Type-Slip (4)
 * <li> Ascend-Service-Type-Telnet (11)
 * <li> Ascend-Service-Type-TelnetBin (12)
 * <li> Ascend-Service-Type-TermServer (14)
 * <li> Ascend-Service-Type-VirtualConn (16)
 * <li> Ascend-Service-Type-Visa2 (23)
 * <li> Ascend-Service-Type-VoIp (22)
 * <li> Ascend-Service-Type-X25 (6)
 * <li> Ascend-Service-Type-X25DChan (17)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendServiceType extends VSAttribute
{
    public static final String NAME = "Ascend-Service-Type";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 49;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AscendServiceTypeATM = new Long(20L);
    public static final Long AscendServiceTypeCombinet = new Long(7L);
    public static final Long AscendServiceTypeEuRaw = new Long(9L);
    public static final Long AscendServiceTypeEuUi = new Long(10L);
    public static final Long AscendServiceTypeFR = new Long(8L);
    public static final Long AscendServiceTypeHdlcNrm = new Long(21L);
    public static final Long AscendServiceTypeIpFax = new Long(19L);
    public static final Long AscendServiceTypeMP = new Long(15L);
    public static final Long AscendServiceTypeMPP = new Long(5L);
    public static final Long AscendServiceTypeNetToNet = new Long(25L);
    public static final Long AscendServiceTypeNone = new Long(1L);
    public static final Long AscendServiceTypeNotUsed = new Long(0L);
    public static final Long AscendServiceTypeOther = new Long(2L);
    public static final Long AscendServiceTypePPP = new Long(3L);
    public static final Long AscendServiceTypePseuTunPPP = new Long(18L);
    public static final Long AscendServiceTypeRawTcp = new Long(13L);
    public static final Long AscendServiceTypeSlip = new Long(4L);
    public static final Long AscendServiceTypeTelnet = new Long(11L);
    public static final Long AscendServiceTypeTelnetBin = new Long(12L);
    public static final Long AscendServiceTypeTermServer = new Long(14L);
    public static final Long AscendServiceTypeVirtualConn = new Long(16L);
    public static final Long AscendServiceTypeVisa2 = new Long(23L);
    public static final Long AscendServiceTypeVoIp = new Long(22L);
    public static final Long AscendServiceTypeX25 = new Long(6L);
    public static final Long AscendServiceTypeX25DChan = new Long(17L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(20L),new Long(7L),new Long(9L),new Long(10L),new Long(8L),new Long(21L),new Long(19L),new Long(15L),new Long(5L),new Long(25L),new Long(1L),new Long(0L),new Long(2L),new Long(3L),new Long(18L),new Long(13L),new Long(4L),new Long(11L),new Long(12L),new Long(14L),new Long(16L),new Long(23L),new Long(22L),new Long(6L),new Long(17L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Ascend-Service-Type-ATM".equals(name)) return new Long(20L);
            if ("Ascend-Service-Type-Combinet".equals(name)) return new Long(7L);
            if ("Ascend-Service-Type-EuRaw".equals(name)) return new Long(9L);
            if ("Ascend-Service-Type-EuUi".equals(name)) return new Long(10L);
            if ("Ascend-Service-Type-FR".equals(name)) return new Long(8L);
            if ("Ascend-Service-Type-HdlcNrm".equals(name)) return new Long(21L);
            if ("Ascend-Service-Type-IpFax".equals(name)) return new Long(19L);
            if ("Ascend-Service-Type-MP".equals(name)) return new Long(15L);
            if ("Ascend-Service-Type-MPP".equals(name)) return new Long(5L);
            if ("Ascend-Service-Type-NetToNet".equals(name)) return new Long(25L);
            if ("Ascend-Service-Type-None".equals(name)) return new Long(1L);
            if ("Ascend-Service-Type-NotUsed".equals(name)) return new Long(0L);
            if ("Ascend-Service-Type-Other".equals(name)) return new Long(2L);
            if ("Ascend-Service-Type-PPP".equals(name)) return new Long(3L);
            if ("Ascend-Service-Type-PseuTunPPP".equals(name)) return new Long(18L);
            if ("Ascend-Service-Type-RawTcp".equals(name)) return new Long(13L);
            if ("Ascend-Service-Type-Slip".equals(name)) return new Long(4L);
            if ("Ascend-Service-Type-Telnet".equals(name)) return new Long(11L);
            if ("Ascend-Service-Type-TelnetBin".equals(name)) return new Long(12L);
            if ("Ascend-Service-Type-TermServer".equals(name)) return new Long(14L);
            if ("Ascend-Service-Type-VirtualConn".equals(name)) return new Long(16L);
            if ("Ascend-Service-Type-Visa2".equals(name)) return new Long(23L);
            if ("Ascend-Service-Type-VoIp".equals(name)) return new Long(22L);
            if ("Ascend-Service-Type-X25".equals(name)) return new Long(6L);
            if ("Ascend-Service-Type-X25DChan".equals(name)) return new Long(17L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(20L).equals(value)) return "Ascend-Service-Type-ATM";
            if (new Long(7L).equals(value)) return "Ascend-Service-Type-Combinet";
            if (new Long(9L).equals(value)) return "Ascend-Service-Type-EuRaw";
            if (new Long(10L).equals(value)) return "Ascend-Service-Type-EuUi";
            if (new Long(8L).equals(value)) return "Ascend-Service-Type-FR";
            if (new Long(21L).equals(value)) return "Ascend-Service-Type-HdlcNrm";
            if (new Long(19L).equals(value)) return "Ascend-Service-Type-IpFax";
            if (new Long(15L).equals(value)) return "Ascend-Service-Type-MP";
            if (new Long(5L).equals(value)) return "Ascend-Service-Type-MPP";
            if (new Long(25L).equals(value)) return "Ascend-Service-Type-NetToNet";
            if (new Long(1L).equals(value)) return "Ascend-Service-Type-None";
            if (new Long(0L).equals(value)) return "Ascend-Service-Type-NotUsed";
            if (new Long(2L).equals(value)) return "Ascend-Service-Type-Other";
            if (new Long(3L).equals(value)) return "Ascend-Service-Type-PPP";
            if (new Long(18L).equals(value)) return "Ascend-Service-Type-PseuTunPPP";
            if (new Long(13L).equals(value)) return "Ascend-Service-Type-RawTcp";
            if (new Long(4L).equals(value)) return "Ascend-Service-Type-Slip";
            if (new Long(11L).equals(value)) return "Ascend-Service-Type-Telnet";
            if (new Long(12L).equals(value)) return "Ascend-Service-Type-TelnetBin";
            if (new Long(14L).equals(value)) return "Ascend-Service-Type-TermServer";
            if (new Long(16L).equals(value)) return "Ascend-Service-Type-VirtualConn";
            if (new Long(23L).equals(value)) return "Ascend-Service-Type-Visa2";
            if (new Long(22L).equals(value)) return "Ascend-Service-Type-VoIp";
            if (new Long(6L).equals(value)) return "Ascend-Service-Type-X25";
            if (new Long(17L).equals(value)) return "Ascend-Service-Type-X25DChan";
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

    public Attr_AscendServiceType()
    {
        setup();
    }

    public Attr_AscendServiceType(Serializable o)
    {
        setup(o);
    }
}

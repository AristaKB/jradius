// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_erx;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: ERX-PPP-Auth-Protocol<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4874<br>
 * VSA Type: 38<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> None (0)
 * <li> PAP (1)
 * <li> CHAP (2)
 * <li> PAP-CHAP (3)
 * <li> CHAP-PAP (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ERXPPPAuthProtocol extends VSAttribute
{
    public static final String NAME = "ERX-PPP-Auth-Protocol";
    public static final int VENDOR_ID = 4874;
    public static final int VSA_TYPE = 38;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long None = new Long(0L);
    public static final Long PAP = new Long(1L);
    public static final Long CHAP = new Long(2L);
    public static final Long PAPCHAP = new Long(3L);
    public static final Long CHAPPAP = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("None".equals(name)) return new Long(0L);
            if ("PAP".equals(name)) return new Long(1L);
            if ("CHAP".equals(name)) return new Long(2L);
            if ("PAP-CHAP".equals(name)) return new Long(3L);
            if ("CHAP-PAP".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "None";
            if (new Long(1L).equals(value)) return "PAP";
            if (new Long(2L).equals(value)) return "CHAP";
            if (new Long(3L).equals(value)) return "PAP-CHAP";
            if (new Long(4L).equals(value)) return "CHAP-PAP";
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

    public Attr_ERXPPPAuthProtocol()
    {
        setup();
    }

    public Attr_ERXPPPAuthProtocol(Serializable o)
    {
        setup(o);
    }
}
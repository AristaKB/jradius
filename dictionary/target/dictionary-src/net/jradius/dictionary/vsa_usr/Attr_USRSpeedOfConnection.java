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
 * Attribute Name: USR-Speed-Of-Connection<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x9801<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Auto (0)
 * <li> 56 (1)
 * <li> 64 (2)
 * <li> Voice (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRSpeedOfConnection extends VSAttribute
{
    public static final String NAME = "USR-Speed-Of-Connection";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x9801;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long Auto = new Long(0L);
    public static final Long _56 = new Long(1L);
    public static final Long _64 = new Long(2L);
    public static final Long Voice = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Auto".equals(name)) return new Long(0L);
            if ("56".equals(name)) return new Long(1L);
            if ("64".equals(name)) return new Long(2L);
            if ("Voice".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Auto";
            if (new Long(1L).equals(value)) return "56";
            if (new Long(2L).equals(value)) return "64";
            if (new Long(3L).equals(value)) return "Voice";
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

    public Attr_USRSpeedOfConnection()
    {
        setup();
    }

    public Attr_USRSpeedOfConnection(Serializable o)
    {
        setup(o);
    }
}

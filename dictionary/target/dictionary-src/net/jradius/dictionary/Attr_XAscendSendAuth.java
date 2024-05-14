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
 * Attribute Name: X-Ascend-Send-Auth<br>
 * Attribute Type: 231<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Send-Auth-None (0)
 * <li> Send-Auth-PAP (1)
 * <li> Send-Auth-CHAP (2)
 * <li> Send-Auth-MS-CHAP (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XAscendSendAuth extends RadiusAttribute
{
    public static final String NAME = "X-Ascend-Send-Auth";
    public static final long TYPE = 231;

    public static final long serialVersionUID = TYPE;

    public static final Long SendAuthNone = new Long(0L);
    public static final Long SendAuthPAP = new Long(1L);
    public static final Long SendAuthCHAP = new Long(2L);
    public static final Long SendAuthMSCHAP = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Send-Auth-None".equals(name)) return new Long(0L);
            if ("Send-Auth-PAP".equals(name)) return new Long(1L);
            if ("Send-Auth-CHAP".equals(name)) return new Long(2L);
            if ("Send-Auth-MS-CHAP".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Send-Auth-None";
            if (new Long(1L).equals(value)) return "Send-Auth-PAP";
            if (new Long(2L).equals(value)) return "Send-Auth-CHAP";
            if (new Long(3L).equals(value)) return "Send-Auth-MS-CHAP";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 231;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_XAscendSendAuth()
    {
        setup();
    }

    public Attr_XAscendSendAuth(Serializable o)
    {
        setup(o);
    }
}

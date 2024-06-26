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
 * Attribute Name: Ascend-User-Acct-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 529<br>
 * VSA Type: 138<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Ascend-User-Acct-None (0)
 * <li> Ascend-User-Acct-User (1)
 * <li> Ascend-User-Acct-User-Default (2)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AscendUserAcctType extends VSAttribute
{
    public static final String NAME = "Ascend-User-Acct-Type";
    public static final int VENDOR_ID = 529;
    public static final int VSA_TYPE = 138;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long AscendUserAcctNone = new Long(0L);
    public static final Long AscendUserAcctUser = new Long(1L);
    public static final Long AscendUserAcctUserDefault = new Long(2L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Ascend-User-Acct-None".equals(name)) return new Long(0L);
            if ("Ascend-User-Acct-User".equals(name)) return new Long(1L);
            if ("Ascend-User-Acct-User-Default".equals(name)) return new Long(2L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "Ascend-User-Acct-None";
            if (new Long(1L).equals(value)) return "Ascend-User-Acct-User";
            if (new Long(2L).equals(value)) return "Ascend-User-Acct-User-Default";
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

    public Attr_AscendUserAcctType()
    {
        setup();
    }

    public Attr_AscendUserAcctType(Serializable o)
    {
        setup(o);
    }
}

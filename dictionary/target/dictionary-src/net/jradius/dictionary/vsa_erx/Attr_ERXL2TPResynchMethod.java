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
 * Attribute Name: ERX-L2TP-Resynch-Method<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4874<br>
 * VSA Type: 90<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> disable (0)
 * <li> failover (1)
 * <li> silent-failover (2)
 * <li> failover-with-silent-backup (3)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ERXL2TPResynchMethod extends VSAttribute
{
    public static final String NAME = "ERX-L2TP-Resynch-Method";
    public static final int VENDOR_ID = 4874;
    public static final int VSA_TYPE = 90;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long disable = new Long(0L);
    public static final Long failover = new Long(1L);
    public static final Long silentfailover = new Long(2L);
    public static final Long failoverwithsilentbackup = new Long(3L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("disable".equals(name)) return new Long(0L);
            if ("failover".equals(name)) return new Long(1L);
            if ("silent-failover".equals(name)) return new Long(2L);
            if ("failover-with-silent-backup".equals(name)) return new Long(3L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "disable";
            if (new Long(1L).equals(value)) return "failover";
            if (new Long(2L).equals(value)) return "silent-failover";
            if (new Long(3L).equals(value)) return "failover-with-silent-backup";
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

    public Attr_ERXL2TPResynchMethod()
    {
        setup();
    }

    public Attr_ERXL2TPResynchMethod(Serializable o)
    {
        setup(o);
    }
}

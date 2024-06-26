// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redback;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: LAC-Port-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 139<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> NAS-PORT-TYPE-10BT (40)
 * <li> NAS-PORT-TYPE-100BT (41)
 * <li> NAS-PORT-TYPE-DS3-FR (42)
 * <li> NAS-PORT-TYPE-DS3-ATM (43)
 * <li> NAS-PORT-TYPE-OC3 (44)
 * <li> NAS-PORT-TYPE-HSSI (45)
 * <li> NAS-PORT-TYPE-EIA530 (46)
 * <li> NAS-PORT-TYPE-T1 (47)
 * <li> NAS-PORT-TYPE-CHAN-T3 (48)
 * <li> NAS-PORT-TYPE-DS1-FR (49)
 * <li> NAS-PORT-TYPE-E3-ATM (50)
 * <li> NAS-PORT-TYPE-IMA-ATM (51)
 * <li> NAS-PORT-TYPE-DS3-ATM-2 (52)
 * <li> NAS-PORT-TYPE-OC3-ATM-2 (53)
 * <li> NAS-PORT-TYPE-1000BSX (54)
 * <li> NAS-PORT-TYPE-E1-FR (55)
 * <li> NAS-PORT-TYPE-E1-ATM (56)
 * <li> NAS-PORT-TYPE-E3-FR (57)
 * <li> NAS-PORT-TYPE-OC3-POS (58)
 * <li> NAS-PORT-TYPE-OC12-POS (59)
 * <li> NAS-PORT-TYPE-PPPOE (60)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LACPortType extends VSAttribute
{
    public static final String NAME = "LAC-Port-Type";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 139;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long NASPORTTYPE10BT = new Long(40L);
    public static final Long NASPORTTYPE100BT = new Long(41L);
    public static final Long NASPORTTYPEDS3FR = new Long(42L);
    public static final Long NASPORTTYPEDS3ATM = new Long(43L);
    public static final Long NASPORTTYPEOC3 = new Long(44L);
    public static final Long NASPORTTYPEHSSI = new Long(45L);
    public static final Long NASPORTTYPEEIA530 = new Long(46L);
    public static final Long NASPORTTYPET1 = new Long(47L);
    public static final Long NASPORTTYPECHANT3 = new Long(48L);
    public static final Long NASPORTTYPEDS1FR = new Long(49L);
    public static final Long NASPORTTYPEE3ATM = new Long(50L);
    public static final Long NASPORTTYPEIMAATM = new Long(51L);
    public static final Long NASPORTTYPEDS3ATM2 = new Long(52L);
    public static final Long NASPORTTYPEOC3ATM2 = new Long(53L);
    public static final Long NASPORTTYPE1000BSX = new Long(54L);
    public static final Long NASPORTTYPEE1FR = new Long(55L);
    public static final Long NASPORTTYPEE1ATM = new Long(56L);
    public static final Long NASPORTTYPEE3FR = new Long(57L);
    public static final Long NASPORTTYPEOC3POS = new Long(58L);
    public static final Long NASPORTTYPEOC12POS = new Long(59L);
    public static final Long NASPORTTYPEPPPOE = new Long(60L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(40L),new Long(41L),new Long(42L),new Long(43L),new Long(44L),new Long(45L),new Long(46L),new Long(47L),new Long(48L),new Long(49L),new Long(50L),new Long(51L),new Long(52L),new Long(53L),new Long(54L),new Long(55L),new Long(56L),new Long(57L),new Long(58L),new Long(59L),new Long(60L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("NAS-PORT-TYPE-10BT".equals(name)) return new Long(40L);
            if ("NAS-PORT-TYPE-100BT".equals(name)) return new Long(41L);
            if ("NAS-PORT-TYPE-DS3-FR".equals(name)) return new Long(42L);
            if ("NAS-PORT-TYPE-DS3-ATM".equals(name)) return new Long(43L);
            if ("NAS-PORT-TYPE-OC3".equals(name)) return new Long(44L);
            if ("NAS-PORT-TYPE-HSSI".equals(name)) return new Long(45L);
            if ("NAS-PORT-TYPE-EIA530".equals(name)) return new Long(46L);
            if ("NAS-PORT-TYPE-T1".equals(name)) return new Long(47L);
            if ("NAS-PORT-TYPE-CHAN-T3".equals(name)) return new Long(48L);
            if ("NAS-PORT-TYPE-DS1-FR".equals(name)) return new Long(49L);
            if ("NAS-PORT-TYPE-E3-ATM".equals(name)) return new Long(50L);
            if ("NAS-PORT-TYPE-IMA-ATM".equals(name)) return new Long(51L);
            if ("NAS-PORT-TYPE-DS3-ATM-2".equals(name)) return new Long(52L);
            if ("NAS-PORT-TYPE-OC3-ATM-2".equals(name)) return new Long(53L);
            if ("NAS-PORT-TYPE-1000BSX".equals(name)) return new Long(54L);
            if ("NAS-PORT-TYPE-E1-FR".equals(name)) return new Long(55L);
            if ("NAS-PORT-TYPE-E1-ATM".equals(name)) return new Long(56L);
            if ("NAS-PORT-TYPE-E3-FR".equals(name)) return new Long(57L);
            if ("NAS-PORT-TYPE-OC3-POS".equals(name)) return new Long(58L);
            if ("NAS-PORT-TYPE-OC12-POS".equals(name)) return new Long(59L);
            if ("NAS-PORT-TYPE-PPPOE".equals(name)) return new Long(60L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(40L).equals(value)) return "NAS-PORT-TYPE-10BT";
            if (new Long(41L).equals(value)) return "NAS-PORT-TYPE-100BT";
            if (new Long(42L).equals(value)) return "NAS-PORT-TYPE-DS3-FR";
            if (new Long(43L).equals(value)) return "NAS-PORT-TYPE-DS3-ATM";
            if (new Long(44L).equals(value)) return "NAS-PORT-TYPE-OC3";
            if (new Long(45L).equals(value)) return "NAS-PORT-TYPE-HSSI";
            if (new Long(46L).equals(value)) return "NAS-PORT-TYPE-EIA530";
            if (new Long(47L).equals(value)) return "NAS-PORT-TYPE-T1";
            if (new Long(48L).equals(value)) return "NAS-PORT-TYPE-CHAN-T3";
            if (new Long(49L).equals(value)) return "NAS-PORT-TYPE-DS1-FR";
            if (new Long(50L).equals(value)) return "NAS-PORT-TYPE-E3-ATM";
            if (new Long(51L).equals(value)) return "NAS-PORT-TYPE-IMA-ATM";
            if (new Long(52L).equals(value)) return "NAS-PORT-TYPE-DS3-ATM-2";
            if (new Long(53L).equals(value)) return "NAS-PORT-TYPE-OC3-ATM-2";
            if (new Long(54L).equals(value)) return "NAS-PORT-TYPE-1000BSX";
            if (new Long(55L).equals(value)) return "NAS-PORT-TYPE-E1-FR";
            if (new Long(56L).equals(value)) return "NAS-PORT-TYPE-E1-ATM";
            if (new Long(57L).equals(value)) return "NAS-PORT-TYPE-E3-FR";
            if (new Long(58L).equals(value)) return "NAS-PORT-TYPE-OC3-POS";
            if (new Long(59L).equals(value)) return "NAS-PORT-TYPE-OC12-POS";
            if (new Long(60L).equals(value)) return "NAS-PORT-TYPE-PPPOE";
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

    public Attr_LACPortType()
    {
        setup();
    }

    public Attr_LACPortType(Serializable o)
    {
        setup(o);
    }
}

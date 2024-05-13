// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: WiMAX-Tariff-Switch-Interval<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 3<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXTariffSwitchInterval extends SubAttribute
{
    public static final String NAME = "WiMAX-Tariff-Switch-Interval";
    public static final int VENDOR_ID = 24757;
    public static final int PARENT_TYPE = 38;
    public static final int VSA_TYPE = (3 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 3;
        setParentClass(Attr_WiMAXPrepaidTariffSwitching.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IntegerValue();
    }

    public Attr_WiMAXTariffSwitchInterval()
    {
        setup();
    }

    public Attr_WiMAXTariffSwitchInterval(Serializable o)
    {
        setup(o);
    }
}

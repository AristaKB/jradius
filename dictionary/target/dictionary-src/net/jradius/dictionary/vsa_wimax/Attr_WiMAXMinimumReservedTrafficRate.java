// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: WiMAX-Minimum-Reserved-Traffic-Rate<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 7<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXMinimumReservedTrafficRate extends SubAttribute
{
    public static final String NAME = "WiMAX-Minimum-Reserved-Traffic-Rate";
    public static final int VENDOR_ID = 24757;
    public static final int PARENT_TYPE = 29;
    public static final int VSA_TYPE = (7 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 7;
        setParentClass(Attr_WiMAXQoSDescriptor.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IntegerValue();
    }

    public Attr_WiMAXMinimumReservedTrafficRate()
    {
        setup();
    }

    public Attr_WiMAXMinimumReservedTrafficRate(Serializable o)
    {
        setup(o);
    }
}

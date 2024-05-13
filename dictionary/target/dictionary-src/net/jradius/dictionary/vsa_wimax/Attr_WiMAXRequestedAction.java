// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: WiMAX-Requested-Action<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 15<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXRequestedAction extends SubAttribute
{
    public static final String NAME = "WiMAX-Requested-Action";
    public static final int VENDOR_ID = 24757;
    public static final int PARENT_TYPE = 37;
    public static final int VSA_TYPE = (15 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 15;
        setParentClass(Attr_WiMAXPPAQ.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IntegerValue();
        ((IntegerValue)attributeValue).setLength(1);
    }

    public Attr_WiMAXRequestedAction()
    {
        setup();
    }

    public Attr_WiMAXRequestedAction(Serializable o)
    {
        setup(o);
    }
}

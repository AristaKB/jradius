// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: WiMAX-Termination-Action<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 12<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXTerminationAction extends SubAttribute
{
    public static final String NAME = "WiMAX-Termination-Action";
    public static final int VENDOR_ID = 24757;
    public static final int PARENT_TYPE = 37;
    public static final int VSA_TYPE = (12 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 12;
        setParentClass(Attr_WiMAXPPAQ.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IntegerValue();
        ((IntegerValue)attributeValue).setLength(1);
    }

    public Attr_WiMAXTerminationAction()
    {
        setup();
    }

    public Attr_WiMAXTerminationAction(Serializable o)
    {
        setup(o);
    }
}

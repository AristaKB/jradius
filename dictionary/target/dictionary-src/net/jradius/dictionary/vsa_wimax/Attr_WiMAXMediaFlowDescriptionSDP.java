// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: WiMAX-Media-Flow-Description-SDP<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 16<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXMediaFlowDescriptionSDP extends SubAttribute
{
    public static final String NAME = "WiMAX-Media-Flow-Description-SDP";
    public static final int VENDOR_ID = 24757;
    public static final int PARENT_TYPE = 29;
    public static final int VSA_TYPE = (16 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 16;
        setParentClass(Attr_WiMAXQoSDescriptor.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new StringValue();
    }

    public Attr_WiMAXMediaFlowDescriptionSDP()
    {
        setup();
    }

    public Attr_WiMAXMediaFlowDescriptionSDP(Serializable o)
    {
        setup(o);
    }
}
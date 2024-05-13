// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.SubAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: WiMAX-Cost-Information-AVP<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 17<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXCostInformationAVP extends SubAttribute
{
    public static final String NAME = "WiMAX-Cost-Information-AVP";
    public static final int VENDOR_ID = 24757;
    public static final int PARENT_TYPE = 37;
    public static final int VSA_TYPE = (17 << 8) | PARENT_TYPE;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 17;
        setParentClass(Attr_WiMAXPPAQ.class);
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new OctetsValue();
    }

    public Attr_WiMAXCostInformationAVP()
    {
        setup();
    }

    public Attr_WiMAXCostInformationAVP(Serializable o)
    {
        setup(o);
    }
}
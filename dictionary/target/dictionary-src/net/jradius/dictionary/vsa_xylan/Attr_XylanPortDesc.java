// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_xylan;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Xylan-Port-Desc<br>
 * Attribute Type: 26<br>
 * Vendor Id: 800<br>
 * VSA Type: 6<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XylanPortDesc extends VSAttribute
{
    public static final String NAME = "Xylan-Port-Desc";
    public static final int VENDOR_ID = 800;
    public static final int VSA_TYPE = 6;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new StringValue();
    }

    public Attr_XylanPortDesc()
    {
        setup();
    }

    public Attr_XylanPortDesc(Serializable o)
    {
        setup(o);
    }
}

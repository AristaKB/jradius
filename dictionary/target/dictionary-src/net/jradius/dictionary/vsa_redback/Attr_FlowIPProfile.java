// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_redback;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Flow-IP-Profile<br>
 * Attribute Type: 26<br>
 * Vendor Id: 2352<br>
 * VSA Type: 205<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FlowIPProfile extends VSAttribute
{
    public static final String NAME = "Flow-IP-Profile";
    public static final int VENDOR_ID = 2352;
    public static final int VSA_TYPE = 205;
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

    public Attr_FlowIPProfile()
    {
        setup();
    }

    public Attr_FlowIPProfile(Serializable o)
    {
        setup(o);
    }
}

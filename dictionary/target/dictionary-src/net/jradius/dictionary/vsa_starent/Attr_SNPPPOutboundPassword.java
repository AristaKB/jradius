// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_starent;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: SN-PPP-Outbound-Password<br>
 * Attribute Type: 26<br>
 * Vendor Id: 8164<br>
 * VSA Type: 15<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SNPPPOutboundPassword extends VSAttribute
{
    public static final String NAME = "SN-PPP-Outbound-Password";
    public static final int VENDOR_ID = 8164;
    public static final int VSA_TYPE = 15;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,2");
        attributeValue = new StringValue();
    }

    public Attr_SNPPPOutboundPassword()
    {
        setup();
    }

    public Attr_SNPPPOutboundPassword(Serializable o)
    {
        setup(o);
    }
}

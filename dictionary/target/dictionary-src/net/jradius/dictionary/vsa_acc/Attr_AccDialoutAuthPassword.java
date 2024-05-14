// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_acc;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Acc-Dialout-Auth-Password<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5<br>
 * VSA Type: 39<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AccDialoutAuthPassword extends VSAttribute
{
    public static final String NAME = "Acc-Dialout-Auth-Password";
    public static final int VENDOR_ID = 5;
    public static final int VSA_TYPE = 39;
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

    public Attr_AccDialoutAuthPassword()
    {
        setup();
    }

    public Attr_AccDialoutAuthPassword(Serializable o)
    {
        setup(o);
    }
}

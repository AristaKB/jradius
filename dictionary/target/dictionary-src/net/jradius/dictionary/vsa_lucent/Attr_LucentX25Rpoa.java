// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_lucent;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Lucent-X25-Rpoa<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4846<br>
 * VSA Type: 41<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LucentX25Rpoa extends VSAttribute
{
    public static final String NAME = "Lucent-X25-Rpoa";
    public static final int VENDOR_ID = 4846;
    public static final int VSA_TYPE = 41;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new StringValue();
    }

    public Attr_LucentX25Rpoa()
    {
        setup();
    }

    public Attr_LucentX25Rpoa(Serializable o)
    {
        setup(o);
    }
}

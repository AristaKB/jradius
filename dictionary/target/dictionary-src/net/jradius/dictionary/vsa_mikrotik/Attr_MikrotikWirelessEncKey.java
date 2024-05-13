// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_mikrotik;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Mikrotik-Wireless-Enc-Key<br>
 * Attribute Type: 26<br>
 * Vendor Id: 14988<br>
 * VSA Type: 7<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MikrotikWirelessEncKey extends VSAttribute
{
    public static final String NAME = "Mikrotik-Wireless-Enc-Key";
    public static final int VENDOR_ID = 14988;
    public static final int VSA_TYPE = 7;
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

    public Attr_MikrotikWirelessEncKey()
    {
        setup();
    }

    public Attr_MikrotikWirelessEncKey(Serializable o)
    {
        setup(o);
    }
}
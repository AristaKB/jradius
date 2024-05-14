// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_3gpp2;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: 3GPP2-KeyID<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5535<br>
 * VSA Type: 8<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr__3GPP2KeyID extends VSAttribute
{
    public static final String NAME = "3GPP2-KeyID";
    public static final int VENDOR_ID = 5535;
    public static final int VSA_TYPE = 8;
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

    public Attr__3GPP2KeyID()
    {
        setup();
    }

    public Attr__3GPP2KeyID(Serializable o)
    {
        setup(o);
    }
}

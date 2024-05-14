// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_cablelabs;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: CableLabs-SF-ID<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4491<br>
 * VSA Type: 30<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_CableLabsSFID extends VSAttribute
{
    public static final String NAME = "CableLabs-SF-ID";
    public static final int VENDOR_ID = 4491;
    public static final int VSA_TYPE = 30;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IntegerValue();
    }

    public Attr_CableLabsSFID()
    {
        setup();
    }

    public Attr_CableLabsSFID(Serializable o)
    {
        setup(o);
    }
}

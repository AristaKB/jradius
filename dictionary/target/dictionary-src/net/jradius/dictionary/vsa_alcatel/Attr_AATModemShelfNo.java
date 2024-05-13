// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_alcatel;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: AAT-Modem-Shelf-No<br>
 * Attribute Type: 26<br>
 * Vendor Id: 3041<br>
 * VSA Type: 30<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AATModemShelfNo extends VSAttribute
{
    public static final String NAME = "AAT-Modem-Shelf-No";
    public static final int VENDOR_ID = 3041;
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

    public Attr_AATModemShelfNo()
    {
        setup();
    }

    public Attr_AATModemShelfNo(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_motorola;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Motorola-WiMAX-MIP-SPI<br>
 * Attribute Type: 26<br>
 * Vendor Id: 161<br>
 * VSA Type: 12<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MotorolaWiMAXMIPSPI extends VSAttribute
{
    public static final String NAME = "Motorola-WiMAX-MIP-SPI";
    public static final int VENDOR_ID = 161;
    public static final int VSA_TYPE = 12;
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

    public Attr_MotorolaWiMAXMIPSPI()
    {
        setup();
    }

    public Attr_MotorolaWiMAXMIPSPI(Serializable o)
    {
        setup(o);
    }
}

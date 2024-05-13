// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_patton;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Patton-Calling-Tx-Packets<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1768<br>
 * VSA Type: 99<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_PattonCallingTxPackets extends VSAttribute
{
    public static final String NAME = "Patton-Calling-Tx-Packets";
    public static final int VENDOR_ID = 1768;
    public static final int VSA_TYPE = 99;
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

    public Attr_PattonCallingTxPackets()
    {
        setup();
    }

    public Attr_PattonCallingTxPackets(Serializable o)
    {
        setup(o);
    }
}
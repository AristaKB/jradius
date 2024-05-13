// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_ipunplugged;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: IPU-MIP-Alg-Type<br>
 * Attribute Type: 26<br>
 * Vendor Id: 5925<br>
 * VSA Type: 53<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_IPUMIPAlgType extends VSAttribute
{
    public static final String NAME = "IPU-MIP-Alg-Type";
    public static final int VENDOR_ID = 5925;
    public static final int VSA_TYPE = 53;
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

    public Attr_IPUMIPAlgType()
    {
        setup();
    }

    public Attr_IPUMIPAlgType(Serializable o)
    {
        setup(o);
    }
}

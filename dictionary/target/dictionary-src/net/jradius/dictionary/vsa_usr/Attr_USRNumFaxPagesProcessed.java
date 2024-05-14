// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: USR-Num-Fax-Pages-Processed<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x0899<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRNumFaxPagesProcessed extends VSAttribute
{
    public static final String NAME = "USR-Num-Fax-Pages-Processed";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x0899;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("4,0");
        attributeValue = new IntegerValue();
    }

    public Attr_USRNumFaxPagesProcessed()
    {
        setup();
    }

    public Attr_USRNumFaxPagesProcessed(Serializable o)
    {
        setup(o);
    }
}

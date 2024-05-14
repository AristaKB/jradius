// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_bintec;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: BinTec-qosPolicyTable<br>
 * Attribute Type: 26<br>
 * Vendor Id: 272<br>
 * VSA Type: 240<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_BinTecqosPolicyTable extends VSAttribute
{
    public static final String NAME = "BinTec-qosPolicyTable";
    public static final int VENDOR_ID = 272;
    public static final int VSA_TYPE = 240;
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

    public Attr_BinTecqosPolicyTable()
    {
        setup();
    }

    public Attr_BinTecqosPolicyTable(Serializable o)
    {
        setup(o);
    }
}

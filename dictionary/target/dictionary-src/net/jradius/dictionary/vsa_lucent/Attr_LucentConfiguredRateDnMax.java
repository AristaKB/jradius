// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_lucent;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Lucent-Configured-Rate-Dn-Max<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4846<br>
 * VSA Type: 10036<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LucentConfiguredRateDnMax extends VSAttribute
{
    public static final String NAME = "Lucent-Configured-Rate-Dn-Max";
    public static final int VENDOR_ID = 4846;
    public static final int VSA_TYPE = 10036;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new IntegerValue();
    }

    public Attr_LucentConfiguredRateDnMax()
    {
        setup();
    }

    public Attr_LucentConfiguredRateDnMax(Serializable o)
    {
        setup(o);
    }
}

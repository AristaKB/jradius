// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_adsl.forum;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Minimum-Data-Rate-Downstream<br>
 * Attribute Type: 26<br>
 * Vendor Id: 3561<br>
 * VSA Type: 132<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MinimumDataRateDownstream extends VSAttribute
{
    public static final String NAME = "Minimum-Data-Rate-Downstream";
    public static final int VENDOR_ID = 3561;
    public static final int VSA_TYPE = 132;
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

    public Attr_MinimumDataRateDownstream()
    {
        setup();
    }

    public Attr_MinimumDataRateDownstream(Serializable o)
    {
        setup(o);
    }
}

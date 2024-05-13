// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_utstarcom;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: UTStarcom-CommittedBandwidth<br>
 * Attribute Type: 26<br>
 * Vendor Id: 7064<br>
 * VSA Type: 142<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_UTStarcomCommittedBandwidth extends VSAttribute
{
    public static final String NAME = "UTStarcom-CommittedBandwidth";
    public static final int VENDOR_ID = 7064;
    public static final int VSA_TYPE = 142;
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

    public Attr_UTStarcomCommittedBandwidth()
    {
        setup();
    }

    public Attr_UTStarcomCommittedBandwidth(Serializable o)
    {
        setup(o);
    }
}

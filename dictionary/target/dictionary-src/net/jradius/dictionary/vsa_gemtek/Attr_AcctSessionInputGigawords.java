// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_gemtek;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acct-Session-Input-Gigawords<br>
 * Attribute Type: 26<br>
 * Vendor Id: 10529<br>
 * VSA Type: 22<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcctSessionInputGigawords extends VSAttribute
{
    public static final String NAME = "Acct-Session-Input-Gigawords";
    public static final int VENDOR_ID = 10529;
    public static final int VSA_TYPE = 22;
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

    public Attr_AcctSessionInputGigawords()
    {
        setup();
    }

    public Attr_AcctSessionInputGigawords(Serializable o)
    {
        setup(o);
    }
}

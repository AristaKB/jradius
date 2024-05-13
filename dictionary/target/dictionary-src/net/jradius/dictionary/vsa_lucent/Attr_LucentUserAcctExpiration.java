// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_lucent;

import java.io.Serializable;
import java.util.Date;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.DateValue;

/**
 * Attribute Name: Lucent-User-Acct-Expiration<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4846<br>
 * VSA Type: 306<br>
 * Value Type: DateValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LucentUserAcctExpiration extends VSAttribute
{
    public static final String NAME = "Lucent-User-Acct-Expiration";
    public static final int VENDOR_ID = 4846;
    public static final int VSA_TYPE = 306;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new DateValue();
    }

    public Attr_LucentUserAcctExpiration()
    {
        setup();
    }

    public Attr_LucentUserAcctExpiration(Serializable o)
    {
        setup(o);
    }
}
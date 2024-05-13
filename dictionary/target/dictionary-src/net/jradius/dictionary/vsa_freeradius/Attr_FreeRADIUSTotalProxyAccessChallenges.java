// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_freeradius;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: FreeRADIUS-Total-Proxy-Access-Challenges<br>
 * Attribute Type: 26<br>
 * Vendor Id: 11344<br>
 * VSA Type: 141<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FreeRADIUSTotalProxyAccessChallenges extends VSAttribute
{
    public static final String NAME = "FreeRADIUS-Total-Proxy-Access-Challenges";
    public static final int VENDOR_ID = 11344;
    public static final int VSA_TYPE = 141;
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

    public Attr_FreeRADIUSTotalProxyAccessChallenges()
    {
        setup();
    }

    public Attr_FreeRADIUSTotalProxyAccessChallenges(Serializable o)
    {
        setup(o);
    }
}

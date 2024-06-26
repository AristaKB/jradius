// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_freeradius;

import java.io.Serializable;
import java.util.Date;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.DateValue;

/**
 * Attribute Name: FreeRADIUS-Acct-Session-Start-Time<br>
 * Attribute Type: 26<br>
 * Vendor Id: 11344<br>
 * VSA Type: 2<br>
 * Value Type: DateValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_FreeRADIUSAcctSessionStartTime extends VSAttribute
{
    public static final String NAME = "FreeRADIUS-Acct-Session-Start-Time";
    public static final int VENDOR_ID = 11344;
    public static final int VSA_TYPE = 2;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new DateValue();
    }

    public Attr_FreeRADIUSAcctSessionStartTime()
    {
        setup();
    }

    public Attr_FreeRADIUSAcctSessionStartTime(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.Date;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.DateValue;

/**
 * Attribute Name: USR-Call-Start-Date-Time<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0xBFF7<br>
 * Value Type: DateValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USRCallStartDateTime extends VSAttribute
{
    public static final String NAME = "USR-Call-Start-Date-Time";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0xBFF7;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("4,0");
        attributeValue = new DateValue();
    }

    public Attr_USRCallStartDateTime()
    {
        setup();
    }

    public Attr_USRCallStartDateTime(Serializable o)
    {
        setup(o);
    }
}

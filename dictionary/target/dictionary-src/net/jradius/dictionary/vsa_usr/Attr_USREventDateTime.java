// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.Date;


import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.DateValue;

/**
 * Attribute Name: USR-Event-Date-Time<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0xBF2F<br>
 * Value Type: DateValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USREventDateTime extends VSAttribute
{
    public static final String NAME = "USR-Event-Date-Time";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0xBF2F;
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

    public Attr_USREventDateTime()
    {
        setup();
    }

    public Attr_USREventDateTime(Serializable o)
    {
        setup(o);
    }
}

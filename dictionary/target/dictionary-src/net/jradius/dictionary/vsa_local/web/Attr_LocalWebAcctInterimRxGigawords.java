// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_local.web;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Local-Web-Acct-Interim-Rx-Gigawords<br>
 * Attribute Type: 26<br>
 * Vendor Id: 19220<br>
 * VSA Type: 215<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LocalWebAcctInterimRxGigawords extends VSAttribute
{
    public static final String NAME = "Local-Web-Acct-Interim-Rx-Gigawords";
    public static final int VENDOR_ID = 19220;
    public static final int VSA_TYPE = 215;
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

    public Attr_LocalWebAcctInterimRxGigawords()
    {
        setup();
    }

    public Attr_LocalWebAcctInterimRxGigawords(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_epygi;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Epygi-InSourceRTP_IP<br>
 * Attribute Type: 26<br>
 * Vendor Id: 16459<br>
 * VSA Type: 189<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_EpygiInSourceRTPIP extends VSAttribute
{
    public static final String NAME = "Epygi-InSourceRTP_IP";
    public static final int VENDOR_ID = 16459;
    public static final int VSA_TYPE = 189;
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

    public Attr_EpygiInSourceRTPIP()
    {
        setup();
    }

    public Attr_EpygiInSourceRTPIP(Serializable o)
    {
        setup(o);
    }
}

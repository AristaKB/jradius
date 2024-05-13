// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_starent;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: SN-PPP-Keepalive<br>
 * Attribute Type: 26<br>
 * Vendor Id: 8164<br>
 * VSA Type: 16<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SNPPPKeepalive extends VSAttribute
{
    public static final String NAME = "SN-PPP-Keepalive";
    public static final int VENDOR_ID = 8164;
    public static final int VSA_TYPE = 16;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,2");
        attributeValue = new IntegerValue();
    }

    public Attr_SNPPPKeepalive()
    {
        setup();
    }

    public Attr_SNPPPKeepalive(Serializable o)
    {
        setup(o);
    }
}
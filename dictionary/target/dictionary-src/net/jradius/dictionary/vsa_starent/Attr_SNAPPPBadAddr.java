// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_starent;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: SNA-PPP-Bad-Addr<br>
 * Attribute Type: 26<br>
 * Vendor Id: 8164<br>
 * VSA Type: 1011<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_SNAPPPBadAddr extends VSAttribute
{
    public static final String NAME = "SNA-PPP-Bad-Addr";
    public static final int VENDOR_ID = 8164;
    public static final int VSA_TYPE = 1011;
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

    public Attr_SNAPPPBadAddr()
    {
        setup();
    }

    public Attr_SNAPPPBadAddr(Serializable o)
    {
        setup(o);
    }
}

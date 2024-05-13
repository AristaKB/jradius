// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: WiMAX-vHA-RK-Lifetime<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 69<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXvHARKLifetime extends VSAttribute
{
    public static final String NAME = "WiMAX-vHA-RK-Lifetime";
    public static final int VENDOR_ID = 24757;
    public static final int VSA_TYPE = 69;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new IntegerValue();
    }

    public Attr_WiMAXvHARKLifetime()
    {
        setup();
    }

    public Attr_WiMAXvHARKLifetime(Serializable o)
    {
        setup(o);
    }
}

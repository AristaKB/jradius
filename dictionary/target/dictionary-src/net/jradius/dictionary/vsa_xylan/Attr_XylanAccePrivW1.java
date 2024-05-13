// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_xylan;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Xylan-Acce-Priv-W1<br>
 * Attribute Type: 26<br>
 * Vendor Id: 800<br>
 * VSA Type: 35<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_XylanAccePrivW1 extends VSAttribute
{
    public static final String NAME = "Xylan-Acce-Priv-W1";
    public static final int VENDOR_ID = 800;
    public static final int VSA_TYPE = 35;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new OctetsValue();
    }

    public Attr_XylanAccePrivW1()
    {
        setup();
    }

    public Attr_XylanAccePrivW1(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_motorola;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.OctetsValue;

/**
 * Attribute Name: Motorola-WiMAX-Home-BTS<br>
 * Attribute Type: 26<br>
 * Vendor Id: 161<br>
 * VSA Type: 50<br>
 * Value Type: OctetsValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_MotorolaWiMAXHomeBTS extends VSAttribute
{
    public static final String NAME = "Motorola-WiMAX-Home-BTS";
    public static final int VENDOR_ID = 161;
    public static final int VSA_TYPE = 50;
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

    public Attr_MotorolaWiMAXHomeBTS()
    {
        setup();
    }

    public Attr_MotorolaWiMAXHomeBTS(Serializable o)
    {
        setup(o);
    }
}

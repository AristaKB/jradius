// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAWithSubAttributes;
import net.jradius.packet.attribute.value.TLVValue;

/**
 * Attribute Name: WiMAX-QoS-Descriptor<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 29<br>
 * Value Type: TLVValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXQoSDescriptor extends VSAWithSubAttributes
{
    public static final String NAME = "WiMAX-QoS-Descriptor";
    public static final int VENDOR_ID = 24757;
    public static final int VSA_TYPE = 29;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new TLVValue(VENDOR_ID, VSA_TYPE, getSubAttributes());
    }

    public Attr_WiMAXQoSDescriptor()
    {
        setup();
    }

    public Attr_WiMAXQoSDescriptor(Serializable o)
    {
        setup(o);
    }
}

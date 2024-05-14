// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_cisco;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: prev-hop-ip<br>
 * Attribute Type: 26<br>
 * Vendor Id: 9<br>
 * VSA Type: 145<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_prevhopip extends VSAttribute
{
    public static final String NAME = "prev-hop-ip";
    public static final int VENDOR_ID = 9;
    public static final int VSA_TYPE = 145;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new StringValue();
    }

    public Attr_prevhopip()
    {
        setup();
    }

    public Attr_prevhopip(Serializable o)
    {
        setup(o);
    }
}

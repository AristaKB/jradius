// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_springtide;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: ST-IPSec-Pfs-Group<br>
 * Attribute Type: 26<br>
 * Vendor Id: 3551<br>
 * VSA Type: 14<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_STIPSecPfsGroup extends VSAttribute
{
    public static final String NAME = "ST-IPSec-Pfs-Group";
    public static final int VENDOR_ID = 3551;
    public static final int VSA_TYPE = 14;
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

    public Attr_STIPSecPfsGroup()
    {
        setup();
    }

    public Attr_STIPSecPfsGroup(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_manzara;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Manzara-User-UID<br>
 * Attribute Type: 26<br>
 * Vendor Id: 19382<br>
 * VSA Type: 1<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ManzaraUserUID extends VSAttribute
{
    public static final String NAME = "Manzara-User-UID";
    public static final int VENDOR_ID = 19382;
    public static final int VSA_TYPE = 1;
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

    public Attr_ManzaraUserUID()
    {
        setup();
    }

    public Attr_ManzaraUserUID(Serializable o)
    {
        setup(o);
    }
}

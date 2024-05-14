// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_acme;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acme-Calling-Packets_FS2<br>
 * Attribute Type: 26<br>
 * Vendor Id: 9148<br>
 * VSA Type: 103<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcmeCallingPacketsFS2 extends VSAttribute
{
    public static final String NAME = "Acme-Calling-Packets_FS2";
    public static final int VENDOR_ID = 9148;
    public static final int VSA_TYPE = 103;
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

    public Attr_AcmeCallingPacketsFS2()
    {
        setup();
    }

    public Attr_AcmeCallingPacketsFS2(Serializable o)
    {
        setup(o);
    }
}

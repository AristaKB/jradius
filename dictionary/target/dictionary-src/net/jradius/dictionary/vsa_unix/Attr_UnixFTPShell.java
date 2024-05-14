// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_unix;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Unix-FTP-Shell<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4<br>
 * VSA Type: 13<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_UnixFTPShell extends VSAttribute
{
    public static final String NAME = "Unix-FTP-Shell";
    public static final int VENDOR_ID = 4;
    public static final int VSA_TYPE = 13;
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

    public Attr_UnixFTPShell()
    {
        setup();
    }

    public Attr_UnixFTPShell(Serializable o)
    {
        setup(o);
    }
}

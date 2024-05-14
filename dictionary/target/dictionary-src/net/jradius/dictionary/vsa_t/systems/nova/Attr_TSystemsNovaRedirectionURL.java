// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_t.systems.nova;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: T-Systems-Nova-Redirection-URL<br>
 * Attribute Type: 26<br>
 * Vendor Id: 16787<br>
 * VSA Type: 4<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TSystemsNovaRedirectionURL extends VSAttribute
{
    public static final String NAME = "T-Systems-Nova-Redirection-URL";
    public static final int VENDOR_ID = 16787;
    public static final int VSA_TYPE = 4;
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

    public Attr_TSystemsNovaRedirectionURL()
    {
        setup();
    }

    public Attr_TSystemsNovaRedirectionURL(Serializable o)
    {
        setup(o);
    }
}

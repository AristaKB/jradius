// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_wimax;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: WiMAX-IP-Redirection-Rule<br>
 * Attribute Type: 26<br>
 * Vendor Id: 24757<br>
 * VSA Type: 55<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_WiMAXIPRedirectionRule extends VSAttribute
{
    public static final String NAME = "WiMAX-IP-Redirection-Rule";
    public static final int VENDOR_ID = 24757;
    public static final int VSA_TYPE = 55;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("1,1,c");
        attributeValue = new StringValue();
    }

    public Attr_WiMAXIPRedirectionRule()
    {
        setup();
    }

    public Attr_WiMAXIPRedirectionRule(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: TLS-Client-Cert-Serial<br>
 * Attribute Type: 1920 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TLSClientCertSerial extends RadiusAttribute
{
    public static final String NAME = "TLS-Client-Cert-Serial";
    public static final long TYPE = 1920;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1920;
        attributeValue = new StringValue();
    }

    public Attr_TLSClientCertSerial()
    {
        setup();
    }

    public Attr_TLSClientCertSerial(Serializable o)
    {
        setup(o);
    }
}

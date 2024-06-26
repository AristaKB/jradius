// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: TLS-Client-Cert-Filename<br>
 * Attribute Type: 1925 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TLSClientCertFilename extends RadiusAttribute
{
    public static final String NAME = "TLS-Client-Cert-Filename";
    public static final long TYPE = 1925;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1925;
        attributeValue = new StringValue();
    }

    public Attr_TLSClientCertFilename()
    {
        setup();
    }

    public Attr_TLSClientCertFilename(Serializable o)
    {
        setup(o);
    }
}

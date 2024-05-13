// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: TLS-Client-Cert-Subject<br>
 * Attribute Type: 1923 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TLSClientCertSubject extends RadiusAttribute
{
    public static final String NAME = "TLS-Client-Cert-Subject";
    public static final long TYPE = 1923;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1923;
        attributeValue = new StringValue();
    }

    public Attr_TLSClientCertSubject()
    {
        setup();
    }

    public Attr_TLSClientCertSubject(Serializable o)
    {
        setup(o);
    }
}
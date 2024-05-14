// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: TLS-Cert-Subject<br>
 * Attribute Type: 1913 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TLSCertSubject extends RadiusAttribute
{
    public static final String NAME = "TLS-Cert-Subject";
    public static final long TYPE = 1913;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1913;
        attributeValue = new StringValue();
    }

    public Attr_TLSCertSubject()
    {
        setup();
    }

    public Attr_TLSCertSubject(Serializable o)
    {
        setup(o);
    }
}

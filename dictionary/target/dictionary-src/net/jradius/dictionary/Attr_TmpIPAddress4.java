// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Tmp-IP-Address-4<br>
 * Attribute Type: 1824 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpIPAddress4 extends RadiusAttribute
{
    public static final String NAME = "Tmp-IP-Address-4";
    public static final long TYPE = 1824;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1824;
        attributeValue = new IPAddrValue();
    }

    public Attr_TmpIPAddress4()
    {
        setup();
    }

    public Attr_TmpIPAddress4(Serializable o)
    {
        setup(o);
    }
}

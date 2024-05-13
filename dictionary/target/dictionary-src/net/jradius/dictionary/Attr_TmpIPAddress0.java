// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.net.InetAddress;


import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.IPAddrValue;

/**
 * Attribute Name: Tmp-IP-Address-0<br>
 * Attribute Type: 1820 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: IPAddrValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_TmpIPAddress0 extends RadiusAttribute
{
    public static final String NAME = "Tmp-IP-Address-0";
    public static final long TYPE = 1820;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 1820;
        attributeValue = new IPAddrValue();
    }

    public Attr_TmpIPAddress0()
    {
        setup();
    }

    public Attr_TmpIPAddress0(Serializable o)
    {
        setup(o);
    }
}

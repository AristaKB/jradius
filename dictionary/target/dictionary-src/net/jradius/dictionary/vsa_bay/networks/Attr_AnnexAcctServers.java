// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_bay.networks;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.StringValue;

/**
 * Attribute Name: Annex-Acct-Servers<br>
 * Attribute Type: 26<br>
 * Vendor Id: 1584<br>
 * VSA Type: 41<br>
 * Value Type: StringValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AnnexAcctServers extends VSAttribute
{
    public static final String NAME = "Annex-Acct-Servers";
    public static final int VENDOR_ID = 1584;
    public static final int VSA_TYPE = 41;
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

    public Attr_AnnexAcctServers()
    {
        setup();
    }

    public Attr_AnnexAcctServers(Serializable o)
    {
        setup(o);
    }
}
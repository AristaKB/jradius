// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_acme;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Acme-Called-RTCP-Avg-Latency_FS1<br>
 * Attribute Type: 26<br>
 * Vendor Id: 9148<br>
 * VSA Type: 48<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_AcmeCalledRTCPAvgLatencyFS1 extends VSAttribute
{
    public static final String NAME = "Acme-Called-RTCP-Avg-Latency_FS1";
    public static final int VENDOR_ID = 9148;
    public static final int VSA_TYPE = 48;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        attributeValue = new IntegerValue();
    }

    public Attr_AcmeCalledRTCPAvgLatencyFS1()
    {
        setup();
    }

    public Attr_AcmeCalledRTCPAvgLatencyFS1(Serializable o)
    {
        setup(o);
    }
}

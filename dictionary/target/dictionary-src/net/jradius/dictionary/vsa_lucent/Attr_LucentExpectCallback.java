// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_lucent;

import java.io.Serializable;
import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.IntegerValue;

/**
 * Attribute Name: Lucent-Expect-Callback<br>
 * Attribute Type: 26<br>
 * Vendor Id: 4846<br>
 * VSA Type: 149<br>
 * Value Type: IntegerValue<br>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_LucentExpectCallback extends VSAttribute
{
    public static final String NAME = "Lucent-Expect-Callback";
    public static final int VENDOR_ID = 4846;
    public static final int VSA_TYPE = 149;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("2,1");
        attributeValue = new IntegerValue();
    }

    public Attr_LucentExpectCallback()
    {
        setup();
    }

    public Attr_LucentExpectCallback(Serializable o)
    {
        setup(o);
    }
}
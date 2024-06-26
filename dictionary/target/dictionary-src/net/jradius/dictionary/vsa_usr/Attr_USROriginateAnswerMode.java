// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_usr;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.VSAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: USR-Originate-Answer-Mode<br>
 * Attribute Type: 26<br>
 * Vendor Id: 429<br>
 * VSA Type: 0x0068<br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> Originate_in_Originate_Mode (1)
 * <li> Originate_in_Answer_Mode (2)
 * <li> Answer_in_Originate_Mode (3)
 * <li> Answer_in_Answer_Mode (4)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_USROriginateAnswerMode extends VSAttribute
{
    public static final String NAME = "USR-Originate-Answer-Mode";
    public static final int VENDOR_ID = 429;
    public static final int VSA_TYPE = 0x0068;
    public static final long TYPE = ((VENDOR_ID & 0xFFFF) << 16) | VSA_TYPE;

    public static final long serialVersionUID = TYPE;

    public static final Long OriginateinOriginateMode = new Long(1L);
    public static final Long OriginateinAnswerMode = new Long(2L);
    public static final Long AnswerinOriginateMode = new Long(3L);
    public static final Long AnswerinAnswerMode = new Long(4L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(1L),new Long(2L),new Long(3L),new Long(4L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("Originate_in_Originate_Mode".equals(name)) return new Long(1L);
            if ("Originate_in_Answer_Mode".equals(name)) return new Long(2L);
            if ("Answer_in_Originate_Mode".equals(name)) return new Long(3L);
            if ("Answer_in_Answer_Mode".equals(name)) return new Long(4L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(1L).equals(value)) return "Originate_in_Originate_Mode";
            if (new Long(2L).equals(value)) return "Originate_in_Answer_Mode";
            if (new Long(3L).equals(value)) return "Answer_in_Originate_Mode";
            if (new Long(4L).equals(value)) return "Answer_in_Answer_Mode";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 26;
        vendorId = VENDOR_ID;
        vsaAttributeType = VSA_TYPE;
        setFormat("4,0");
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_USROriginateAnswerMode()
    {
        setup();
    }

    public Attr_USROriginateAnswerMode(Serializable o)
    {
        setup(o);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import net.jradius.packet.attribute.RadiusAttribute;
import net.jradius.packet.attribute.value.NamedValue;

/**
 * Attribute Name: Module-Return-Code<br>
 * Attribute Type: 1108 (FreeRADIUS Internal Attribute)<br><br>
 * Value Type: NamedValue<br>
 * Possible Values: <br>
 * <ul>
 * <li> reject (0)
 * <li> fail (1)
 * <li> ok (2)
 * <li> handled (3)
 * <li> invalid (4)
 * <li> userlock (5)
 * <li> notfound (6)
 * <li> noop (7)
 * <li> updated (8)
 * </ul>
 *
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public final class Attr_ModuleReturnCode extends RadiusAttribute
{
    public static final String NAME = "Module-Return-Code";
    public static final long TYPE = 1108;

    public static final long serialVersionUID = TYPE;

    public static final Long reject = new Long(0L);
    public static final Long fail = new Long(1L);
    public static final Long ok = new Long(2L);
    public static final Long handled = new Long(3L);
    public static final Long invalid = new Long(4L);
    public static final Long userlock = new Long(5L);
    public static final Long notfound = new Long(6L);
    public static final Long noop = new Long(7L);
    public static final Long updated = new Long(8L);

    @SuppressWarnings("serial")
    protected class NamedValueMap implements NamedValue.NamedValueMap, Serializable
    {
        public Long[] knownValues = { new Long(0L),new Long(1L),new Long(2L),new Long(3L),new Long(4L),new Long(5L),new Long(6L),new Long(7L),new Long(8L)};

        public Long[] getKnownValues() { return knownValues; }

        public Long getNamedValue(String name)
        {
            if ("reject".equals(name)) return new Long(0L);
            if ("fail".equals(name)) return new Long(1L);
            if ("ok".equals(name)) return new Long(2L);
            if ("handled".equals(name)) return new Long(3L);
            if ("invalid".equals(name)) return new Long(4L);
            if ("userlock".equals(name)) return new Long(5L);
            if ("notfound".equals(name)) return new Long(6L);
            if ("noop".equals(name)) return new Long(7L);
            if ("updated".equals(name)) return new Long(8L);
            return null;
        }

        public String getNamedValue(Long value)
        {
            if (new Long(0L).equals(value)) return "reject";
            if (new Long(1L).equals(value)) return "fail";
            if (new Long(2L).equals(value)) return "ok";
            if (new Long(3L).equals(value)) return "handled";
            if (new Long(4L).equals(value)) return "invalid";
            if (new Long(5L).equals(value)) return "userlock";
            if (new Long(6L).equals(value)) return "notfound";
            if (new Long(7L).equals(value)) return "noop";
            if (new Long(8L).equals(value)) return "updated";
            return null;
        }
    };

    public static transient NamedValueMap map = null;
    public void setup()
    {
        attributeName = NAME;
        attributeType = 1108;
        attributeValue = new NamedValue(map != null ? map : (map = new NamedValueMap()));
    }

    public Attr_ModuleReturnCode()
    {
        setup();
    }

    public Attr_ModuleReturnCode(Serializable o)
    {
        setup(o);
    }
}
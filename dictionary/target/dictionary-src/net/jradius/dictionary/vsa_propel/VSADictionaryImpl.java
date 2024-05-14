// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_propel;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_propel
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Propel"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_PropelAccelerate.class);
        map.put(new Long(2L), Attr_PropelDialedDigits.class);
        map.put(new Long(3L), Attr_PropelClientIPAddress.class);
        map.put(new Long(4L), Attr_PropelClientNASIPAddress.class);
        map.put(new Long(5L), Attr_PropelClientSourceID.class);
        map.put(new Long(6L), Attr_PropelContentFilterID.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_PropelAccelerate.NAME, Attr_PropelAccelerate.class);
        map.put(Attr_PropelDialedDigits.NAME, Attr_PropelDialedDigits.class);
        map.put(Attr_PropelClientIPAddress.NAME, Attr_PropelClientIPAddress.class);
        map.put(Attr_PropelClientNASIPAddress.NAME, Attr_PropelClientNASIPAddress.class);
        map.put(Attr_PropelClientSourceID.NAME, Attr_PropelClientSourceID.class);
        map.put(Attr_PropelContentFilterID.NAME, Attr_PropelContentFilterID.class);
    }
}

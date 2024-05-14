// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_roaring.penguin;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_roaring.penguin
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Roaring-Penguin"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_RPUpstreamSpeedLimit.class);
        map.put(new Long(2L), Attr_RPDownstreamSpeedLimit.class);
        map.put(new Long(3L), Attr_RPHURL.class);
        map.put(new Long(4L), Attr_RPMOTM.class);
        map.put(new Long(5L), Attr_RPMaxSessionsPerUser.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_RPUpstreamSpeedLimit.NAME, Attr_RPUpstreamSpeedLimit.class);
        map.put(Attr_RPDownstreamSpeedLimit.NAME, Attr_RPDownstreamSpeedLimit.class);
        map.put(Attr_RPHURL.NAME, Attr_RPHURL.class);
        map.put(Attr_RPMOTM.NAME, Attr_RPMOTM.class);
        map.put(Attr_RPMaxSessionsPerUser.NAME, Attr_RPMaxSessionsPerUser.class);
    }
}

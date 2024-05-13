// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_colubris;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_colubris
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Colubris"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(0L), Attr_ColubrisAVPair.class);
        map.put(new Long(1L), Attr_ColubrisIntercept.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ColubrisAVPair.NAME, Attr_ColubrisAVPair.class);
        map.put(Attr_ColubrisIntercept.NAME, Attr_ColubrisIntercept.class);
    }
}
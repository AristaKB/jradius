// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_cabletron;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_cabletron
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Cabletron"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(201L), Attr_CabletronProtocolEnable.class);
        map.put(new Long(202L), Attr_CabletronProtocolCallable.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_CabletronProtocolEnable.NAME, Attr_CabletronProtocolEnable.class);
        map.put(Attr_CabletronProtocolCallable.NAME, Attr_CabletronProtocolCallable.class);
    }
}
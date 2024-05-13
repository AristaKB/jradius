// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_manzara;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_manzara
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Manzara"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_ManzaraUserUID.class);
        map.put(new Long(2L), Attr_ManzaraUserGID.class);
        map.put(new Long(3L), Attr_ManzaraUserHome.class);
        map.put(new Long(4L), Attr_ManzaraUserShell.class);
        map.put(new Long(5L), Attr_ManzaraPPPAddrString.class);
        map.put(new Long(6L), Attr_ManzaraFullLoginString.class);
        map.put(new Long(7L), Attr_ManzaraTariffUnits.class);
        map.put(new Long(8L), Attr_ManzaraTariffType.class);
        map.put(new Long(9L), Attr_ManzaraECPSessionKey.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ManzaraUserUID.NAME, Attr_ManzaraUserUID.class);
        map.put(Attr_ManzaraUserGID.NAME, Attr_ManzaraUserGID.class);
        map.put(Attr_ManzaraUserHome.NAME, Attr_ManzaraUserHome.class);
        map.put(Attr_ManzaraUserShell.NAME, Attr_ManzaraUserShell.class);
        map.put(Attr_ManzaraPPPAddrString.NAME, Attr_ManzaraPPPAddrString.class);
        map.put(Attr_ManzaraFullLoginString.NAME, Attr_ManzaraFullLoginString.class);
        map.put(Attr_ManzaraTariffUnits.NAME, Attr_ManzaraTariffUnits.class);
        map.put(Attr_ManzaraTariffType.NAME, Attr_ManzaraTariffType.class);
        map.put(Attr_ManzaraECPSessionKey.NAME, Attr_ManzaraECPSessionKey.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_telebit;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_telebit
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "Telebit"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_TelebitLoginCommand.class);
        map.put(new Long(2L), Attr_TelebitPortName.class);
        map.put(new Long(3L), Attr_TelebitActivateCommand.class);
        map.put(new Long(4L), Attr_TelebitAccountingInfo.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_TelebitLoginCommand.NAME, Attr_TelebitLoginCommand.class);
        map.put(Attr_TelebitPortName.NAME, Attr_TelebitPortName.class);
        map.put(Attr_TelebitActivateCommand.NAME, Attr_TelebitActivateCommand.class);
        map.put(Attr_TelebitAccountingInfo.NAME, Attr_TelebitAccountingInfo.class);
    }
}

// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:13 +0530

package net.jradius.dictionary.vsa_wispr;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_wispr
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "WISPr"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_WISPrLocationID.class);
        map.put(new Long(2L), Attr_WISPrLocationName.class);
        map.put(new Long(3L), Attr_WISPrLogoffURL.class);
        map.put(new Long(4L), Attr_WISPrRedirectionURL.class);
        map.put(new Long(5L), Attr_WISPrBandwidthMinUp.class);
        map.put(new Long(6L), Attr_WISPrBandwidthMinDown.class);
        map.put(new Long(7L), Attr_WISPrBandwidthMaxUp.class);
        map.put(new Long(8L), Attr_WISPrBandwidthMaxDown.class);
        map.put(new Long(9L), Attr_WISPrSessionTerminateTime.class);
        map.put(new Long(10L), Attr_WISPrSessionTerminateEndOfDay.class);
        map.put(new Long(11L), Attr_WISPrBillingClassOfService.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_WISPrLocationID.NAME, Attr_WISPrLocationID.class);
        map.put(Attr_WISPrLocationName.NAME, Attr_WISPrLocationName.class);
        map.put(Attr_WISPrLogoffURL.NAME, Attr_WISPrLogoffURL.class);
        map.put(Attr_WISPrRedirectionURL.NAME, Attr_WISPrRedirectionURL.class);
        map.put(Attr_WISPrBandwidthMinUp.NAME, Attr_WISPrBandwidthMinUp.class);
        map.put(Attr_WISPrBandwidthMinDown.NAME, Attr_WISPrBandwidthMinDown.class);
        map.put(Attr_WISPrBandwidthMaxUp.NAME, Attr_WISPrBandwidthMaxUp.class);
        map.put(Attr_WISPrBandwidthMaxDown.NAME, Attr_WISPrBandwidthMaxDown.class);
        map.put(Attr_WISPrSessionTerminateTime.NAME, Attr_WISPrSessionTerminateTime.class);
        map.put(Attr_WISPrSessionTerminateEndOfDay.NAME, Attr_WISPrSessionTerminateEndOfDay.class);
        map.put(Attr_WISPrBillingClassOfService.NAME, Attr_WISPrBillingClassOfService.class);
    }
}

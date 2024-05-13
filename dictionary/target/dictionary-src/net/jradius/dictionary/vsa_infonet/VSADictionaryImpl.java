// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Mon, 13 May 2024 11:07:32 +0530

package net.jradius.dictionary.vsa_infonet;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_infonet
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "infonet"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(238L), Attr_InfonetProxy.class);
        map.put(new Long(239L), Attr_InfonetConfig.class);
        map.put(new Long(240L), Attr_InfonetMCSCountry.class);
        map.put(new Long(241L), Attr_InfonetMCSRegion.class);
        map.put(new Long(242L), Attr_InfonetMCSOffPeak.class);
        map.put(new Long(243L), Attr_InfonetMCSOverflow.class);
        map.put(new Long(244L), Attr_InfonetMCSPort.class);
        map.put(new Long(245L), Attr_InfonetMCSPortCount.class);
        map.put(new Long(247L), Attr_InfonetAccountNumber.class);
        map.put(new Long(248L), Attr_InfonetType.class);
        map.put(new Long(252L), Attr_InfonetPoolRequest.class);
        map.put(new Long(254L), Attr_InfonetSurchargeType.class);
        map.put(new Long(255L), Attr_InfonetNASLocation.class);
        map.put(new Long(246L), Attr_InfonetRandomIPPool.class);
        map.put(new Long(249L), Attr_InfonetRealmType.class);
        map.put(new Long(250L), Attr_InfonetLoginHostDest.class);
        map.put(new Long(251L), Attr_InfonetTunnelDecisionIP.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_InfonetProxy.NAME, Attr_InfonetProxy.class);
        map.put(Attr_InfonetConfig.NAME, Attr_InfonetConfig.class);
        map.put(Attr_InfonetMCSCountry.NAME, Attr_InfonetMCSCountry.class);
        map.put(Attr_InfonetMCSRegion.NAME, Attr_InfonetMCSRegion.class);
        map.put(Attr_InfonetMCSOffPeak.NAME, Attr_InfonetMCSOffPeak.class);
        map.put(Attr_InfonetMCSOverflow.NAME, Attr_InfonetMCSOverflow.class);
        map.put(Attr_InfonetMCSPort.NAME, Attr_InfonetMCSPort.class);
        map.put(Attr_InfonetMCSPortCount.NAME, Attr_InfonetMCSPortCount.class);
        map.put(Attr_InfonetAccountNumber.NAME, Attr_InfonetAccountNumber.class);
        map.put(Attr_InfonetType.NAME, Attr_InfonetType.class);
        map.put(Attr_InfonetPoolRequest.NAME, Attr_InfonetPoolRequest.class);
        map.put(Attr_InfonetSurchargeType.NAME, Attr_InfonetSurchargeType.class);
        map.put(Attr_InfonetNASLocation.NAME, Attr_InfonetNASLocation.class);
        map.put(Attr_InfonetRandomIPPool.NAME, Attr_InfonetRandomIPPool.class);
        map.put(Attr_InfonetRealmType.NAME, Attr_InfonetRealmType.class);
        map.put(Attr_InfonetLoginHostDest.NAME, Attr_InfonetLoginHostDest.class);
        map.put(Attr_InfonetTunnelDecisionIP.NAME, Attr_InfonetTunnelDecisionIP.class);
    }
}
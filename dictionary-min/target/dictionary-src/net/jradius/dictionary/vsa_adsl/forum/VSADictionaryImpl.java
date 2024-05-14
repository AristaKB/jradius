// DO NOT EDIT THIS FILE DIRECTLY! - AUTOMATICALLY GENERATED
// Generated by: class net.jradius.freeradius.RadiusDictionary
// Generated on: Tue, 14 May 2024 12:35:18 +0530

package net.jradius.dictionary.vsa_adsl.forum;

import java.util.Map;

import net.jradius.packet.attribute.VSADictionary;

/**
 * Dictionary for package net.jradius.dictionary.vsa_adsl.forum
 * @author class net.jradius.freeradius.RadiusDictionary
 */
public class VSADictionaryImpl implements VSADictionary
{
    public String getVendorName() { return "ADSL-Forum"; }

    public void loadAttributes(Map<Long, Class<?>> map)
    {
        map.put(new Long(1L), Attr_ADSLAgentCircuitId.class);
        map.put(new Long(2L), Attr_ADSLAgentRemoteId.class);
        map.put(new Long(129L), Attr_ActualDataRateUpstream.class);
        map.put(new Long(130L), Attr_ActualDataRateDownstream.class);
        map.put(new Long(131L), Attr_MinimumDataRateUpstream.class);
        map.put(new Long(132L), Attr_MinimumDataRateDownstream.class);
        map.put(new Long(133L), Attr_AttainableDataRateUpstream.class);
        map.put(new Long(134L), Attr_AttainableDataRateDownstream.class);
        map.put(new Long(135L), Attr_MaximumDataRateUpstream.class);
        map.put(new Long(136L), Attr_MaximumDataRateDownstream.class);
        map.put(new Long(137L), Attr_MinimumDataRateUpstreamLowPower.class);
        map.put(new Long(138L), Attr_MinimumDataRateDownstreamLowPower.class);
        map.put(new Long(139L), Attr_MaximumInterleavingDelayUpstream.class);
        map.put(new Long(140L), Attr_ActualInterleavingDelayUpstream.class);
        map.put(new Long(141L), Attr_MaximumInterleavingDelayDownstream.class);
        map.put(new Long(142L), Attr_ActualInterleavingDelayDownstream.class);
        map.put(new Long(144L), Attr_AccessLoopEncapsulation.class);
        map.put(new Long(252L), Attr_IWFSession.class);
    }

    public void loadAttributesNames(Map<String, Class<?>> map)
    {
        map.put(Attr_ADSLAgentCircuitId.NAME, Attr_ADSLAgentCircuitId.class);
        map.put(Attr_ADSLAgentRemoteId.NAME, Attr_ADSLAgentRemoteId.class);
        map.put(Attr_ActualDataRateUpstream.NAME, Attr_ActualDataRateUpstream.class);
        map.put(Attr_ActualDataRateDownstream.NAME, Attr_ActualDataRateDownstream.class);
        map.put(Attr_MinimumDataRateUpstream.NAME, Attr_MinimumDataRateUpstream.class);
        map.put(Attr_MinimumDataRateDownstream.NAME, Attr_MinimumDataRateDownstream.class);
        map.put(Attr_AttainableDataRateUpstream.NAME, Attr_AttainableDataRateUpstream.class);
        map.put(Attr_AttainableDataRateDownstream.NAME, Attr_AttainableDataRateDownstream.class);
        map.put(Attr_MaximumDataRateUpstream.NAME, Attr_MaximumDataRateUpstream.class);
        map.put(Attr_MaximumDataRateDownstream.NAME, Attr_MaximumDataRateDownstream.class);
        map.put(Attr_MinimumDataRateUpstreamLowPower.NAME, Attr_MinimumDataRateUpstreamLowPower.class);
        map.put(Attr_MinimumDataRateDownstreamLowPower.NAME, Attr_MinimumDataRateDownstreamLowPower.class);
        map.put(Attr_MaximumInterleavingDelayUpstream.NAME, Attr_MaximumInterleavingDelayUpstream.class);
        map.put(Attr_ActualInterleavingDelayUpstream.NAME, Attr_ActualInterleavingDelayUpstream.class);
        map.put(Attr_MaximumInterleavingDelayDownstream.NAME, Attr_MaximumInterleavingDelayDownstream.class);
        map.put(Attr_ActualInterleavingDelayDownstream.NAME, Attr_ActualInterleavingDelayDownstream.class);
        map.put(Attr_AccessLoopEncapsulation.NAME, Attr_AccessLoopEncapsulation.class);
        map.put(Attr_IWFSession.NAME, Attr_IWFSession.class);
    }
}

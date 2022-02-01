package org.citygml.ade.opendrive.model.road;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.common.TopLevelFeature;
import org.citygml4j.model.transportation.Section;
import org.xmlobjects.gml.model.measures.Length;

public class OpenDRIVEStandardRoad extends Section implements TopLevelFeature, OpenDRIVERoad, ADEObject {
    private Length length;
    private String roadName;
    private e_trafficRule trafficRule;

    @Override
    public void setOpenDRIVERoadLength(Length length) {
        this.length = length;
    }

    @Override
    public Length getOpenDRIVERoadLength() {
        return this.length;
    }

    @Override
    public void setOpenDRIVERoadName(String roadName) {
        this.roadName = roadName;
    }

    @Override
    public String getOpenDRIVERoadName() {
        return this.roadName;
    }

    @Override
    public void setOpenDRIVERoadTrafficRule(e_trafficRule trafficRule) {
        this.trafficRule = trafficRule;
    }

    @Override
    public e_trafficRule getOpenDRIVERoadTrafficRule() {
        return this.trafficRule;
    }
}

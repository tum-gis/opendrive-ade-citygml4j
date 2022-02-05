package org.citygml.ade.opendrive.model.road;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.common.TopLevelFeature;
import org.citygml4j.model.transportation.AbstractTransportationSpace;
import org.citygml4j.visitor.ObjectVisitor;
import org.xmlobjects.gml.model.measures.Length;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVEConnectingRoad extends AbstractTransportationSpace implements TopLevelFeature, OpenDRIVERoad, ADEObject {
    private Length length;
    private String roadName;
    private e_trafficRule trafficRule;
    private List<OpenDRIVELaneSectionProperty> laneSection;

    @Override
    public void setOpenDRIVERoadLength(Length length) {
        this.length = length;
    }

    @Override
    public Length getOpenDRIVERoadLength() {
        return length;
    }

    @Override
    public void setOpenDRIVERoadName(String roadName) {
        this.roadName = roadName;
    }

    @Override
    public String getOpenDRIVERoadName() {
        return roadName;
    }

    @Override
    public void setOpenDRIVERoadTrafficRule(e_trafficRule trafficRule) {
        this.trafficRule = trafficRule;
    }

    @Override
    public e_trafficRule getOpenDRIVERoadTrafficRule() {
        return trafficRule;
    }

    @Override
    public void setOpenDRIVELaneSection(List<OpenDRIVELaneSectionProperty> laneSection) {
        this.laneSection = laneSection;
    }

    @Override
    public List<OpenDRIVELaneSectionProperty> getOpenDRIVELaneSection() {
        if (laneSection == null)
            laneSection = new ArrayList<>();

        return laneSection;
    }
}

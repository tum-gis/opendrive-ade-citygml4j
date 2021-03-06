package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.linearReferencing.ReferenceableTypeList;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.common.TopLevelFeature;
import org.citygml4j.model.transportation.AbstractTransportationSpace;
import org.xmlobjects.gml.model.measures.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OpenDRIVEConnectingRoad extends AbstractTransportationSpace implements TopLevelFeature, OpenDRIVERoad, ADEObject {
    private Length length;
    private String roadName;
    private E_trafficRule trafficRule;
    private ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection;
    private OpenDRIVERoadShapeProperty roadShape;
    private OpenDRIVEAdditionalDataProperty additionalData;
//    private OpenDRIVEJunctionProperty junction;

    public OpenDRIVEConnectingRoad() {
    }

    public OpenDRIVEConnectingRoad(Length length, ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection,
                                   OpenDRIVERoadShapeProperty roadShape, String roadID /*, OpenDRIVEJunctionProperty junction*/) {
        this.length = length;
        this.laneSection = laneSection;
        this.roadShape = roadShape;
        this.length = length;
        super.setId("UUID_" + UUID.randomUUID() + "_ODR_id_" + roadID);
    }

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public void setLength(Length length) {
        this.length = length;
    }

    @Override
    public Length getLength() {
        return length;
    }

    @Override
    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    @Override
    public String getRoadName() {
        return roadName;
    }

    @Override
    public void setTrafficRule(E_trafficRule trafficRule) {
        this.trafficRule = trafficRule;
    }

    @Override
    public E_trafficRule getTrafficRule() {
        return trafficRule;
    }

    @Override
    public void setLaneSection(ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection) {
        this.laneSection = laneSection;
    }

    @Override
    public List<OpenDRIVELaneSectionProperty> getLaneSection() {
        if (laneSection == null)
            laneSection = new ReferenceableTypeList<>();

        return laneSection;
    }

    @Override
    public void setRoadShape(OpenDRIVERoadShapeProperty roadShape) {
        this.roadShape = roadShape;
    }

    @Override
    public OpenDRIVERoadShapeProperty getRoadShape() {
        return roadShape;
    }
}

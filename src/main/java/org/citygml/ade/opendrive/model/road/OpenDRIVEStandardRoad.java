package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.linearReferencing.ReferenceableTypeList;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.common.TopLevelFeature;
import org.citygml4j.model.transportation.Section;
import org.xmlobjects.gml.model.measures.Length;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVEStandardRoad extends Section implements TopLevelFeature, OpenDRIVERoad, ADEObject {
    private Length length;
    private String roadName;
    private E_trafficRule trafficRule;
    private ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection;
    private OpenDRIVERoadShapeProperty roadShape;
    private OpenDRIVEAdditionalDataProperty additionalData;


    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

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
    public void setOpenDRIVERoadTrafficRule(E_trafficRule trafficRule) {
        this.trafficRule = trafficRule;
    }

    @Override
    public E_trafficRule getOpenDRIVERoadTrafficRule() {
        return this.trafficRule;
    }

    @Override
    public void setOpenDRIVELaneSection(ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection) {
        this.laneSection = laneSection;
    }

    @Override
    public ReferenceableTypeList<OpenDRIVELaneSectionProperty> getOpenDRIVELaneSection() {
        if (laneSection == null)
            laneSection = new ReferenceableTypeList<>();

        return laneSection;
    }

    @Override
    public void setOpenDRIVERoadShape(OpenDRIVERoadShapeProperty roadShape) {
        this.roadShape = roadShape;
    }

    @Override
    public OpenDRIVERoadShapeProperty getOpenDRIVERoadShape() {
        return roadShape;
    }
}

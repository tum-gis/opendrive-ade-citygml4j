package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneProperty;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.transportation.AbstractTransportationSpace;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVELaneSection extends AbstractTransportationSpace implements ADEObject, OpenDRIVEElement {
    private Boolean singleSided;
    private List<OpenDRIVELaneProperty> lane;
    private OpenDRIVEAdditionalDataProperty additionalData;

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    public Boolean getSingleSided() {
        return singleSided;
    }

    public void setSingleSided(Boolean singleSided) {
        this.singleSided = singleSided;
    }

    public List<OpenDRIVELaneProperty> getLane() {
        if (lane == null)
            lane = new ArrayList<>();

        return lane;
    }

    public void setLane(List<OpenDRIVELaneProperty> lane) {
        this.lane = lane;
    }
}

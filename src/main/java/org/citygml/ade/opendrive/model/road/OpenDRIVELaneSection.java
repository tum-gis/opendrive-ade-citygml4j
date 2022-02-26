package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml.ade.opendrive.model.core.ReferenceableType;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneArrayProperty;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneProperty;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.transportation.AbstractTransportationSpace;
import org.xmlobjects.gml.model.geometry.primitives.CurveSegmentArrayProperty;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVELaneSection extends AbstractTransportationSpace implements ADEObject, OpenDRIVEElement, ReferenceableType {
    private Boolean singleSided;
    private List<OpenDRIVELaneProperty> lane;
    private OpenDRIVEAdditionalDataProperty additionalData;
    private LinearReferencingProperty linearReferencing;

    public OpenDRIVELaneSection() {

    }

//    public OpenDRIVELaneSection(OpenDRIVELaneArrayProperty lanes) {
//        setLanes(lanes);
//    }


    public List<OpenDRIVELaneProperty> getLane() {
        if (lane == null)
            lane = new ArrayList<>();

        return lane;
    }

    public void setLane(List<OpenDRIVELaneProperty> lane) {
        this.lane = lane;
    }

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

//    public OpenDRIVELaneArrayProperty getLanes() {
//        if (lanes == null)
//            lanes = new OpenDRIVELaneArrayProperty();
//
//        return lanes;
//    }
//
//    public void setLanes(OpenDRIVELaneArrayProperty lanes) {
//        this.lanes = asChild(this.sortLanesByLaneID(lanes));
//    }

    public OpenDRIVELaneArrayProperty sortLanesByLaneID(OpenDRIVELaneArrayProperty lanes) {
        try {
                if (lanes != null && !lanes.getObjects().isEmpty() && lanes.getObjects().size() > 1) {
                    lanes.getObjects().sort((a, b) -> {
                        try {
                            return -Integer.compare(((OpenDRIVELane) a).getLaneID(), ((OpenDRIVELane) b).getLaneID());
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            System.out.println("Lane does not contain lane id.");
                            return 0;
                        }
                    });
                }
            } catch (NullPointerException e) {
                return lanes;
            }

        return lanes;
    }

    @Override
    public void setLinearReferencing(LinearReferencingProperty linearReferencing) {
        this.linearReferencing = linearReferencing;
    }

    @Override
    public LinearReferencingProperty getLinearReferencing() {
        return linearReferencing;
    }
}

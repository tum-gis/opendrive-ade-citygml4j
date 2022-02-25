package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneArrayProperty;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.transportation.AbstractTransportationSpace;
import org.xmlobjects.gml.model.geometry.primitives.CurveSegmentArrayProperty;

public class OpenDRIVELaneSection extends AbstractTransportationSpace implements ADEObject, OpenDRIVEElement {
    private Boolean singleSided;
    private OpenDRIVELaneArrayProperty lanes;
    private OpenDRIVEAdditionalDataProperty additionalData;

    public OpenDRIVELaneSection() {

    }

    public OpenDRIVELaneSection(OpenDRIVELaneArrayProperty lanes) {
        setLanes(lanes);
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

    public OpenDRIVELaneArrayProperty getLanes() {
        if (lanes == null)
            lanes = new OpenDRIVELaneArrayProperty();

        return lanes;
    }

    public void setLanes(OpenDRIVELaneArrayProperty lanes) {
        this.lanes = asChild(this.sortLanesByLaneID(lanes));
    }

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
}

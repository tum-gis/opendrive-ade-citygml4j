package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml4j.model.transportation.GranularityValue;
import org.citygml4j.model.transportation.TrafficSpace;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVETrafficLane extends TrafficSpace implements OpenDRIVELane {
    private Integer laneID;
    private LateralLaneSection lateralLaneSection;
    private Boolean level;
    private String laneType;
    private List<OpenDRIVELaneProperty> successor;
    private List<OpenDRIVELaneProperty> predecessor;
    private OpenDRIVEAdditionalDataProperty additionalData;
    private OpenDRIVELaneShapeProperty laneShape;

    // From OpenDRIVE 1.6 specification:
    // In OpenDRIVE, all roads contain lanes. Each road shall have at least one lane with a width larger than 0. The number of lanes per road is not limited.
    // For the definition and description of lanes in OpenDRIVE, the center lane is required. The center lane has no width and serves as reference for lane numbering.
    // => lane granularity
    public OpenDRIVETrafficLane() {
        super(GranularityValue.LANE);
//        setGranularity(GranularityValue.LANE);
    }

    public OpenDRIVETrafficLane(Integer laneID, LateralLaneSection lateralLaneSection, String type) {
//        this.setGranularity(GranularityValue.LANE);
        super(GranularityValue.LANE);
        this.laneID = laneID;
        this.lateralLaneSection = lateralLaneSection;
        this.laneType = type;
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
    public void setLaneID(Integer laneID) {
        this.laneID = laneID;
    }

    @Override
    public Integer getLaneID() {
        return laneID;
    }

    @Override
    public void setLateralLaneSection(LateralLaneSection lateralLaneSection) {
        this.lateralLaneSection = lateralLaneSection;
    }

    @Override
    public LateralLaneSection getLateralLaneSection() {
        return this.lateralLaneSection;
    }

    @Override
    public void setLevel(Boolean level) {
        this.level = level;
    }

    @Override
    public Boolean getLevel() {
        return level;
    }

    @Override
    public void setLaneType(String laneType) {
        this.laneType = laneType;
    }

    @Override
    public String getLaneType() {
        return laneType;
    }

    @Override
    public void setSuccessor(List<OpenDRIVELaneProperty> successor) {
        this.successor = successor;
    }

    @Override
    public List<OpenDRIVELaneProperty> getSuccessor() {
        if (successor == null)
            successor = new ArrayList<>();

        return successor;
    }

    @Override
    public void setPredecessor(List<OpenDRIVELaneProperty> predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public List<OpenDRIVELaneProperty> getPredecessor() {
        if (predecessor == null)
            predecessor = new ArrayList<>();

        return predecessor;
    }

    @Override
    public void setLaneShape(OpenDRIVELaneShapeProperty laneShape) {
        this.laneShape = laneShape;
    }

    @Override
    public OpenDRIVELaneShapeProperty getLaneShape() {
        return this.laneShape;
    }
}

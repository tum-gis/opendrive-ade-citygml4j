package org.citygml.ade.opendrive.model.lane;

import org.citygml4j.model.ade.ADEObject;
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

    @Override
    public void setLaneID(Integer laneID) {
        this.laneID = laneID;
    }

    @Override
    public Integer getLaneID() {
        return null;
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
}

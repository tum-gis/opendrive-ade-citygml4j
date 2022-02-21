package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml4j.model.ade.ADEObject;

import java.util.List;

public interface OpenDRIVELane extends ADEObject, OpenDRIVEElement {
    public void setLaneID(Integer laneID);
    public Integer getLaneID();

    public void setLateralLaneSection(LateralLaneSection lateralLaneSection);
    public LateralLaneSection getLateralLaneSection();

    public void setLevel(Boolean level);
    public Boolean getLevel();

    public void setLaneType(String laneType);
    public String getLaneType();

    public void setSuccessor(List<OpenDRIVELaneArrayProperty> successor);
    public List<OpenDRIVELaneArrayProperty> getSuccessor();

    public void setPredecessor(List<OpenDRIVELaneArrayProperty> predecessor);
    public List<OpenDRIVELaneArrayProperty> getPredecessor();

    // TODO: complete
}

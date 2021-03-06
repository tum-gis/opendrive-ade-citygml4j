package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.GMLObject;
import org.xmlobjects.gml.model.feature.AbstractFeature;

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

    public void setSuccessor(List<OpenDRIVELaneProperty> successor);
    public List<OpenDRIVELaneProperty> getSuccessor();

    public void setPredecessor(List<OpenDRIVELaneProperty> predecessor);
    public List<OpenDRIVELaneProperty> getPredecessor();

    public void setLaneShape(OpenDRIVELaneShapeProperty laneShape);
    public OpenDRIVELaneShapeProperty getLaneShape();

    // TODO: complete
}

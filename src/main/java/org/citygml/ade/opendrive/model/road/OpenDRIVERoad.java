package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml.ade.opendrive.model.linearReferencing.ReferenceableTypeList;
import org.xmlobjects.gml.model.measures.Length;

import java.util.List;

public interface OpenDRIVERoad extends OpenDRIVEElement {
    public void setLength(Length length);
    public Length getLength();

    public void setRoadName(String roadName);
    public String getRoadName();

    public void setTrafficRule(E_trafficRule trafficRule);
    public E_trafficRule getTrafficRule();

    public void setLaneSection(ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection);
    public List<OpenDRIVELaneSectionProperty> getLaneSection();

    public void setRoadShape(OpenDRIVERoadShapeProperty roadShape);
    public OpenDRIVERoadShapeProperty getRoadShape();

}

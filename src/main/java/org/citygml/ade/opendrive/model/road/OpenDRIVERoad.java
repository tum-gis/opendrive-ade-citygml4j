package org.citygml.ade.opendrive.model.road;

import org.xmlobjects.gml.model.measures.Length;

import java.util.List;

public interface OpenDRIVERoad {
    public void setOpenDRIVERoadLength(Length length);
    public Length getOpenDRIVERoadLength();

    public void setOpenDRIVERoadName(String roadName);
    public String getOpenDRIVERoadName();

    public void setOpenDRIVERoadTrafficRule(E_trafficRule trafficRule);
    public E_trafficRule getOpenDRIVERoadTrafficRule();

    public void setOpenDRIVELaneSection(List<OpenDRIVELaneSectionProperty> laneSection);
    public List<OpenDRIVELaneSectionProperty> getOpenDRIVELaneSection();

    public void setOpenDRIVERoadShape(OpenDRIVERoadShapeProperty roadShape);
    public OpenDRIVERoadShapeProperty getOpenDRIVERoadShape();

}

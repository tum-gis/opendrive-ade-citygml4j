package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml.ade.opendrive.model.linearReferencing.ReferenceableTypeList;
import org.xmlobjects.gml.model.measures.Length;

import java.util.List;

public interface OpenDRIVERoad extends OpenDRIVEElement {
    public void setOpenDRIVERoadLength(Length length);
    public Length getOpenDRIVERoadLength();

    public void setOpenDRIVERoadName(String roadName);
    public String getOpenDRIVERoadName();

    public void setOpenDRIVERoadTrafficRule(E_trafficRule trafficRule);
    public E_trafficRule getOpenDRIVERoadTrafficRule();

    public void setOpenDRIVELaneSection(ReferenceableTypeList<OpenDRIVELaneSectionProperty> laneSection);
    public List<OpenDRIVELaneSectionProperty> getOpenDRIVELaneSection();

    public void setOpenDRIVERoadShape(OpenDRIVERoadShapeProperty roadShape);
    public OpenDRIVERoadShapeProperty getOpenDRIVERoadShape();

}

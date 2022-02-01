package org.citygml.ade.opendrive.model.road;

import org.xmlobjects.gml.model.measures.Length;

public interface OpenDRIVERoad {
    public void setOpenDRIVERoadLength(Length length);
    public Length getOpenDRIVERoadLength();

    public void setOpenDRIVERoadName(String roadName);
    public String getOpenDRIVERoadName();

    public void setOpenDRIVERoadTrafficRule(e_trafficRule trafficRule);
    public e_trafficRule getOpenDRIVERoadTrafficRule();

}

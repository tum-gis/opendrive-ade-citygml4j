package org.citygml.ade.opendrive.model.lane;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractGML;

public class OpenDRIVELateralLaneBoundary extends AbstractGML implements ADEObject {
    private OpenDRIVELaneWidthProperty laneWidth;

    public OpenDRIVELaneWidthProperty getLaneWidth() {
        return laneWidth;
    }

    public void setLaneWidth(OpenDRIVELaneWidthProperty laneWidth) {
        this.laneWidth = laneWidth;
    }
}

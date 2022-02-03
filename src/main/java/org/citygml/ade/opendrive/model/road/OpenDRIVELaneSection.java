package org.citygml.ade.opendrive.model.road;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.transportation.AbstractTransportationSpace;

public class OpenDRIVELaneSection extends AbstractTransportationSpace implements ADEObject {
    private Boolean singleSided;

    public Boolean getSingleSided() {
        return singleSided;
    }

    public void setSingleSided(Boolean singleSided) {
        this.singleSided = singleSided;
    }
}

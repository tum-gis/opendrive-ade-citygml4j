package org.citygml.ade.opendrive.model.junction;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.transportation.Intersection;

public class OpenDRIVEJunction extends Intersection implements ADEObject {
    private String junctionName;
    private e_junction_type junctionType = e_junction_type.DEFAULT;

    public String getJunctionName() {
        return junctionName;
    }

    public void setJunctionName(String junctionName) {
        this.junctionName = junctionName;
    }

    public e_junction_type getJunctionType() {
        return junctionType;
    }

    public void setJunctionType(e_junction_type junctionType) {
        this.junctionType = junctionType;
    }
}

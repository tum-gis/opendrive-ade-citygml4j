package org.citygml.ade.opendrive.model.junction;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.transportation.Intersection;

public class OpenDRIVEJunction extends Intersection implements ADEObject, OpenDRIVEElement {
    private String junctionName;
    private E_junction_type junctionType = E_junction_type.DEFAULT;
    private OpenDRIVEAdditionalDataProperty additionalData;

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    public String getJunctionName() {
        return junctionName;
    }

    public void setJunctionName(String junctionName) {
        this.junctionName = junctionName;
    }

    public E_junction_type getJunctionType() {
        return junctionType;
    }

    public void setJunctionType(E_junction_type junctionType) {
        this.junctionType = junctionType;
    }
}

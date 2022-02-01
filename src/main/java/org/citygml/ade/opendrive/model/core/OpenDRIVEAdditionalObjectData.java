package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.ADEOfAbstractCityObject;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class OpenDRIVEAdditionalObjectData extends ADEOfAbstractCityObject implements ADEObject {
    private List<OpenDRIVEAdditionalDataProperty> additionalData;

    public List<OpenDRIVEAdditionalDataProperty> getAdditionalData() {
        if (additionalData == null)
            additionalData = new ChildList<>(this);

        return additionalData;
    }

    public void setAdditionalData(List<OpenDRIVEAdditionalDataProperty> additionalData) {
        this.additionalData = additionalData;
    }
}

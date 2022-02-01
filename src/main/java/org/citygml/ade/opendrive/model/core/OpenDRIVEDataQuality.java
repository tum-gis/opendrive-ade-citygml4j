package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.GMLObject;

public class OpenDRIVEDataQuality extends GMLObject implements ADEObject {
    private OpenDRIVEDataErrorProperty error;
    private OpenDRIVERawDataProperty rawData;

    public OpenDRIVEDataErrorProperty getError() {
        return error;
    }

    public void setError(OpenDRIVEDataErrorProperty error) {
        this.error = error;
    }

    public OpenDRIVERawDataProperty getRawData() {
        return rawData;
    }

    public void setRawData(OpenDRIVERawDataProperty rawData) {
        this.rawData = rawData;
    }
}

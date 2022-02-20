package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.AbstractThematicSurface;

public class OpenDRIVERoadShape extends AbstractThematicSurface implements ADEObject, OpenDRIVEElement {
    private OpenDRIVERoadReferenceLineProperty referenceLine;
    private OpenDRIVEAdditionalDataProperty additionalData;

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    public OpenDRIVERoadReferenceLineProperty getReferenceLine() {
        return referenceLine;
    }

    public void setReferenceLine(OpenDRIVERoadReferenceLineProperty referenceLine) {
        this.referenceLine = referenceLine;
    }
}

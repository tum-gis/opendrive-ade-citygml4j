package org.citygml.ade.opendrive.model.road;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.AbstractThematicSurface;

public class OpenDRIVERoadShape extends AbstractThematicSurface implements ADEObject {
    private OpenDRIVERoadReferenceLineProperty referenceLine;

    public OpenDRIVERoadReferenceLineProperty getReferenceLine() {
        return referenceLine;
    }

    public void setReferenceLine(OpenDRIVERoadReferenceLineProperty referenceLine) {
        this.referenceLine = referenceLine;
    }
}

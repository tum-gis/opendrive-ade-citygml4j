package org.citygml.ade.opendrive.model.lane;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.AbstractSpaceBoundary;
import org.citygml4j.model.core.AbstractUnoccupiedSpace;
import org.citygml4j.model.core.ClosureSurface;
import org.citygml4j.model.generics.GenericThematicSurface;
import org.citygml4j.model.transportation.Marking;

public class OpenDRIVELaneShape extends AbstractUnoccupiedSpace implements ADEObject {
    private OpenDRIVELateralLaneBoundaryProperty lateralLaneBoundary;

    @Override
    public boolean isValidBoundary(AbstractSpaceBoundary boundary) {
        return boundary instanceof Marking
                || boundary instanceof ClosureSurface
                || boundary instanceof GenericThematicSurface
                || boundary instanceof ADEObject;
    }

    public OpenDRIVELateralLaneBoundaryProperty getLateralLaneBoundary() {
        return lateralLaneBoundary;
    }

    public void setLateralLaneBoundary(OpenDRIVELateralLaneBoundaryProperty lateralLaneBoundary) {
        this.lateralLaneBoundary = lateralLaneBoundary;
    }
}

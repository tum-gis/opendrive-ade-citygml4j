package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.model.core.ReferenceableType;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.geometry.primitives.CurveProperty;

public class OpenDRIVELaneWidth extends AbstractGML implements ADEObject, ReferenceableType {
    private CurveProperty width;
    private LinearReferencingProperty linearReferencing;

    public CurveProperty getWidth() {
        return width;
    }

    public void setWidth(CurveProperty width) {
        this.width = width;
    }

    @Override
    public void setLinearReferencing(LinearReferencingProperty linearReferencing) {
        this.linearReferencing = linearReferencing;
    }

    @Override
    public LinearReferencingProperty getLinearReferencing() {
        return linearReferencing;
    }
}

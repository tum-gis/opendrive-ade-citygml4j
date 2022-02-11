package org.citygml.ade.opendrive.model.road;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.AbstractFeature;
import org.gml.model.LinearReferencingSystem.LR_ILinearElement;
import org.gml.model.LinearReferencingSystem.LR_ReferentProperty;
import org.xmlobjects.gml.model.base.AbstractGML;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVERoadReferenceLine extends AbstractFeature implements LR_ILinearElement, ADEObject {
    private List<LR_ReferentProperty> referent;

    @Override
    public void setReferent(List<LR_ReferentProperty> referent) {
        this.referent = referent;
    }

    @Override
    public List<LR_ReferentProperty> getReferent() {
        if (this.referent == null)
            this.referent = new ArrayList<>();

        return this.referent;
    }
}

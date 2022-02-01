package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractGML;

public class LR_AlongReferent extends AbstractGML {
    private LR_ReferentProperty fromReferent;

    public LR_ReferentProperty getFromReferent() {
        return fromReferent;
    }

    public void setFromReferent(LR_ReferentProperty fromReferent) {
        this.fromReferent = fromReferent;
    }
}

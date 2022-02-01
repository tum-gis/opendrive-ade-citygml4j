package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.basictypes.Measure;

public class LR_DistanceExpression extends AbstractGML {
    private Measure distanceAlong;
    private LR_AlongReferentProperty referent;

    public Measure getDistanceAlong() {
        return distanceAlong;
    }

    public void setDistanceAlong(Measure distanceAlong) {
        this.distanceAlong = distanceAlong;
    }

    public LR_AlongReferentProperty getReferent() {
        return referent;
    }

    public void setReferent(LR_AlongReferentProperty referent) {
        this.referent = referent;
    }
}

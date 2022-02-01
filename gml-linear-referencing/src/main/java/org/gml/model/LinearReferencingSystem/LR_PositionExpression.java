package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractGML;

public class LR_PositionExpression extends AbstractGML {
    private LR_LinearReferencingMethodProperty lrm;
    private LR_DistanceExpressionProperty distanceExpression;
    private LR_LinearElementProperty linearElement;

    public LR_LinearReferencingMethodProperty getLrm() {
        return lrm;
    }

    public void setLrm(LR_LinearReferencingMethodProperty lrm) {
        this.lrm = lrm;
    }

    public LR_DistanceExpressionProperty getDistanceExpression() {
        return distanceExpression;
    }

    public void setDistanceExpression(LR_DistanceExpressionProperty distanceExpression) {
        this.distanceExpression = distanceExpression;
    }

    public LR_LinearElementProperty getLinearElement() {
        return linearElement;
    }

    public void setLinearElement(LR_LinearElementProperty linearElement) {
        this.linearElement = linearElement;
    }
}

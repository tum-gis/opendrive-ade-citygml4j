package org.citygml.ade.opendrive.model.object;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.ADEOfAbstractCityObject;
import org.gml.model.LinearReferencingSystem.LR_PositionExpression;
import org.gml.model.LinearReferencingSystem.LR_PositionExpressionProperty;

public class LinearReferencing extends ADEOfAbstractCityObject implements ADEObject {
    private LR_PositionExpressionProperty positionExpression;

    public LinearReferencing() {
    }

    public LinearReferencing(LR_PositionExpressionProperty positionExpression) {
        this.positionExpression = positionExpression;
    }

    public LR_PositionExpressionProperty getPositionExpression() {
        return positionExpression;
    }

    public void setPositionExpression(LR_PositionExpressionProperty positionExpression) {
        this.positionExpression = positionExpression;
    }
}

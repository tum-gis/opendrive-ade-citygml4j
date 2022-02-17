package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractProperty;

public class LR_DistanceExpressionProperty extends AbstractProperty<LR_DistanceExpression> {
    public LR_DistanceExpressionProperty() {
    }

    public LR_DistanceExpressionProperty(LR_DistanceExpression object) {
        super(object);
    }

    public LR_DistanceExpressionProperty(String href) {
        super(href);
    }

    @Override
    public Class<LR_DistanceExpression> getTargetType() {
        return LR_DistanceExpression.class;
    }

}

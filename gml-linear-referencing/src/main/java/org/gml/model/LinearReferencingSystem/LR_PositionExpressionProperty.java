package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractProperty;

public class LR_PositionExpressionProperty extends AbstractProperty<LR_PositionExpression> {

    public LR_PositionExpressionProperty() {
    }

    public LR_PositionExpressionProperty(LR_PositionExpression object) {
        super(object);
    }

    public LR_PositionExpressionProperty(String href) {
        super(href);
    }

    @Override
    public Class<LR_PositionExpression> getTargetType() {
        return LR_PositionExpression.class;
    }
}

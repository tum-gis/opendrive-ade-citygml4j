package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.geometry.primitives.Point;

public interface LR_ISpatial {
    public Point point(LR_PositionExpression lrPosition);
    public LR_PositionExpression lrPosition(Point point);
}

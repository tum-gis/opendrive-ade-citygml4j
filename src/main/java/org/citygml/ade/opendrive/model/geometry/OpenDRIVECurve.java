package org.citygml.ade.opendrive.model.geometry;

import org.citygml4j.model.ade.ADEObject;
import org.gml.model.LinearReferencingSystem.*;
import org.xmlobjects.gml.model.basictypes.Measure;
import org.xmlobjects.gml.model.geometry.primitives.Curve;

import java.util.List;

public class OpenDRIVECurve extends Curve implements ADEObject, LR_Curve {
    @Override
    public LR_LinearReferencingMethod defaultLRM() {
        return null;
    }

    @Override
    public Measure measure(String measureAttribute) {
        return null;
    }

    @Override
    public LR_DistanceExpression translateToInstance(LR_PositionExpression sourceLocation, LR_LinearElement targetInstance, LR_LinearReferencingMethod targetLRM) {
        return null;
    }

    @Override
    public List<LR_DistanceExpression> translateToType(LR_PositionExpression sourceLocation, String targetType, LR_LinearReferencingMethod targetLRM) {
        return null;
    }

    @Override
    public Measure startValue(LR_LinearReferencingMethod lrm) {
        return null;
    }
}

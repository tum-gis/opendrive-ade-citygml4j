package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.basictypes.Measure;

import java.util.List;

public interface LR_ILinearElement {

    public LR_LinearReferencingMethod defaultLRM();
    public Measure measure(String measureAttribute);
    public default Measure measure() {
        return this.measure("defaultLength");
    }
    public LR_DistanceExpression translateToInstance(LR_PositionExpression sourceLocation,
                                                     LR_LinearElement targetInstance,
                                                     LR_LinearReferencingMethod targetLRM);
    public List<LR_DistanceExpression> translateToType(LR_PositionExpression sourceLocation, String targetType,
                                                 LR_LinearReferencingMethod targetLRM);
    public Measure startValue(LR_LinearReferencingMethod lrm);
}

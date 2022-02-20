package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.AbstractFeature;
import org.gml.model.LinearReferencingSystem.*;
import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.basictypes.Measure;
import org.xmlobjects.gml.model.geometry.primitives.CurveProperty;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVERoadReferenceLine extends AbstractFeature implements LR_Feature, ADEObject, OpenDRIVEElement {
    private List<LR_ReferentProperty> referent;
    private CurveProperty planView;
    private OpenDRIVEAdditionalDataProperty additionalData;

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    public CurveProperty getPlanView() {
        return planView;
    }

    public void setPlanView(CurveProperty planView) {
        this.planView = planView;
    }

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

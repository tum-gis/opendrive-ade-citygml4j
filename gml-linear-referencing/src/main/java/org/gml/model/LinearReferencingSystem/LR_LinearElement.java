package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.basictypes.Measure;
import org.xmlobjects.gml.model.feature.FeatureProperty;
import org.xmlobjects.gml.model.geometry.primitives.CurveProperty;

import java.util.ArrayList;
import java.util.List;

public class LR_LinearElement extends AbstractGML {
    private FeatureProperty feature;
    private CurveProperty curve;
//    private DirectedEdgeProperty edge;
    private LR_LinearReferencingMethodProperty defaultLRM;
    private Measure measure;
    private List<LR_StartValue> startValue;

    public FeatureProperty getFeature() {
        return feature;
    }

    public void setFeature(FeatureProperty feature) {
        this.feature = feature;
    }

    public CurveProperty getCurve() {
        return curve;
    }

    public void setCurve(CurveProperty curve) {
        this.curve = curve;
    }

    public LR_LinearReferencingMethodProperty getDefaultLRM() {
        return defaultLRM;
    }

    public void setDefaultLRM(LR_LinearReferencingMethodProperty defaultLRM) {
        this.defaultLRM = defaultLRM;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public List<LR_StartValue> getStartValue() {
        if (startValue == null)
            startValue = new ArrayList<>();

        return startValue;
    }

    public void setStartValue(List<LR_StartValue> startValue) {
        this.startValue = startValue;
    }

}

package org.gml.model.LinearReferencingSystem;

import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.assertj.core.api.RecursiveComparisonAssert;
import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.basictypes.Measure;
import org.xmlobjects.gml.model.feature.FeatureProperty;
import org.xmlobjects.gml.model.geometry.primitives.CurveProperty;

import java.util.ArrayList;
import java.util.List;

//import static org.assertj.core.api.Assertions.assertThat;

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

    public LR_LinearReferencingMethodProperty defaultLRM() {
        // If the defaultLRM is not set retrieve it from the feature/curve
        if (defaultLRM == null) {
            if (feature != null && feature.getObject() != null && feature.getObject() instanceof LR_ILinearElement) {
                // TODO: Resolve XLink if present
                return new LR_LinearReferencingMethodProperty(((LR_ILinearElement)feature).defaultLRM());
            }

            if (curve != null && curve.getObject() != null && curve.getObject() instanceof LR_ILinearElement) {
                // TODO: Resolve XLink if present
                return new LR_LinearReferencingMethodProperty(((LR_ILinearElement)curve).defaultLRM());
            }
        }

        return defaultLRM;
    }

    public void setDefaultLRM(LR_LinearReferencingMethodProperty defaultLRM) {
        this.defaultLRM = defaultLRM;
    }

    public Measure measure() {
        return this.measure("defaultLength");
    }

    public Measure measure(String measureAttribute) {
        if (measure == null) {
            if (feature != null && feature.getObject() != null && feature.getObject() instanceof LR_ILinearElement) {
                // TODO: Resolve XLink if present
                return ((LR_ILinearElement)feature).measure(measureAttribute);
            }

            if (curve != null && curve.getObject() != null && curve.getObject() instanceof LR_ILinearElement) {
                // TODO: Resolve XLink if present
                return ((LR_ILinearElement)curve).measure(measureAttribute);
            }
        }

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

    public Measure startValue(LR_LinearReferencingMethod lrm) {
        if (this.getStartValue().isEmpty() == false) {

            for(LR_StartValue startVal : this.getStartValue()) {
                // TODO: Resolve XLink reference if present
                LR_LinearReferencingMethod lrm_tmp = startVal.getLrm().getObject();
//                try {
//                    assertThat(lrm).usingRecursiveComparison().isEqualTo(lrm_tmp);
//
//
//
//                    // If no exception is thrown the objects are equal and the corresponding values can be returned
//                    return new Measure(startVal.getValue(), startVal.getUom());
//                } catch (AssertionError assertionError) {
//                    continue;
//                }

                    boolean equal = new EqualsBuilder().setTestRecursive(true).reflectionAppend(lrm, lrm_tmp).isEquals();

                    if (equal == true)
                        return new Measure(startVal.getValue(), startVal.getUom());
            }
        } else {
            if (feature != null && feature.getObject() != null && feature.getObject() instanceof LR_ILinearElement) {
                // TODO: Resolve XLink if present
                return ((LR_ILinearElement)feature).startValue(lrm);
            }

            if (curve != null && curve.getObject() != null && curve.getObject() instanceof LR_ILinearElement) {
                // TODO: Resolve XLink if present
                return ((LR_ILinearElement)curve).startValue(lrm);
            }
        }

        return null;
    }

}

package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.GMLObject;

public class LR_StartValue extends GMLObject {
    private Double value;
    private String uom;
    private LR_LinearReferencingMethodProperty lrm;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public LR_LinearReferencingMethodProperty getLrm() {
        return lrm;
    }

    public void setLrm(LR_LinearReferencingMethodProperty lrm) {
        this.lrm = lrm;
    }
}

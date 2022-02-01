package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.GMLObject;

public class LR_StartValue extends GMLObject {
    private Double value;
    private String uom;
    private String lrm;

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

    public String getLrm() {
        return lrm;
    }

    public void setLrm(String lrm) {
        this.lrm = lrm;
    }
}

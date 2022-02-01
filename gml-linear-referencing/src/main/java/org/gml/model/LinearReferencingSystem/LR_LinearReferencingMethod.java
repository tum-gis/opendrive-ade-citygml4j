package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractGML;

import java.util.ArrayList;
import java.util.List;

public class LR_LinearReferencingMethod extends AbstractGML {
    private String name;
    private LR_LRMType type;
    private String units;
    private List<String> constraint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LR_LRMType getType() {
        return type;
    }

    public void setType(LR_LRMType type) {
        this.type = type;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public List<String> getConstraint() {
        if (this.constraint == null) {
            constraint = new ArrayList<String>();
        }

        return constraint;
    }

    public void setConstraint(List<String> constraint) {
        this.constraint = constraint;
    }
}

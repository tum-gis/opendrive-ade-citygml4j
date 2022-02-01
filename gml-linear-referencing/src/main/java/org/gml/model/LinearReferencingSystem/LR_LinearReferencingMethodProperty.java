package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractProperty;

public class LR_LinearReferencingMethodProperty extends AbstractProperty<LR_LinearReferencingMethod> {

    public LR_LinearReferencingMethodProperty(){}

    public LR_LinearReferencingMethodProperty(LR_LinearReferencingMethod object){
        super(object);
    }

    public LR_LinearReferencingMethodProperty(String href) {
        super(href);
    }

    @Override
    public Class<LR_LinearReferencingMethod> getTargetType() {
        return LR_LinearReferencingMethod.class;
    }

}

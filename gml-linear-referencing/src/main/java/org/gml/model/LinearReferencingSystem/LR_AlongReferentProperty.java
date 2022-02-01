package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractProperty;

public class LR_AlongReferentProperty extends AbstractProperty<LR_AlongReferent> {

    public LR_AlongReferentProperty() {
    }

    public LR_AlongReferentProperty(LR_AlongReferent object) {
        super(object);
    }

    public LR_AlongReferentProperty(String href) {
        super(href);
    }

    @Override
    public Class<LR_AlongReferent> getTargetType() {
        return LR_AlongReferent.class;
    }
}

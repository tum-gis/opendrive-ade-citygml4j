package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractProperty;

public class LR_ReferentProperty extends AbstractProperty<LR_Referent> {
    public LR_ReferentProperty() {
    }

    public LR_ReferentProperty(LR_Referent object) {
        super(object);
    }

    public LR_ReferentProperty(String href) {
        super(href);
    }

    @Override
    public Class<LR_Referent> getTargetType() {
        return LR_Referent.class;
    }
}

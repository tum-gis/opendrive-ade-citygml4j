package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractProperty;

public class LR_LinearElementProperty extends AbstractProperty<LR_LinearElement> {
    public LR_LinearElementProperty() {
    }

    public LR_LinearElementProperty(LR_LinearElement object) {
        super(object);
    }

    public LR_LinearElementProperty(String href) {
        super(href);
    }

    @Override
    public Class<LR_LinearElement> getTargetType() {
        return LR_LinearElement.class;
    }
}

package org.citygml.ade.opendrive.model.object;

import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class LinearReferencingProperty extends AbstractInlineProperty<LinearReferencing> {
    public LinearReferencingProperty() {
    }

    public LinearReferencingProperty(LinearReferencing object) {
        super(object);
    }

    @Override
    public Class<LinearReferencing> getTargetType() {
        return LinearReferencing.class;
    }
}

package org.citygml.ade.opendrive.model.object;

import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class LinearReferencingProperty extends AbstractInlineProperty<LinearReferencing> {

    @Override
    public Class<LinearReferencing> getTargetType() {
        return LinearReferencing.class;
    }
}

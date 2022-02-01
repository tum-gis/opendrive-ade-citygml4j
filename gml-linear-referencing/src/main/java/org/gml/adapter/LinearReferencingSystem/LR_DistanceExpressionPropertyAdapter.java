package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_DistanceExpressionProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;

import javax.xml.namespace.QName;

public class LR_DistanceExpressionPropertyAdapter extends AbstractPropertyAdapter<LR_DistanceExpressionProperty> {
    @Override
    public LR_DistanceExpressionProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_DistanceExpressionProperty();
    }
}

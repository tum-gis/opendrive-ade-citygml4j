package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_PositionExpressionProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;

import javax.xml.namespace.QName;

public class LR_PositionExpressionPropertyAdapter extends AbstractPropertyAdapter<LR_PositionExpressionProperty> {
    @Override
    public LR_PositionExpressionProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_PositionExpressionProperty();
    }
}

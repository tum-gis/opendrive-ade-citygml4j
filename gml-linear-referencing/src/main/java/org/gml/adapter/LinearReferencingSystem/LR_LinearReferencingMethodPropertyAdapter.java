package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_LinearReferencingMethodProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;

import javax.xml.namespace.QName;

public class LR_LinearReferencingMethodPropertyAdapter extends AbstractPropertyAdapter<LR_LinearReferencingMethodProperty> {
    @Override
    public LR_LinearReferencingMethodProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_LinearReferencingMethodProperty();
    }
}

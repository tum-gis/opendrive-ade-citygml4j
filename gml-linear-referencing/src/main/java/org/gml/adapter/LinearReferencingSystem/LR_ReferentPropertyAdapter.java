package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_ReferentProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;

import javax.xml.namespace.QName;

public class LR_ReferentPropertyAdapter extends AbstractPropertyAdapter<LR_ReferentProperty> {
    @Override
    public LR_ReferentProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_ReferentProperty();
    }
}

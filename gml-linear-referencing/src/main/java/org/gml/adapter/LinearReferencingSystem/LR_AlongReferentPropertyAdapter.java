package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_AlongReferentProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;

import javax.xml.namespace.QName;

public class LR_AlongReferentPropertyAdapter extends AbstractPropertyAdapter<LR_AlongReferentProperty> {
    @Override
    public LR_AlongReferentProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_AlongReferentProperty();
    }
}

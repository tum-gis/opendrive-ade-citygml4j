package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_LinearElementProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

public class LR_LinearElementPropertyAdapter extends AbstractPropertyAdapter<LR_LinearElementProperty> {
    @Override
    public LR_LinearElementProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_LinearElementProperty();
    }
}

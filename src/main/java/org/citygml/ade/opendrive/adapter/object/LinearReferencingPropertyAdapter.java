package org.citygml.ade.opendrive.adapter.object;

import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;


public class LinearReferencingPropertyAdapter extends AbstractInlinePropertyAdapter<LinearReferencingProperty> {
    @Override
    public LinearReferencingProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new LinearReferencingProperty();
    }
}

package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEUserDataProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVEUserDataPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVEUserDataProperty> {
    @Override
    public OpenDRIVEUserDataProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEUserDataProperty();
    }
}

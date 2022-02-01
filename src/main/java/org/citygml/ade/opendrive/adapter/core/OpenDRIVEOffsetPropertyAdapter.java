package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEOffsetProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVEOffsetPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVEOffsetProperty> {

    @Override
    public OpenDRIVEOffsetProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEOffsetProperty();
    }
}

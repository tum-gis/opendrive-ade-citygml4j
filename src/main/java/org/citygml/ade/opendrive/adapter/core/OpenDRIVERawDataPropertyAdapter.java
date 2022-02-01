package org.citygml.ade.opendrive.adapter.core;


import org.citygml.ade.opendrive.model.core.OpenDRIVERawDataProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVERawDataPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVERawDataProperty> {
    @Override
    public OpenDRIVERawDataProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new OpenDRIVERawDataProperty();
    }
}

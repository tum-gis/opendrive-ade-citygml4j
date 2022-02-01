package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEDataErrorProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVEDataErrorPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVEDataErrorProperty> {
    @Override
    public OpenDRIVEDataErrorProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new OpenDRIVEDataErrorProperty();
    }
}

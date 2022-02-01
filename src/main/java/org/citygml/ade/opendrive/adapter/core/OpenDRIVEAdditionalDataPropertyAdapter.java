package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEOffsetProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVEAdditionalDataPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVEAdditionalDataProperty> {
    @Override
    public OpenDRIVEAdditionalDataProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEAdditionalDataProperty();
    }
}

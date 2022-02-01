package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEDataQualityProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVEDataQualityPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVEDataQualityProperty> {
    @Override
    public OpenDRIVEDataQualityProperty createObject(QName qName, Object o) throws ObjectBuildException {
        return new OpenDRIVEDataQualityProperty();
    }
}

package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.model.core.OpenDRIVEUserDataProperty;
import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSectionProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVELaneSectionPropertyAdapter extends AbstractFeaturePropertyAdapter<OpenDRIVELaneSectionProperty> {
    @Override
    public OpenDRIVELaneSectionProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneSectionProperty();
    }
}

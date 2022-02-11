package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.model.road.OpenDRIVERoadReferenceLineProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlineOrByReferencePropertyAdapter;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVERoadReferenceLinePropertyAdapter extends AbstractFeaturePropertyAdapter<OpenDRIVERoadReferenceLineProperty> {
    @Override
    public OpenDRIVERoadReferenceLineProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVERoadReferenceLineProperty();
    }
}

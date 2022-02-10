package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.model.road.OpenDRIVERoadShapeProperty;
import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVERoadShapePropertyAdapter extends AbstractFeaturePropertyAdapter<OpenDRIVERoadShapeProperty> {
    @Override
    public OpenDRIVERoadShapeProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVERoadShapeProperty();
    }
}

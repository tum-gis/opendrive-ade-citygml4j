package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneShapeProperty;
import org.citygml4j.xml.adapter.core.AbstractUnoccupiedSpacePropertyAdapter;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

public class OpenDRIVELaneShapePropertyAdapter extends AbstractFeaturePropertyAdapter<OpenDRIVELaneShapeProperty> {
    @Override
    public OpenDRIVELaneShapeProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneShapeProperty();
    }

}

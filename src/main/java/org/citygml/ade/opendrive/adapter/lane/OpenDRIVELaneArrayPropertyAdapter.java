package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneArrayProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.FeatureArrayPropertyAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVELaneArrayPropertyAdapter extends FeatureArrayPropertyAdapter {
    @Override
    public OpenDRIVELaneArrayProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneArrayProperty();
    }
}

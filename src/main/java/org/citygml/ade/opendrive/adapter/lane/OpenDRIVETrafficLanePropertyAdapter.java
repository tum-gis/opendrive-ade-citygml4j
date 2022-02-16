package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVETrafficLaneProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVETrafficLanePropertyAdapter extends AbstractFeaturePropertyAdapter<OpenDRIVETrafficLaneProperty> {
    @Override
    public OpenDRIVETrafficLaneProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVETrafficLaneProperty();
    }
}

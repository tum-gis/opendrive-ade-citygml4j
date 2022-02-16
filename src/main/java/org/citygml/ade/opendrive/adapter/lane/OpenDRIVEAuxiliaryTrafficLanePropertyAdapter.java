package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVEAuxiliaryTrafficLaneProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVEAuxiliaryTrafficLanePropertyAdapter extends AbstractFeaturePropertyAdapter<OpenDRIVEAuxiliaryTrafficLaneProperty> {
    @Override
    public OpenDRIVEAuxiliaryTrafficLaneProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEAuxiliaryTrafficLaneProperty();
    }
}

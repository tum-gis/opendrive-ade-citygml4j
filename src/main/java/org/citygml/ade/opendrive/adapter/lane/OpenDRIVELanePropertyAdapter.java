package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneProperty;
import org.citygml4j.model.core.AbstractFeature;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;
import org.xmlobjects.gml.model.feature.FeatureProperty;

import javax.xml.namespace.QName;

public class OpenDRIVELanePropertyAdapter extends FeaturePropertyAdapter {
    @Override
    public OpenDRIVELaneProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneProperty();
    }
}

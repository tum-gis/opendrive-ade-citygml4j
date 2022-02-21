package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneProperty;
import org.citygml4j.model.core.AbstractFeatureProperty;
import org.citygml4j.xml.adapter.core.AbstractFeaturePropertyAdapter;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVELanePropertyAdapter extends FeaturePropertyAdapter {
    @Override
    public OpenDRIVELaneProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneProperty();
    }
}

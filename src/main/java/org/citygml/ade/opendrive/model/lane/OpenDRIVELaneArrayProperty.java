package org.citygml.ade.opendrive.model.lane;

import org.citygml4j.model.core.AbstractFeature;
import org.xmlobjects.gml.model.feature.FeatureArrayProperty;
import org.xmlobjects.gml.model.feature.FeatureProperty;

import java.util.List;

public class OpenDRIVELaneArrayProperty<T extends OpenDRIVELane> extends FeatureArrayProperty {
    public OpenDRIVELaneArrayProperty() {
    }

    public OpenDRIVELaneArrayProperty(List<OpenDRIVELane> object) {
        super(object);
    }

//    public OpenDRIVELaneProperty(String href) {
//        super(href);
//    }

    @Override
    public Class<OpenDRIVELane> getTargetType() {
        return OpenDRIVELane.class;
    }
}

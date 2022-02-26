package org.citygml.ade.opendrive.model.lane;

import org.citygml4j.model.core.AbstractFeature;
import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVELaneProperty<T extends OpenDRIVELane> extends FeatureProperty {
    public OpenDRIVELaneProperty() {
    }

    public OpenDRIVELaneProperty(OpenDRIVELane object) {
        super((AbstractFeature) object);
    }

    public OpenDRIVELaneProperty(String href) {
        super(href);
    }

//    public Class<?> getTargetType() {
//        return OpenDRIVELane.class;
//    }
}

package org.citygml.ade.opendrive.model.lane;

import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVETrafficLaneProperty extends OpenDRIVELaneProperty /*extends FeatureProperty<OpenDRIVETrafficLane>*/ {
    public OpenDRIVETrafficLaneProperty() {
    }

    public OpenDRIVETrafficLaneProperty(OpenDRIVETrafficLane object) {
        super(object);
    }

    public OpenDRIVETrafficLaneProperty(String href) {
        super(href);
    }

//    @Override
//    public Class<OpenDRIVETrafficLane> getTargetType() {
//        return OpenDRIVETrafficLane.class;
//    }
}

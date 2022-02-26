package org.citygml.ade.opendrive.model.lane;

import org.xmlobjects.gml.model.feature.FeatureProperty;

import java.util.List;

public class OpenDRIVETrafficLaneProperty extends OpenDRIVELaneProperty<OpenDRIVETrafficLane> {
    public OpenDRIVETrafficLaneProperty() {
    }

    public OpenDRIVETrafficLaneProperty(OpenDRIVETrafficLane object) {
        super(object);
    }

    public OpenDRIVETrafficLaneProperty(String href) {
        super(href);
    }

    @Override
    public Class<OpenDRIVETrafficLane> getTargetType() {
        return OpenDRIVETrafficLane.class;
    }
}

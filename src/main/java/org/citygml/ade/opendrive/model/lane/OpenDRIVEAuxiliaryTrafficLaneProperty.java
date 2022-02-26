package org.citygml.ade.opendrive.model.lane;


import org.xmlobjects.gml.model.feature.FeatureProperty;

import java.util.List;

public class OpenDRIVEAuxiliaryTrafficLaneProperty extends OpenDRIVELaneProperty<OpenDRIVEAuxiliaryTrafficLane> {
    public OpenDRIVEAuxiliaryTrafficLaneProperty() {
    }

    public OpenDRIVEAuxiliaryTrafficLaneProperty(OpenDRIVEAuxiliaryTrafficLane object) {
        super(object);
    }

    public OpenDRIVEAuxiliaryTrafficLaneProperty(String href) {
        super(href);
    }

    @Override
    public Class<OpenDRIVEAuxiliaryTrafficLane> getTargetType() {
        return OpenDRIVEAuxiliaryTrafficLane.class;
    }
}

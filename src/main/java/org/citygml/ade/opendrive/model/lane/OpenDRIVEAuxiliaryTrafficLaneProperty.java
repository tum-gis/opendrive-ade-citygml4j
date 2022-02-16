package org.citygml.ade.opendrive.model.lane;

import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.model.feature.FeatureProperty;


import javax.xml.namespace.QName;

public class OpenDRIVEAuxiliaryTrafficLaneProperty extends OpenDRIVELaneProperty/*extends FeatureProperty<OpenDRIVEAuxiliaryTrafficLane>*/ {
    public OpenDRIVEAuxiliaryTrafficLaneProperty() {
    }

    public OpenDRIVEAuxiliaryTrafficLaneProperty(OpenDRIVEAuxiliaryTrafficLane object) {
        super(object);
    }

    public OpenDRIVEAuxiliaryTrafficLaneProperty(String href) {
        super(href);
    }

//    @Override
//    public Class<OpenDRIVEAuxiliaryTrafficLane> getTargetType() {
//        return OpenDRIVEAuxiliaryTrafficLane.class;
//    }
}

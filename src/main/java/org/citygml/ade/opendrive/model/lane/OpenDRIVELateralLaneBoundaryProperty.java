package org.citygml.ade.opendrive.model.lane;

import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVELateralLaneBoundaryProperty extends AbstractInlineProperty<OpenDRIVELateralLaneBoundary> {
    public OpenDRIVELateralLaneBoundaryProperty() {
    }

    public OpenDRIVELateralLaneBoundaryProperty(OpenDRIVELateralLaneBoundary object) {
        super(object);
    }

    @Override
    public Class<OpenDRIVELateralLaneBoundary> getTargetType() {
        return OpenDRIVELateralLaneBoundary.class;
    }
}

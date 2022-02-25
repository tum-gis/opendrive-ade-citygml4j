package org.citygml.ade.opendrive.model.lane;

import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVELaneWidthProperty extends AbstractInlineProperty<OpenDRIVELaneWidth> {
    public OpenDRIVELaneWidthProperty() {
    }

    public OpenDRIVELaneWidthProperty(OpenDRIVELaneWidth object) {
        super(object);
    }

    @Override
    public Class<OpenDRIVELaneWidth> getTargetType() {
        return OpenDRIVELaneWidth.class;
    }
}

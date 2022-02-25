package org.citygml.ade.opendrive.model.lane;

import org.citygml4j.model.core.AbstractFeatureProperty;
import org.citygml4j.model.core.AbstractUnoccupiedSpaceProperty;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;
import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVELaneShapeProperty extends FeatureProperty<OpenDRIVELaneShape> {
    public OpenDRIVELaneShapeProperty() {
    }

    public OpenDRIVELaneShapeProperty(OpenDRIVELaneShape object) {
        super(object);
    }

    public OpenDRIVELaneShapeProperty(String href) {
        super(href);
    }

    @Override
    public Class<OpenDRIVELaneShape> getTargetType() {
        return OpenDRIVELaneShape.class;
    }
}

package org.citygml.ade.opendrive.model.road;

import org.xmlobjects.gml.model.common.GenericElement;
import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVERoadShapeProperty extends FeatureProperty<OpenDRIVERoadShape> {
    public OpenDRIVERoadShapeProperty() {
    }

    public OpenDRIVERoadShapeProperty(OpenDRIVERoadShape object) {
        super(object);
    }

    public OpenDRIVERoadShapeProperty(String href) {
        super(href);
    }

    public OpenDRIVERoadShapeProperty(GenericElement element) {
        super(element);
    }

    @Override
    public Class<OpenDRIVERoadShape> getTargetType() {
        return OpenDRIVERoadShape.class;
    }
}

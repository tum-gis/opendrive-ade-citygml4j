package org.citygml.ade.opendrive.model.road;

import org.citygml4j.model.core.AbstractFeatureProperty;
import org.xmlobjects.gml.model.base.AbstractInlineOrByReferenceProperty;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;
import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVERoadReferenceLineProperty extends FeatureProperty<OpenDRIVERoadReferenceLine> {

    public OpenDRIVERoadReferenceLineProperty() {
    }

    public OpenDRIVERoadReferenceLineProperty(OpenDRIVERoadReferenceLine object) {
        super(object);
    }

    public OpenDRIVERoadReferenceLineProperty(String href) {
        super(href);
    }

    @Override
    public Class<OpenDRIVERoadReferenceLine> getTargetType() {
        return OpenDRIVERoadReferenceLine.class;
    }
}

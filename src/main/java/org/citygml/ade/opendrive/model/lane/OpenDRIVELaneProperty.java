package org.citygml.ade.opendrive.model.lane;

import org.citygml.ade.opendrive.adapter.lane.OpenDRIVELanePropertyAdapter;
import org.citygml4j.model.core.AbstractFeature;
import org.citygml4j.model.core.AbstractFeatureProperty;
import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVELaneProperty extends AbstractFeatureProperty {
    public OpenDRIVELaneProperty() {
    }

    public OpenDRIVELaneProperty(AbstractFeature object) {
        super(object);
    }

    public OpenDRIVELaneProperty(String href) {
        super(href);
    }

    @Override
    public Class<AbstractFeature> getTargetType() {
        return super.getTargetType();
    }
}

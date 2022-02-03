package org.citygml.ade.opendrive.model.road;

import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVELaneSectionProperty extends FeatureProperty<OpenDRIVELaneSection> {
    public OpenDRIVELaneSectionProperty() {
    }

    public OpenDRIVELaneSectionProperty(OpenDRIVELaneSection object) {
        super(object);
    }

    public OpenDRIVELaneSectionProperty(String href) {
        super(href);
    }

    @Override
    public Class<OpenDRIVELaneSection> getTargetType() {
        return OpenDRIVELaneSection.class;
    }
}

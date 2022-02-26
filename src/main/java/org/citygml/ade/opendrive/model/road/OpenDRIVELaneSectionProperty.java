package org.citygml.ade.opendrive.model.road;

import org.citygml.ade.opendrive.model.linearReferencing.ReferenceableTypeProperty;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.xmlobjects.gml.model.feature.FeatureProperty;

public class OpenDRIVELaneSectionProperty extends FeatureProperty<OpenDRIVELaneSection> implements ReferenceableTypeProperty {
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

    @Override
    public void setLinearReferencing(LinearReferencingProperty linearReferencing) {
        // TODO: Handle xLink
        super.getObject().setLinearReferencing(linearReferencing);
    }

    @Override
    public LinearReferencingProperty getLinearReferencing() {
        // TODO: Handle xLink
        return super.getObject().getLinearReferencing();
    }
}

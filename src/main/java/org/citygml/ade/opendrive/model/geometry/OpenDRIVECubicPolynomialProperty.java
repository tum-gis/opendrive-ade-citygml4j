package org.citygml.ade.opendrive.model.geometry;

import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVECubicPolynomialProperty extends AbstractInlineProperty<OpenDRIVECubicPolynomial> {

    public OpenDRIVECubicPolynomialProperty() {
    }

    public OpenDRIVECubicPolynomialProperty(OpenDRIVECubicPolynomial object) {
        super(object);
    }

    @Override
    public Class<OpenDRIVECubicPolynomial> getTargetType() {
        return OpenDRIVECubicPolynomial.class;
    }
}

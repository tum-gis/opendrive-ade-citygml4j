package org.citygml.ade.opendrive.model.core;

import org.citygml.ade.opendrive.model.object.LinearReferencing;

public interface ReferenceableType {
    public void setLinearReferencing(LinearReferencing linearReferencing);
    public LinearReferencing getLinearReferencing();
}

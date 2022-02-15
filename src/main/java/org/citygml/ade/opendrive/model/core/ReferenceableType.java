package org.citygml.ade.opendrive.model.core;

import org.citygml.ade.opendrive.model.object.LinearReferencing;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;

public interface ReferenceableType {
    public void setLinearReferencing(LinearReferencingProperty linearReferencing);
    public LinearReferencingProperty getLinearReferencing();
}

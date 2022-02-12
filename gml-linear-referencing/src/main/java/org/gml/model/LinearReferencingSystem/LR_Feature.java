package org.gml.model.LinearReferencingSystem;

import java.util.List;

public interface LR_Feature extends LR_ILinearElement {
    public void setReferent(List<LR_ReferentProperty> referent);
    public List<LR_ReferentProperty> getReferent();
}

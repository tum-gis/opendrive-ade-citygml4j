package org.gml.model.LinearReferencingSystem;

import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.basictypes.Code;
import org.xmlobjects.gml.model.feature.FeatureProperty;
import org.xmlobjects.gml.model.geometry.primitives.PointProperty;

public class LR_Referent extends AbstractGML {
    private Code name;
    private String referentType;
    private PointProperty position;
    private LR_PositionExpressionProperty location;
    private FeatureProperty ownedBy;

    public Code getName() {
        return name;
    }

    public void setName(Code name) {
        this.name = name;
    }

    public String getReferentType() {
        return referentType;
    }

    public void setReferentType(String referentType) {
        this.referentType = referentType;
    }

    public PointProperty getPosition() {
        return position;
    }

    public void setPosition(PointProperty position) {
        this.position = position;
    }

    public LR_PositionExpressionProperty getLocation() {
        return location;
    }

    public void setLocation(LR_PositionExpressionProperty location) {
        this.location = location;
    }

    public FeatureProperty getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(FeatureProperty ownedBy) {
        this.ownedBy = ownedBy;
    }
}

package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.ExternalReferenceProperty;
import org.xmlobjects.gml.model.GMLObject;
import org.xmlobjects.gml.model.basictypes.Code;
import org.xmlobjects.model.ChildList;

import java.util.List;

public class OpenDRIVEAdditionalData extends GMLObject implements ADEObject {
    private List<OpenDRIVEUserDataProperty> userData;
    private List<ExternalReferenceProperty> include;
    private OpenDRIVEDataQualityProperty dataQuality;

    public List<OpenDRIVEUserDataProperty> getUserData() {
        if (userData == null)
            userData = new ChildList<>(this);

        return userData;
    }

    public void setUserData(List<OpenDRIVEUserDataProperty> userData) {
        this.userData = userData;
    }

    public List<ExternalReferenceProperty> getInclude() {
        if (include == null)
            include = new ChildList<>(this);

        return include;
    }

    public void setInclude(List<ExternalReferenceProperty> include) {
        this.include = include;
    }

    public OpenDRIVEDataQualityProperty getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(OpenDRIVEDataQualityProperty dataQuality) {
        this.dataQuality = dataQuality;
    }
}

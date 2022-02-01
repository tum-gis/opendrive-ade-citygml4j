package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVEDataQualityProperty extends AbstractInlineProperty<OpenDRIVEDataQuality> implements ADEObject {

    public OpenDRIVEDataQualityProperty(){}

    public OpenDRIVEDataQualityProperty(OpenDRIVEDataQuality object){
        super(object);
    }

    @Override
    public Class<OpenDRIVEDataQuality> getTargetType() {
        return OpenDRIVEDataQuality.class;
    }
}

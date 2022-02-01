package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVEDataErrorProperty extends AbstractInlineProperty<OpenDRIVEDataError> implements ADEObject {

    public OpenDRIVEDataErrorProperty(){}

    public OpenDRIVEDataErrorProperty(OpenDRIVEDataError object){
        super(object);
    }

    @Override
    public Class<OpenDRIVEDataError> getTargetType() {
        return OpenDRIVEDataError.class;
    }
}

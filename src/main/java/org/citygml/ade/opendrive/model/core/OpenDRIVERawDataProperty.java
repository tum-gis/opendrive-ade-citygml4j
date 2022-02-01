package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVERawDataProperty extends AbstractInlineProperty<OpenDRIVERawData> implements ADEObject {
    public OpenDRIVERawDataProperty(){}

    public OpenDRIVERawDataProperty(OpenDRIVERawData object){
        super(object);
    }

    @Override
    public Class<OpenDRIVERawData> getTargetType() {
        return OpenDRIVERawData.class;
    }
}

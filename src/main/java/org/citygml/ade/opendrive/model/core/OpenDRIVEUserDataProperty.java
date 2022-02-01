package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVEUserDataProperty extends AbstractInlineProperty<OpenDRIVEUserData> implements ADEObject {
    public OpenDRIVEUserDataProperty(){}

    public OpenDRIVEUserDataProperty(OpenDRIVEUserData object){
        super(object);
    }

    @Override
    public Class<OpenDRIVEUserData> getTargetType() {
        return OpenDRIVEUserData.class;
    }
}

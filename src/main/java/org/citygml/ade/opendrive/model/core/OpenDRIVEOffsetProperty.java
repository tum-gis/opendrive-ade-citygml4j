package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVEOffsetProperty extends AbstractInlineProperty<OpenDRIVEOffset> implements ADEObject {

    public OpenDRIVEOffsetProperty(){}

    public OpenDRIVEOffsetProperty(OpenDRIVEOffset object){
        super(object);
    }

    @Override
    public Class<OpenDRIVEOffset> getTargetType() {
        return OpenDRIVEOffset.class;
    }
}

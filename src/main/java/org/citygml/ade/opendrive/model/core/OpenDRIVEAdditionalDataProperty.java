package org.citygml.ade.opendrive.model.core;

import org.xmlobjects.gml.model.base.AbstractInlineProperty;

public class OpenDRIVEAdditionalDataProperty extends AbstractInlineProperty<OpenDRIVEAdditionalData> {

    public OpenDRIVEAdditionalDataProperty(){}

    public OpenDRIVEAdditionalDataProperty(OpenDRIVEAdditionalData object){
        super(object);
    }

    @Override
    public Class<OpenDRIVEAdditionalData> getTargetType() {
        return OpenDRIVEAdditionalData.class;
    }
}

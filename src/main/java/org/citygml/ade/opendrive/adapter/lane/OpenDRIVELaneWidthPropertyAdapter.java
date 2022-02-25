package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneWidthProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVELaneWidthPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVELaneWidthProperty> {
    @Override
    public OpenDRIVELaneWidthProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneWidthProperty();
    }
}

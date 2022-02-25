package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELateralLaneBoundaryProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

public class OpenDRIVELateralLaneBoundaryPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVELateralLaneBoundaryProperty> {
    @Override
    public OpenDRIVELateralLaneBoundaryProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELateralLaneBoundaryProperty();
    }
}

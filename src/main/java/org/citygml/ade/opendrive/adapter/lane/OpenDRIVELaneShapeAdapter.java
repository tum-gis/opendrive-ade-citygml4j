package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneShape;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.core.AbstractUnoccupiedSpaceAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVELaneShape", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVELaneShapeAdapter extends AbstractUnoccupiedSpaceAdapter<OpenDRIVELaneShape> {
    @Override
    public OpenDRIVELaneShape createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneShape();
    }

    @Override
    public Element createElement(OpenDRIVELaneShape object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVELaneShape");
    }

    @Override
    public void buildChildObject(OpenDRIVELaneShape object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
            switch(name.getLocalPart()) {
                case "lateralLaneBoundary":
                    object.setLateralLaneBoundary(reader.getObjectUsingBuilder(OpenDRIVELateralLaneBoundaryPropertyAdapter.class));
                    break;
            }
        } else
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVELaneShape object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getLateralLaneBoundary() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lateralLaneBoundary"),
                    object.getLateralLaneBoundary(), OpenDRIVELateralLaneBoundaryPropertyAdapter.class, namespaces);
    }
}

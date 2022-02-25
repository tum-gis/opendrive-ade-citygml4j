package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELateralLaneBoundary;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVELateralLaneBoundary", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVELateralLaneBoundaryAdapter extends AbstractGMLAdapter<OpenDRIVELateralLaneBoundary> {
    @Override
    public OpenDRIVELateralLaneBoundary createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELateralLaneBoundary();
    }

    @Override
    public Element createElement(OpenDRIVELateralLaneBoundary object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVELateralLaneBoundary");
    }

    @Override
    public void buildChildObject(OpenDRIVELateralLaneBoundary object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
            switch (name.getLocalPart()) {
                case "laneWidth":
                    object.setLaneWidth(reader.getObjectUsingBuilder(OpenDRIVELaneWidthPropertyAdapter.class));
                    break;
            }
        } else
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVELateralLaneBoundary object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getLaneWidth() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "laneWidth"),
                    object.getLaneWidth(), OpenDRIVELaneWidthPropertyAdapter.class, namespaces);
    }
}

package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSection;
import org.citygml.ade.opendrive.model.road.e_trafficRule;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.transportation.AbstractTransportationSpaceAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.measures.LengthAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVELaneSection", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVELaneSectionAdapter extends AbstractTransportationSpaceAdapter<OpenDRIVELaneSection> {
    @Override
    public OpenDRIVELaneSection createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneSection();
    }

    @Override
    public void buildChildObject(OpenDRIVELaneSection object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "singleSided":
                    reader.getTextContent().ifBoolean(object::setSingleSided);
                    break;
            }
        } else // If the namespace is not from the ADE then the element is from the citygml standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(OpenDRIVELaneSection object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVELaneSection");
    }

    @Override
    public void writeChildElements(OpenDRIVELaneSection object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getSingleSided() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "singleSided").addTextContent(object.getSingleSided().toString()));
    }
}

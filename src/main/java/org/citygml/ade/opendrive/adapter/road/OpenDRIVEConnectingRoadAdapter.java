package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.model.road.OpenDRIVEConnectingRoad;
import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSectionProperty;
import org.citygml.ade.opendrive.model.road.E_trafficRule;
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

@XMLElement(name = "OpenDRIVEConnectingRoad", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEConnectingRoadAdapter extends AbstractTransportationSpaceAdapter<OpenDRIVEConnectingRoad> {
    @Override
    public OpenDRIVEConnectingRoad createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEConnectingRoad();
    }

    @Override
    public void buildChildObject(OpenDRIVEConnectingRoad object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "length":
                    object.setOpenDRIVERoadLength(reader.getObjectUsingBuilder(LengthAdapter.class));
                    break;
                case "roadName":
                    reader.getTextContent().ifPresent(object::setOpenDRIVERoadName);
                    break;
                case "rule":
                    reader.getTextContent().ifPresent(v -> object.setOpenDRIVERoadTrafficRule(E_trafficRule.fromValue(v)));
                    break;
                case "laneSection":
                    object.getOpenDRIVELaneSection().add(reader.getObjectUsingBuilder(OpenDRIVELaneSectionPropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the ADE then the element is from the citygml standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(OpenDRIVEConnectingRoad object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEConnectingRoad");
    }

    @Override
    public void writeChildElements(OpenDRIVEConnectingRoad object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getOpenDRIVERoadLength() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "length"), object.getOpenDRIVERoadLength(), LengthAdapter.class, namespaces);

        if (object.getOpenDRIVERoadName() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "roadName").addTextContent(object.getOpenDRIVERoadName()));

        if (object.getOpenDRIVERoadTrafficRule() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "rule").addTextContent(object.getOpenDRIVERoadTrafficRule().toValue()));

        for (OpenDRIVELaneSectionProperty laneSectionProperty : object.getOpenDRIVELaneSection())
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "laneSection"), laneSectionProperty, OpenDRIVELaneSectionPropertyAdapter.class, namespaces);

    }
}

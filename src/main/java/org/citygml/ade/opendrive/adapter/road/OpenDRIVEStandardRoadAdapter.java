package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSectionProperty;
import org.citygml.ade.opendrive.model.road.OpenDRIVEStandardRoad;
import org.citygml.ade.opendrive.model.road.E_trafficRule;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.transportation.SectionAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.measures.LengthAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.util.composite.CompositeObjectAdapter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVEStandardRoad", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEStandardRoadAdapter extends CompositeObjectAdapter<OpenDRIVEStandardRoad> {

    public OpenDRIVEStandardRoadAdapter() {
        super(SectionAdapter.class);
    }

    @Override
    public OpenDRIVEStandardRoad createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEStandardRoad();
    }

    @Override
    public void buildChildObject(OpenDRIVEStandardRoad object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "length":
                    object.setLength(reader.getObjectUsingBuilder(LengthAdapter.class));
                    break;
                case "roadName":
                    reader.getTextContent().ifPresent(object::setRoadName);
                    break;
                case "rule":
                    reader.getTextContent().ifPresent(v -> object.setTrafficRule(E_trafficRule.fromValue(v)));
                    break;
                case "laneSection":
                    object.getLaneSection().add(reader.getObjectUsingBuilder(OpenDRIVELaneSectionPropertyAdapter.class));
                    break;
                case "roadShape":
                    object.setRoadShape(reader.getObjectUsingBuilder(OpenDRIVERoadShapePropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the ADE then the element is from the citygml standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(OpenDRIVEStandardRoad object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEStandardRoad");
    }

    @Override
    public void writeChildElements(OpenDRIVEStandardRoad object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getLength() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "length"), object.getLength(), LengthAdapter.class, namespaces);

        if (object.getRoadName() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "roadName").addTextContent(object.getRoadName()));

        if (object.getTrafficRule() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "rule").addTextContent(object.getTrafficRule().toValue()));

        for (OpenDRIVELaneSectionProperty laneSectionProperty : object.getLaneSection())
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "laneSection"), laneSectionProperty, OpenDRIVELaneSectionPropertyAdapter.class, namespaces);

        if (object.getRoadShape() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "roadShape"), object.getRoadShape(), OpenDRIVERoadShapePropertyAdapter.class, namespaces);

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);

    }
}

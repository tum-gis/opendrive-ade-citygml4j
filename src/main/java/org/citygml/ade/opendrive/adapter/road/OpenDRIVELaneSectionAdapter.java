package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.adapter.lane.OpenDRIVELaneArrayPropertyAdapter;
import org.citygml.ade.opendrive.adapter.lane.OpenDRIVELanePropertyAdapter;
import org.citygml.ade.opendrive.adapter.object.LinearReferencingPropertyAdapter;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneArrayProperty;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneProperty;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSection;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.transportation.AbstractTransportationSpaceAdapter;
import org.gml.module.GML_LR_Module;
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
                case "lane":
//                    reader.getObjectUsingBuilder(AbstractFeaturePropertyAdapter.class);
//                    reader.getObjectUsingBuilder(OpenDRIVELanePropertyAdapter.class);
                    // Inside of the getObjectUsingBuilder()-method the reader searches automatically for the builder/serializer
                    // according to local-name, namespace-uri and type => As long as the adapter class is a superclass
                    // of the wanted classes the builder uses the right adapter classes that matches the
                    // local-name, namespace-uri and type (w.r.t. inheritance relations)
                    object.getLane().add((OpenDRIVELaneProperty) reader.getObjectUsingBuilder(OpenDRIVELanePropertyAdapter.class),
                            (OpenDRIVELaneProperty a, OpenDRIVELaneProperty b) -> {
                                return ((OpenDRIVELane) a.getObject()).getLaneID() < ((OpenDRIVELane) b.getObject()).getLaneID() ? -1 : 0;
                            });

                    // For array property
//                    object.getLanes().add((OpenDRIVELaneArrayProperty) reader.getObjectUsingBuilder(OpenDRIVELaneArrayPropertyAdapter.class));
//                    object.setLanes((OpenDRIVELaneArrayProperty) reader.getObjectUsingBuilder(OpenDRIVELaneArrayPropertyAdapter.class));
                    break;
                case "linearReferencing":
                    object.setLinearReferencing(reader.getObjectUsingBuilder(LinearReferencingPropertyAdapter.class));
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

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);

//        for (OpenDRIVELaneArrayProperty laneProperty : object.getLane()) {
//            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lane"),
//                    laneProperty, OpenDRIVELanePropertyAdapter.class, namespaces);
////            if (laneProperty instanceof OpenDRIVETrafficLaneProperty) {
////                writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lane"),
////                        (OpenDRIVETrafficLaneProperty) laneProperty, OpenDRIVETrafficLanePropertyAdapter.class, namespaces);
////            } else {
////                if (laneProperty instanceof OpenDRIVEAuxiliaryTrafficLaneProperty) {
////                    writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lane"),
////                            (OpenDRIVEAuxiliaryTrafficLaneProperty) laneProperty, OpenDRIVEAuxiliaryTrafficLanePropertyAdapter.class, namespaces);
////                }
////            }
//        }

//        if (object.getLanes() != null)
//            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lanes"),
//                    object.getLanes(), OpenDRIVELaneArrayPropertyAdapter.class, namespaces);

        if (object.getLane() != null)
            for (OpenDRIVELaneProperty l : object.getLane())
                writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lane"),
                        l, OpenDRIVELanePropertyAdapter.class, namespaces);

        if (object.getLinearReferencing() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "linearReferencing"),
                    object.getLinearReferencing(), LinearReferencingPropertyAdapter.class, namespaces);

    }
}

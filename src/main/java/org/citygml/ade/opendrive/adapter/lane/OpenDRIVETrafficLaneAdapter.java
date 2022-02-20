package org.citygml.ade.opendrive.adapter.lane;
import org.citygml.ade.opendrive.model.lane.LateralLaneSection;
import org.citygml.ade.opendrive.model.lane.OpenDRIVETrafficLane;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.transportation.TrafficSpaceAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
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

@XMLElement(name = "OpenDRIVETrafficLane", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVETrafficLaneAdapter extends OpenDRIVELaneAdapter<OpenDRIVETrafficLane>/*CompositeObjectAdapter<OpenDRIVETrafficLane>*/ {

    public OpenDRIVETrafficLaneAdapter() {
        super(TrafficSpaceAdapter.class);
    }

    @Override
    public OpenDRIVETrafficLane createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVETrafficLane();
    }

    @Override
    public Element createElement(OpenDRIVETrafficLane object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVETrafficLane");
    }

//    @Override
//    public void buildChildObject(OpenDRIVETrafficLane object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
//        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
//            switch(name.getLocalPart()) {
//                case "laneID":
//                    reader.getTextContent().ifInteger(object::setLaneID);
//                    break;
//                case "level":
//                    reader.getTextContent().ifBoolean(object::setLevel);
//                    break;
//                case "type":
//                    reader.getTextContent().ifPresent(object::setLaneType);
//                    break;
//                case "lateralLaneSection":
//                    reader.getTextContent().ifPresent((v) -> object.setLateralLaneSection(LateralLaneSection.fromValue(v)));
//                    break;
//            }
//        } else
//            super.buildChildObject(object, name, attributes, reader);
//    }
//
    @Override
    public void writeChildElements(OpenDRIVETrafficLane object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);
    }


}

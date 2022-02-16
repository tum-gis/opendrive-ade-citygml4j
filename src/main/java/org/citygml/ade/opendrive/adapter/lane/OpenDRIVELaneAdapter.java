package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.LateralLaneSection;
import org.citygml.ade.opendrive.model.lane.OpenDRIVEAuxiliaryTrafficLane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELane;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.serializer.ObjectSerializer;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.util.composite.CompositeObjectAdapter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

public abstract class OpenDRIVELaneAdapter<T extends OpenDRIVELane> extends CompositeObjectAdapter<T> {

    public <S extends ObjectBuilder<? super T> & ObjectSerializer<? super T>> OpenDRIVELaneAdapter(Class<S> adapter) {
        super(adapter);
    }

    @Override
    public void buildChildObject(T object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
            switch(name.getLocalPart()) {
                case "laneID":
                    reader.getTextContent().ifInteger(object::setLaneID);
                    break;
                case "level":
                    reader.getTextContent().ifBoolean(object::setLevel);
                    break;
                case "type":
                    reader.getTextContent().ifPresent(object::setLaneType);
                    break;
                case "lateralLaneSection":
                    reader.getTextContent().ifPresent((v) -> object.setLateralLaneSection(LateralLaneSection.fromValue(v)));
                    break;
            }
        } else
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(T object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);
        // TODO:
    }
}

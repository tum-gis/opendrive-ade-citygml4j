package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.model.lane.LateralLaneSection;
import org.citygml.ade.opendrive.model.lane.OpenDRIVEAuxiliaryTrafficLane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELane;
import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneShapeProperty;
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
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;
import org.xmlobjects.xml.TextContent;

import javax.xml.namespace.QName;
import java.util.List;

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
                case "laneShape":
                    object.setLaneShape(reader.getObjectUsingBuilder(OpenDRIVELaneShapePropertyAdapter.class));
                    break;
            }
        } else
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(T object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);

        if (object.getLevel() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "level").addTextContent(TextContent.ofBoolean(object.getLevel())));

        if (object.getLaneID() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "laneID").addTextContent(
                    TextContent.ofInteger(object.getLaneID())
            ));

        if (object.getLateralLaneSection() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "lateralLaneSection").addTextContent(
                    object.getLateralLaneSection().toString()
            ));

        if (object.getLaneType() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "type").addTextContent(object.getLaneType()));

        if (object.getLaneShape() != null) {
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "laneShape"),
                    object.getLaneShape(), OpenDRIVELaneShapePropertyAdapter.class, namespaces);
        }

    }
}

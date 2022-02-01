package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEHeader;
import org.citygml.ade.opendrive.model.core.OpenDRIVEOffset;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.util.CityGMLConstants;
import org.citygml4j.xml.adapter.ade.SingletonADEProperty;
import org.w3c.dom.Text;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.annotation.XMLElements;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.serializer.ObjectSerializer;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;
import org.xmlobjects.xml.TextContent;

import javax.xml.namespace.QName;

//@XMLElements({
//        @XMLElement(name = "date", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "east", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "west", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "north", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "south", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "revMinor", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "revMajor", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "name", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "vendor", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE),
//        @XMLElement(name = "version", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
//})

// The @XMLElement states for which elements there should be builders and serializers
@XMLElement(name = "OpenDRIVEHeader", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEHeaderAdapter implements ObjectBuilder<OpenDRIVEHeader>, ObjectSerializer<OpenDRIVEHeader> {

    @Override
    @SingletonADEProperty
    public OpenDRIVEHeader createObject(QName qName, Object o) throws ObjectBuildException {
        return new OpenDRIVEHeader();
    }

    @Override
    public void buildChildObject(OpenDRIVEHeader object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "date":
//                    if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI()))
//                        reader.getTextContent().ifDateTime(object::setDate);
//                    else
//                        reader.getTextContent().ifDate(object::setDate);

//                    TextContent textContent = reader.getTextContent();
                    reader.getTextContent().ifPresent(object::setDate);

                    if (object.getDate() == null){
                        // TODO: Handle date string that is not conform to the ISO ISO-8601 calendar system
                    }
                    return;
                case "east":
                    reader.getTextContent().ifDouble(object::setEast);
                    break;
                case "west":
                    reader.getTextContent().ifDouble(object::setWest);
                    break;
                case "north":
                    reader.getTextContent().ifDouble(object::setNorth);
                    break;
                case "south":
                    reader.getTextContent().ifDouble(object::setSouth);
                    break;
                case "revMinor":
                    reader.getTextContent().ifInteger(object::setRevMinor);
                    break;
                case "revMajor":
                    reader.getTextContent().ifInteger(object::setRevMajor);
                    break;
                case "name":
                    reader.getTextContent().ifPresent(object::setName);
                    break;
                case "vendor":
                    reader.getTextContent().ifPresent(object::setVendor);
                    break;
                case "version":
                    reader.getTextContent().ifPresent(object::setVersion);
                    break;
                case "offset":
                    object.setOffset(reader.getObjectUsingBuilder(OpenDRIVEOffsetPropertyAdapter.class));
                    break;
                case "georeference":
                    reader.getTextContent().ifPresent(object::setGeoreference);
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEHeader object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEHeader");
    }

    @Override
    public void writeChildElements(OpenDRIVEHeader object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        if (object.getDate() != null) {
//            TextContent date = TextContent.ofDate(object.getDate());
            String date = object.getDate();
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "date").addTextContent(date));
        }

        if (object.getEast() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "east").addTextContent(TextContent.ofDouble(object.getEast())));

        if (object.getWest() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "west").addTextContent(TextContent.ofDouble(object.getWest())));

        if (object.getNorth() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "north").addTextContent(TextContent.ofDouble(object.getNorth())));

        if (object.getSouth() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "south").addTextContent(TextContent.ofDouble(object.getSouth())));

        if (object.getRevMinor() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "revMinor").addTextContent(TextContent.ofInteger(object.getRevMinor())));

        if (object.getRevMajor() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "revMajor").addTextContent(TextContent.ofInteger(object.getRevMajor())));

        if (object.getName() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "name").addTextContent(object.getName()));

        if (object.getVendor() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "vendor").addTextContent(object.getVendor()));

        if (object.getVersion() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "version").addTextContent(object.getVersion()));

        if (object.getOffset() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "offset"), object.getOffset(), OpenDRIVEOffsetPropertyAdapter.class, namespaces);

        if (object.getGeoreference() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "georeference").addTextContent(object.getGeoreference()));
    }
}

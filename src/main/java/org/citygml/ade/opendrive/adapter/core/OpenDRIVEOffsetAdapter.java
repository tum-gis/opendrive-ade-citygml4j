package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEOffset;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.adapter.measures.AngleAdapter;
import org.xmlobjects.gml.adapter.measures.LengthAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.serializer.ObjectSerializer;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVEOffset", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEOffsetAdapter implements ObjectBuilder<OpenDRIVEOffset>, ObjectSerializer<OpenDRIVEOffset> {
    @Override
    public OpenDRIVEOffset createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEOffset();
    }

    @Override
    public void buildChildObject(OpenDRIVEOffset object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "hdg":
                    object.setHdg(reader.getObjectUsingBuilder(AngleAdapter.class));
                    break;
                case "x":
                    reader.getTextContent().ifDouble(object::setX);
                    break;
                case "y":
                    reader.getTextContent().ifDouble(object::setY);
                    break;
                case "z":
                    reader.getTextContent().ifDouble(object::setZ);
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEOffset object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEOffset");
    }

    @Override
    public void writeChildElements(OpenDRIVEOffset object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        if (object.getHdg() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "hdg"), object.getHdg(), AngleAdapter.class, namespaces);

        if (object.getX() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "x").addTextContent(object.getX().toString()));

        if (object.getY() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "y").addTextContent(object.getY().toString()));

        if (object.getZ() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "z").addTextContent(object.getZ().toString()));
    }
}

package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEDataError;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
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

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVEDataError", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEDataErrorAdapter implements ObjectBuilder<OpenDRIVEDataError>, ObjectSerializer<OpenDRIVEDataError> {
    @Override
    public OpenDRIVEDataError createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEDataError();
    }

    @Override
    public void buildChildObject(OpenDRIVEDataError object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "xyAbsolute":
                    reader.getTextContent().ifDouble(object::setXyAbsolute);
                    break;
                case "xyRelative":
                    reader.getTextContent().ifDouble(object::setXyRelative);
                    break;
                case "zAbsolute":
                    reader.getTextContent().ifDouble(object::setzAbsolute);
                    break;
                case "zRelative":
                    reader.getTextContent().ifDouble(object::setzRelative);
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEDataError object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEDataError");
    }

    @Override
    public void writeChildElements(OpenDRIVEDataError object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
    }
}

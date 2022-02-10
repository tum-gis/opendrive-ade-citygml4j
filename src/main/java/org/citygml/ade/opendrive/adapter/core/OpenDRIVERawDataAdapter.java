package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVERawData;
import org.citygml.ade.opendrive.model.core.E_dataQuality_RawData_PostProcessing;
import org.citygml.ade.opendrive.model.core.E_dataQuality_RawData_Source;
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

@XMLElement(name = "OpenDRIVERawData", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVERawDataAdapter implements ObjectBuilder<OpenDRIVERawData>, ObjectSerializer<OpenDRIVERawData> {
    @Override
    public OpenDRIVERawData createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVERawData();
    }

    @Override
    public void buildChildObject(OpenDRIVERawData object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "date":
                    reader.getTextContent().ifPresent(object::setDate);
                    break;
                case "postProcessing":
//                    object.setPostProcessing(e_dataQuality_RawData_PostProcessing.fromValue(reader.getTextContent().toString()));
                    reader.getTextContent().ifPresent(v -> object.setPostProcessing(E_dataQuality_RawData_PostProcessing.fromValue(v)));
                    break;
                case "postProcessingComment":
                    reader.getTextContent().ifPresent(object::setPostProcessingComment);
                    break;
                case "source":
//                    object.setSource(e_dataQuality_RawData_Source.fromValue(reader.getTextContent().toString()));
                    reader.getTextContent().ifPresent(v -> object.setSource(E_dataQuality_RawData_Source.fromValue(v)));
                    break;
                case "sourceComment":
                    reader.getTextContent().ifPresent(object::setSourceComment);
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVERawData object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEDataError");
    }

    @Override
    public void writeChildElements(OpenDRIVERawData object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
    }
}

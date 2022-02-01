package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDatasetData;
import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalObjectData;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.ade.SingletonADEProperty;
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

@XMLElement(name = "OpenDRIVEAdditionalObjectData", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEAdditionalObjectDataAdapter implements ObjectBuilder<OpenDRIVEAdditionalObjectData>, ObjectSerializer<OpenDRIVEAdditionalObjectData> {
    @Override
    @SingletonADEProperty
    public OpenDRIVEAdditionalObjectData createObject(QName qName, Object o) throws ObjectBuildException {
        return new OpenDRIVEAdditionalObjectData();
    }

    @Override // initializeObject works as well
    public void buildChildObject(OpenDRIVEAdditionalObjectData object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "additionalData":
                    object.getAdditionalData().add(reader.getObjectUsingBuilder(OpenDRIVEAdditionalDataPropertyAdapter.class));
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEAdditionalObjectData object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEAdditionalObjectData");
    }

    @Override
    public void writeChildElements(OpenDRIVEAdditionalObjectData object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        if (object.getAdditionalData() != null)
            for (OpenDRIVEAdditionalDataProperty dataProperty : object.getAdditionalData())
                writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"), dataProperty, OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);
    }
}

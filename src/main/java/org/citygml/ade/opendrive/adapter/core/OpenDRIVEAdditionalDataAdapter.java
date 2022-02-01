package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.*;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.core.ExternalReferencePropertyAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.adapter.measures.AngleAdapter;
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

@XMLElement(name = "OpenDRIVEAdditionalData", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEAdditionalDataAdapter implements ObjectBuilder<OpenDRIVEAdditionalData>, ObjectSerializer<OpenDRIVEAdditionalData> {
    @Override
    public OpenDRIVEAdditionalData createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEAdditionalData();
    }

    @Override
    public void buildChildObject(OpenDRIVEAdditionalData object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "userData":
                    object.getUserData().add(reader.getObjectUsingBuilder(OpenDRIVEUserDataPropertyAdapter.class));
                    break;
                case "include":
                    object.getInclude().add(reader.getObjectUsingBuilder(ExternalReferencePropertyAdapter.class));
                    break;
                case "dataQuality":
                    object.setDataQuality(reader.getObjectUsingBuilder(OpenDRIVEDataQualityPropertyAdapter.class));
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEAdditionalData object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEAdditionalData");
    }

    @Override
    public void writeChildElements(OpenDRIVEAdditionalData object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
    }
}

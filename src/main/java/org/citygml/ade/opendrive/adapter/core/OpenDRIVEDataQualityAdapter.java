package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEDataErrorProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEDataQuality;
import org.citygml.ade.opendrive.model.core.OpenDRIVEOffset;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
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

@XMLElement(name = "OpenDRIVEDataQuality", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEDataQualityAdapter implements ObjectBuilder<OpenDRIVEDataQuality>, ObjectSerializer<OpenDRIVEDataQuality> {
    @Override
    public OpenDRIVEDataQuality createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEDataQuality();
    }

    @Override
    public void buildChildObject(OpenDRIVEDataQuality object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "rawData":
                    object.setRawData(reader.getObjectUsingBuilder(OpenDRIVERawDataPropertyAdapter.class));
                    break;
                case "error":
                    object.setError(reader.getObjectUsingBuilder(OpenDRIVEDataErrorPropertyAdapter.class));
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEDataQuality object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEDataQuality");
    }

    @Override
    public void writeChildElements(OpenDRIVEDataQuality object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
    }
}

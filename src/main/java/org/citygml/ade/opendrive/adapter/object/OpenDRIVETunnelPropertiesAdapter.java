package org.citygml.ade.opendrive.adapter.object;

import org.citygml.ade.opendrive.model.object.OpenDRIVEBridgeProperties;
import org.citygml.ade.opendrive.model.object.OpenDRIVETunnelProperties;
import org.citygml.ade.opendrive.model.object.e_bridgeType;
import org.citygml.ade.opendrive.model.object.e_tunnelType;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.ade.SingletonADEProperty;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
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

@XMLElement(name = "OpenDRIVETunnelProperties", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVETunnelPropertiesAdapter implements ObjectBuilder<OpenDRIVETunnelProperties>, ObjectSerializer<OpenDRIVETunnelProperties> {
    @Override
    @SingletonADEProperty
    public OpenDRIVETunnelProperties createObject(QName qName, Object o) throws ObjectBuildException {
        return new OpenDRIVETunnelProperties();
    }

    @Override
    public void buildChildObject(OpenDRIVETunnelProperties object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "tunnelName":
                    reader.getTextContent().ifPresent(object::setTunnelName);
                    break;
                case "type":
                    reader.getTextContent().ifPresent((v) -> object.setType(e_tunnelType.fromValue(v)));
                    break;
                case "length":
                    object.setLength(reader.getObjectUsingBuilder(LengthAdapter.class));
                    break;
                case "daylight":
                    reader.getTextContent().ifDouble(object::setDaylight);
                    break;
                case "lightning":
                    reader.getTextContent().ifDouble(object::setLighting);
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVETunnelProperties object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEBridgeProperties");
    }

    @Override
    public void writeChildElements(OpenDRIVETunnelProperties object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
//        if (object.getAdditionalData() != null)
//            for (OpenDRIVEAdditionalDataProperty dataProperty : object.getAdditionalData())
//                writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"), dataProperty, OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);
    }
}

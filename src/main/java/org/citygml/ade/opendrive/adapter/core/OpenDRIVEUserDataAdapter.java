package org.citygml.ade.opendrive.adapter.core;

import org.citygml.ade.opendrive.model.core.OpenDRIVEOffset;
import org.citygml.ade.opendrive.model.core.OpenDRIVEUserData;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.adapter.basictypes.CodeAdapter;
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

@XMLElement(name = "OpenDRIVEUserData", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEUserDataAdapter implements ObjectBuilder<OpenDRIVEUserData>, ObjectSerializer<OpenDRIVEUserData> {
    @Override
    public OpenDRIVEUserData createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEUserData();
    }

    @Override
    public void buildChildObject(OpenDRIVEUserData object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "userDataContent":
//                    object.setUserData(reader.getObjectUsingBuilder(OpenDRIVEUserDataPropertyAdapter.class));
                    org.w3c.dom.Element el = reader.getDOMElement();
                    // TODO: Extract content of userDataContent element and store it as org.w3c.dom.ELement
                    object.getUserDataContent().add(el);
                    break;
                case "code":
                    object.setCode(reader.getObjectUsingBuilder(CodeAdapter.class));
                    break;
                case "value":
                    reader.getTextContent().ifPresent(object::setValue);
                    break;
            }
        }
    }

    @Override
    public Element createElement(OpenDRIVEUserData object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEUserData");
    }

    @Override
    public void writeChildElements(OpenDRIVEUserData object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
//        if (object.getHdg() != null)
//            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "hdg"), object.getHdg(), AngleAdapter.class, namespaces);
        // TODO:
    }
}

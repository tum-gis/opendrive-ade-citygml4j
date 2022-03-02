package org.citygml.ade.opendrive.adapter.junction;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.model.junction.OpenDRIVEJunction;
import org.citygml.ade.opendrive.model.junction.E_junction_type;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.transportation.IntersectionAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.util.composite.CompositeObjectAdapter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVEJunction", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEJunctionAdapter extends CompositeObjectAdapter<OpenDRIVEJunction> {
    public OpenDRIVEJunctionAdapter() {
        super(IntersectionAdapter.class);
    }

    @Override
    public OpenDRIVEJunction createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEJunction();
    }

    @Override
    public void buildChildObject(OpenDRIVEJunction object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "junctionName":
                    reader.getTextContent().ifPresent(object::setJunctionName);
                    break;
                case "junctionType":
                    reader.getTextContent().ifPresent((v) -> object.setJunctionType(E_junction_type.fromValue(v)));
                    break;
            }
        } else // If the namespace is not from the ADE then the element is from the citygml standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(OpenDRIVEJunction object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEJunction");
    }

    @Override
    public void writeChildElements(OpenDRIVEJunction object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getJunctionType() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "junctionType").addTextContent(object.getJunctionType().toValue()));

        if (object.getJunctionType() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "junctionName").addTextContent(object.getJunctionName()));

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);
    }
}

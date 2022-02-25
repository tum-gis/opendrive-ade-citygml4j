package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_LRMType;
import org.gml.model.LinearReferencingSystem.LR_LinearReferencingMethod;
import org.gml.module.GML_LR_Module;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "LinearReferencingMethod", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_LinearReferencingMethodAdapter extends AbstractGMLAdapter<LR_LinearReferencingMethod> {

    @Override
    public LR_LinearReferencingMethod createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_LinearReferencingMethod();
    }

    @Override
    public void buildChildObject(LR_LinearReferencingMethod object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "name":
                    reader.getTextContent().ifPresent(object::setName);
                    break;
                case "type":
                    reader.getTextContent().ifPresent((v) -> object.setType(LR_LRMType.fromValue(v)));
                    break;
                case "constraint":
                    reader.getTextContent().ifPresent(object::setConstraint);
                    break;
            }
        } else // If the namespace is not from the GML module then the element is from the GML standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(LR_LinearReferencingMethod object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "LinearReferencingMethod");
    }

    @Override
    public void writeChildElements(LR_LinearReferencingMethod object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getName() != null)
            writer.writeElement(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "name").addTextContent(object.getName()));

        if (object.getType() != null)
            writer.writeElement(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "type").addTextContent(object.getType().toString()));

        if (object.getConstraint() != null)
            writer.writeElement(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "constraint").addTextContent(object.getConstraint()));


    }
}

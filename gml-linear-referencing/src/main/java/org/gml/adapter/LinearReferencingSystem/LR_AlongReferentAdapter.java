package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_AlongReferent;
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

@XMLElement(name = "AlongReferent", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_AlongReferentAdapter extends AbstractGMLAdapter<LR_AlongReferent> {
    @Override
    public LR_AlongReferent createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_AlongReferent();
    }

    @Override
    public void buildChildObject(LR_AlongReferent object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "fromReferent":
                    object.setFromReferent(reader.getObjectUsingBuilder(LR_ReferentPropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the GML module then the element is from the GML standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(LR_AlongReferent object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "AlongReferent");
    }

    @Override
    public void writeChildElements(LR_AlongReferent object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getFromReferent() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "fromReferent"),
                    object.getFromReferent(), LR_ReferentPropertyAdapter.class, namespaces);
    }
}

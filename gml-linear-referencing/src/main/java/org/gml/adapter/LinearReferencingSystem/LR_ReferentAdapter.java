package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_LinearElement;
import org.gml.model.LinearReferencingSystem.LR_Referent;
import org.gml.module.GML_LR_Module;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
import org.xmlobjects.gml.adapter.basictypes.CodeAdapter;
import org.xmlobjects.gml.adapter.basictypes.MeasureAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.CurvePropertyAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.PointPropertyAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;
import org.xmlobjects.xml.TextContent;

import javax.xml.namespace.QName;

@XMLElement(name = "Referent", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_ReferentAdapter extends AbstractGMLAdapter<LR_Referent> {
    @Override
    public LR_Referent createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_Referent();
    }

    @Override
    public void buildChildObject(LR_Referent object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "name":
                    object.setName(reader.getObjectUsingBuilder(CodeAdapter.class));
                    break;
                case "type":
                    reader.getTextContent().ifPresent(object::setReferentType);
                    break;
                case "position":
                    object.setPosition(reader.getObjectUsingBuilder(PointPropertyAdapter.class));
                    break;
                case "location":
                    object.setLocation(reader.getObjectUsingBuilder(LR_PositionExpressionPropertyAdapter.class));
                    break;
                case "ownedBy":
                    object.setOwnedBy(reader.getObjectUsingBuilder(FeaturePropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the GML module then the element is from the GML standard module -> call super class methods
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(LR_Referent object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "Referent");
    }

    @Override
    public void writeChildElements(LR_Referent object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getName() != null)
            writer.writeElement(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "name").addTextContent(object.getName().toString()));

        if (object.getReferentType() != null)
            writer.writeElement(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "type").addTextContent(object.getReferentType()));

        if (object.getLocation() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "location"), object.getLocation(), LR_PositionExpressionPropertyAdapter.class, namespaces);

        if (object.getPosition() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "position"),
                    object.getPosition(), PointPropertyAdapter.class, namespaces);

        if (object.getOwnedBy() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "ownedBy"),
                    object.getOwnedBy(), FeaturePropertyAdapter.class, namespaces);
    }
}

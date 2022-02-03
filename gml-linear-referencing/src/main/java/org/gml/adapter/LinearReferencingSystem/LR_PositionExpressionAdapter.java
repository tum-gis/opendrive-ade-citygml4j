package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_PositionExpression;
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

@XMLElement(name = "PositionExpression", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_PositionExpressionAdapter extends AbstractGMLAdapter<LR_PositionExpression> {
    @Override
    public LR_PositionExpression createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_PositionExpression();
    }

    @Override
    public void buildChildObject(LR_PositionExpression object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "lrm":
                    object.setLrm(reader.getObjectUsingBuilder(LR_LinearReferencingMethodPropertyAdapter.class));
                    break;
                case "distanceExpression":
                    object.setDistanceExpression(reader.getObjectUsingBuilder(LR_DistanceExpressionPropertyAdapter.class));
                    break;
                case "linearElement":
                    object.setLinearElement(reader.getObjectUsingBuilder(LR_LinearElementPropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the GML module then the element is from the gml standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(LR_PositionExpression object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "PositionExpression");
    }

    @Override
    public void writeChildElements(LR_PositionExpression object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getDistanceExpression() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "distanceExpression"), object.getDistanceExpression(), LR_DistanceExpressionPropertyAdapter.class, namespaces);

        // TODO: Write remaining elements
    }
}

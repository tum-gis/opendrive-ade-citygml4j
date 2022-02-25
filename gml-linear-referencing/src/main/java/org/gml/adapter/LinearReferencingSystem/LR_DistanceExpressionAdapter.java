package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_DistanceExpression;
import org.gml.model.LinearReferencingSystem.LR_LRMType;
import org.gml.model.LinearReferencingSystem.LR_LinearReferencingMethod;
import org.gml.module.GML_LR_Module;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
import org.xmlobjects.gml.adapter.basictypes.MeasureAdapter;
import org.xmlobjects.gml.adapter.measures.LengthAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "DistanceExpression", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_DistanceExpressionAdapter extends AbstractGMLAdapter<LR_DistanceExpression> {
    @Override
    public LR_DistanceExpression createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_DistanceExpression();
    }

    @Override
    public void buildChildObject(LR_DistanceExpression object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "distanceAlong":
                    object.setDistanceAlong(reader.getObjectUsingBuilder(MeasureAdapter.class));
                    break;
                case "referent":
                    object.setReferent(reader.getObjectUsingBuilder(LR_AlongReferentPropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the GML module then the element is from the GML standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(LR_DistanceExpression object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "DistanceExpression");
    }

    @Override
    public void writeChildElements(LR_DistanceExpression object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getDistanceAlong() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "distanceAlong"), object.getDistanceAlong(), MeasureAdapter.class, namespaces);

        if (object.getReferent() != null)
            writer.writeElementUsingSerializer(Element.of(GML_LR_Module.GML_LR_NAMESPACE, "referent"),
                    object.getReferent(), LR_AlongReferentPropertyAdapter.class, namespaces);

    }
}

package org.citygml.ade.opendrive.adapter.object;

import org.citygml.ade.opendrive.model.object.LinearReferencing;
import org.citygml.ade.opendrive.model.object.OpenDRIVEBridgeProperties;
import org.citygml.ade.opendrive.model.object.e_bridgeType;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.ade.SingletonADEProperty;
import org.gml.adapter.LinearReferencingSystem.LR_PositionExpressionAdapter;
import org.gml.adapter.LinearReferencingSystem.LR_PositionExpressionPropertyAdapter;
import org.gml.module.GML_LR_Module;
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

@XMLElement(name = "LinearReferencing", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class LinearReferencingAdapter implements ObjectBuilder<LinearReferencing>, ObjectSerializer<LinearReferencing> {
    @Override
    @SingletonADEProperty
    public LinearReferencing createObject(QName qName, Object o) throws ObjectBuildException {
        return new LinearReferencing();
    }

    @Override
    public void buildChildObject(LinearReferencing object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "positionExpression":
                    object.setPositionExpression(reader.getObjectUsingBuilder(LR_PositionExpressionPropertyAdapter.class));
                    break;
            }
        }
    }

    @Override
    public Element createElement(LinearReferencing object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "LinearReferencing");
    }

    @Override
    public void writeChildElements(LinearReferencing object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
//        if (object.getAdditionalData() != null)
//            for (OpenDRIVEAdditionalDataProperty dataProperty : object.getAdditionalData())
//                writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"), dataProperty, OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);

        if (object.getPositionExpression() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "positionExpression"),
                    object.getPositionExpression(), LR_PositionExpressionPropertyAdapter.class, namespaces);
    }
}

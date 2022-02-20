package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.model.road.OpenDRIVERoadReferenceLine;
import org.citygml.ade.opendrive.model.road.OpenDRIVERoadShape;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.core.AbstractThematicSurfaceAdapter;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVERoadShape", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVERoadShapeAdapter extends AbstractThematicSurfaceAdapter<OpenDRIVERoadShape> {
    @Override
    public OpenDRIVERoadShape createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVERoadShape();
    }

    @Override
    public void buildChildObject(OpenDRIVERoadShape object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                // TODO:
                case "referenceLine":
                    object.setReferenceLine(reader.getObjectUsingBuilder(OpenDRIVERoadReferenceLinePropertyAdapter.class));
                    break;
            }
        } else // If the namespace is not from the ADE then the element is from the citygml standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(OpenDRIVERoadShape object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVERoadShape");
    }

    @Override
    public void writeChildElements(OpenDRIVERoadShape object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);
        // TODO:
//        if (object.getSingleSided() != null)
//            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "singleSided").addTextContent(object.getSingleSided().toString()));
        if (object.getReferenceLine() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "referenceLine"), object.getReferenceLine(), OpenDRIVERoadReferenceLinePropertyAdapter.class, namespaces);

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);
    }
}

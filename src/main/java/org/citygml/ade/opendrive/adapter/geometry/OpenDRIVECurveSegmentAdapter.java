package org.citygml.ade.opendrive.adapter.geometry;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.adapter.object.LinearReferencingAdapter;
import org.citygml.ade.opendrive.adapter.object.LinearReferencingPropertyAdapter;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVECurveSegment;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVELine;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.GMLSerializerHelper;
import org.xmlobjects.gml.adapter.geometry.primitives.AbstractCurveSegmentAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.PointPropertyAdapter;
import org.xmlobjects.gml.adapter.measures.AngleAdapter;
import org.xmlobjects.gml.adapter.measures.LengthAdapter;
import org.xmlobjects.gml.model.geometry.primitives.AbstractCurveSegment;
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

public abstract class OpenDRIVECurveSegmentAdapter<T extends OpenDRIVECurveSegment> extends AbstractCurveSegmentAdapter<T> {

    public static Element createOpenDRIVECurveSegmentElement(String namespace, String localName,
                                                             Namespaces namespaces,
                                                             OpenDRIVECurveSegment curveSegment) {
        Element element = Element.of(namespace, localName);
        GMLSerializerHelper.serializeSRSReference(element, (OpenDRIVECurveSegment) curveSegment, namespaces);

        return element;
    }

    @Override
    public void initializeObject(T object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        super.initializeObject(object, name, attributes, reader);
        attributes.getValue("srsName").ifPresent(((OpenDRIVECurveSegment) object)::setSrsName);
    }

    @Override
    public void initializeElement(Element element, T object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.initializeElement(element, object, namespaces, writer);
        element.addAttribute("srsName", TextContent.of(((OpenDRIVECurveSegment) object).getSrsName()));
    }

    @Override
    public void buildChildObject(T object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "origin":
                    object.setOrigin(reader.getObjectUsingBuilder(PointPropertyAdapter.class));
                    break;
                case "heading":
                    object.setHeading(reader.getObjectUsingBuilder(AngleAdapter.class));
                    break;
                case "length":
                    object.setLength(reader.getObjectUsingBuilder(LengthAdapter.class));
                    break;
                case "linearReferencing":
                    ((OpenDRIVECurveSegment)object).setLinearReferencing(reader.getObjectUsingBuilder(LinearReferencingPropertyAdapter.class));
                    break;
            }
        } else {
            super.buildChildObject(object, name, attributes, reader);
        }
    }

    @Override
    public void writeChildElements(T object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (((OpenDRIVECurveSegment)object).getOrigin() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "origin"), object.getOrigin(), PointPropertyAdapter.class, namespaces);

        if (((OpenDRIVECurveSegment)object).getHeading() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "heading"), object.getHeading(), AngleAdapter.class, namespaces);

        if (((OpenDRIVECurveSegment)object).getOrigin() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "length"), object.getLength(), LengthAdapter.class, namespaces);

        if (((OpenDRIVECurveSegment)object).getLinearReferencing() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "linearReferencing"), object.getLinearReferencing(), LinearReferencingPropertyAdapter.class, namespaces);

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);
    }
}

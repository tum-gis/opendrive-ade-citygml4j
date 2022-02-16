package org.citygml.ade.opendrive.adapter.geometry;


import org.citygml.ade.opendrive.model.geometry.OpenDRIVECubicPolynomial;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVECurveSegment;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
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
import org.xmlobjects.xml.TextContent;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVECubicPolynomial", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVECubicPolynomialAdapter extends OpenDRIVECurveSegmentAdapter<OpenDRIVECubicPolynomial> {
    @Override
    public OpenDRIVECubicPolynomial createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVECubicPolynomial();
    }

    @Override
    public void buildChildObject(OpenDRIVECubicPolynomial object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
            switch (name.getLocalPart()) {
                case "a":
                    reader.getTextContent().ifDouble(object::setA);
                    break;
                case "b":
                    reader.getTextContent().ifDouble(object::setB);
                    break;
                case "c":
                    reader.getTextContent().ifDouble(object::setC);
                    break;
                case "d":
                    reader.getTextContent().ifDouble(object::setD);
                    break;
            }
        }

        // Call buildChildObject from OpenDRIVECurveSegment class
        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVECubicPolynomial object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getA() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "a").addTextContent(
                    TextContent.ofDouble(object.getA())
            ));

        if (object.getB() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "b").addTextContent(
                    TextContent.ofDouble(object.getB())
            ));

        if (object.getC() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "c").addTextContent(
                    TextContent.ofDouble(object.getC())
            ));

        if (object.getD() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "d").addTextContent(
                    TextContent.ofDouble(object.getD())
            ));
    }
}

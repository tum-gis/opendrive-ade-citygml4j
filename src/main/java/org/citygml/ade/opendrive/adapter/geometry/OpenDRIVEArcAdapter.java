package org.citygml.ade.opendrive.adapter.geometry;

import org.citygml.ade.opendrive.model.geometry.OpenDRIVEArc;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVECurveSegment;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
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

@XMLElement(name = "OpenDRIVEArc", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEArcAdapter extends OpenDRIVECurveSegmentAdapter<OpenDRIVEArc> {
    @Override
    public OpenDRIVEArc createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEArc();
    }

    @Override
    public Element createElement(OpenDRIVEArc object, Namespaces namespaces) throws ObjectSerializeException {
        return createOpenDRIVECurveSegmentElement(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEArc",
                namespaces, object);
    }

    @Override
    public void buildChildObject(OpenDRIVEArc object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "curvature":
                    reader.getTextContent().ifDouble(object::setCurvature);
                    break;
            }
        }
        // Call buildChildObject from OpenDRIVECurveSegment class
        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVEArc object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getCurvature() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "curvature").addTextContent(
                    TextContent.ofDouble(object.getCurvature())
            ));
    }
}

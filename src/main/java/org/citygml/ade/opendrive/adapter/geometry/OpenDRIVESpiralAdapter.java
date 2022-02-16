package org.citygml.ade.opendrive.adapter.geometry;

import org.citygml.ade.opendrive.model.geometry.OpenDRIVELine;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVESpiral;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.GMLSerializerHelper;
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

@XMLElement(name = "OpenDRIVESpiral", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVESpiralAdapter extends OpenDRIVECurveSegmentAdapter<OpenDRIVESpiral> {
    @Override
    public OpenDRIVESpiral createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVESpiral();
    }

    @Override
    public Element createElement(OpenDRIVESpiral object, Namespaces namespaces) throws ObjectSerializeException {
        return super.createOpenDRIVECurveSegmentElement(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVESpiral",
                namespaces, object);
    }

    @Override
    public void buildChildObject(OpenDRIVESpiral object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "curvatureStart":
                    reader.getTextContent().ifDouble(object::setCurvatureStart);
                    break;
                case "curvatureEnd":
                    reader.getTextContent().ifDouble(object::setCurvatureEnd);
                    break;
            }
        }

        // Call buildChildObject from OpenDRIVECurveSegment class
        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVESpiral object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getCurvatureStart() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "curvatureStart").addTextContent(
                    TextContent.ofDouble(object.getCurvatureStart())
            ));

        if (object.getCurvatureEnd() != null)
            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "curvatureEnd").addTextContent(
                    TextContent.ofDouble(object.getCurvatureStart())
            ));
    }
}

package org.citygml.ade.opendrive.adapter.geometry;

import org.citygml.ade.opendrive.model.geometry.OpenDRIVECurveSegment;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVELine;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.GMLSerializerHelper;
import org.xmlobjects.gml.model.geometry.primitives.AbstractCurveSegment;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVELine", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVELineAdapter extends OpenDRIVECurveSegmentAdapter{

    @Override
    public OpenDRIVELine createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELine();
    }

    @Override
    public void buildChildObject(Object object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(Object object, Namespaces namespaces) throws ObjectSerializeException {
        Element element = Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVELine");
        GMLSerializerHelper.serializeSRSReference(element, (OpenDRIVELine) object, namespaces);

        return element;
    }

    @Override
    public void writeChildElements(Object object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);
    }
}

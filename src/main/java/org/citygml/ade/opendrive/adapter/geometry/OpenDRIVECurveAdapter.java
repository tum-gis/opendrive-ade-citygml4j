package org.citygml.ade.opendrive.adapter.geometry;

import org.citygml.ade.opendrive.model.geometry.OpenDRIVECurve;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.geometry.primitives.CurveAdapter;
import org.xmlobjects.gml.model.geometry.primitives.Curve;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVECurve", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVECurveAdapter extends CurveAdapter {

    @Override
    public OpenDRIVECurve createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVECurve();
    }

    @Override
    public void buildChildObject(Curve object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
//        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
//            switch (name.getLocalPart()) {
//
//            }
//        } else {
//            // If the namespace is not from the ADE then the element is from the citygml standard module
//            super.buildChildObject(object, name, attributes, reader);
//        }

        // No OpenDRIVE ADE properties
        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(Curve object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVECurve");
    }

    @Override
    public void writeChildElements(Curve object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // No OpenDRIVE ADE properties
        super.writeChildElements(object, namespaces, writer);
    }
}

package org.citygml.ade.opendrive.adapter.lane;

import org.citygml.ade.opendrive.model.lane.OpenDRIVELaneWidth;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.CurvePropertyAdapter;
import org.xmlobjects.gml.model.geometry.primitives.Curve;
import org.xmlobjects.gml.model.geometry.primitives.CurveProperty;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVELaneWidth", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVELaneWidthAdapter extends AbstractGMLAdapter<OpenDRIVELaneWidth> {
    @Override
    public OpenDRIVELaneWidth createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVELaneWidth();
    }

    @Override
    public Element createElement(OpenDRIVELaneWidth object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVELaneWidth");
    }

    @Override
    public void buildChildObject(OpenDRIVELaneWidth object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
            switch (name.getLocalPart()) {
                case "width":
                    object.setWidth(reader.getObjectUsingBuilder(CurvePropertyAdapter.class));
                    break;
            }
        } else
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVELaneWidth object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getWidth() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "width"),
                    object.getWidth(), CurvePropertyAdapter.class, namespaces);
    }
}

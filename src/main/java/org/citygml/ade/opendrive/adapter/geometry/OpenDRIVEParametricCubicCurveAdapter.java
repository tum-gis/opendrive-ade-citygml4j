package org.citygml.ade.opendrive.adapter.geometry;

import org.citygml.ade.opendrive.model.geometry.OpenDRIVECubicPolynomialProperty;
import org.citygml.ade.opendrive.model.geometry.OpenDRIVEParametricCubicCurve;
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

import javax.xml.namespace.QName;

@XMLElement(name = "OpenDRIVEParametricCubicCurve", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVEParametricCubicCurveAdapter extends OpenDRIVECurveSegmentAdapter<OpenDRIVEParametricCubicCurve>{
    @Override
    public OpenDRIVEParametricCubicCurve createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVEParametricCubicCurve();
    }

    @Override
    public Element createElement(OpenDRIVEParametricCubicCurve object, Namespaces namespaces) throws ObjectSerializeException {
        return createOpenDRIVECurveSegmentElement(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVEParametricCubicCurve",
                namespaces, object);
    }

    @Override
    public void buildChildObject(OpenDRIVEParametricCubicCurve object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (name.getNamespaceURI().equals(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)) {
            switch (name.getLocalPart()) {
                case "firstComponentFunction":
                    object.setFirstCoordinateComponentFunction(
                            reader.getObjectUsingBuilder(OpenDRIVECubicPolynomialPropertyAdapter.class)
                    );
                    break;
                case "secondComponentFunction":
                    object.setSecondCoordinateComponentFunction(
                            reader.getObjectUsingBuilder(OpenDRIVECubicPolynomialPropertyAdapter.class)
                    );
                    break;
            }
        }

        // Call buildChildObject from OpenDRIVECurveSegment class
        super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public void writeChildElements(OpenDRIVEParametricCubicCurve object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);

        if (object.getFirstCoordinateComponentFunction() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "firstComponentFunction"), ((OpenDRIVEParametricCubicCurve) object).getFirstCoordinateComponentFunction(),
                    OpenDRIVECubicPolynomialPropertyAdapter.class, namespaces);

        if (object.getSecondCoordinateComponentFunction() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "secondComponentFunction"), ((OpenDRIVEParametricCubicCurve) object).getSecondCoordinateComponentFunction(),
                    OpenDRIVECubicPolynomialPropertyAdapter.class, namespaces);
    }
}

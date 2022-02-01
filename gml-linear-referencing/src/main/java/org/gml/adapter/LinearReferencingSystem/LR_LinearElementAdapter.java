package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_LinearElement;
import org.gml.module.GML_LR_Module;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
import org.xmlobjects.gml.adapter.basictypes.MeasureAdapter;
import org.xmlobjects.gml.adapter.feature.FeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.geometry.primitives.CurvePropertyAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import javax.xml.namespace.QName;

@XMLElement(name = "LinearElement", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_LinearElementAdapter extends AbstractGMLAdapter<LR_LinearElement> {
    @Override
    public LR_LinearElement createObject(QName qName, Object o) throws ObjectBuildException {
        return new LR_LinearElement();
    }

    @Override
    public void buildChildObject(LR_LinearElement object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "feature":
                    object.setFeature(reader.getObjectUsingBuilder(FeaturePropertyAdapter.class));
                    break;
                case "curve":
                    object.setCurve(reader.getObjectUsingBuilder(CurvePropertyAdapter.class));
                    break;
                case "defaultLRM":
                    object.setDefaultLRM(reader.getObjectUsingBuilder(LR_LinearReferencingMethodPropertyAdapter.class));
                    break;
                case "measure":
                    object.setMeasure(reader.getObjectUsingBuilder(MeasureAdapter.class));
                    break;
                case "startValue":
                    object.getStartValue().add((reader.getObjectUsingBuilder(LR_StartValueAdapter.class)));
                    break;
            }
        } else // If the namespace is not from the GML module then the element is from the GML standard module
            super.buildChildObject(object, name, attributes, reader);
    }

    @Override
    public Element createElement(LR_LinearElement object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "LinearElement");
    }

    @Override
    public void writeChildElements(LR_LinearElement object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        // TODO:
        super.writeChildElements(object, namespaces, writer);
    }
}

package org.citygml.ade.opendrive.adapter.road;

import org.citygml.ade.opendrive.adapter.core.OpenDRIVEAdditionalDataPropertyAdapter;
import org.citygml.ade.opendrive.model.road.OpenDRIVELaneSection;
import org.citygml.ade.opendrive.model.road.OpenDRIVERoadReferenceLine;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml4j.xml.adapter.core.AbstractFeatureAdapter;
import org.gml.adapter.LinearReferencingSystem.LR_AlongReferentPropertyAdapter;
import org.gml.adapter.LinearReferencingSystem.LR_ReferentPropertyAdapter;
import org.gml.model.LinearReferencingSystem.LR_ReferentProperty;
import org.gml.module.GML_LR_Module;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractGMLAdapter;
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

@XMLElement(name = "OpenDRIVERoadReferenceLine", namespaceURI = OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE)
public class OpenDRIVERoadReferenceLineAdapter extends AbstractFeatureAdapter<OpenDRIVERoadReferenceLine> {
    @Override
    public OpenDRIVERoadReferenceLine createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVERoadReferenceLine();
    }

    @Override
    public void buildChildObject(OpenDRIVERoadReferenceLine object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "referent":
                    object.getReferent().add(reader.getObjectUsingBuilder(LR_ReferentPropertyAdapter.class));
                    break;
                case "planView":
                    object.setPlanView(reader.getObjectUsingBuilder(CurvePropertyAdapter.class));
                    break;
            }
        } else  // If the namespace is not from the ADE then the element is from the citygml standard module
            super.buildChildObject(object, name, attributes, reader);

    }

    @Override
    public Element createElement(OpenDRIVERoadReferenceLine object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "OpenDRIVERoadReferenceLine");
    }

    @Override
    public void writeChildElements(OpenDRIVERoadReferenceLine object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        super.writeChildElements(object, namespaces, writer);
        // TODO:
//        if (object.getSingleSided() != null)
//            writer.writeElement(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "singleSided").addTextContent(object.getSingleSided().toString()));
        for (LR_ReferentProperty ref : object.getReferent())
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "referent"), ref, LR_ReferentPropertyAdapter.class, namespaces);

        if (object.getPlanView() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "planView"),
                    object.getPlanView(), CurvePropertyAdapter.class, namespaces);

        if (object.getAdditionalData() != null)
            writer.writeElementUsingSerializer(Element.of(OpenDRIVEADEModule.OPENDRIVEADE_NAMESPACE, "additionalData"),
                    object.getAdditionalData(), OpenDRIVEAdditionalDataPropertyAdapter.class, namespaces);
    }
}

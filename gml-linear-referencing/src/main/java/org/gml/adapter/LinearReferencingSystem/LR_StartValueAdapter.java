package org.gml.adapter.LinearReferencingSystem;

import org.gml.model.LinearReferencingSystem.LR_LinearReferencingMethodProperty;
import org.gml.model.LinearReferencingSystem.LR_StartValue;
import org.gml.module.GML_LR_Module;
import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
import org.xmlobjects.gml.adapter.basictypes.CodeAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.serializer.ObjectSerializer;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;
import org.xmlobjects.xml.TextContent;

import javax.xml.namespace.QName;

@XMLElement(name = "startValue", namespaceURI = GML_LR_Module.GML_LR_NAMESPACE)
public class LR_StartValueAdapter implements ObjectBuilder<LR_StartValue>, ObjectSerializer<LR_StartValue> {
    @Override
    public LR_StartValue createObject(QName name, Object parent) throws ObjectBuildException {
        return new LR_StartValue();
    }

    @Override
    public void initializeObject(LR_StartValue object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (GML_LR_Module.GML_LR_NAMESPACE.equals(name.getNamespaceURI())) {
            reader.getTextContent().ifDouble(object::setValue);
            attributes.getValue("uom").ifPresent(object::setUom);

            String xLinkHrefToLRM = attributes.getValue("lrm").toString();
            object.setLrm(new LR_LinearReferencingMethodProperty(xLinkHrefToLRM));
        }
    }

    @Override
    public Element createElement(LR_StartValue object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(GML_LR_Module.GML_LR_NAMESPACE, "startValue");
    }

    @Override
    public void initializeElement(Element element, LR_StartValue object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        element.addTextContent(TextContent.ofDouble(object.getValue()));
        element.addAttribute("uom", object.getUom());
        element.addAttribute("lrm", object.getLrm().getHref());
    }

}

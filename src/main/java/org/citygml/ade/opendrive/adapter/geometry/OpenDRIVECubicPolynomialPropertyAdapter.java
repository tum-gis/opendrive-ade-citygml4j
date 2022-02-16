package org.citygml.ade.opendrive.adapter.geometry;


import org.citygml.ade.opendrive.model.geometry.OpenDRIVECubicPolynomialProperty;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.gml.adapter.base.AbstractInlinePropertyAdapter;

import javax.xml.namespace.QName;

public class OpenDRIVECubicPolynomialPropertyAdapter extends AbstractInlinePropertyAdapter<OpenDRIVECubicPolynomialProperty> {
    @Override
    public OpenDRIVECubicPolynomialProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new OpenDRIVECubicPolynomialProperty();
    }
}

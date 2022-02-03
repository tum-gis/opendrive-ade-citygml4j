package org.citygml.ade.opendrive.module;

import org.citygml4j.model.CityGMLVersion;
import org.citygml4j.xml.module.ade.ADEModule;
import org.gml.module.GML_LR_Module;

public class GMLLinearReferencingModule extends ADEModule {
    public GMLLinearReferencingModule() {
        super(GML_LR_Module.GML_LR_NAMESPACE, "gmllr", CityGMLVersion.v3_0);
    }
}

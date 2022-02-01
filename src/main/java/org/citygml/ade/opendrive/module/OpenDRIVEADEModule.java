package org.citygml.ade.opendrive.module;

import org.citygml4j.model.CityGMLVersion;
import org.citygml4j.xml.module.ade.ADEModule;

import java.net.URL;

public class OpenDRIVEADEModule extends ADEModule {
    public static final String OPENDRIVEADE_NAMESPACE = "http://www.citygml.org/ade/openDRIVE";

    public OpenDRIVEADEModule() {
        super(OPENDRIVEADE_NAMESPACE, "odr", CityGMLVersion.v3_0);
    }

    @Override
    public URL getSchemaResource() {
        // TODO: Provide URL to schema
        return OpenDRIVEADEModule.class.getResource("/org/citygml4j/ade/opendriveade/schemas/OpenDRIVEADE.xsd");
    }
}

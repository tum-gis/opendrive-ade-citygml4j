package org.citygml.ade.opendrive;

import org.citygml.ade.opendrive.module.GMLLinearReferencingModule;
import org.citygml.ade.opendrive.module.OpenDRIVEADEModule;
import org.citygml.ade.opendrive.walker.OpenDRIVEADEWalker;
import org.citygml4j.visitor.ADEWalker;
import org.citygml4j.xml.ade.ADEContext;
import org.citygml4j.xml.module.ade.ADEModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OpenDRIVEADEContext implements ADEContext {

    @Override
    public List<ADEModule> getADEModules() {
//        return Collections.singletonList(new OpenDRIVEADEModule());
        ArrayList<ADEModule> adeModules = new ArrayList<ADEModule>();
        adeModules.add(new OpenDRIVEADEModule());
        adeModules.add(new GMLLinearReferencingModule());
        return adeModules;
    }

    @Override
    public ADEWalker getADEWalker() {
        return new OpenDRIVEADEWalker();
    }
}

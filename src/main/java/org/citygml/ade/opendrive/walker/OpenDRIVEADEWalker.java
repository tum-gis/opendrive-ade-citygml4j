package org.citygml.ade.opendrive.walker;

import org.citygml.ade.opendrive.model.road.OpenDRIVEStandardRoad;
import org.citygml4j.model.transportation.Section;
import org.citygml4j.visitor.ADEWalker;

public class OpenDRIVEADEWalker extends ADEWalker {
    // TODO:
    public void visit(OpenDRIVEStandardRoad openDRIVEStandardRoad){
        walker.visit((Section) openDRIVEStandardRoad);
    }

}

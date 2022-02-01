package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.GMLObject;
import org.xmlobjects.gml.model.measures.Angle;

public class OpenDRIVEOffset extends GMLObject implements ADEObject {
    private Angle hdg;
    private Double x;
    private Double y;
    private Double z;

    public Angle getHdg() {
        return hdg;
    }

    public void setHdg(Angle hdg) {
        this.hdg = hdg;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }
}

package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.GMLObject;

public class OpenDRIVEDataError extends GMLObject implements ADEObject {
    private Double xyAbsolute;
    private Double xyRelative;
    private Double zAbsolute;
    private Double zRelative;

    public Double getXyAbsolute() {
        return xyAbsolute;
    }

    public void setXyAbsolute(Double xyAbsolute) {
        this.xyAbsolute = xyAbsolute;
    }

    public Double getXyRelative() {
        return xyRelative;
    }

    public void setXyRelative(Double xyRelative) {
        this.xyRelative = xyRelative;
    }

    public Double getzAbsolute() {
        return zAbsolute;
    }

    public void setzAbsolute(Double zAbsolute) {
        this.zAbsolute = zAbsolute;
    }

    public Double getzRelative() {
        return zRelative;
    }

    public void setzRelative(Double zRelative) {
        this.zRelative = zRelative;
    }
}

package org.citygml.ade.opendrive.model.geometry;

import java.util.List;

public class OpenDRIVELine extends OpenDRIVECurveSegment {
    // TODO: Implementation of overriden methods
    @Override
    public List<Double> toCoordinateList3D() {
        return null;
    }

    @Override
    public List<String> getAxisLabels() {
        return null;
    }

    @Override
    public boolean isSetAxisLabels() {
        return false;
    }

    @Override
    public void setAxisLabels(List<String> axisLabels) {

    }

    @Override
    public List<String> getUomLabels() {
        return null;
    }

    @Override
    public boolean isSetUomLabels() {
        return false;
    }

    @Override
    public void setUomLabels(List<String> uomLabels) {

    }
}

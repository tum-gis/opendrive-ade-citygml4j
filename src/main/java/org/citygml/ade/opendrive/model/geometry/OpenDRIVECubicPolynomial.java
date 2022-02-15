package org.citygml.ade.opendrive.model.geometry;

import java.util.List;

public class OpenDRIVECubicPolynomial extends OpenDRIVECurveSegment {
    private Double a;
    private Double b;
    private Double c;
    private Double d;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

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

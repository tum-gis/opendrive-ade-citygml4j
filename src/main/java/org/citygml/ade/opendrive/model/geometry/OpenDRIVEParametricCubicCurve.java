package org.citygml.ade.opendrive.model.geometry;

import java.util.List;

public class OpenDRIVEParametricCubicCurve extends OpenDRIVECurveSegment{
    private OpenDRIVECubicPolynomialProperty firstCoordinateComponentFunction;
    private OpenDRIVECubicPolynomialProperty secondCoordinateComponentFunction;
    private E_paramPoly3_pRange pRange;

    public E_paramPoly3_pRange getpRange() {
        return pRange;
    }

    public void setpRange(E_paramPoly3_pRange pRange) {
        this.pRange = pRange;
    }

    public OpenDRIVECubicPolynomialProperty getFirstCoordinateComponentFunction() {
        return firstCoordinateComponentFunction;
    }

    public void setFirstCoordinateComponentFunction(OpenDRIVECubicPolynomialProperty firstCoordinateComponentFunction) {
        this.firstCoordinateComponentFunction = firstCoordinateComponentFunction;
    }

    public OpenDRIVECubicPolynomialProperty getSecondCoordinateComponentFunction() {
        return secondCoordinateComponentFunction;
    }

    public void setSecondCoordinateComponentFunction(OpenDRIVECubicPolynomialProperty secondCoordinateComponentFunction) {
        this.secondCoordinateComponentFunction = secondCoordinateComponentFunction;
    }

    // TODO: Implement methods
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

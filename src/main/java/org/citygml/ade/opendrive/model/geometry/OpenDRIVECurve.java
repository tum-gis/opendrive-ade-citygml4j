package org.citygml.ade.opendrive.model.geometry;

import org.citygml4j.model.ade.ADEObject;
import org.gml.model.LinearReferencingSystem.*;
import org.xmlobjects.gml.model.basictypes.Measure;
import org.xmlobjects.gml.model.geometry.primitives.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OpenDRIVECurve extends Curve implements ADEObject, LR_Curve {

    class NotAnOpenDRIVECurveSegmentException extends Exception {
        public NotAnOpenDRIVECurveSegmentException(String message) {
            super(message);
        }
    }

    private void throwException() throws NotAnOpenDRIVECurveSegmentException{
        throw new NotAnOpenDRIVECurveSegmentException("Test");
    }

    private CurveSegmentArrayProperty sortCurveSegments(CurveSegmentArrayProperty segments) {
        if (segments != null && !segments.getObjects().isEmpty()) {
            Comparator<AbstractCurveSegment> sortFunction = (cs0, cs1) -> {
                if (cs0 instanceof OpenDRIVECurveSegment) {
                    if (cs1 instanceof OpenDRIVECurveSegment) {
                        Double s0 = null, s1 = null;
                        try {
                            s0 = ((OpenDRIVECurveSegment) cs0).getLinearReferencing().getObject().getPositionExpression().getObject().getDistanceExpression().getObject().getDistanceAlong().getValue();
                            s1 = ((OpenDRIVECurveSegment) cs1).getLinearReferencing().getObject().getPositionExpression().getObject().getDistanceExpression().getObject().getDistanceAlong().getValue();
                        } catch (NullPointerException e){
                            e.printStackTrace();
                        } catch (ClassCastException e) {
                            e.printStackTrace();
                        }

//                      return s0 > s1 ? 1 : 0;
                        return (s0 != null) && (s1 != null) ? Double.compare(s0, s1) : 0;
                    } else {
                        try {
                            throw new NotAnOpenDRIVECurveSegmentException("Illegal curve segment type. Only subtypes of "
                                    + OpenDRIVECurveSegment.class.toString() + " are allowed, but " +
                                    cs1.getClass().toString() + " was found.");
                        } catch (NotAnOpenDRIVECurveSegmentException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    try {
                        throw new NotAnOpenDRIVECurveSegmentException("Illegal curve segment type. Only subtypes of"
                                + OpenDRIVECurveSegment.class.toString() + "are allowed, but " +
                                cs0.getClass().toString() + "was found.");
                    } catch (NotAnOpenDRIVECurveSegmentException e) {
                        e.printStackTrace();
                    }
                }

                return 0;
            };

            segments.getObjects().sort(sortFunction);
        }

        return segments;
    }

    @Override
    public void setSegments(CurveSegmentArrayProperty segments) {
        super.setSegments(sortCurveSegments(segments));
    }

    @Override
    public LR_LinearReferencingMethod defaultLRM() {
        return null;
    }

    @Override
    public Measure measure(String measureAttribute) {
        return null;
    }

    @Override
    public LR_DistanceExpression translateToInstance(LR_PositionExpression sourceLocation, LR_LinearElement targetInstance, LR_LinearReferencingMethod targetLRM) {
        return null;
    }

    @Override
    public List<LR_DistanceExpression> translateToType(LR_PositionExpression sourceLocation, String targetType, LR_LinearReferencingMethod targetLRM) {
        return null;
    }

    @Override
    public Measure startValue(LR_LinearReferencingMethod lrm) {
        return null;
    }

    @Override
    public Point point(LR_PositionExpression lrPosition) {
        return null;
    }

    @Override
    public LR_PositionExpression lrPosition(Point point) {
        return null;
    }
}

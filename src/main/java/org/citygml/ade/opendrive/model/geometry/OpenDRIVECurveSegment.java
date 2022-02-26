package org.citygml.ade.opendrive.model.geometry;

import org.citygml.ade.opendrive.model.core.OpenDRIVEAdditionalDataProperty;
import org.citygml.ade.opendrive.model.core.OpenDRIVEElement;
import org.citygml.ade.opendrive.model.linearReferencing.ReferenceableType;
import org.citygml.ade.opendrive.model.object.LinearReferencingProperty;
import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.geometry.SRSReference;
import org.xmlobjects.gml.model.geometry.primitives.AbstractCurveSegment;
import org.xmlobjects.gml.model.geometry.primitives.PointProperty;
import org.xmlobjects.gml.model.measures.Angle;
import org.xmlobjects.gml.model.measures.Length;

public abstract class OpenDRIVECurveSegment extends AbstractCurveSegment implements ADEObject, SRSReference, ReferenceableType, OpenDRIVEElement {
    private String srsName;
    private Integer srsDimension;

    private Angle heading;
    private Length length;
    private PointProperty origin;
    private LinearReferencingProperty linearReferencing;

    private OpenDRIVEAdditionalDataProperty additionalData;

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return additionalData;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public String getSrsName() {
        return this.srsName;
    }

    @Override
    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    @Override
    public Integer getSrsDimension() {
        return this.srsDimension;
    }

    @Override
    public void setSrsDimension(Integer srsDimension) {
        this.srsDimension = srsDimension;
    }

    public Angle getHeading() {
        return heading;
    }

    public void setHeading(Angle heading) {
        this.heading = heading;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = length;
    }

    public PointProperty getOrigin() {
        return origin;
    }

    public void setOrigin(PointProperty origin) {
        this.origin = origin;
    }

    @Override
    public LinearReferencingProperty getLinearReferencing() {
        return linearReferencing;
    }

    @Override
    public void setLinearReferencing(LinearReferencingProperty linearReferencing) {
        this.linearReferencing = linearReferencing;
    }
}

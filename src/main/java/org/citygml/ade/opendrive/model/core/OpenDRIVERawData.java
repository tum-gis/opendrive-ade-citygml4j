package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.xmlobjects.gml.model.GMLObject;

public class OpenDRIVERawData extends GMLObject implements ADEObject {
    private String date;
    private E_dataQuality_RawData_PostProcessing postProcessing;
    private String postProcessingComment;
    private E_dataQuality_RawData_Source source;
    private String sourceComment;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public E_dataQuality_RawData_PostProcessing getPostProcessing() {
        return postProcessing;
    }

    public void setPostProcessing(E_dataQuality_RawData_PostProcessing postProcessing) {
        this.postProcessing = postProcessing;
    }

    public String getPostProcessingComment() {
        return postProcessingComment;
    }

    public void setPostProcessingComment(String postProcessingComment) {
        this.postProcessingComment = postProcessingComment;
    }

    public E_dataQuality_RawData_Source getSource() {
        return source;
    }

    public void setSource(E_dataQuality_RawData_Source source) {
        this.source = source;
    }

    public String getSourceComment() {
        return sourceComment;
    }

    public void setSourceComment(String sourceComment) {
        this.sourceComment = sourceComment;
    }
}

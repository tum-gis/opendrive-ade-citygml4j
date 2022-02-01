package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.w3c.dom.Element;
import org.xmlobjects.gml.model.GMLObject;
import org.xmlobjects.gml.model.basictypes.Code;
import org.xmlobjects.model.ChildList;

import java.util.ArrayList;
import java.util.List;

public class OpenDRIVEUserData extends GMLObject implements ADEObject {
    private Code code;
    private String value;
    private List<org.w3c.dom.Element> userDataContent;

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<org.w3c.dom.Element> getUserDataContent() {
        if (userDataContent == null)
            userDataContent = new ArrayList<>();

        return userDataContent;
    }

    public void setUserDataContent(List<org.w3c.dom.Element> userDataContent) {
        this.userDataContent = userDataContent;
    }
}

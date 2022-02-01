package org.citygml.ade.opendrive.model.object;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.bridge.ADEOfBridge;
import org.citygml4j.model.tunnel.ADEOfTunnel;
import org.xmlobjects.gml.model.measures.Length;

public class OpenDRIVEBridgeProperties extends ADEOfBridge implements ADEObject {
    private String bridgeName;
    private Length length;
    private e_bridgeType type;

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = length;
    }

    public e_bridgeType getType() {
        return type;
    }

    public void setType(e_bridgeType type) {
        this.type = type;
    }
}

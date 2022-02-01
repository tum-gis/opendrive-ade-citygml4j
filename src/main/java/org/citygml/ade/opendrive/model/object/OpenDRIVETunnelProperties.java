package org.citygml.ade.opendrive.model.object;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.tunnel.ADEOfTunnel;
import org.xmlobjects.gml.model.measures.Length;

public class OpenDRIVETunnelProperties extends ADEOfTunnel implements ADEObject {
    private Length length;
    private Double daylight;
    private Double lighting;
    private String tunnelName;
    private e_tunnelType type;

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = length;
    }

    public Double getDaylight() {
        return daylight;
    }

    public void setDaylight(Double daylight) {
        this.daylight = daylight;
    }

    public Double getLighting() {
        return lighting;
    }

    public void setLighting(Double lighting) {
        this.lighting = lighting;
    }

    public String getTunnelName() {
        return tunnelName;
    }

    public void setTunnelName(String tunnelName) {
        this.tunnelName = tunnelName;
    }

    public e_tunnelType getType() {
        return type;
    }

    public void setType(e_tunnelType type) {
        this.type = type;
    }
}

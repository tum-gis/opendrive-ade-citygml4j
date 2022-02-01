package org.citygml.ade.opendrive.model.core;

import org.citygml.ade.opendrive.model.road.e_trafficRule;

public enum e_dataQuality_RawData_Source {
    SENSOR("sensor"),
    CADASTRE("cadastre"),
    CUSTOM("custom");

    private final String value;

    public static e_dataQuality_RawData_Source fromValue(String value) {
        for (e_dataQuality_RawData_Source v : e_dataQuality_RawData_Source.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private e_dataQuality_RawData_Source(String value) {
        this.value = value;
    }

    public String toValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

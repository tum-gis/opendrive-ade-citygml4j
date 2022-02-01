package org.citygml.ade.opendrive.model.object;

import org.citygml.ade.opendrive.model.core.e_dataQuality_RawData_PostProcessing;

public enum e_bridgeType {
    CONCRETE("concrete"),
    STEEL("steel"),
    BRICK("brick"),
    WOOD("wood");

    private final String value;

    public static e_bridgeType fromValue(String value) {
        for (e_bridgeType v : e_bridgeType.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private e_bridgeType(String value) {
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

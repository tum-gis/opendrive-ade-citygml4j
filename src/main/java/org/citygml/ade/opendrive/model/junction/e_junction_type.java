package org.citygml.ade.opendrive.model.junction;

import org.citygml.ade.opendrive.model.object.e_bridgeType;

public enum e_junction_type {
    DEFAULT("default"),
    VIRTUAL("virtual");

    private final String value;

    public static e_junction_type fromValue(String value) {
        for (e_junction_type v : e_junction_type.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private e_junction_type(String value) {
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

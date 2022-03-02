package org.citygml.ade.opendrive.model.junction;

public enum E_junction_type {
    DEFAULT("default"),
    VIRTUAL("virtual");

    private final String value;

    public static E_junction_type fromValue(String value) {
        for (E_junction_type v : E_junction_type.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private E_junction_type(String value) {
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

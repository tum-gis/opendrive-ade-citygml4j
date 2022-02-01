package org.citygml.ade.opendrive.model.object;

public enum e_tunnelType {
    UNDERPASS("underpass"),
    STANDARD("standard");

    private final String value;

    public static e_tunnelType fromValue(String value) {
        for (e_tunnelType v : e_tunnelType.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private e_tunnelType(String value) {
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

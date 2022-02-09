package org.citygml.ade.opendrive.model.object;

public enum E_tunnelType {
    UNDERPASS("underpass"),
    STANDARD("standard");

    private final String value;

    public static E_tunnelType fromValue(String value) {
        for (E_tunnelType v : E_tunnelType.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private E_tunnelType(String value) {
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

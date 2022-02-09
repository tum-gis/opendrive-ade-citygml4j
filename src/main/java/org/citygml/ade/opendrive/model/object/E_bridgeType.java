package org.citygml.ade.opendrive.model.object;

public enum E_bridgeType {
    CONCRETE("concrete"),
    STEEL("steel"),
    BRICK("brick"),
    WOOD("wood");

    private final String value;

    public static E_bridgeType fromValue(String value) {
        for (E_bridgeType v : E_bridgeType.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private E_bridgeType(String value) {
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

package org.citygml.ade.opendrive.model.lane;

public enum LateralLaneSection {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right")
    ;

    private final String value;

    private LateralLaneSection(String value) {
        this.value = value;
    }

    public static LateralLaneSection fromValue(String value) {
        for (LateralLaneSection v : LateralLaneSection.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    public String toValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package org.citygml.ade.opendrive.model.road;

public enum e_trafficRule {
    RHT("RHT"),
    LHT("LHT");

    private final String value;

    public static e_trafficRule fromValue(String value) {
        for (e_trafficRule v : e_trafficRule.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private e_trafficRule(String value) {
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

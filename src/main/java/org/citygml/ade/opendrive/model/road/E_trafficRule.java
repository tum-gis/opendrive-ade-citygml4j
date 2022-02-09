package org.citygml.ade.opendrive.model.road;

public enum E_trafficRule {
    RHT("RHT"),
    LHT("LHT");

    private final String value;

    public static E_trafficRule fromValue(String value) {
        for (E_trafficRule v : E_trafficRule.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private E_trafficRule(String value) {
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

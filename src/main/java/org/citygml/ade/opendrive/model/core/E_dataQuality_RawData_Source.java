package org.citygml.ade.opendrive.model.core;

public enum E_dataQuality_RawData_Source {
    SENSOR("sensor"),
    CADASTRE("cadastre"),
    CUSTOM("custom");

    private final String value;

    public static E_dataQuality_RawData_Source fromValue(String value) {
        for (E_dataQuality_RawData_Source v : E_dataQuality_RawData_Source.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private E_dataQuality_RawData_Source(String value) {
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

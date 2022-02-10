package org.citygml.ade.opendrive.model.core;

public enum E_dataQuality_RawData_PostProcessing {
    RAW("raw"),
    CLEANED("cleaned"),
    PROCESSED("processed"),
    FUSED("fused");

    private final String value;

    public static E_dataQuality_RawData_PostProcessing fromValue(String value) {
        for (E_dataQuality_RawData_PostProcessing v : E_dataQuality_RawData_PostProcessing.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private E_dataQuality_RawData_PostProcessing(String value) {
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

package org.gml.model.LinearReferencingSystem;

public enum LR_LRMType {
    ABSOLUTE("absolute"),
    RELATIVE("relative"),
    INTERPOLATIVE("interpolative");

    private final String value;

    public static LR_LRMType fromValue(String value) {
        for (LR_LRMType v : LR_LRMType.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    private LR_LRMType(String value) {
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

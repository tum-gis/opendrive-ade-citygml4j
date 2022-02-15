package org.citygml.ade.opendrive.model.geometry;

import org.citygml.ade.opendrive.model.object.E_bridgeType;

public enum E_paramPoly3_pRange {
    ARCLENGTH("arclength"),   // Calls private constructor with value="arclength"
    NORMALIZED("normalized"); // Calls private constructor with value="normalized"

    private final String value;

    private E_paramPoly3_pRange(String value) {
        this.value = value;
    }


    public static E_paramPoly3_pRange fromValue(String value) {
        for (E_paramPoly3_pRange v : E_paramPoly3_pRange.values()) {
            if (v.value.equals(value))
                return v;
        }

        return null;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

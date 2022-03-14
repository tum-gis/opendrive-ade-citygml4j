package org.gml.utils;

import org.gml.model.LinearReferencingSystem.LR_LinearReferencingMethod;

import java.util.Comparator;
import java.util.Objects;

public class LRMComparator implements Comparator<LR_LinearReferencingMethod> {
    @Override
    public int compare(LR_LinearReferencingMethod o1, LR_LinearReferencingMethod o2) {
        boolean equalNames = Objects.equals(o1.getName(), o2.getName());
        boolean equalType = Objects.equals(o1.getType(), o2.getType());
        boolean equalUnits = Objects.equals(o1.getUnits(), o2.getUnits());
        boolean equalConstraints = Objects.equals(o1.getConstraint(), o2.getConstraint());

        if (equalNames && equalConstraints && equalType && equalUnits)
            return 0;

        return -1;
    }
}
